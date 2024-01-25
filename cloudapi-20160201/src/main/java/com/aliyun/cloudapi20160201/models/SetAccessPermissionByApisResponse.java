// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class SetAccessPermissionByApisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetAccessPermissionByApisResponseBody body;

    public static SetAccessPermissionByApisResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAccessPermissionByApisResponse self = new SetAccessPermissionByApisResponse();
        return TeaModel.build(map, self);
    }

    public SetAccessPermissionByApisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAccessPermissionByApisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetAccessPermissionByApisResponse setBody(SetAccessPermissionByApisResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAccessPermissionByApisResponseBody getBody() {
        return this.body;
    }

}
