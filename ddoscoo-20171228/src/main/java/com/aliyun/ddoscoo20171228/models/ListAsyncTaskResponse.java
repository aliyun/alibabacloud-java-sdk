// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ListAsyncTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAsyncTaskResponseBody body;

    public static ListAsyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAsyncTaskResponse self = new ListAsyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListAsyncTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAsyncTaskResponse setBody(ListAsyncTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAsyncTaskResponseBody getBody() {
        return this.body;
    }

}
