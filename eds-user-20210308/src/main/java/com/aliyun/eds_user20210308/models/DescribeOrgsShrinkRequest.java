// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeOrgsShrinkRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return. Valid values: 1 to 100.\
     * Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The token that determines the start point of the query. The return value is the value of the NextToken response parameter that was returned last time the DescribeOrgs operation was called.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The name of the organization.</p>
     * 
     * <strong>example:</strong>
     * <p>org****</p>
     */
    @NameInMap("OrgName")
    public String orgName;

    /**
     * <p>The parent organization ID.</p>
     * 
     * <strong>example:</strong>
     * <p>org-****</p>
     */
    @NameInMap("ParentOrgId")
    public String parentOrgId;

    @NameInMap("ShowExtras")
    public String showExtrasShrink;

    public static DescribeOrgsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrgsShrinkRequest self = new DescribeOrgsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOrgsShrinkRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public DescribeOrgsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeOrgsShrinkRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public DescribeOrgsShrinkRequest setParentOrgId(String parentOrgId) {
        this.parentOrgId = parentOrgId;
        return this;
    }
    public String getParentOrgId() {
        return this.parentOrgId;
    }

    public DescribeOrgsShrinkRequest setShowExtrasShrink(String showExtrasShrink) {
        this.showExtrasShrink = showExtrasShrink;
        return this;
    }
    public String getShowExtrasShrink() {
        return this.showExtrasShrink;
    }

}
