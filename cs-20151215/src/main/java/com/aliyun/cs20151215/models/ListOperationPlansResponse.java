// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListOperationPlansResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListOperationPlansResponseBody body;

    public static ListOperationPlansResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOperationPlansResponse self = new ListOperationPlansResponse();
        return TeaModel.build(map, self);
    }

    public ListOperationPlansResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOperationPlansResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOperationPlansResponse setBody(ListOperationPlansResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOperationPlansResponseBody getBody() {
        return this.body;
    }

}
