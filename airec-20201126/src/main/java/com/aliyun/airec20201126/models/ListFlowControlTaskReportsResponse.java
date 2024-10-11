// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListFlowControlTaskReportsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFlowControlTaskReportsResponseBody body;

    public static ListFlowControlTaskReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowControlTaskReportsResponse self = new ListFlowControlTaskReportsResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowControlTaskReportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowControlTaskReportsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFlowControlTaskReportsResponse setBody(ListFlowControlTaskReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlowControlTaskReportsResponseBody getBody() {
        return this.body;
    }

}
