// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifySQLCollectorPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySQLCollectorPolicyResponseBody body;

    public static ModifySQLCollectorPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySQLCollectorPolicyResponse self = new ModifySQLCollectorPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifySQLCollectorPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySQLCollectorPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySQLCollectorPolicyResponse setBody(ModifySQLCollectorPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySQLCollectorPolicyResponseBody getBody() {
        return this.body;
    }

}
