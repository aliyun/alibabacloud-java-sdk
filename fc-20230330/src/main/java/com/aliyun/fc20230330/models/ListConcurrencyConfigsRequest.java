// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListConcurrencyConfigsRequest extends TeaModel {
    /**
     * <p>The function name. If you do not specify this parameter, the concurrency configurations of all functions are listed.</p>
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
     * <p>The token for paging.</p>
     * 
     * <strong>example:</strong>
     * <p>MTIzNCNhYmM=</p>
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
