// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetApplicationProvisioningScopeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetApplicationProvisioningScopeResponseBody body;

    public static GetApplicationProvisioningScopeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationProvisioningScopeResponse self = new GetApplicationProvisioningScopeResponse();
        return TeaModel.build(map, self);
    }

    public GetApplicationProvisioningScopeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApplicationProvisioningScopeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApplicationProvisioningScopeResponse setBody(GetApplicationProvisioningScopeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApplicationProvisioningScopeResponseBody getBody() {
        return this.body;
    }

}
