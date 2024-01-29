// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListEngineNamespacesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListEngineNamespacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEngineNamespacesResponse setBody(ListEngineNamespacesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEngineNamespacesResponseBody getBody() {
        return this.body;
    }

}
