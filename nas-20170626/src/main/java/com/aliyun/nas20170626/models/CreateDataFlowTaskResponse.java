// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateDataFlowTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataFlowTaskResponseBody body;

    public static CreateDataFlowTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataFlowTaskResponse self = new CreateDataFlowTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataFlowTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataFlowTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataFlowTaskResponse setBody(CreateDataFlowTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataFlowTaskResponseBody getBody() {
        return this.body;
    }

}
