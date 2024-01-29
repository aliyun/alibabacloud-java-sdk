// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ResetSshKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetSshKeyResponseBody body;

    public static ResetSshKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetSshKeyResponse self = new ResetSshKeyResponse();
        return TeaModel.build(map, self);
    }

    public ResetSshKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetSshKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetSshKeyResponse setBody(ResetSshKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetSshKeyResponseBody getBody() {
        return this.body;
    }

}
