// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetProvisionConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetProvisionConfigResponseBody body;

    public static GetProvisionConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProvisionConfigResponse self = new GetProvisionConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetProvisionConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProvisionConfigResponse setBody(GetProvisionConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProvisionConfigResponseBody getBody() {
        return this.body;
    }

}
