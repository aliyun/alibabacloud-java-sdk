// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTasksInTaskFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTasksInTaskFlowResponseBody body;

    public static ListTasksInTaskFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTasksInTaskFlowResponse self = new ListTasksInTaskFlowResponse();
        return TeaModel.build(map, self);
    }

    public ListTasksInTaskFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTasksInTaskFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTasksInTaskFlowResponse setBody(ListTasksInTaskFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTasksInTaskFlowResponseBody getBody() {
        return this.body;
    }

}
