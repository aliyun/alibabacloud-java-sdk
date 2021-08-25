// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetSupplierInformationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetSupplierInformationResponse setBody(GetSupplierInformationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSupplierInformationResponseBody getBody() {
        return this.body;
    }

}
