// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationChaincodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeFabricOrganizationChaincodesResponse setBody(DescribeFabricOrganizationChaincodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricOrganizationChaincodesResponseBody getBody() {
        return this.body;
    }

}
