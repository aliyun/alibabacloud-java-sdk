// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListNodePoolComponentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNodePoolComponentsResponseBody body;

    public static ListNodePoolComponentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNodePoolComponentsResponse self = new ListNodePoolComponentsResponse();
        return TeaModel.build(map, self);
    }

    public ListNodePoolComponentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNodePoolComponentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNodePoolComponentsResponse setBody(ListNodePoolComponentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNodePoolComponentsResponseBody getBody() {
        return this.body;
    }

}
