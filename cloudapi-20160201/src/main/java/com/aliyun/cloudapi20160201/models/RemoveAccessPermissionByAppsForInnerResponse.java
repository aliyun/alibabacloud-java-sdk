// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class RemoveAccessPermissionByAppsForInnerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveAccessPermissionByAppsForInnerResponseBody body;

    public static RemoveAccessPermissionByAppsForInnerResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveAccessPermissionByAppsForInnerResponse self = new RemoveAccessPermissionByAppsForInnerResponse();
        return TeaModel.build(map, self);
    }

    public RemoveAccessPermissionByAppsForInnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveAccessPermissionByAppsForInnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveAccessPermissionByAppsForInnerResponse setBody(RemoveAccessPermissionByAppsForInnerResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveAccessPermissionByAppsForInnerResponseBody getBody() {
        return this.body;
    }

}
