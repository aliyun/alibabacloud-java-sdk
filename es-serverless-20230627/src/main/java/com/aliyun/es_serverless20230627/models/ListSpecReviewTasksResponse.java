// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class ListSpecReviewTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSpecReviewTasksResponseBody body;

    public static ListSpecReviewTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSpecReviewTasksResponse self = new ListSpecReviewTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListSpecReviewTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSpecReviewTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSpecReviewTasksResponse setBody(ListSpecReviewTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSpecReviewTasksResponseBody getBody() {
        return this.body;
    }

}
