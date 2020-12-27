// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class BatchAuditTest01Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchAuditTest01ResponseBody body;

    public static BatchAuditTest01Response build(java.util.Map<String, ?> map) throws Exception {
        BatchAuditTest01Response self = new BatchAuditTest01Response();
        return TeaModel.build(map, self);
    }

    public BatchAuditTest01Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchAuditTest01Response setBody(BatchAuditTest01ResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchAuditTest01ResponseBody getBody() {
        return this.body;
    }

}
