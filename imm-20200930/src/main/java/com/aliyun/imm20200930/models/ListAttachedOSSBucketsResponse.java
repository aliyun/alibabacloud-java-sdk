// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ListAttachedOSSBucketsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAttachedOSSBucketsResponseBody body;

    public static ListAttachedOSSBucketsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAttachedOSSBucketsResponse self = new ListAttachedOSSBucketsResponse();
        return TeaModel.build(map, self);
    }

    public ListAttachedOSSBucketsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAttachedOSSBucketsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAttachedOSSBucketsResponse setBody(ListAttachedOSSBucketsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAttachedOSSBucketsResponseBody getBody() {
        return this.body;
    }

}
