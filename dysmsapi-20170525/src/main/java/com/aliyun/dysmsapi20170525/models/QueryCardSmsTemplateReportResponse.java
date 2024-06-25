// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryCardSmsTemplateReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCardSmsTemplateReportResponseBody body;

    public static QueryCardSmsTemplateReportResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCardSmsTemplateReportResponse self = new QueryCardSmsTemplateReportResponse();
        return TeaModel.build(map, self);
    }

    public QueryCardSmsTemplateReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCardSmsTemplateReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCardSmsTemplateReportResponse setBody(QueryCardSmsTemplateReportResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCardSmsTemplateReportResponseBody getBody() {
        return this.body;
    }

}
