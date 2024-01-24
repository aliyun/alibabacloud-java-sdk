// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteDataFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDataFlowResponseBody body;

    public static DeleteDataFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataFlowResponse self = new DeleteDataFlowResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataFlowResponse setBody(DeleteDataFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataFlowResponseBody getBody() {
        return this.body;
    }

}
