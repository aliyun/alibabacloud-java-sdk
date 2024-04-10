// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNamespaceResponseBody body;

    public static GetNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNamespaceResponse self = new GetNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public GetNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNamespaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNamespaceResponse setBody(GetNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNamespaceResponseBody getBody() {
        return this.body;
    }

}
