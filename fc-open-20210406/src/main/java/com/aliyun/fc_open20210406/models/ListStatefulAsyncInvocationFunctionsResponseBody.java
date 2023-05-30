// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListStatefulAsyncInvocationFunctionsResponseBody extends TeaModel {
    /**
     * <p>The trace ID of the request for Function Compute API.</p>
     */
    @NameInMap("data")
    public java.util.List<AsyncConfigMeta> data;

    /**
     * <p>2022-01-28 18:04:38</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListStatefulAsyncInvocationFunctionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStatefulAsyncInvocationFunctionsResponseBody self = new ListStatefulAsyncInvocationFunctionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStatefulAsyncInvocationFunctionsResponseBody setData(java.util.List<AsyncConfigMeta> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AsyncConfigMeta> getData() {
        return this.data;
    }

    public ListStatefulAsyncInvocationFunctionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
