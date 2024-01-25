// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class RequestUserSellPointTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RequestUserSellPointTemplateResponseBody body;

    public static RequestUserSellPointTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        RequestUserSellPointTemplateResponse self = new RequestUserSellPointTemplateResponse();
        return TeaModel.build(map, self);
    }

    public RequestUserSellPointTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RequestUserSellPointTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RequestUserSellPointTemplateResponse setBody(RequestUserSellPointTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public RequestUserSellPointTemplateResponseBody getBody() {
        return this.body;
    }

}
