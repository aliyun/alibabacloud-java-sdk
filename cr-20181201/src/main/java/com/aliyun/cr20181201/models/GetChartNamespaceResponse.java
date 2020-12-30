// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetChartNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetChartNamespaceResponse setBody(GetChartNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetChartNamespaceResponseBody getBody() {
        return this.body;
    }

}
