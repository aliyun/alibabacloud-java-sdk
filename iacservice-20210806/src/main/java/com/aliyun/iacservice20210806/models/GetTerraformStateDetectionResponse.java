// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetTerraformStateDetectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTerraformStateDetectionResponseBody body;

    public static GetTerraformStateDetectionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTerraformStateDetectionResponse self = new GetTerraformStateDetectionResponse();
        return TeaModel.build(map, self);
    }

    public GetTerraformStateDetectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTerraformStateDetectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTerraformStateDetectionResponse setBody(GetTerraformStateDetectionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTerraformStateDetectionResponseBody getBody() {
        return this.body;
    }

}
