// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeletePipelineGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePipelineGroupResponseBody body;

    public static DeletePipelineGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePipelineGroupResponse self = new DeletePipelineGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeletePipelineGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePipelineGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePipelineGroupResponse setBody(DeletePipelineGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePipelineGroupResponseBody getBody() {
        return this.body;
    }

}
