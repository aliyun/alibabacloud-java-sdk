// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class GetIcebergNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Namespace body;

    public static GetIcebergNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIcebergNamespaceResponse self = new GetIcebergNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public GetIcebergNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIcebergNamespaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIcebergNamespaceResponse setBody(Namespace body) {
        this.body = body;
        return this;
    }
    public Namespace getBody() {
        return this.body;
    }

}
