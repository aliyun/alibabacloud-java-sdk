// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.address_purification20191118.models;

import com.aliyun.tea.*;

public class GetZipcodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetZipcodeResponseBody body;

    public static GetZipcodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetZipcodeResponse self = new GetZipcodeResponse();
        return TeaModel.build(map, self);
    }

    public GetZipcodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetZipcodeResponse setBody(GetZipcodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetZipcodeResponseBody getBody() {
        return this.body;
    }

}
