// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class AddDirectionalCardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDirectionalCardResponseBody body;

    public static AddDirectionalCardResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDirectionalCardResponse self = new AddDirectionalCardResponse();
        return TeaModel.build(map, self);
    }

    public AddDirectionalCardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDirectionalCardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDirectionalCardResponse setBody(AddDirectionalCardResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDirectionalCardResponseBody getBody() {
        return this.body;
    }

}
