// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationPeersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFabricOrganizationPeersResponseBody body;

    public static DescribeFabricOrganizationPeersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricOrganizationPeersResponse self = new DescribeFabricOrganizationPeersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricOrganizationPeersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricOrganizationPeersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFabricOrganizationPeersResponse setBody(DescribeFabricOrganizationPeersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricOrganizationPeersResponseBody getBody() {
        return this.body;
    }

}
