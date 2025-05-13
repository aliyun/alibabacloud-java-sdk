// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListStatefulAsyncInvocationFunctionsRequest extends TeaModel {
    /**
     * <p>The maximum number of results to return. Default value: 20. Maximum value: 100. The number of returned results is less than or equal to the specified number.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The starting position of the query. If this parameter is left empty, the query starts from the beginning. You do not need to specify this parameter in the first call. The tokens for subsequent queries are obtained from previous returned results.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
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
