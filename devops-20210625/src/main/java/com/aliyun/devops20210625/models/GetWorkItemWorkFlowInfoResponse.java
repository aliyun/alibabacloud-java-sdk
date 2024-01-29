// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetWorkItemWorkFlowInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkItemWorkFlowInfoResponseBody body;

    public static GetWorkItemWorkFlowInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkItemWorkFlowInfoResponse self = new GetWorkItemWorkFlowInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkItemWorkFlowInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkItemWorkFlowInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkItemWorkFlowInfoResponse setBody(GetWorkItemWorkFlowInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkItemWorkFlowInfoResponseBody getBody() {
        return this.body;
    }

}
