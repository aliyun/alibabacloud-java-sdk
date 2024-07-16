// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class UpdateCardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateCardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCardResponse setBody(UpdateCardResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCardResponseBody getBody() {
        return this.body;
    }

}
