// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ListInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListInstanceResponseBody body;

    public static ListInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceResponse self = new ListInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceResponse setBody(ListInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceResponseBody getBody() {
        return this.body;
    }

}
