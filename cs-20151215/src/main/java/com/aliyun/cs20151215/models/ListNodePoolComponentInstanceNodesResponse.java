// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListNodePoolComponentInstanceNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNodePoolComponentInstanceNodesResponseBody body;

    public static ListNodePoolComponentInstanceNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNodePoolComponentInstanceNodesResponse self = new ListNodePoolComponentInstanceNodesResponse();
        return TeaModel.build(map, self);
    }

    public ListNodePoolComponentInstanceNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNodePoolComponentInstanceNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNodePoolComponentInstanceNodesResponse setBody(ListNodePoolComponentInstanceNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNodePoolComponentInstanceNodesResponseBody getBody() {
        return this.body;
    }

}
