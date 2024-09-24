// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateDataFlowSubTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataFlowSubTaskResponseBody body;

    public static CreateDataFlowSubTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataFlowSubTaskResponse self = new CreateDataFlowSubTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataFlowSubTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataFlowSubTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataFlowSubTaskResponse setBody(CreateDataFlowSubTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataFlowSubTaskResponseBody getBody() {
        return this.body;
    }

}
