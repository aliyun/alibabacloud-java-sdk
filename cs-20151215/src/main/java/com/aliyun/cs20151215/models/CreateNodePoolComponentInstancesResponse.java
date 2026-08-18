// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateNodePoolComponentInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateNodePoolComponentInstancesResponseBody body;

    public static CreateNodePoolComponentInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNodePoolComponentInstancesResponse self = new CreateNodePoolComponentInstancesResponse();
        return TeaModel.build(map, self);
    }

    public CreateNodePoolComponentInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNodePoolComponentInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNodePoolComponentInstancesResponse setBody(CreateNodePoolComponentInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNodePoolComponentInstancesResponseBody getBody() {
        return this.body;
    }

}
