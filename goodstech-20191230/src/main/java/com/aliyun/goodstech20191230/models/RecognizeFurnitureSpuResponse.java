// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.goodstech20191230.models;

import com.aliyun.tea.*;

public class RecognizeFurnitureSpuResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeFurnitureSpuResponseBody body;

    public static RecognizeFurnitureSpuResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeFurnitureSpuResponse self = new RecognizeFurnitureSpuResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeFurnitureSpuResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeFurnitureSpuResponse setBody(RecognizeFurnitureSpuResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeFurnitureSpuResponseBody getBody() {
        return this.body;
    }

}
