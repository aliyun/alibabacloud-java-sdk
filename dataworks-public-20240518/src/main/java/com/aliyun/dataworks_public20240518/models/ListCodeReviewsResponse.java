// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListCodeReviewsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCodeReviewsResponseBody body;

    public static ListCodeReviewsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCodeReviewsResponse self = new ListCodeReviewsResponse();
        return TeaModel.build(map, self);
    }

    public ListCodeReviewsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCodeReviewsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCodeReviewsResponse setBody(ListCodeReviewsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCodeReviewsResponseBody getBody() {
        return this.body;
    }

}
