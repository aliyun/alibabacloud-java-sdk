// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListBiddingDocResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBiddingDocResponseBody body;

    public static ListBiddingDocResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBiddingDocResponse self = new ListBiddingDocResponse();
        return TeaModel.build(map, self);
    }

    public ListBiddingDocResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBiddingDocResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBiddingDocResponse setBody(ListBiddingDocResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBiddingDocResponseBody getBody() {
        return this.body;
    }

}
