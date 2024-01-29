// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdatePipelineGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePipelineGroupResponseBody body;

    public static UpdatePipelineGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePipelineGroupResponse self = new UpdatePipelineGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePipelineGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePipelineGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePipelineGroupResponse setBody(UpdatePipelineGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePipelineGroupResponseBody getBody() {
        return this.body;
    }

}
