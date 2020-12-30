// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetConfigResponseBody body;

    public static GetConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConfigResponse self = new GetConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConfigResponse setBody(GetConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConfigResponseBody getBody() {
        return this.body;
    }

}
