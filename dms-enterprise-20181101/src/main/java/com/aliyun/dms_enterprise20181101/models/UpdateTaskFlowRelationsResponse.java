// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowRelationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTaskFlowRelationsResponseBody body;

    public static UpdateTaskFlowRelationsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskFlowRelationsResponse self = new UpdateTaskFlowRelationsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTaskFlowRelationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTaskFlowRelationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTaskFlowRelationsResponse setBody(UpdateTaskFlowRelationsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTaskFlowRelationsResponseBody getBody() {
        return this.body;
    }

}
