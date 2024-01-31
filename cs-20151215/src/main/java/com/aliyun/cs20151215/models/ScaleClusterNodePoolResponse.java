// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ScaleClusterNodePoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ScaleClusterNodePoolResponseBody body;

    public static ScaleClusterNodePoolResponse build(java.util.Map<String, ?> map) throws Exception {
        ScaleClusterNodePoolResponse self = new ScaleClusterNodePoolResponse();
        return TeaModel.build(map, self);
    }

    public ScaleClusterNodePoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScaleClusterNodePoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ScaleClusterNodePoolResponse setBody(ScaleClusterNodePoolResponseBody body) {
        this.body = body;
        return this;
    }
    public ScaleClusterNodePoolResponseBody getBody() {
        return this.body;
    }

}
