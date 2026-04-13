// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DetectTerraformStateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetectTerraformStateResponseBody body;

    public static DetectTerraformStateResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectTerraformStateResponse self = new DetectTerraformStateResponse();
        return TeaModel.build(map, self);
    }

    public DetectTerraformStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectTerraformStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectTerraformStateResponse setBody(DetectTerraformStateResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectTerraformStateResponseBody getBody() {
        return this.body;
    }

}
