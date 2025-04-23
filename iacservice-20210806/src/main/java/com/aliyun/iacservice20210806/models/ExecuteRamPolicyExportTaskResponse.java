// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ExecuteRamPolicyExportTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteRamPolicyExportTaskResponseBody body;

    public static ExecuteRamPolicyExportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteRamPolicyExportTaskResponse self = new ExecuteRamPolicyExportTaskResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteRamPolicyExportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteRamPolicyExportTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteRamPolicyExportTaskResponse setBody(ExecuteRamPolicyExportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteRamPolicyExportTaskResponseBody getBody() {
        return this.body;
    }

}
