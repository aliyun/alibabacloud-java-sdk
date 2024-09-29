// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class OperateWorkflowInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateWorkflowInstanceResponseBody body;

    public static OperateWorkflowInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateWorkflowInstanceResponse self = new OperateWorkflowInstanceResponse();
        return TeaModel.build(map, self);
    }

    public OperateWorkflowInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateWorkflowInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateWorkflowInstanceResponse setBody(OperateWorkflowInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateWorkflowInstanceResponseBody getBody() {
        return this.body;
    }

}
