// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeOrgsRequest extends TeaModel {
    /**
     * <p>The channel.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("BusinessChannel")
    public String businessChannel;

    @NameInMap("IncludeOrgIds")
    public java.util.List<String> includeOrgIds;

    /**
     * <p>The maximum number of entries to return. Valid values: 1 to 100.<br>
     * Default value: 100.<br></p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token. To retrieve the next page of results, set this parameter to the <code>NextToken</code> value that was returned from a previous request.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The organization name.</p>
     * 
     * <strong>example:</strong>
     * <p>产品部</p>
     */
    @NameInMap("OrgName")
    public String orgName;

    /**
     * <p>The parent organization ID.</p>
     * 
     * <strong>example:</strong>
     * <p>org-11fs****</p>
     */
    @NameInMap("ParentOrgId")
    public String parentOrgId;

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
