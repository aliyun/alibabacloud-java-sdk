// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetConfigRulesReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetConfigRulesReportResponseBody body;

    public static GetConfigRulesReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConfigRulesReportResponse self = new GetConfigRulesReportResponse();
        return TeaModel.build(map, self);
    }

    public GetConfigRulesReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConfigRulesReportResponse setBody(GetConfigRulesReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConfigRulesReportResponseBody getBody() {
        return this.body;
    }

}
