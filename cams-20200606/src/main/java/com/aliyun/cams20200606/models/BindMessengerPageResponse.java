// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class BindMessengerPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindMessengerPageResponseBody body;

    public static BindMessengerPageResponse build(java.util.Map<String, ?> map) throws Exception {
        BindMessengerPageResponse self = new BindMessengerPageResponse();
        return TeaModel.build(map, self);
    }

    public BindMessengerPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindMessengerPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindMessengerPageResponse setBody(BindMessengerPageResponseBody body) {
        this.body = body;
        return this;
    }
    public BindMessengerPageResponseBody getBody() {
        return this.body;
    }

}
