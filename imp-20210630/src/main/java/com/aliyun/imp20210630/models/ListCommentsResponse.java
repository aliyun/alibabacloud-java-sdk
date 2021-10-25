// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListCommentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCommentsResponseBody body;

    public static ListCommentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCommentsResponse self = new ListCommentsResponse();
        return TeaModel.build(map, self);
    }

    public ListCommentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCommentsResponse setBody(ListCommentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCommentsResponseBody getBody() {
        return this.body;
    }

}
