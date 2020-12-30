// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListSkillGroupSummaryReportsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListSkillGroupSummaryReportsResponse setBody(ListSkillGroupSummaryReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSkillGroupSummaryReportsResponseBody getBody() {
        return this.body;
    }

}
