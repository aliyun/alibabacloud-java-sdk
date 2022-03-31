// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchDeleteDcdnWafRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchDeleteDcdnWafRulesResponseBody body;

    public static BatchDeleteDcdnWafRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteDcdnWafRulesResponse self = new BatchDeleteDcdnWafRulesResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteDcdnWafRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteDcdnWafRulesResponse setBody(BatchDeleteDcdnWafRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteDcdnWafRulesResponseBody getBody() {
        return this.body;
    }

}
