// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class ListFaceDbsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFaceDbsResponseBody body;

    public static ListFaceDbsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFaceDbsResponse self = new ListFaceDbsResponse();
        return TeaModel.build(map, self);
    }

    public ListFaceDbsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFaceDbsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFaceDbsResponse setBody(ListFaceDbsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFaceDbsResponseBody getBody() {
        return this.body;
    }

}
