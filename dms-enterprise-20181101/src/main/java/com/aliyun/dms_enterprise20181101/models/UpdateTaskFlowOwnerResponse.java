// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowOwnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTaskFlowOwnerResponseBody body;

    public static UpdateTaskFlowOwnerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskFlowOwnerResponse self = new UpdateTaskFlowOwnerResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTaskFlowOwnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTaskFlowOwnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTaskFlowOwnerResponse setBody(UpdateTaskFlowOwnerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTaskFlowOwnerResponseBody getBody() {
        return this.body;
    }

}
