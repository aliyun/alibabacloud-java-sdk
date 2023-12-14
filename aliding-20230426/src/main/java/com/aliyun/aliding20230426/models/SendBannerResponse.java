// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SendBannerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SendBannerResponseBody body;

    public static SendBannerResponse build(java.util.Map<String, ?> map) throws Exception {
        SendBannerResponse self = new SendBannerResponse();
        return TeaModel.build(map, self);
    }

    public SendBannerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendBannerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendBannerResponse setBody(SendBannerResponseBody body) {
        this.body = body;
        return this;
    }
    public SendBannerResponseBody getBody() {
        return this.body;
    }

}
