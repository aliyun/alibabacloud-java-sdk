// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteSecurityGroupPermissionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSecurityGroupPermissionsResponseBody body;

    public static DeleteSecurityGroupPermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityGroupPermissionsResponse self = new DeleteSecurityGroupPermissionsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityGroupPermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSecurityGroupPermissionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSecurityGroupPermissionsResponse setBody(DeleteSecurityGroupPermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSecurityGroupPermissionsResponseBody getBody() {
        return this.body;
    }

}
