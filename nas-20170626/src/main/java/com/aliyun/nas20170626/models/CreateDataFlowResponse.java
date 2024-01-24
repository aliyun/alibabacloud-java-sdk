// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateDataFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDataFlowResponseBody body;

    public static CreateDataFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataFlowResponse self = new CreateDataFlowResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataFlowResponse setBody(CreateDataFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataFlowResponseBody getBody() {
        return this.body;
    }

}
