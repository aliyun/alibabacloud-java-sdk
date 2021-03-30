// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetApDetailedConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetApDetailedConfigResponseBody body;

    public static GetApDetailedConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApDetailedConfigResponse self = new GetApDetailedConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetApDetailedConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApDetailedConfigResponse setBody(GetApDetailedConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApDetailedConfigResponseBody getBody() {
        return this.body;
    }

}
