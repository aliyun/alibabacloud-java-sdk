// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateVendorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVendorResponseBody body;

    public static CreateVendorResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVendorResponse self = new CreateVendorResponse();
        return TeaModel.build(map, self);
    }

    public CreateVendorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVendorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVendorResponse setBody(CreateVendorResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVendorResponseBody getBody() {
        return this.body;
    }

}
