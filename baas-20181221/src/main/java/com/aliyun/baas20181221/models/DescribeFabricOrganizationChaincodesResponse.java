// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationChaincodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFabricOrganizationChaincodesResponseBody body;

    public static DescribeFabricOrganizationChaincodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricOrganizationChaincodesResponse self = new DescribeFabricOrganizationChaincodesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricOrganizationChaincodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricOrganizationChaincodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFabricOrganizationChaincodesResponse setBody(DescribeFabricOrganizationChaincodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricOrganizationChaincodesResponseBody getBody() {
        return this.body;
    }

}
