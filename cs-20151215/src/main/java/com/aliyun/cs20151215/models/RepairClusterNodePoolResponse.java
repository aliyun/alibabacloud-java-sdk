// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class RepairClusterNodePoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RepairClusterNodePoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RepairClusterNodePoolResponse setBody(RepairClusterNodePoolResponseBody body) {
        this.body = body;
        return this;
    }
    public RepairClusterNodePoolResponseBody getBody() {
        return this.body;
    }

}
