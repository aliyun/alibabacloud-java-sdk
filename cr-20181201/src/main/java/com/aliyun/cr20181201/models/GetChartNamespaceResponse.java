// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetChartNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetChartNamespaceResponseBody body;

    public static GetChartNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetChartNamespaceResponse self = new GetChartNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public GetChartNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetChartNamespaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetChartNamespaceResponse setBody(GetChartNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetChartNamespaceResponseBody getBody() {
        return this.body;
    }

}
