// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AddMediaMarksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddMediaMarksResponseBody body;

    public static AddMediaMarksResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMediaMarksResponse self = new AddMediaMarksResponse();
        return TeaModel.build(map, self);
    }

    public AddMediaMarksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMediaMarksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddMediaMarksResponse setBody(AddMediaMarksResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMediaMarksResponseBody getBody() {
        return this.body;
    }

}
