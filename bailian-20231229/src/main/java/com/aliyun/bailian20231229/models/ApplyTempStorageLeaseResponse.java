// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ApplyTempStorageLeaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyTempStorageLeaseResponseBody body;

    public static ApplyTempStorageLeaseResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyTempStorageLeaseResponse self = new ApplyTempStorageLeaseResponse();
        return TeaModel.build(map, self);
    }

    public ApplyTempStorageLeaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyTempStorageLeaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyTempStorageLeaseResponse setBody(ApplyTempStorageLeaseResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyTempStorageLeaseResponseBody getBody() {
        return this.body;
    }

}
