// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListCsccJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListCsccJobsResponseBody body;

    public static ListCsccJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCsccJobsResponse self = new ListCsccJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListCsccJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCsccJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCsccJobsResponse setBody(ListCsccJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCsccJobsResponseBody getBody() {
        return this.body;
    }

}
