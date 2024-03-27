// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTaskFlowEdgesByConditionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTaskFlowEdgesByConditionResponseBody body;

    public static ListTaskFlowEdgesByConditionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTaskFlowEdgesByConditionResponse self = new ListTaskFlowEdgesByConditionResponse();
        return TeaModel.build(map, self);
    }

    public ListTaskFlowEdgesByConditionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTaskFlowEdgesByConditionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTaskFlowEdgesByConditionResponse setBody(ListTaskFlowEdgesByConditionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTaskFlowEdgesByConditionResponseBody getBody() {
        return this.body;
    }

}
