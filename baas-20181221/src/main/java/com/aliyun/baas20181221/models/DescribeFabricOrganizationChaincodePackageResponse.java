// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationChaincodePackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeFabricOrganizationChaincodePackageResponse setBody(DescribeFabricOrganizationChaincodePackageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricOrganizationChaincodePackageResponseBody getBody() {
        return this.body;
    }

}
