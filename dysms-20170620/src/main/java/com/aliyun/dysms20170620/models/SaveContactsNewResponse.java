// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class SaveContactsNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveContactsNewResponseBody body;

    public static SaveContactsNewResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveContactsNewResponse self = new SaveContactsNewResponse();
        return TeaModel.build(map, self);
    }

    public SaveContactsNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveContactsNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveContactsNewResponse setBody(SaveContactsNewResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveContactsNewResponseBody getBody() {
        return this.body;
    }

}
