// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SyncDepartmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyncDepartmentResponseBody body;

    public static SyncDepartmentResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncDepartmentResponse self = new SyncDepartmentResponse();
        return TeaModel.build(map, self);
    }

    public SyncDepartmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncDepartmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncDepartmentResponse setBody(SyncDepartmentResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncDepartmentResponseBody getBody() {
        return this.body;
    }

}
