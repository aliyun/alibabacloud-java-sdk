// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetClusterAddonInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetClusterAddonInstanceResponseBody body;

    public static GetClusterAddonInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClusterAddonInstanceResponse self = new GetClusterAddonInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetClusterAddonInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClusterAddonInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClusterAddonInstanceResponse setBody(GetClusterAddonInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClusterAddonInstanceResponseBody getBody() {
        return this.body;
    }

}
