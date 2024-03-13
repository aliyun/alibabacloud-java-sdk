// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListDeploymentJobResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDeploymentJobResourceResponseBody body;

    public static ListDeploymentJobResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentJobResourceResponse self = new ListDeploymentJobResourceResponse();
        return TeaModel.build(map, self);
    }

    public ListDeploymentJobResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeploymentJobResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDeploymentJobResourceResponse setBody(ListDeploymentJobResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeploymentJobResourceResponseBody getBody() {
        return this.body;
    }

}
