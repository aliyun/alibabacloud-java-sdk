// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GenerateConfigRulesReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GenerateConfigRulesReportResponse setBody(GenerateConfigRulesReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateConfigRulesReportResponseBody getBody() {
        return this.body;
    }

}
