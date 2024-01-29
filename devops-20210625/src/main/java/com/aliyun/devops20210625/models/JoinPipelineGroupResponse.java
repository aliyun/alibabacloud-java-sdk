// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class JoinPipelineGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public JoinPipelineGroupResponseBody body;

    public static JoinPipelineGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        JoinPipelineGroupResponse self = new JoinPipelineGroupResponse();
        return TeaModel.build(map, self);
    }

    public JoinPipelineGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public JoinPipelineGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public JoinPipelineGroupResponse setBody(JoinPipelineGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public JoinPipelineGroupResponseBody getBody() {
        return this.body;
    }

}
