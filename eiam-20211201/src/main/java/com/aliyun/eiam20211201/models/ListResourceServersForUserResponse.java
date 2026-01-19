// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListResourceServersForUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListResourceServersForUserResponseBody body;

    public static ListResourceServersForUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceServersForUserResponse self = new ListResourceServersForUserResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceServersForUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceServersForUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResourceServersForUserResponse setBody(ListResourceServersForUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceServersForUserResponseBody getBody() {
        return this.body;
    }

}
