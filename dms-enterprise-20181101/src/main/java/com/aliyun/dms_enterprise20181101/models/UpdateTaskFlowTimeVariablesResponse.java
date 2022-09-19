// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowTimeVariablesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTaskFlowTimeVariablesResponseBody body;

    public static UpdateTaskFlowTimeVariablesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskFlowTimeVariablesResponse self = new UpdateTaskFlowTimeVariablesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTaskFlowTimeVariablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTaskFlowTimeVariablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTaskFlowTimeVariablesResponse setBody(UpdateTaskFlowTimeVariablesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTaskFlowTimeVariablesResponseBody getBody() {
        return this.body;
    }

}
