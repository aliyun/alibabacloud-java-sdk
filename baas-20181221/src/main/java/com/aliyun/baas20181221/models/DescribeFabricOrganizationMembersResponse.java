// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeFabricOrganizationMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFabricOrganizationMembersResponse setBody(DescribeFabricOrganizationMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricOrganizationMembersResponseBody getBody() {
        return this.body;
    }

}
