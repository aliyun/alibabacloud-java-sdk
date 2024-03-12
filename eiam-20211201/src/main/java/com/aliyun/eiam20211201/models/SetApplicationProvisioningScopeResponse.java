// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetApplicationProvisioningScopeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetApplicationProvisioningScopeResponseBody body;

    public static SetApplicationProvisioningScopeResponse build(java.util.Map<String, ?> map) throws Exception {
        SetApplicationProvisioningScopeResponse self = new SetApplicationProvisioningScopeResponse();
        return TeaModel.build(map, self);
    }

    public SetApplicationProvisioningScopeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetApplicationProvisioningScopeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetApplicationProvisioningScopeResponse setBody(SetApplicationProvisioningScopeResponseBody body) {
        this.body = body;
        return this;
    }
    public SetApplicationProvisioningScopeResponseBody getBody() {
        return this.body;
    }

}
