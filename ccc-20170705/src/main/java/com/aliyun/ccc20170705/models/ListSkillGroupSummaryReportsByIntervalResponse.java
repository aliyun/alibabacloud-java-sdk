// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListSkillGroupSummaryReportsByIntervalResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListSkillGroupSummaryReportsByIntervalResponse setBody(ListSkillGroupSummaryReportsByIntervalResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSkillGroupSummaryReportsByIntervalResponseBody getBody() {
        return this.body;
    }

}
