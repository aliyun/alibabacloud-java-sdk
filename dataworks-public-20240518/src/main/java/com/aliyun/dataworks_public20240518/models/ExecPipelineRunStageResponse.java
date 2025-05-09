// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ExecPipelineRunStageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecPipelineRunStageResponseBody body;

    public static ExecPipelineRunStageResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecPipelineRunStageResponse self = new ExecPipelineRunStageResponse();
        return TeaModel.build(map, self);
    }

    public ExecPipelineRunStageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecPipelineRunStageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecPipelineRunStageResponse setBody(ExecPipelineRunStageResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecPipelineRunStageResponseBody getBody() {
        return this.body;
    }

}
