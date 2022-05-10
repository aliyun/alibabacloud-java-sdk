// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ScanDataRemoveRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ScanDataRemoveRoleResponseBody body;

    public static ScanDataRemoveRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        ScanDataRemoveRoleResponse self = new ScanDataRemoveRoleResponse();
        return TeaModel.build(map, self);
    }

    public ScanDataRemoveRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScanDataRemoveRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ScanDataRemoveRoleResponse setBody(ScanDataRemoveRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public ScanDataRemoveRoleResponseBody getBody() {
        return this.body;
    }

}
