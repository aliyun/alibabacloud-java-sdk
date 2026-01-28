// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetAuthorizationResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAuthorizationResourceResponseBody body;

    public static GetAuthorizationResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuthorizationResourceResponse self = new GetAuthorizationResourceResponse();
        return TeaModel.build(map, self);
    }

    public GetAuthorizationResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAuthorizationResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAuthorizationResourceResponse setBody(GetAuthorizationResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAuthorizationResourceResponseBody getBody() {
        return this.body;
    }

}
