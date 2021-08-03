// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribePolicyGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePolicyGroupsResponseBody body;

    public static DescribePolicyGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyGroupsResponse self = new DescribePolicyGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolicyGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePolicyGroupsResponse setBody(DescribePolicyGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolicyGroupsResponseBody getBody() {
        return this.body;
    }

}
