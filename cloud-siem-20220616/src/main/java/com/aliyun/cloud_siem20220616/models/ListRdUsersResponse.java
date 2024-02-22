// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListRdUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRdUsersResponseBody body;

    public static ListRdUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRdUsersResponse self = new ListRdUsersResponse();
        return TeaModel.build(map, self);
    }

    public ListRdUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRdUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRdUsersResponse setBody(ListRdUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRdUsersResponseBody getBody() {
        return this.body;
    }

}
