// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class GroupInvokeFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GroupInvokeFlowResponseBody body;

    public static GroupInvokeFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        GroupInvokeFlowResponse self = new GroupInvokeFlowResponse();
        return TeaModel.build(map, self);
    }

    public GroupInvokeFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GroupInvokeFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GroupInvokeFlowResponse setBody(GroupInvokeFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public GroupInvokeFlowResponseBody getBody() {
        return this.body;
    }

}
