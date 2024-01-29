// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListMergeRequestsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMergeRequestsResponseBody body;

    public static ListMergeRequestsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMergeRequestsResponse self = new ListMergeRequestsResponse();
        return TeaModel.build(map, self);
    }

    public ListMergeRequestsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMergeRequestsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMergeRequestsResponse setBody(ListMergeRequestsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMergeRequestsResponseBody getBody() {
        return this.body;
    }

}
