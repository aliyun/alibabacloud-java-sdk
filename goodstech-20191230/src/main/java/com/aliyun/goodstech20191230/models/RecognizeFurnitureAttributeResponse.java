// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.goodstech20191230.models;

import com.aliyun.tea.*;

public class RecognizeFurnitureAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeFurnitureAttributeResponseBody body;

    public static RecognizeFurnitureAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeFurnitureAttributeResponse self = new RecognizeFurnitureAttributeResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeFurnitureAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeFurnitureAttributeResponse setBody(RecognizeFurnitureAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeFurnitureAttributeResponseBody getBody() {
        return this.body;
    }

}
