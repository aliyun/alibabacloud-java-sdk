// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationChaincodePackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFabricOrganizationChaincodePackageResponseBody body;

    public static DescribeFabricOrganizationChaincodePackageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricOrganizationChaincodePackageResponse self = new DescribeFabricOrganizationChaincodePackageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricOrganizationChaincodePackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricOrganizationChaincodePackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFabricOrganizationChaincodePackageResponse setBody(DescribeFabricOrganizationChaincodePackageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricOrganizationChaincodePackageResponseBody getBody() {
        return this.body;
    }

}
