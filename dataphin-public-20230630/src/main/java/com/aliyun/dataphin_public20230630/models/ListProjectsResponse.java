// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListProjectsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProjectsResponseBody body;

    public static ListProjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsResponse self = new ListProjectsResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProjectsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProjectsResponse setBody(ListProjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProjectsResponseBody getBody() {
        return this.body;
    }

}
