// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateScanRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateScanRuleResponseBody body;

    public static CreateScanRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateScanRuleResponse self = new CreateScanRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateScanRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateScanRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateScanRuleResponse setBody(CreateScanRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateScanRuleResponseBody getBody() {
        return this.body;
    }

}
