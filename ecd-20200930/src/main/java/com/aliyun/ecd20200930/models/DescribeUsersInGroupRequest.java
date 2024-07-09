// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeUsersInGroupRequest extends TeaModel {
    /**
     * <p>The status of the desktop connection for the end user.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>0: Disconnected.</li>
     * <li>1: Connected.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ConnectState")
    public Integer connectState;

    /**
     * <p>The ID of the cloud computer pool.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dg-8ttn55ujj8nj8****</p>
     */
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    /**
     * <p>The ID of the authorized user.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The IDs of the authorized users.</p>
     */
    @NameInMap("EndUserIds")
    public java.util.List<String> endUserIds;

    /**
     * <p>The query string for fuzzy match. If you specify this parameter, the system returns all results that contain the string.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The number of entries to return on each page.</p>
     * <ul>
     * <li>Maximum value: 100.</li>
     * <li>Default value: 10.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start point of the next query. If this parameter is left empty, all results are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the organization to which the end user belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>org-d0fua2oyukw8j****</p>
     */
    @NameInMap("OrgId")
    public String orgId;

    /**
     * <p>Specifies whether to query user details.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>true (default)</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>false</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("QueryUserDetail")
    public Boolean queryUserDetail;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeUsersInGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsersInGroupRequest self = new DescribeUsersInGroupRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUsersInGroupRequest setConnectState(Integer connectState) {
        this.connectState = connectState;
        return this;
    }
    public Integer getConnectState() {
        return this.connectState;
    }

    public DescribeUsersInGroupRequest setDesktopGroupId(String desktopGroupId) {
        this.desktopGroupId = desktopGroupId;
        return this;
    }
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    public DescribeUsersInGroupRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public DescribeUsersInGroupRequest setEndUserIds(java.util.List<String> endUserIds) {
        this.endUserIds = endUserIds;
        return this;
    }
    public java.util.List<String> getEndUserIds() {
        return this.endUserIds;
    }

    public DescribeUsersInGroupRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public DescribeUsersInGroupRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeUsersInGroupRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeUsersInGroupRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public DescribeUsersInGroupRequest setQueryUserDetail(Boolean queryUserDetail) {
        this.queryUserDetail = queryUserDetail;
        return this;
    }
    public Boolean getQueryUserDetail() {
        return this.queryUserDetail;
    }

    public DescribeUsersInGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
