// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SuspendTaskFlowInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SuspendTaskFlowInstanceResponseBody body;

    public static SuspendTaskFlowInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        SuspendTaskFlowInstanceResponse self = new SuspendTaskFlowInstanceResponse();
        return TeaModel.build(map, self);
    }

    public SuspendTaskFlowInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SuspendTaskFlowInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SuspendTaskFlowInstanceResponse setBody(SuspendTaskFlowInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public SuspendTaskFlowInstanceResponseBody getBody() {
        return this.body;
    }

}
