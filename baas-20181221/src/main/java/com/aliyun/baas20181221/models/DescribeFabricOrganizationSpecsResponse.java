// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationSpecsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFabricOrganizationSpecsResponseBody body;

    public static DescribeFabricOrganizationSpecsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricOrganizationSpecsResponse self = new DescribeFabricOrganizationSpecsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricOrganizationSpecsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricOrganizationSpecsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFabricOrganizationSpecsResponse setBody(DescribeFabricOrganizationSpecsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricOrganizationSpecsResponseBody getBody() {
        return this.body;
    }

}
