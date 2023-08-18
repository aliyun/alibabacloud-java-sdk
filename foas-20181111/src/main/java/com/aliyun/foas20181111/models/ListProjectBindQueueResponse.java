// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ListProjectBindQueueResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListProjectBindQueueResponseBody body;

    public static ListProjectBindQueueResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectBindQueueResponse self = new ListProjectBindQueueResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectBindQueueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProjectBindQueueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProjectBindQueueResponse setBody(ListProjectBindQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProjectBindQueueResponseBody getBody() {
        return this.body;
    }

}
