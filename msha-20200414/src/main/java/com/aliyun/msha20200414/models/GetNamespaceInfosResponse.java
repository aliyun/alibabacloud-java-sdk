// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class GetNamespaceInfosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetNamespaceInfosResponseBody body;

    public static GetNamespaceInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNamespaceInfosResponse self = new GetNamespaceInfosResponse();
        return TeaModel.build(map, self);
    }

    public GetNamespaceInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNamespaceInfosResponse setBody(GetNamespaceInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNamespaceInfosResponseBody getBody() {
        return this.body;
    }

}
