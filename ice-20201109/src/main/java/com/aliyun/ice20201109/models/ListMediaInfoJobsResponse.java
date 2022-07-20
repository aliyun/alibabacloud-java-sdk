// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListMediaInfoJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListMediaInfoJobsResponseBody body;

    public static ListMediaInfoJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMediaInfoJobsResponse self = new ListMediaInfoJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListMediaInfoJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMediaInfoJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMediaInfoJobsResponse setBody(ListMediaInfoJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMediaInfoJobsResponseBody getBody() {
        return this.body;
    }

}
