// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.address_purification20191118.models;

import com.aliyun.tea.*;

public class StructureAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StructureAddressResponseBody body;

    public static StructureAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        StructureAddressResponse self = new StructureAddressResponse();
        return TeaModel.build(map, self);
    }

    public StructureAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StructureAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StructureAddressResponse setBody(StructureAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public StructureAddressResponseBody getBody() {
        return this.body;
    }

}
