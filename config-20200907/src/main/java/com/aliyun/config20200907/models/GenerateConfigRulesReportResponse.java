// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GenerateConfigRulesReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateConfigRulesReportResponseBody body;

    public static GenerateConfigRulesReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateConfigRulesReportResponse self = new GenerateConfigRulesReportResponse();
        return TeaModel.build(map, self);
    }

    public GenerateConfigRulesReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateConfigRulesReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateConfigRulesReportResponse setBody(GenerateConfigRulesReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateConfigRulesReportResponseBody getBody() {
        return this.body;
    }

}
