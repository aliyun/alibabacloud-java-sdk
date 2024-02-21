// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class ListImageSharePermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListImageSharePermissionResponseBody body;

    public static ListImageSharePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListImageSharePermissionResponse self = new ListImageSharePermissionResponse();
        return TeaModel.build(map, self);
    }

    public ListImageSharePermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListImageSharePermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListImageSharePermissionResponse setBody(ListImageSharePermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListImageSharePermissionResponseBody getBody() {
        return this.body;
    }

}
