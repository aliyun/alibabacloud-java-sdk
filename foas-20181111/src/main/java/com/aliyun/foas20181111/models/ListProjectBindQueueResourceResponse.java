// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ListProjectBindQueueResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListProjectBindQueueResourceResponseBody body;

    public static ListProjectBindQueueResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectBindQueueResourceResponse self = new ListProjectBindQueueResourceResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectBindQueueResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProjectBindQueueResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProjectBindQueueResourceResponse setBody(ListProjectBindQueueResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProjectBindQueueResourceResponseBody getBody() {
        return this.body;
    }

}
