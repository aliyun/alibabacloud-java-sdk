// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListTableVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTableVersionsResponseBody body;

    public static ListTableVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTableVersionsResponse self = new ListTableVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListTableVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTableVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTableVersionsResponse setBody(ListTableVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTableVersionsResponseBody getBody() {
        return this.body;
    }

}
