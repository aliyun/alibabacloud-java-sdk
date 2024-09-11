// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListPlanningProposalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPlanningProposalResponseBody body;

    public static ListPlanningProposalResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPlanningProposalResponse self = new ListPlanningProposalResponse();
        return TeaModel.build(map, self);
    }

    public ListPlanningProposalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPlanningProposalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPlanningProposalResponse setBody(ListPlanningProposalResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPlanningProposalResponseBody getBody() {
        return this.body;
    }

}
