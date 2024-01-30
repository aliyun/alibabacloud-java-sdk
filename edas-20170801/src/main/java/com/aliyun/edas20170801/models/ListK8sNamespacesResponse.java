// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListK8sNamespacesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListK8sNamespacesResponseBody body;

    public static ListK8sNamespacesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListK8sNamespacesResponse self = new ListK8sNamespacesResponse();
        return TeaModel.build(map, self);
    }

    public ListK8sNamespacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListK8sNamespacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListK8sNamespacesResponse setBody(ListK8sNamespacesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListK8sNamespacesResponseBody getBody() {
        return this.body;
    }

}
