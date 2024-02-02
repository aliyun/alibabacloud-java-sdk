// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListIntervalAgentSkillGroupReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIntervalAgentSkillGroupReportResponseBody body;

    public static ListIntervalAgentSkillGroupReportResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIntervalAgentSkillGroupReportResponse self = new ListIntervalAgentSkillGroupReportResponse();
        return TeaModel.build(map, self);
    }

    public ListIntervalAgentSkillGroupReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIntervalAgentSkillGroupReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIntervalAgentSkillGroupReportResponse setBody(ListIntervalAgentSkillGroupReportResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIntervalAgentSkillGroupReportResponseBody getBody() {
        return this.body;
    }

}
