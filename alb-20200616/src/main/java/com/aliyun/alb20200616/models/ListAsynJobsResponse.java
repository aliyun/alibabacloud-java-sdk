// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListAsynJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAsynJobsResponseBody body;

    public static ListAsynJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAsynJobsResponse self = new ListAsynJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListAsynJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAsynJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAsynJobsResponse setBody(ListAsynJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAsynJobsResponseBody getBody() {
        return this.body;
    }

}
