// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class ListPropertyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPropertyResponseBody body;

    public static ListPropertyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPropertyResponse self = new ListPropertyResponse();
        return TeaModel.build(map, self);
    }

    public ListPropertyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPropertyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPropertyResponse setBody(ListPropertyResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPropertyResponseBody getBody() {
        return this.body;
    }

}
