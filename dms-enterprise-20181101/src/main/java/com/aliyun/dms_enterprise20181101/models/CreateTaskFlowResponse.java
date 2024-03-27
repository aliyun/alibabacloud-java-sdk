// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateTaskFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTaskFlowResponseBody body;

    public static CreateTaskFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskFlowResponse self = new CreateTaskFlowResponse();
        return TeaModel.build(map, self);
    }

    public CreateTaskFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTaskFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTaskFlowResponse setBody(CreateTaskFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTaskFlowResponseBody getBody() {
        return this.body;
    }

}
