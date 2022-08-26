// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ApplyApproveResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ApplyApproveResponseBody body;

    public static ApplyApproveResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyApproveResponse self = new ApplyApproveResponse();
        return TeaModel.build(map, self);
    }

    public ApplyApproveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyApproveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyApproveResponse setBody(ApplyApproveResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyApproveResponseBody getBody() {
        return this.body;
    }

}
