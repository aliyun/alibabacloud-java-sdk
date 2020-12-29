// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationMembersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFabricOrganizationMembersResponseBody body;

    public static DescribeFabricOrganizationMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricOrganizationMembersResponse self = new DescribeFabricOrganizationMembersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricOrganizationMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricOrganizationMembersResponse setBody(DescribeFabricOrganizationMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricOrganizationMembersResponseBody getBody() {
        return this.body;
    }

}
