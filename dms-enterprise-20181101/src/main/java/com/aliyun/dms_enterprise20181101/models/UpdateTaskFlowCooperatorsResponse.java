// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowCooperatorsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTaskFlowCooperatorsResponseBody body;

    public static UpdateTaskFlowCooperatorsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskFlowCooperatorsResponse self = new UpdateTaskFlowCooperatorsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTaskFlowCooperatorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTaskFlowCooperatorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTaskFlowCooperatorsResponse setBody(UpdateTaskFlowCooperatorsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTaskFlowCooperatorsResponseBody getBody() {
        return this.body;
    }

}
