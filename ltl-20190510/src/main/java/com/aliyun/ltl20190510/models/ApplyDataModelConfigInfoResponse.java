// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class ApplyDataModelConfigInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ApplyDataModelConfigInfoResponseBody body;

    public static ApplyDataModelConfigInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyDataModelConfigInfoResponse self = new ApplyDataModelConfigInfoResponse();
        return TeaModel.build(map, self);
    }

    public ApplyDataModelConfigInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyDataModelConfigInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyDataModelConfigInfoResponse setBody(ApplyDataModelConfigInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyDataModelConfigInfoResponseBody getBody() {
        return this.body;
    }

}
