// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListIntervalSkillGroupReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListIntervalSkillGroupReportResponseBody body;

    public static ListIntervalSkillGroupReportResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIntervalSkillGroupReportResponse self = new ListIntervalSkillGroupReportResponse();
        return TeaModel.build(map, self);
    }

    public ListIntervalSkillGroupReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIntervalSkillGroupReportResponse setBody(ListIntervalSkillGroupReportResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIntervalSkillGroupReportResponseBody getBody() {
        return this.body;
    }

}
