// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateFabricChaincodePackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFabricChaincodePackageResponseBody body;

    public static CreateFabricChaincodePackageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFabricChaincodePackageResponse self = new CreateFabricChaincodePackageResponse();
        return TeaModel.build(map, self);
    }

    public CreateFabricChaincodePackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFabricChaincodePackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFabricChaincodePackageResponse setBody(CreateFabricChaincodePackageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFabricChaincodePackageResponseBody getBody() {
        return this.body;
    }

}
