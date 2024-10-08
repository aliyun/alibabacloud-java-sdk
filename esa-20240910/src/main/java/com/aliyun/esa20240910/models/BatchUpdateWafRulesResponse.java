// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BatchUpdateWafRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchUpdateWafRulesResponseBody body;

    public static BatchUpdateWafRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateWafRulesResponse self = new BatchUpdateWafRulesResponse();
        return TeaModel.build(map, self);
    }

    public BatchUpdateWafRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchUpdateWafRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchUpdateWafRulesResponse setBody(BatchUpdateWafRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchUpdateWafRulesResponseBody getBody() {
        return this.body;
    }

}
