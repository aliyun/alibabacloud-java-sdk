// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowConstantsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTaskFlowConstantsResponseBody body;

    public static UpdateTaskFlowConstantsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskFlowConstantsResponse self = new UpdateTaskFlowConstantsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTaskFlowConstantsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTaskFlowConstantsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTaskFlowConstantsResponse setBody(UpdateTaskFlowConstantsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTaskFlowConstantsResponseBody getBody() {
        return this.body;
    }

}
