// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowEdgesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTaskFlowEdgesResponseBody body;

    public static UpdateTaskFlowEdgesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskFlowEdgesResponse self = new UpdateTaskFlowEdgesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTaskFlowEdgesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTaskFlowEdgesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTaskFlowEdgesResponse setBody(UpdateTaskFlowEdgesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTaskFlowEdgesResponseBody getBody() {
        return this.body;
    }

}
