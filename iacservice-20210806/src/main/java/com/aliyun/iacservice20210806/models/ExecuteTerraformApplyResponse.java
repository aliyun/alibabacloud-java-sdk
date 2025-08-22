// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ExecuteTerraformApplyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteTerraformApplyResponseBody body;

    public static ExecuteTerraformApplyResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteTerraformApplyResponse self = new ExecuteTerraformApplyResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteTerraformApplyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteTerraformApplyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteTerraformApplyResponse setBody(ExecuteTerraformApplyResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteTerraformApplyResponseBody getBody() {
        return this.body;
    }

}
