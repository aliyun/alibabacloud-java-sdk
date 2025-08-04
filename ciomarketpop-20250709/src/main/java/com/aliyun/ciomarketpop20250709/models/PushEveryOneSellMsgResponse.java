// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ciomarketpop20250709.models;

import com.aliyun.tea.*;

public class PushEveryOneSellMsgResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public String body;

    public static PushEveryOneSellMsgResponse build(java.util.Map<String, ?> map) throws Exception {
        PushEveryOneSellMsgResponse self = new PushEveryOneSellMsgResponse();
        return TeaModel.build(map, self);
    }

    public PushEveryOneSellMsgResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushEveryOneSellMsgResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushEveryOneSellMsgResponse setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
