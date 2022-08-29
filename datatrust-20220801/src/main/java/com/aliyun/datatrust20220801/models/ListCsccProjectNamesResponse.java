// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListCsccProjectNamesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListCsccProjectNamesResponseBody body;

    public static ListCsccProjectNamesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCsccProjectNamesResponse self = new ListCsccProjectNamesResponse();
        return TeaModel.build(map, self);
    }

    public ListCsccProjectNamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCsccProjectNamesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCsccProjectNamesResponse setBody(ListCsccProjectNamesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCsccProjectNamesResponseBody getBody() {
        return this.body;
    }

}
