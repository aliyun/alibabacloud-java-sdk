// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEnvCustomJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListEnvCustomJobsResponseBody body;

    public static ListEnvCustomJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnvCustomJobsResponse self = new ListEnvCustomJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListEnvCustomJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnvCustomJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEnvCustomJobsResponse setBody(ListEnvCustomJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnvCustomJobsResponseBody getBody() {
        return this.body;
    }

}
