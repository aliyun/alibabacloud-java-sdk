// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeOrgsShrinkRequest extends TeaModel {
    /**
     * <p>The business channel.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("BusinessChannel")
    public String businessChannel;

    /**
     * <p>The list of organization IDs to query.</p>
     */
    @NameInMap("IncludeOrgIds")
    public java.util.List<String> includeOrgIds;

    /**
     * <p>Specifies whether to query all subordinate organizations when a parent organization is specified.</p>
     */
    @NameInMap("IsQueryAllSubOrgs")
    public Boolean isQueryAllSubOrgs;

    /**
     * <p>The maximum number of results to return. Valid values: 1 to 100. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token. Set the value to the NextToken parameter returned by the previous API call.</p>
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
     * <p>Product Department</p>
     */
    @NameInMap("OrgName")
    public String orgName;

    /**
     * <p>The ID of the parent organization.</p>
     * 
     * <strong>example:</strong>
     * <p>org-11fs****</p>
     */
    @NameInMap("ParentOrgId")
    public String parentOrgId;

    /**
     * <p>The switch mapping for additional response information. This parameter controls whether to return organization paths and resource policy information.</p>
     */
    @NameInMap("ShowExtras")
    public String showExtrasShrink;

    public static DescribeOrgsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrgsShrinkRequest self = new DescribeOrgsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOrgsShrinkRequest setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
        return this;
    }
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    public DescribeOrgsShrinkRequest setIncludeOrgIds(java.util.List<String> includeOrgIds) {
        this.includeOrgIds = includeOrgIds;
        return this;
    }
    public java.util.List<String> getIncludeOrgIds() {
        return this.includeOrgIds;
    }

    public DescribeOrgsShrinkRequest setIsQueryAllSubOrgs(Boolean isQueryAllSubOrgs) {
        this.isQueryAllSubOrgs = isQueryAllSubOrgs;
        return this;
    }
    public Boolean getIsQueryAllSubOrgs() {
        return this.isQueryAllSubOrgs;
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
