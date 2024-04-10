// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class BeeBotAssociateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BeeBotAssociateResponseBody body;

    public static BeeBotAssociateResponse build(java.util.Map<String, ?> map) throws Exception {
        BeeBotAssociateResponse self = new BeeBotAssociateResponse();
        return TeaModel.build(map, self);
    }

    public BeeBotAssociateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BeeBotAssociateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BeeBotAssociateResponse setBody(BeeBotAssociateResponseBody body) {
        this.body = body;
        return this;
    }
    public BeeBotAssociateResponseBody getBody() {
        return this.body;
    }

}
