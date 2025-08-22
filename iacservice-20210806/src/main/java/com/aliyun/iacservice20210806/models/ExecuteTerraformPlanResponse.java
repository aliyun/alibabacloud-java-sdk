// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ExecuteTerraformPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteTerraformPlanResponseBody body;

    public static ExecuteTerraformPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteTerraformPlanResponse self = new ExecuteTerraformPlanResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteTerraformPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteTerraformPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteTerraformPlanResponse setBody(ExecuteTerraformPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteTerraformPlanResponseBody getBody() {
        return this.body;
    }

}
