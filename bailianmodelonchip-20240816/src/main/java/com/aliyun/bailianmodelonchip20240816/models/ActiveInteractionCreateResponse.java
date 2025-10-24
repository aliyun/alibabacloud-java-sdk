// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class ActiveInteractionCreateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ActiveInteractionCreateResponseBody body;

    public static ActiveInteractionCreateResponse build(java.util.Map<String, ?> map) throws Exception {
        ActiveInteractionCreateResponse self = new ActiveInteractionCreateResponse();
        return TeaModel.build(map, self);
    }

    public ActiveInteractionCreateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActiveInteractionCreateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ActiveInteractionCreateResponse setBody(ActiveInteractionCreateResponseBody body) {
        this.body = body;
        return this;
    }
    public ActiveInteractionCreateResponseBody getBody() {
        return this.body;
    }

}
