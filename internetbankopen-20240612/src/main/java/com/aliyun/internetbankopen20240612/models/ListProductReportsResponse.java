// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.internetbankopen20240612.models;

import com.aliyun.tea.*;

public class ListProductReportsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProductReportsResponseBody body;

    public static ListProductReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductReportsResponse self = new ListProductReportsResponse();
        return TeaModel.build(map, self);
    }

    public ListProductReportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductReportsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProductReportsResponse setBody(ListProductReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductReportsResponseBody getBody() {
        return this.body;
    }

}
