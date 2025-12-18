// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SyncDepartmentUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyncDepartmentUserResponseBody body;

    public static SyncDepartmentUserResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncDepartmentUserResponse self = new SyncDepartmentUserResponse();
        return TeaModel.build(map, self);
    }

    public SyncDepartmentUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncDepartmentUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncDepartmentUserResponse setBody(SyncDepartmentUserResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncDepartmentUserResponseBody getBody() {
        return this.body;
    }

}
