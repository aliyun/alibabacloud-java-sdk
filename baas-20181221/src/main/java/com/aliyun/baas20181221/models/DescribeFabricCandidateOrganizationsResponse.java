// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricCandidateOrganizationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeFabricCandidateOrganizationsResponse setBody(DescribeFabricCandidateOrganizationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricCandidateOrganizationsResponseBody getBody() {
        return this.body;
    }

}
