// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class SetAccessPermissionByGroupForBackendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetAccessPermissionByGroupForBackendResponseBody body;

    public static SetAccessPermissionByGroupForBackendResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAccessPermissionByGroupForBackendResponse self = new SetAccessPermissionByGroupForBackendResponse();
        return TeaModel.build(map, self);
    }

    public SetAccessPermissionByGroupForBackendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAccessPermissionByGroupForBackendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetAccessPermissionByGroupForBackendResponse setBody(SetAccessPermissionByGroupForBackendResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAccessPermissionByGroupForBackendResponseBody getBody() {
        return this.body;
    }

}
