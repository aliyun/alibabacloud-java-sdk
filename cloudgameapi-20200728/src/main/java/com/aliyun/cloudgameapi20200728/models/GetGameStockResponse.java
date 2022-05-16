// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetGameStockResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetGameStockResponseBody body;

    public static GetGameStockResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGameStockResponse self = new GetGameStockResponse();
        return TeaModel.build(map, self);
    }

    public GetGameStockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGameStockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGameStockResponse setBody(GetGameStockResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGameStockResponseBody getBody() {
        return this.body;
    }

}
