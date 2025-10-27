// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class ListFlowAliasesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example-flow-name</p>
     */
    @NameInMap("FlowName")
    public String flowName;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>list token</p>
     * 
     * <strong>example:</strong>
     * <p>token</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListFlowAliasesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFlowAliasesRequest self = new ListFlowAliasesRequest();
        return TeaModel.build(map, self);
    }

    public ListFlowAliasesRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public ListFlowAliasesRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListFlowAliasesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
