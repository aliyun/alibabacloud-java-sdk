// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class StopTaskFlowInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopTaskFlowInstanceResponseBody body;

    public static StopTaskFlowInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StopTaskFlowInstanceResponse self = new StopTaskFlowInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StopTaskFlowInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopTaskFlowInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopTaskFlowInstanceResponse setBody(StopTaskFlowInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StopTaskFlowInstanceResponseBody getBody() {
        return this.body;
    }

}
