// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class BatchModifyEntitlementResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchModifyEntitlementResponseBody body;

    public static BatchModifyEntitlementResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchModifyEntitlementResponse self = new BatchModifyEntitlementResponse();
        return TeaModel.build(map, self);
    }

    public BatchModifyEntitlementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchModifyEntitlementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchModifyEntitlementResponse setBody(BatchModifyEntitlementResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchModifyEntitlementResponseBody getBody() {
        return this.body;
    }

}
