// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ApplyResourceAccessPermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyResourceAccessPermissionResponseBody body;

    public static ApplyResourceAccessPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyResourceAccessPermissionResponse self = new ApplyResourceAccessPermissionResponse();
        return TeaModel.build(map, self);
    }

    public ApplyResourceAccessPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyResourceAccessPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyResourceAccessPermissionResponse setBody(ApplyResourceAccessPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyResourceAccessPermissionResponseBody getBody() {
        return this.body;
    }

}
