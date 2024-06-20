// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricCandidateOrganizationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFabricCandidateOrganizationsResponseBody body;

    public static DescribeFabricCandidateOrganizationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricCandidateOrganizationsResponse self = new DescribeFabricCandidateOrganizationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricCandidateOrganizationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricCandidateOrganizationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFabricCandidateOrganizationsResponse setBody(DescribeFabricCandidateOrganizationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricCandidateOrganizationsResponseBody getBody() {
        return this.body;
    }

}
