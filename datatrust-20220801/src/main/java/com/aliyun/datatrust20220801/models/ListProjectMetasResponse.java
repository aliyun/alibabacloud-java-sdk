// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListProjectMetasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListProjectMetasResponseBody body;

    public static ListProjectMetasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectMetasResponse self = new ListProjectMetasResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectMetasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProjectMetasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProjectMetasResponse setBody(ListProjectMetasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProjectMetasResponseBody getBody() {
        return this.body;
    }

}
