// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListJobRunsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListJobRunsResponseBody body;

    public static ListJobRunsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListJobRunsResponse self = new ListJobRunsResponse();
        return TeaModel.build(map, self);
    }

    public ListJobRunsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListJobRunsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListJobRunsResponse setBody(ListJobRunsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListJobRunsResponseBody getBody() {
        return this.body;
    }

}
