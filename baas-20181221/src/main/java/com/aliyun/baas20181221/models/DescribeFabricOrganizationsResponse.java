// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFabricOrganizationsResponseBody body;

    public static DescribeFabricOrganizationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricOrganizationsResponse self = new DescribeFabricOrganizationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricOrganizationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricOrganizationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFabricOrganizationsResponse setBody(DescribeFabricOrganizationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricOrganizationsResponseBody getBody() {
        return this.body;
    }

}
