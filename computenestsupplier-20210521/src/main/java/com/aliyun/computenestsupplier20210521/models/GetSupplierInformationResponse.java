// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetSupplierInformationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSupplierInformationResponseBody body;

    public static GetSupplierInformationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSupplierInformationResponse self = new GetSupplierInformationResponse();
        return TeaModel.build(map, self);
    }

    public GetSupplierInformationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSupplierInformationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSupplierInformationResponse setBody(GetSupplierInformationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSupplierInformationResponseBody getBody() {
        return this.body;
    }

}
