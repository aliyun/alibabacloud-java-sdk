// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListPipelineJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPipelineJobsResponseBody body;

    public static ListPipelineJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineJobsResponse self = new ListPipelineJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListPipelineJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPipelineJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPipelineJobsResponse setBody(ListPipelineJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPipelineJobsResponseBody getBody() {
        return this.body;
    }

}
