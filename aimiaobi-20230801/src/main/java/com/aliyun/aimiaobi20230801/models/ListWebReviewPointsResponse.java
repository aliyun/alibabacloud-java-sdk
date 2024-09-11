// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListWebReviewPointsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWebReviewPointsResponseBody body;

    public static ListWebReviewPointsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWebReviewPointsResponse self = new ListWebReviewPointsResponse();
        return TeaModel.build(map, self);
    }

    public ListWebReviewPointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWebReviewPointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWebReviewPointsResponse setBody(ListWebReviewPointsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWebReviewPointsResponseBody getBody() {
        return this.body;
    }

}
