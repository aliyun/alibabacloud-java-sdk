// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DeleteFlowProjectUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFlowProjectUserResponseBody body;

    public static DeleteFlowProjectUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowProjectUserResponse self = new DeleteFlowProjectUserResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFlowProjectUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFlowProjectUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFlowProjectUserResponse setBody(DeleteFlowProjectUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFlowProjectUserResponseBody getBody() {
        return this.body;
    }

}
