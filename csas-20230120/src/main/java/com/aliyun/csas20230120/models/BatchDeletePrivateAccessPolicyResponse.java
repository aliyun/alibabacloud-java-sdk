// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class BatchDeletePrivateAccessPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchDeletePrivateAccessPolicyResponseBody body;

    public static BatchDeletePrivateAccessPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeletePrivateAccessPolicyResponse self = new BatchDeletePrivateAccessPolicyResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeletePrivateAccessPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeletePrivateAccessPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDeletePrivateAccessPolicyResponse setBody(BatchDeletePrivateAccessPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeletePrivateAccessPolicyResponseBody getBody() {
        return this.body;
    }

}
