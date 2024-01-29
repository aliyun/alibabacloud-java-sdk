// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListPipelineGroupPipelinesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPipelineGroupPipelinesResponseBody body;

    public static ListPipelineGroupPipelinesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineGroupPipelinesResponse self = new ListPipelineGroupPipelinesResponse();
        return TeaModel.build(map, self);
    }

    public ListPipelineGroupPipelinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPipelineGroupPipelinesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPipelineGroupPipelinesResponse setBody(ListPipelineGroupPipelinesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPipelineGroupPipelinesResponseBody getBody() {
        return this.body;
    }

}
