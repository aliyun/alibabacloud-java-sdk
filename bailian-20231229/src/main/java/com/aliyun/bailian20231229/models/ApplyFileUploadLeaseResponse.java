// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ApplyFileUploadLeaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyFileUploadLeaseResponseBody body;

    public static ApplyFileUploadLeaseResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyFileUploadLeaseResponse self = new ApplyFileUploadLeaseResponse();
        return TeaModel.build(map, self);
    }

    public ApplyFileUploadLeaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyFileUploadLeaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyFileUploadLeaseResponse setBody(ApplyFileUploadLeaseResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyFileUploadLeaseResponseBody getBody() {
        return this.body;
    }

}
