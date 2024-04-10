// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteChartNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteChartNamespaceResponseBody body;

    public static DeleteChartNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteChartNamespaceResponse self = new DeleteChartNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteChartNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteChartNamespaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteChartNamespaceResponse setBody(DeleteChartNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteChartNamespaceResponseBody getBody() {
        return this.body;
    }

}
