// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListFeedbacksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFeedbacksResponseBody body;

    public static ListFeedbacksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFeedbacksResponse self = new ListFeedbacksResponse();
        return TeaModel.build(map, self);
    }

    public ListFeedbacksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFeedbacksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFeedbacksResponse setBody(ListFeedbacksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFeedbacksResponseBody getBody() {
        return this.body;
    }

}
