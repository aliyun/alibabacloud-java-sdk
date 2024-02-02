// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListPersonalNumbersOfUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPersonalNumbersOfUserResponseBody body;

    public static ListPersonalNumbersOfUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPersonalNumbersOfUserResponse self = new ListPersonalNumbersOfUserResponse();
        return TeaModel.build(map, self);
    }

    public ListPersonalNumbersOfUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPersonalNumbersOfUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPersonalNumbersOfUserResponse setBody(ListPersonalNumbersOfUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPersonalNumbersOfUserResponseBody getBody() {
        return this.body;
    }

}
