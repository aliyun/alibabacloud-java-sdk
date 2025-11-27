// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CheckBatchTableAccessPermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckBatchTableAccessPermissionResponseBody body;

    public static CheckBatchTableAccessPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckBatchTableAccessPermissionResponse self = new CheckBatchTableAccessPermissionResponse();
        return TeaModel.build(map, self);
    }

    public CheckBatchTableAccessPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckBatchTableAccessPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckBatchTableAccessPermissionResponse setBody(CheckBatchTableAccessPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckBatchTableAccessPermissionResponseBody getBody() {
        return this.body;
    }

}
