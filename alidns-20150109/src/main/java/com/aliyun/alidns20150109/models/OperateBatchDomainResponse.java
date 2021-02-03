// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class OperateBatchDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OperateBatchDomainResponseBody body;

    public static OperateBatchDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateBatchDomainResponse self = new OperateBatchDomainResponse();
        return TeaModel.build(map, self);
    }

    public OperateBatchDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateBatchDomainResponse setBody(OperateBatchDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateBatchDomainResponseBody getBody() {
        return this.body;
    }

}
