// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class AddImageLibResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddImageLibResponseBody body;

    public static AddImageLibResponse build(java.util.Map<String, ?> map) throws Exception {
        AddImageLibResponse self = new AddImageLibResponse();
        return TeaModel.build(map, self);
    }

    public AddImageLibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddImageLibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddImageLibResponse setBody(AddImageLibResponseBody body) {
        this.body = body;
        return this;
    }
    public AddImageLibResponseBody getBody() {
        return this.body;
    }

}
