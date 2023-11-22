// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListPhoneMessageQrdlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPhoneMessageQrdlResponseBody body;

    public static ListPhoneMessageQrdlResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPhoneMessageQrdlResponse self = new ListPhoneMessageQrdlResponse();
        return TeaModel.build(map, self);
    }

    public ListPhoneMessageQrdlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPhoneMessageQrdlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPhoneMessageQrdlResponse setBody(ListPhoneMessageQrdlResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPhoneMessageQrdlResponseBody getBody() {
        return this.body;
    }

}
