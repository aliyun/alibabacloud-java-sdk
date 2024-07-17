// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListTableNamesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTableNamesResponseBody body;

    public static ListTableNamesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTableNamesResponse self = new ListTableNamesResponse();
        return TeaModel.build(map, self);
    }

    public ListTableNamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTableNamesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTableNamesResponse setBody(ListTableNamesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTableNamesResponseBody getBody() {
        return this.body;
    }

}
