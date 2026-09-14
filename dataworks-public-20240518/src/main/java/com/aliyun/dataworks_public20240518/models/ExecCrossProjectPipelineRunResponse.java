// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ExecCrossProjectPipelineRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecCrossProjectPipelineRunResponseBody body;

    public static ExecCrossProjectPipelineRunResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecCrossProjectPipelineRunResponse self = new ExecCrossProjectPipelineRunResponse();
        return TeaModel.build(map, self);
    }

    public ExecCrossProjectPipelineRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecCrossProjectPipelineRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecCrossProjectPipelineRunResponse setBody(ExecCrossProjectPipelineRunResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecCrossProjectPipelineRunResponseBody getBody() {
        return this.body;
    }

}
