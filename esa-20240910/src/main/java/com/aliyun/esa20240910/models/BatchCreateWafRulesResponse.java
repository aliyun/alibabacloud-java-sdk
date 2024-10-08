// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BatchCreateWafRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchCreateWafRulesResponseBody body;

    public static BatchCreateWafRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateWafRulesResponse self = new BatchCreateWafRulesResponse();
        return TeaModel.build(map, self);
    }

    public BatchCreateWafRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchCreateWafRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchCreateWafRulesResponse setBody(BatchCreateWafRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCreateWafRulesResponseBody getBody() {
        return this.body;
    }

}
