// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListMergeRequestCommentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMergeRequestCommentsResponseBody body;

    public static ListMergeRequestCommentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMergeRequestCommentsResponse self = new ListMergeRequestCommentsResponse();
        return TeaModel.build(map, self);
    }

    public ListMergeRequestCommentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMergeRequestCommentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMergeRequestCommentsResponse setBody(ListMergeRequestCommentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMergeRequestCommentsResponseBody getBody() {
        return this.body;
    }

}
