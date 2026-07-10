// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class BatchQueryDepartmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchQueryDepartmentResponseBody body;

    public static BatchQueryDepartmentResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryDepartmentResponse self = new BatchQueryDepartmentResponse();
        return TeaModel.build(map, self);
    }

    public BatchQueryDepartmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchQueryDepartmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchQueryDepartmentResponse setBody(BatchQueryDepartmentResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchQueryDepartmentResponseBody getBody() {
        return this.body;
    }

}
