// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeCandidateOrganizationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCandidateOrganizationsResponseBody body;

    public static DescribeCandidateOrganizationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCandidateOrganizationsResponse self = new DescribeCandidateOrganizationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCandidateOrganizationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCandidateOrganizationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCandidateOrganizationsResponse setBody(DescribeCandidateOrganizationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCandidateOrganizationsResponseBody getBody() {
        return this.body;
    }

}
