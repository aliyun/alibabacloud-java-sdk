// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class RepairClusterNodePoolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RepairClusterNodePoolResponseBody body;

    public static RepairClusterNodePoolResponse build(java.util.Map<String, ?> map) throws Exception {
        RepairClusterNodePoolResponse self = new RepairClusterNodePoolResponse();
        return TeaModel.build(map, self);
    }

    public RepairClusterNodePoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RepairClusterNodePoolResponse setBody(RepairClusterNodePoolResponseBody body) {
        this.body = body;
        return this;
    }
    public RepairClusterNodePoolResponseBody getBody() {
        return this.body;
    }

}
