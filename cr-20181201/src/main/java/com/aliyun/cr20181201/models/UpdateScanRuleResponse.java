// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateScanRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateScanRuleResponseBody body;

    public static UpdateScanRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateScanRuleResponse self = new UpdateScanRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateScanRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateScanRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateScanRuleResponse setBody(UpdateScanRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateScanRuleResponseBody getBody() {
        return this.body;
    }

}
