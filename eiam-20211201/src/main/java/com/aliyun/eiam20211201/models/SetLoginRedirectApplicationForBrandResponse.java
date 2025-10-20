// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetLoginRedirectApplicationForBrandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetLoginRedirectApplicationForBrandResponseBody body;

    public static SetLoginRedirectApplicationForBrandResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLoginRedirectApplicationForBrandResponse self = new SetLoginRedirectApplicationForBrandResponse();
        return TeaModel.build(map, self);
    }

    public SetLoginRedirectApplicationForBrandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetLoginRedirectApplicationForBrandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetLoginRedirectApplicationForBrandResponse setBody(SetLoginRedirectApplicationForBrandResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLoginRedirectApplicationForBrandResponseBody getBody() {
        return this.body;
    }

}
