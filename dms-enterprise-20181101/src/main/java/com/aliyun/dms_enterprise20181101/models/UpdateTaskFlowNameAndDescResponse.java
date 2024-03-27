// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowNameAndDescResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTaskFlowNameAndDescResponseBody body;

    public static UpdateTaskFlowNameAndDescResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskFlowNameAndDescResponse self = new UpdateTaskFlowNameAndDescResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTaskFlowNameAndDescResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTaskFlowNameAndDescResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTaskFlowNameAndDescResponse setBody(UpdateTaskFlowNameAndDescResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTaskFlowNameAndDescResponseBody getBody() {
        return this.body;
    }

}
