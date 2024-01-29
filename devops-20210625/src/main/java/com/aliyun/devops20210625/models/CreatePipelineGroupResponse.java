// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreatePipelineGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePipelineGroupResponseBody body;

    public static CreatePipelineGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelineGroupResponse self = new CreatePipelineGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreatePipelineGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePipelineGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePipelineGroupResponse setBody(CreatePipelineGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePipelineGroupResponseBody getBody() {
        return this.body;
    }

}
