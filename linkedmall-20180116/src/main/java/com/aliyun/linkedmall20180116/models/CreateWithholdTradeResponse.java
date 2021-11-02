// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateWithholdTradeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateWithholdTradeResponseBody body;

    public static CreateWithholdTradeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWithholdTradeResponse self = new CreateWithholdTradeResponse();
        return TeaModel.build(map, self);
    }

    public CreateWithholdTradeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWithholdTradeResponse setBody(CreateWithholdTradeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWithholdTradeResponseBody getBody() {
        return this.body;
    }

}
