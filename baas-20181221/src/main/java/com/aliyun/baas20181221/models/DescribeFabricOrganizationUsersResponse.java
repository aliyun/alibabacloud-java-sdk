// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFabricOrganizationUsersResponseBody body;

    public static DescribeFabricOrganizationUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricOrganizationUsersResponse self = new DescribeFabricOrganizationUsersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricOrganizationUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricOrganizationUsersResponse setBody(DescribeFabricOrganizationUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricOrganizationUsersResponseBody getBody() {
        return this.body;
    }

}
