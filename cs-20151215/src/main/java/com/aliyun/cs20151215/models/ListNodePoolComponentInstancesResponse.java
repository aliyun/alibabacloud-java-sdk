// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListNodePoolComponentInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNodePoolComponentInstancesResponseBody body;

    public static ListNodePoolComponentInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNodePoolComponentInstancesResponse self = new ListNodePoolComponentInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListNodePoolComponentInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNodePoolComponentInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNodePoolComponentInstancesResponse setBody(ListNodePoolComponentInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNodePoolComponentInstancesResponseBody getBody() {
        return this.body;
    }

}
