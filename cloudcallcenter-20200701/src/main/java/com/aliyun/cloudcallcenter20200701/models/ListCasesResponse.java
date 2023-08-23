// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class ListCasesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListCasesResponseBody body;

    public static ListCasesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCasesResponse self = new ListCasesResponse();
        return TeaModel.build(map, self);
    }

    public ListCasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCasesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCasesResponse setBody(ListCasesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCasesResponseBody getBody() {
        return this.body;
    }

}
