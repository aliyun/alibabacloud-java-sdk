// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFabricOrganizationResponseBody body;

    public static DescribeFabricOrganizationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricOrganizationResponse self = new DescribeFabricOrganizationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricOrganizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricOrganizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFabricOrganizationResponse setBody(DescribeFabricOrganizationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricOrganizationResponseBody getBody() {
        return this.body;
    }

}
