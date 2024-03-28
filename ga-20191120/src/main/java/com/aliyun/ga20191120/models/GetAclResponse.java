// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetAclResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAclResponseBody body;

    public static GetAclResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAclResponse self = new GetAclResponse();
        return TeaModel.build(map, self);
    }

    public GetAclResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAclResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAclResponse setBody(GetAclResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAclResponseBody getBody() {
        return this.body;
    }

}
