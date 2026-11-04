// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListSkillGroupSummaryReportsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSkillGroupSummaryReportsResponseBody body;

    public static ListSkillGroupSummaryReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSkillGroupSummaryReportsResponse self = new ListSkillGroupSummaryReportsResponse();
        return TeaModel.build(map, self);
    }

    public ListSkillGroupSummaryReportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSkillGroupSummaryReportsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSkillGroupSummaryReportsResponse setBody(ListSkillGroupSummaryReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSkillGroupSummaryReportsResponseBody getBody() {
        return this.body;
    }

}
