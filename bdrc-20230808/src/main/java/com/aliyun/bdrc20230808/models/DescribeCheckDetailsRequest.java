// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class DescribeCheckDetailsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>cae**********699</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ecs:123<em><strong>890:cn-shanghai:instance/i-001</strong></em>90</p>
     */
    @NameInMap("ResourceArn")
    public String resourceArn;

    /**
     * <strong>example:</strong>
     * <p>rule-000***dav</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    public static DescribeCheckDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckDetailsRequest self = new DescribeCheckDetailsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCheckDetailsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeCheckDetailsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeCheckDetailsRequest setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }
    public String getResourceArn() {
        return this.resourceArn;
    }

    public DescribeCheckDetailsRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
