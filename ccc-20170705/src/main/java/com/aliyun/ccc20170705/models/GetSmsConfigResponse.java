// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetSmsConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSmsConfigResponseBody body;

    public static GetSmsConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSmsConfigResponse self = new GetSmsConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetSmsConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSmsConfigResponse setBody(GetSmsConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSmsConfigResponseBody getBody() {
        return this.body;
    }

}
