// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class DescribeCheckDetailsRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return on each page. The default value is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results. Set this parameter to the value of NextToken that is returned from the last API call. For more information about how to set this parameter, see the API description.</p>
     * 
     * <strong>example:</strong>
     * <p>cae**********699</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The unique identifier of the resource.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ecs:123<em><strong>890:cn-shanghai:instance/i-001</strong></em>90</p>
     */
    @NameInMap("ResourceArn")
    public String resourceArn;

    /**
     * <p>The unique ID of the data protection rule.</p>
     * 
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
