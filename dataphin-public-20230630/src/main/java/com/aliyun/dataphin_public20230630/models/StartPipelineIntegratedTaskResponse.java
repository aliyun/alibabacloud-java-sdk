// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class StartPipelineIntegratedTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartPipelineIntegratedTaskResponseBody body;

    public static StartPipelineIntegratedTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StartPipelineIntegratedTaskResponse self = new StartPipelineIntegratedTaskResponse();
        return TeaModel.build(map, self);
    }

    public StartPipelineIntegratedTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartPipelineIntegratedTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartPipelineIntegratedTaskResponse setBody(StartPipelineIntegratedTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StartPipelineIntegratedTaskResponseBody getBody() {
        return this.body;
    }

}
