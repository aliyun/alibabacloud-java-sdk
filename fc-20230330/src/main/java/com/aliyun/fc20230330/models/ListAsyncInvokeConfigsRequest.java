// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListAsyncInvokeConfigsRequest extends TeaModel {
    /**
     * <p>The function name. If you do not configure this parameter, the asynchronous invocation configurations of all functions are displayed.</p>
     */
    @NameInMap("functionName")
    public String functionName;

    /**
     * <p>The maximum number of entries to be returned.</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The paging information. This parameter specifies the start point of the query.</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListAsyncInvokeConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAsyncInvokeConfigsRequest self = new ListAsyncInvokeConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListAsyncInvokeConfigsRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public ListAsyncInvokeConfigsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListAsyncInvokeConfigsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
