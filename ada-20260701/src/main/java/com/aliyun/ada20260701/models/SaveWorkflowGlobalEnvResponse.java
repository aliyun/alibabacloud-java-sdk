// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class SaveWorkflowGlobalEnvResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveWorkflowGlobalEnvResponseBody body;

    public static SaveWorkflowGlobalEnvResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveWorkflowGlobalEnvResponse self = new SaveWorkflowGlobalEnvResponse();
        return TeaModel.build(map, self);
    }

    public SaveWorkflowGlobalEnvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveWorkflowGlobalEnvResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveWorkflowGlobalEnvResponse setBody(SaveWorkflowGlobalEnvResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveWorkflowGlobalEnvResponseBody getBody() {
        return this.body;
    }

}
