// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationDeletableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFabricOrganizationDeletableResponseBody body;

    public static DescribeFabricOrganizationDeletableResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricOrganizationDeletableResponse self = new DescribeFabricOrganizationDeletableResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricOrganizationDeletableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricOrganizationDeletableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFabricOrganizationDeletableResponse setBody(DescribeFabricOrganizationDeletableResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricOrganizationDeletableResponseBody getBody() {
        return this.body;
    }

}
