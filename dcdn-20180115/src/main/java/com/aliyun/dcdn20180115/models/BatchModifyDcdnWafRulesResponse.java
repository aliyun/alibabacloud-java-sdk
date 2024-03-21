// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchModifyDcdnWafRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchModifyDcdnWafRulesResponseBody body;

    public static BatchModifyDcdnWafRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchModifyDcdnWafRulesResponse self = new BatchModifyDcdnWafRulesResponse();
        return TeaModel.build(map, self);
    }

    public BatchModifyDcdnWafRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchModifyDcdnWafRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchModifyDcdnWafRulesResponse setBody(BatchModifyDcdnWafRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchModifyDcdnWafRulesResponseBody getBody() {
        return this.body;
    }

}
