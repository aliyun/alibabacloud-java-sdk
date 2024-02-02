// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListHistoricalSkillGroupReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHistoricalSkillGroupReportResponseBody body;

    public static ListHistoricalSkillGroupReportResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHistoricalSkillGroupReportResponse self = new ListHistoricalSkillGroupReportResponse();
        return TeaModel.build(map, self);
    }

    public ListHistoricalSkillGroupReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHistoricalSkillGroupReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHistoricalSkillGroupReportResponse setBody(ListHistoricalSkillGroupReportResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHistoricalSkillGroupReportResponseBody getBody() {
        return this.body;
    }

}
