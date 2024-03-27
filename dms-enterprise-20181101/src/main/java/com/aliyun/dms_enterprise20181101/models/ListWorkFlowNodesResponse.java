// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListWorkFlowNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWorkFlowNodesResponseBody body;

    public static ListWorkFlowNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkFlowNodesResponse self = new ListWorkFlowNodesResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkFlowNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkFlowNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWorkFlowNodesResponse setBody(ListWorkFlowNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkFlowNodesResponseBody getBody() {
        return this.body;
    }

}
