// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetKvNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetKvNamespaceResponseBody body;

    public static GetKvNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKvNamespaceResponse self = new GetKvNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public GetKvNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKvNamespaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetKvNamespaceResponse setBody(GetKvNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKvNamespaceResponseBody getBody() {
        return this.body;
    }

}
