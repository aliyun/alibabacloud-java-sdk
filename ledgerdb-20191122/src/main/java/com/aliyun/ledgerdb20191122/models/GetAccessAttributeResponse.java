// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class GetAccessAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAccessAttributeResponseBody body;

    public static GetAccessAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccessAttributeResponse self = new GetAccessAttributeResponse();
        return TeaModel.build(map, self);
    }

    public GetAccessAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccessAttributeResponse setBody(GetAccessAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccessAttributeResponseBody getBody() {
        return this.body;
    }

}
