// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListRepositoryGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRepositoryGroupsResponseBody body;

    public static ListRepositoryGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryGroupsResponse self = new ListRepositoryGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListRepositoryGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRepositoryGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRepositoryGroupsResponse setBody(ListRepositoryGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRepositoryGroupsResponseBody getBody() {
        return this.body;
    }

}
