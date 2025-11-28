// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListScanRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListScanRuleResponseBody body;

    public static ListScanRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListScanRuleResponse self = new ListScanRuleResponse();
        return TeaModel.build(map, self);
    }

    public ListScanRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListScanRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListScanRuleResponse setBody(ListScanRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListScanRuleResponseBody getBody() {
        return this.body;
    }

}
