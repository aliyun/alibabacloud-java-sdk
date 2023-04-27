// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribePolicyGovernanceInClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePolicyGovernanceInClusterResponseBody body;

    public static DescribePolicyGovernanceInClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyGovernanceInClusterResponse self = new DescribePolicyGovernanceInClusterResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolicyGovernanceInClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePolicyGovernanceInClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePolicyGovernanceInClusterResponse setBody(DescribePolicyGovernanceInClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolicyGovernanceInClusterResponseBody getBody() {
        return this.body;
    }

}
