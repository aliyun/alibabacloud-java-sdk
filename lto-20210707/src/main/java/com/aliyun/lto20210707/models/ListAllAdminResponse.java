// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListAllAdminResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAllAdminResponseBody body;

    public static ListAllAdminResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAllAdminResponse self = new ListAllAdminResponse();
        return TeaModel.build(map, self);
    }

    public ListAllAdminResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAllAdminResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAllAdminResponse setBody(ListAllAdminResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAllAdminResponseBody getBody() {
        return this.body;
    }

}
