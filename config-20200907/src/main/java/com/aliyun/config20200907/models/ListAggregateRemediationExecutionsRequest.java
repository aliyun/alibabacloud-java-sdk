// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateRemediationExecutionsRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <p>For more information about how to obtain the ID of an account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-edd3626622af00b3****</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The rule ID.</p>
     * <p>For more information about how to obtain the ID of a rule, see <a href="https://help.aliyun.com/document_detail/264148.html">ListAggregateConfigRules</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cr-2792626622af0c21****</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    /**
     * <p>The status of the remediation. Valid values:</p>
     * <ul>
     * <li>Success</li>
     * <li>Failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("ExecutionStatus")
    public String executionStatus;

    /**
     * <p>The maximum number of entries to return for a single request. Valid values: 10 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>aVCjqFaSy0Ps6zSMGw09****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the member account in the account group. When left unfilled, this rule queries the remediation result for the account that created the rule. If the account is not in the account group, the result will be empty.</p>
     * 
     * <strong>example:</strong>
     * <p>126672004088****</p>
     */
    @NameInMap("ResourceAccountId")
    public Long resourceAccountId;

    public static ListAggregateRemediationExecutionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateRemediationExecutionsRequest self = new ListAggregateRemediationExecutionsRequest();
        return TeaModel.build(map, self);
    }

    public ListAggregateRemediationExecutionsRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public ListAggregateRemediationExecutionsRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public ListAggregateRemediationExecutionsRequest setExecutionStatus(String executionStatus) {
        this.executionStatus = executionStatus;
        return this;
    }
    public String getExecutionStatus() {
        return this.executionStatus;
    }

    public ListAggregateRemediationExecutionsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListAggregateRemediationExecutionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAggregateRemediationExecutionsRequest setResourceAccountId(Long resourceAccountId) {
        this.resourceAccountId = resourceAccountId;
        return this;
    }
    public Long getResourceAccountId() {
        return this.resourceAccountId;
    }

}
