// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListDatasetJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDatasetJobsResponseBody body;

    public static ListDatasetJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetJobsResponse self = new ListDatasetJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListDatasetJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDatasetJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDatasetJobsResponse setBody(ListDatasetJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDatasetJobsResponseBody getBody() {
        return this.body;
    }

}
