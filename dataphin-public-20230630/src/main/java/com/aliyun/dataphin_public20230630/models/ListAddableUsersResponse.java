// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListAddableUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAddableUsersResponseBody body;

    public static ListAddableUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAddableUsersResponse self = new ListAddableUsersResponse();
        return TeaModel.build(map, self);
    }

    public ListAddableUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAddableUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAddableUsersResponse setBody(ListAddableUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAddableUsersResponseBody getBody() {
        return this.body;
    }

}
