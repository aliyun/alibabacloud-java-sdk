// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateSecurityGroupPermissionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSecurityGroupPermissionsResponseBody body;

    public static CreateSecurityGroupPermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityGroupPermissionsResponse self = new CreateSecurityGroupPermissionsResponse();
        return TeaModel.build(map, self);
    }

    public CreateSecurityGroupPermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSecurityGroupPermissionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSecurityGroupPermissionsResponse setBody(CreateSecurityGroupPermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSecurityGroupPermissionsResponseBody getBody() {
        return this.body;
    }

}
