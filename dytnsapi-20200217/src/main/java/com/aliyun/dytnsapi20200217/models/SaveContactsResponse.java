// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class SaveContactsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveContactsResponseBody body;

    public static SaveContactsResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveContactsResponse self = new SaveContactsResponse();
        return TeaModel.build(map, self);
    }

    public SaveContactsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveContactsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveContactsResponse setBody(SaveContactsResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveContactsResponseBody getBody() {
        return this.body;
    }

}
