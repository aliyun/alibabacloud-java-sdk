// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class StopPipelineIntegratedTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopPipelineIntegratedTaskResponseBody body;

    public static StopPipelineIntegratedTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopPipelineIntegratedTaskResponse self = new StopPipelineIntegratedTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopPipelineIntegratedTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopPipelineIntegratedTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopPipelineIntegratedTaskResponse setBody(StopPipelineIntegratedTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StopPipelineIntegratedTaskResponseBody getBody() {
        return this.body;
    }

}
