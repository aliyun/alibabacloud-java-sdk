// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ListPolicyGroupsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kU+SQXzm0H9mu/FiSc****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PolicyGroupIds")
    public java.util.List<String> policyGroupIds;

    @NameInMap("PolicyGroupName")
    public String policyGroupName;

    public static ListPolicyGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPolicyGroupsRequest self = new ListPolicyGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListPolicyGroupsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPolicyGroupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPolicyGroupsRequest setPolicyGroupIds(java.util.List<String> policyGroupIds) {
        this.policyGroupIds = policyGroupIds;
        return this;
    }
    public java.util.List<String> getPolicyGroupIds() {
        return this.policyGroupIds;
    }

    public ListPolicyGroupsRequest setPolicyGroupName(String policyGroupName) {
        this.policyGroupName = policyGroupName;
        return this;
    }
    public String getPolicyGroupName() {
        return this.policyGroupName;
    }

}
