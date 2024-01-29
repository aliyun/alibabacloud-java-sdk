// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListRepositoryTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRepositoryTagsResponseBody body;

    public static ListRepositoryTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryTagsResponse self = new ListRepositoryTagsResponse();
        return TeaModel.build(map, self);
    }

    public ListRepositoryTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRepositoryTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRepositoryTagsResponse setBody(ListRepositoryTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRepositoryTagsResponseBody getBody() {
        return this.body;
    }

}
