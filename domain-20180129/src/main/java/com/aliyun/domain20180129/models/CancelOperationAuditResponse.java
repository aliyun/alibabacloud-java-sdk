// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CancelOperationAuditResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelOperationAuditResponseBody body;

    public static CancelOperationAuditResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelOperationAuditResponse self = new CancelOperationAuditResponse();
        return TeaModel.build(map, self);
    }

    public CancelOperationAuditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelOperationAuditResponse setBody(CancelOperationAuditResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelOperationAuditResponseBody getBody() {
        return this.body;
    }

}
