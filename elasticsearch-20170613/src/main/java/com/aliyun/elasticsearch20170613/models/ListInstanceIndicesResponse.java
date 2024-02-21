// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListInstanceIndicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstanceIndicesResponseBody body;

    public static ListInstanceIndicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceIndicesResponse self = new ListInstanceIndicesResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceIndicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceIndicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceIndicesResponse setBody(ListInstanceIndicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceIndicesResponseBody getBody() {
        return this.body;
    }

}
