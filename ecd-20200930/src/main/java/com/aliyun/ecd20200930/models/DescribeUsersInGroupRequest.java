// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeUsersInGroupRequest extends TeaModel {
    /**
     * <p>The connection status of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ConnectState")
    public Integer connectState;

    /**
     * <p>The shared cloud desktop ID.</p>
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
     * <p>A list of authorized user IDs.</p>
     */
    @NameInMap("EndUserIds")
    public java.util.List<String> endUserIds;

    /**
     * <p>The string for a partial match query. Results that contain this string are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The number of entries per page.</p>
     * <ul>
     * <li><p>Maximum value: 100.</p>
     * </li>
     * <li><p>Default value: 10.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token to start the next query. An empty value indicates that all results have been returned.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the organization to which the user belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>org-d0fua2oyukw8j****</p>
     */
    @NameInMap("OrgId")
    public String orgId;

    /**
     * <p>Specifies whether to query user details.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("QueryUserDetail")
    public Boolean queryUserDetail;

    /**
     * <p>The region ID. Call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to get a list of regions where WUYING Workspace is available.</p>
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
