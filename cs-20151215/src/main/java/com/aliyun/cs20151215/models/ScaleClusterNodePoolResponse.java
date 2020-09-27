// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ScaleClusterNodePoolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

}
