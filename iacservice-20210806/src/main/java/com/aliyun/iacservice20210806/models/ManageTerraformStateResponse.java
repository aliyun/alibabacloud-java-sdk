// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ManageTerraformStateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ManageTerraformStateResponseBody body;

    public static ManageTerraformStateResponse build(java.util.Map<String, ?> map) throws Exception {
        ManageTerraformStateResponse self = new ManageTerraformStateResponse();
        return TeaModel.build(map, self);
    }

    public ManageTerraformStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ManageTerraformStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ManageTerraformStateResponse setBody(ManageTerraformStateResponseBody body) {
        this.body = body;
        return this;
    }
    public ManageTerraformStateResponseBody getBody() {
        return this.body;
    }

}
