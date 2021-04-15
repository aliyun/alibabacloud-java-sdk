// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListEngineNamespacesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEngineNamespacesResponseBody body;

    public static ListEngineNamespacesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEngineNamespacesResponse self = new ListEngineNamespacesResponse();
        return TeaModel.build(map, self);
    }

    public ListEngineNamespacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEngineNamespacesResponse setBody(ListEngineNamespacesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEngineNamespacesResponseBody getBody() {
        return this.body;
    }

}
