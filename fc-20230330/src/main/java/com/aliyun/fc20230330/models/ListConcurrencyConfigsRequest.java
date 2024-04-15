// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListConcurrencyConfigsRequest extends TeaModel {
    /**
     * <p>The function name. If you leave this parameter empty, the concurrency configurations of all functions are returned.</p>
     */
    @NameInMap("functionName")
    public String functionName;

    /**
     * <p>The maximum number of entries returned.</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListConcurrencyConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConcurrencyConfigsRequest self = new ListConcurrencyConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListConcurrencyConfigsRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public ListConcurrencyConfigsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListConcurrencyConfigsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
