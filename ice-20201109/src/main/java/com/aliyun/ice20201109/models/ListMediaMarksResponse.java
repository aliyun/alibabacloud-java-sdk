// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListMediaMarksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMediaMarksResponseBody body;

    public static ListMediaMarksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMediaMarksResponse self = new ListMediaMarksResponse();
        return TeaModel.build(map, self);
    }

    public ListMediaMarksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMediaMarksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMediaMarksResponse setBody(ListMediaMarksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMediaMarksResponseBody getBody() {
        return this.body;
    }

}
