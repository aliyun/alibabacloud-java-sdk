// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetWafBotAppKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWafBotAppKeyResponseBody body;

    public static GetWafBotAppKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWafBotAppKeyResponse self = new GetWafBotAppKeyResponse();
        return TeaModel.build(map, self);
    }

    public GetWafBotAppKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWafBotAppKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWafBotAppKeyResponse setBody(GetWafBotAppKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWafBotAppKeyResponseBody getBody() {
        return this.body;
    }

}
