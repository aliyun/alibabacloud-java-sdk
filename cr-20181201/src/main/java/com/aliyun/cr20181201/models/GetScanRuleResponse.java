// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetScanRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetScanRuleResponseBody body;

    public static GetScanRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScanRuleResponse self = new GetScanRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetScanRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScanRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetScanRuleResponse setBody(GetScanRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScanRuleResponseBody getBody() {
        return this.body;
    }

}
