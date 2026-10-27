// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeOrgsRequest extends TeaModel {
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
    public java.util.Map<String, ?> showExtras;

    public static DescribeOrgsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrgsRequest self = new DescribeOrgsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOrgsRequest setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
        return this;
    }
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    public DescribeOrgsRequest setIncludeOrgIds(java.util.List<String> includeOrgIds) {
        this.includeOrgIds = includeOrgIds;
        return this;
    }
    public java.util.List<String> getIncludeOrgIds() {
        return this.includeOrgIds;
    }

    public DescribeOrgsRequest setIsQueryAllSubOrgs(Boolean isQueryAllSubOrgs) {
        this.isQueryAllSubOrgs = isQueryAllSubOrgs;
        return this;
    }
    public Boolean getIsQueryAllSubOrgs() {
        return this.isQueryAllSubOrgs;
    }

    public DescribeOrgsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public DescribeOrgsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeOrgsRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public DescribeOrgsRequest setParentOrgId(String parentOrgId) {
        this.parentOrgId = parentOrgId;
        return this;
    }
    public String getParentOrgId() {
        return this.parentOrgId;
    }

    public DescribeOrgsRequest setShowExtras(java.util.Map<String, ?> showExtras) {
        this.showExtras = showExtras;
        return this;
    }
    public java.util.Map<String, ?> getShowExtras() {
        return this.showExtras;
    }

}
