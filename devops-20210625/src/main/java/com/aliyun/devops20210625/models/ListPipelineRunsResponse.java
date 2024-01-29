// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListPipelineRunsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPipelineRunsResponseBody body;

    public static ListPipelineRunsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineRunsResponse self = new ListPipelineRunsResponse();
        return TeaModel.build(map, self);
    }

    public ListPipelineRunsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPipelineRunsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPipelineRunsResponse setBody(ListPipelineRunsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPipelineRunsResponseBody getBody() {
        return this.body;
    }

}
