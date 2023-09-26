// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class RemoveAccessPermissionByAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveAccessPermissionByAppsResponseBody body;

    public static RemoveAccessPermissionByAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveAccessPermissionByAppsResponse self = new RemoveAccessPermissionByAppsResponse();
        return TeaModel.build(map, self);
    }

    public RemoveAccessPermissionByAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveAccessPermissionByAppsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveAccessPermissionByAppsResponse setBody(RemoveAccessPermissionByAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveAccessPermissionByAppsResponseBody getBody() {
        return this.body;
    }

}
