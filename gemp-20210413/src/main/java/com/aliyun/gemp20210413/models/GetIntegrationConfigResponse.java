// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetIntegrationConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetIntegrationConfigResponseBody body;

    public static GetIntegrationConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIntegrationConfigResponse self = new GetIntegrationConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetIntegrationConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIntegrationConfigResponse setBody(GetIntegrationConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIntegrationConfigResponseBody getBody() {
        return this.body;
    }

}
