// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ApproveOperationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ApproveOperationResponseBody body;

    public static ApproveOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        ApproveOperationResponse self = new ApproveOperationResponse();
        return TeaModel.build(map, self);
    }

    public ApproveOperationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApproveOperationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApproveOperationResponse setBody(ApproveOperationResponseBody body) {
        this.body = body;
        return this;
    }
    public ApproveOperationResponseBody getBody() {
        return this.body;
    }

}
