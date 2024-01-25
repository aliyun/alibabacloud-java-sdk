// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class RemoveAccessPermissionByApisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveAccessPermissionByApisResponseBody body;

    public static RemoveAccessPermissionByApisResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveAccessPermissionByApisResponse self = new RemoveAccessPermissionByApisResponse();
        return TeaModel.build(map, self);
    }

    public RemoveAccessPermissionByApisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveAccessPermissionByApisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveAccessPermissionByApisResponse setBody(RemoveAccessPermissionByApisResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveAccessPermissionByApisResponseBody getBody() {
        return this.body;
    }

}
