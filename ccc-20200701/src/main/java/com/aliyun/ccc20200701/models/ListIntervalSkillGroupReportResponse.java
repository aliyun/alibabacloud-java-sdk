// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListIntervalSkillGroupReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListIntervalSkillGroupReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIntervalSkillGroupReportResponse setBody(ListIntervalSkillGroupReportResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIntervalSkillGroupReportResponseBody getBody() {
        return this.body;
    }

}
