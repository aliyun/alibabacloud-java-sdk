// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class DeleteFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFlowResponseBody body;

    public static DeleteFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowResponse self = new DeleteFlowResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFlowResponse setBody(DeleteFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFlowResponseBody getBody() {
        return this.body;
    }

}
