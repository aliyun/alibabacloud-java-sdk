// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class DeleteVendorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVendorResponseBody body;

    public static DeleteVendorResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVendorResponse self = new DeleteVendorResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVendorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVendorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVendorResponse setBody(DeleteVendorResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVendorResponseBody getBody() {
        return this.body;
    }

}
