// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetApplicationGrantScopeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetApplicationGrantScopeResponseBody body;

    public static SetApplicationGrantScopeResponse build(java.util.Map<String, ?> map) throws Exception {
        SetApplicationGrantScopeResponse self = new SetApplicationGrantScopeResponse();
        return TeaModel.build(map, self);
    }

    public SetApplicationGrantScopeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetApplicationGrantScopeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetApplicationGrantScopeResponse setBody(SetApplicationGrantScopeResponseBody body) {
        this.body = body;
        return this;
    }
    public SetApplicationGrantScopeResponseBody getBody() {
        return this.body;
    }

}
