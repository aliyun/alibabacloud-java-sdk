// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateChartNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateChartNamespaceResponseBody body;

    public static CreateChartNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateChartNamespaceResponse self = new CreateChartNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public CreateChartNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateChartNamespaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateChartNamespaceResponse setBody(CreateChartNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateChartNamespaceResponseBody getBody() {
        return this.body;
    }

}
