// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListStatefulAsyncInvocationFunctionsRequest extends TeaModel {
    /**
     * <p>The latest version of Function Compute API.</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>Alibaba Cloud provides SDKs for multiple programming languages to help you integrate Alibaba Cloud services by using APIs. We recommend that you use an SDK to call API operations. This frees you from manual signature verification.</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListStatefulAsyncInvocationFunctionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStatefulAsyncInvocationFunctionsRequest self = new ListStatefulAsyncInvocationFunctionsRequest();
        return TeaModel.build(map, self);
    }

    public ListStatefulAsyncInvocationFunctionsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListStatefulAsyncInvocationFunctionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
