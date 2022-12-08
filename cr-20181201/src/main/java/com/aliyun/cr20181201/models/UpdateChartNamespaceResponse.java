// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateChartNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateChartNamespaceResponseBody body;

    public static UpdateChartNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateChartNamespaceResponse self = new UpdateChartNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateChartNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateChartNamespaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateChartNamespaceResponse setBody(UpdateChartNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateChartNamespaceResponseBody getBody() {
        return this.body;
    }

}
