// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListAddableRolesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAddableRolesResponseBody body;

    public static ListAddableRolesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAddableRolesResponse self = new ListAddableRolesResponse();
        return TeaModel.build(map, self);
    }

    public ListAddableRolesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAddableRolesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAddableRolesResponse setBody(ListAddableRolesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAddableRolesResponseBody getBody() {
        return this.body;
    }

}
