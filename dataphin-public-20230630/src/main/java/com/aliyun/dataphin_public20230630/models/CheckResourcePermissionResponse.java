// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CheckResourcePermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckResourcePermissionResponseBody body;

    public static CheckResourcePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckResourcePermissionResponse self = new CheckResourcePermissionResponse();
        return TeaModel.build(map, self);
    }

    public CheckResourcePermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckResourcePermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckResourcePermissionResponse setBody(CheckResourcePermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckResourcePermissionResponseBody getBody() {
        return this.body;
    }

}
