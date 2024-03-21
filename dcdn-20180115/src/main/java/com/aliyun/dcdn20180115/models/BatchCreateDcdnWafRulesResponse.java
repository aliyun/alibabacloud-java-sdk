// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchCreateDcdnWafRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchCreateDcdnWafRulesResponseBody body;

    public static BatchCreateDcdnWafRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateDcdnWafRulesResponse self = new BatchCreateDcdnWafRulesResponse();
        return TeaModel.build(map, self);
    }

    public BatchCreateDcdnWafRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchCreateDcdnWafRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchCreateDcdnWafRulesResponse setBody(BatchCreateDcdnWafRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCreateDcdnWafRulesResponseBody getBody() {
        return this.body;
    }

}
