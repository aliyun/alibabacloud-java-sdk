// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetPipelineGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPipelineGroupResponseBody body;

    public static GetPipelineGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineGroupResponse self = new GetPipelineGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetPipelineGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPipelineGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPipelineGroupResponse setBody(GetPipelineGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPipelineGroupResponseBody getBody() {
        return this.body;
    }

}
