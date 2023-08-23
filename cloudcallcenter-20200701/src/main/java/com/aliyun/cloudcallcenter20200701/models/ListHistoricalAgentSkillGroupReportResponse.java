// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class ListHistoricalAgentSkillGroupReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListHistoricalAgentSkillGroupReportResponseBody body;

    public static ListHistoricalAgentSkillGroupReportResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHistoricalAgentSkillGroupReportResponse self = new ListHistoricalAgentSkillGroupReportResponse();
        return TeaModel.build(map, self);
    }

    public ListHistoricalAgentSkillGroupReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHistoricalAgentSkillGroupReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHistoricalAgentSkillGroupReportResponse setBody(ListHistoricalAgentSkillGroupReportResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHistoricalAgentSkillGroupReportResponseBody getBody() {
        return this.body;
    }

}
