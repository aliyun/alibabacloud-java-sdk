// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class QueryEdsAgentReportConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryEdsAgentReportConfigResponseBody body;

    public static QueryEdsAgentReportConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEdsAgentReportConfigResponse self = new QueryEdsAgentReportConfigResponse();
        return TeaModel.build(map, self);
    }

    public QueryEdsAgentReportConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEdsAgentReportConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryEdsAgentReportConfigResponse setBody(QueryEdsAgentReportConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEdsAgentReportConfigResponseBody getBody() {
        return this.body;
    }

}
