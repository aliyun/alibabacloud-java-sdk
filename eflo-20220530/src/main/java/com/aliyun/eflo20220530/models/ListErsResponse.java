// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListErsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListErsResponseBody body;

    public static ListErsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListErsResponse self = new ListErsResponse();
        return TeaModel.build(map, self);
    }

    public ListErsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListErsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListErsResponse setBody(ListErsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListErsResponseBody getBody() {
        return this.body;
    }

}
