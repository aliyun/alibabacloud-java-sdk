// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class FindUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FindUsersResponseBody body;

    public static FindUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        FindUsersResponse self = new FindUsersResponse();
        return TeaModel.build(map, self);
    }

    public FindUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FindUsersResponse setBody(FindUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public FindUsersResponseBody getBody() {
        return this.body;
    }

}
