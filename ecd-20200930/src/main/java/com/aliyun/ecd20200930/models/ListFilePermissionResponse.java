// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListFilePermissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListFilePermissionResponseBody body;

    public static ListFilePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFilePermissionResponse self = new ListFilePermissionResponse();
        return TeaModel.build(map, self);
    }

    public ListFilePermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFilePermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFilePermissionResponse setBody(ListFilePermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFilePermissionResponseBody getBody() {
        return this.body;
    }

}
