// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribePolicyGovernanceInClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public DescribePolicyGovernanceInClusterResponse setBody(DescribePolicyGovernanceInClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolicyGovernanceInClusterResponseBody getBody() {
        return this.body;
    }

}
