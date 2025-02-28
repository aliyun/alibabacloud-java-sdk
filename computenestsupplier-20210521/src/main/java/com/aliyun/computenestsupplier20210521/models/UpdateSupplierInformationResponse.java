// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateSupplierInformationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSupplierInformationResponseBody body;

    public static UpdateSupplierInformationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSupplierInformationResponse self = new UpdateSupplierInformationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSupplierInformationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSupplierInformationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSupplierInformationResponse setBody(UpdateSupplierInformationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSupplierInformationResponseBody getBody() {
        return this.body;
    }

}
