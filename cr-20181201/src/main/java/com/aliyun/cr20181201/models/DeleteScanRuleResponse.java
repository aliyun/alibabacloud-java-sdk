// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteScanRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteScanRuleResponseBody body;

    public static DeleteScanRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteScanRuleResponse self = new DeleteScanRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteScanRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteScanRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteScanRuleResponse setBody(DeleteScanRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteScanRuleResponseBody getBody() {
        return this.body;
    }

}
