// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AddTaskFlowEdgesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddTaskFlowEdgesResponseBody body;

    public static AddTaskFlowEdgesResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTaskFlowEdgesResponse self = new AddTaskFlowEdgesResponse();
        return TeaModel.build(map, self);
    }

    public AddTaskFlowEdgesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddTaskFlowEdgesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddTaskFlowEdgesResponse setBody(AddTaskFlowEdgesResponseBody body) {
        this.body = body;
        return this;
    }
    public AddTaskFlowEdgesResponseBody getBody() {
        return this.body;
    }

}
