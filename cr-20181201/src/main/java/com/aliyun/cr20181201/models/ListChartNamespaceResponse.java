// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListChartNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListChartNamespaceResponseBody body;

    public static ListChartNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListChartNamespaceResponse self = new ListChartNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public ListChartNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListChartNamespaceResponse setBody(ListChartNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListChartNamespaceResponseBody getBody() {
        return this.body;
    }

}
