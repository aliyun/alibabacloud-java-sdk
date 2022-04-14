// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class UpdateCardResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCardResponseBody body;

    public static UpdateCardResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCardResponse self = new UpdateCardResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCardResponse setBody(UpdateCardResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCardResponseBody getBody() {
        return this.body;
    }

}
