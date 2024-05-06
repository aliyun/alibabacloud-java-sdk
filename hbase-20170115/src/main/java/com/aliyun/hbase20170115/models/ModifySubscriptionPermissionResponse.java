// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class ModifySubscriptionPermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySubscriptionPermissionResponseBody body;

    public static ModifySubscriptionPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySubscriptionPermissionResponse self = new ModifySubscriptionPermissionResponse();
        return TeaModel.build(map, self);
    }

    public ModifySubscriptionPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySubscriptionPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySubscriptionPermissionResponse setBody(ModifySubscriptionPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySubscriptionPermissionResponseBody getBody() {
        return this.body;
    }

}
