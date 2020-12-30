// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteChartNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteChartNamespaceResponse setBody(DeleteChartNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteChartNamespaceResponseBody getBody() {
        return this.body;
    }

}
