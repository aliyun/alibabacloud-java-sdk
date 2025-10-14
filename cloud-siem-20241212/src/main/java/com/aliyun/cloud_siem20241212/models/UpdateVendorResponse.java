// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateVendorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateVendorResponseBody body;

    public static UpdateVendorResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVendorResponse self = new UpdateVendorResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVendorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVendorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateVendorResponse setBody(UpdateVendorResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVendorResponseBody getBody() {
        return this.body;
    }

}
