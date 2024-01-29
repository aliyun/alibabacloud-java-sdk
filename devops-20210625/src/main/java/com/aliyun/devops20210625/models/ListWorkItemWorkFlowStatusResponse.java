// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListWorkItemWorkFlowStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWorkItemWorkFlowStatusResponseBody body;

    public static ListWorkItemWorkFlowStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkItemWorkFlowStatusResponse self = new ListWorkItemWorkFlowStatusResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkItemWorkFlowStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkItemWorkFlowStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWorkItemWorkFlowStatusResponse setBody(ListWorkItemWorkFlowStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkItemWorkFlowStatusResponseBody getBody() {
        return this.body;
    }

}
