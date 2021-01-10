// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddTrancodeSEIResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddTrancodeSEIResponseBody body;

    public static AddTrancodeSEIResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTrancodeSEIResponse self = new AddTrancodeSEIResponse();
        return TeaModel.build(map, self);
    }

    public AddTrancodeSEIResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddTrancodeSEIResponse setBody(AddTrancodeSEIResponseBody body) {
        this.body = body;
        return this;
    }
    public AddTrancodeSEIResponseBody getBody() {
        return this.body;
    }

}
