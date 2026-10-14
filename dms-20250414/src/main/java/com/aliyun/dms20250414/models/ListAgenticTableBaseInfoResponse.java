// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListAgenticTableBaseInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAgenticTableBaseInfoResponseBody body;

    public static ListAgenticTableBaseInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgenticTableBaseInfoResponse self = new ListAgenticTableBaseInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListAgenticTableBaseInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgenticTableBaseInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAgenticTableBaseInfoResponse setBody(ListAgenticTableBaseInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgenticTableBaseInfoResponseBody getBody() {
        return this.body;
    }

}
