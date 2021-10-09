// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class RequestUserSellPointTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RequestUserSellPointTemplateResponse setBody(RequestUserSellPointTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public RequestUserSellPointTemplateResponseBody getBody() {
        return this.body;
    }

}
