// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ApplyResourcePermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyResourcePermissionResponseBody body;

    public static ApplyResourcePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyResourcePermissionResponse self = new ApplyResourcePermissionResponse();
        return TeaModel.build(map, self);
    }

    public ApplyResourcePermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyResourcePermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyResourcePermissionResponse setBody(ApplyResourcePermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyResourcePermissionResponseBody getBody() {
        return this.body;
    }

}
