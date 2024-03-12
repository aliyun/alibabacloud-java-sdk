// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetApplicationGrantScopeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetApplicationGrantScopeResponseBody body;

    public static GetApplicationGrantScopeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationGrantScopeResponse self = new GetApplicationGrantScopeResponse();
        return TeaModel.build(map, self);
    }

    public GetApplicationGrantScopeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApplicationGrantScopeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApplicationGrantScopeResponse setBody(GetApplicationGrantScopeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApplicationGrantScopeResponseBody getBody() {
        return this.body;
    }

}
