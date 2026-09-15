// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetLumaNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLumaNamespaceResponseBody body;

    public static GetLumaNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLumaNamespaceResponse self = new GetLumaNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public GetLumaNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLumaNamespaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLumaNamespaceResponse setBody(GetLumaNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLumaNamespaceResponseBody getBody() {
        return this.body;
    }

}
