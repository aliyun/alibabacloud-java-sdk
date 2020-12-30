// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateChartNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateChartNamespaceResponse setBody(CreateChartNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateChartNamespaceResponseBody getBody() {
        return this.body;
    }

}
