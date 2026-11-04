// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListSkillGroupSummaryReportsByIntervalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSkillGroupSummaryReportsByIntervalResponseBody body;

    public static ListSkillGroupSummaryReportsByIntervalResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSkillGroupSummaryReportsByIntervalResponse self = new ListSkillGroupSummaryReportsByIntervalResponse();
        return TeaModel.build(map, self);
    }

    public ListSkillGroupSummaryReportsByIntervalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSkillGroupSummaryReportsByIntervalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSkillGroupSummaryReportsByIntervalResponse setBody(ListSkillGroupSummaryReportsByIntervalResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSkillGroupSummaryReportsByIntervalResponseBody getBody() {
        return this.body;
    }

}
