// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListStatefulAsyncInvocationsResponseBody extends TeaModel {
    /**
     * <p>The information about asynchronous tasks.</p>
     */
    @NameInMap("invocations")
    public java.util.List<StatefulAsyncInvocation> invocations;

    /**
     * <p>The token used to obtain more results. If this parameter is left empty, all the results are returned.</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListStatefulAsyncInvocationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStatefulAsyncInvocationsResponseBody self = new ListStatefulAsyncInvocationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStatefulAsyncInvocationsResponseBody setInvocations(java.util.List<StatefulAsyncInvocation> invocations) {
        this.invocations = invocations;
        return this;
    }
    public java.util.List<StatefulAsyncInvocation> getInvocations() {
        return this.invocations;
    }

    public ListStatefulAsyncInvocationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
