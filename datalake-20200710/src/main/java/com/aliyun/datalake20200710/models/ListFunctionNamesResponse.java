// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListFunctionNamesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFunctionNamesResponseBody body;

    public static ListFunctionNamesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionNamesResponse self = new ListFunctionNamesResponse();
        return TeaModel.build(map, self);
    }

    public ListFunctionNamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFunctionNamesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFunctionNamesResponse setBody(ListFunctionNamesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFunctionNamesResponseBody getBody() {
        return this.body;
    }

}
