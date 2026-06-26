// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListAsyncInvokeConfigsRequest extends TeaModel {
    /**
     * <p>The name of the function. If you do not specify this parameter, the asynchronous invocation configurations of all functions are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>my-func</p>
     */
    @NameInMap("functionName")
    public String functionName;

    /**
     * <p>The maximum number of results to return.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The token that is used for paging.</p>
     * 
     * <strong>example:</strong>
     * <p>MTIzNCNhYmM=</p>
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
