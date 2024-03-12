// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetApplicationProvisioningScopeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
