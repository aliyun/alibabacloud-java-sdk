// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ExportHotTopicPlanningProposalsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportHotTopicPlanningProposalsResponseBody body;

    public static ExportHotTopicPlanningProposalsResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportHotTopicPlanningProposalsResponse self = new ExportHotTopicPlanningProposalsResponse();
        return TeaModel.build(map, self);
    }

    public ExportHotTopicPlanningProposalsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportHotTopicPlanningProposalsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportHotTopicPlanningProposalsResponse setBody(ExportHotTopicPlanningProposalsResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportHotTopicPlanningProposalsResponseBody getBody() {
        return this.body;
    }

}
