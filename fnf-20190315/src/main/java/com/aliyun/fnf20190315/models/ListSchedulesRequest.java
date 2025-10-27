// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class ListSchedulesRequest extends TeaModel {
    /**
     * <p>The name of the flow that is associated with the time-based schedules. The name is unique within the region and cannot be modified after the flow is created. The name must meet the following conventions:</p>
     * <ul>
     * <li>The name can contain letters, digits, underscores (_), and hyphens (-).</li>
     * <li>The name must start with a letter or an underscore (_).</li>
     * <li>The name is case-sensitive.</li>
     * <li>The name must be 1 to 128 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testFlowName</p>
     */
    @NameInMap("FlowName")
    public String flowName;

    /**
     * <p>The number of schedules that you want to query. Valid values: 1 to 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>For the first query, you do not need to specify this parameter. The system uses the value of the <strong>FlowName</strong> parameter as the value of the <strong>NextToken</strong> parameter. When the query ends, no value is returned for this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>testNextToken</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListSchedulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSchedulesRequest self = new ListSchedulesRequest();
        return TeaModel.build(map, self);
    }

    public ListSchedulesRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public ListSchedulesRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListSchedulesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
