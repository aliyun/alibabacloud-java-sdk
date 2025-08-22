// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListUsersInRecycleBinResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUsersInRecycleBinResponseBody body;

    public static ListUsersInRecycleBinResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUsersInRecycleBinResponse self = new ListUsersInRecycleBinResponse();
        return TeaModel.build(map, self);
    }

    public ListUsersInRecycleBinResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUsersInRecycleBinResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUsersInRecycleBinResponse setBody(ListUsersInRecycleBinResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUsersInRecycleBinResponseBody getBody() {
        return this.body;
    }

}
