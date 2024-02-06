// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ListBucketsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBucketsResponseBody body;

    public static ListBucketsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBucketsResponse self = new ListBucketsResponse();
        return TeaModel.build(map, self);
    }

    public ListBucketsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBucketsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBucketsResponse setBody(ListBucketsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBucketsResponseBody getBody() {
        return this.body;
    }

}
