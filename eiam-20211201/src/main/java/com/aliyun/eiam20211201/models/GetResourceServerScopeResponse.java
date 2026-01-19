// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetResourceServerScopeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetResourceServerScopeResponseBody body;

    public static GetResourceServerScopeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceServerScopeResponse self = new GetResourceServerScopeResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceServerScopeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceServerScopeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceServerScopeResponse setBody(GetResourceServerScopeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceServerScopeResponseBody getBody() {
        return this.body;
    }

}
