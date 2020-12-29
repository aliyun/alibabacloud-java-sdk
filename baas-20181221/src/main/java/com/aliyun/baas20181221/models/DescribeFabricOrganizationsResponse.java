// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeFabricOrganizationsResponse setBody(DescribeFabricOrganizationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricOrganizationsResponseBody getBody() {
        return this.body;
    }

}
