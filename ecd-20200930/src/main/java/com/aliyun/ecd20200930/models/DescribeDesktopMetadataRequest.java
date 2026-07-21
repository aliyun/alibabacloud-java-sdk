// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopMetadataRequest extends TeaModel {
    /**
     * <p>The time when the cloud desktop was created. The time is in UTC format:
     * <code>yyyy-MM-dd\\&quot;T\\&quot;HH:mm:ss\\&quot;Z\\&quot;</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-01T12:00:00Z</p>
     */
    @NameInMap("CreationTimeStart")
    public String creationTimeStart;

    /**
     * <p>The list of cloud desktop IDs.</p>
     */
    @NameInMap("DesktopIds")
    public java.util.List<String> desktopIds;

    /**
     * <p>The end user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>test-user</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The shared cloud desktop ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dg-i1ruuudp92qpj****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The hostname.</p>
     * 
     * <strong>example:</strong>
     * <p>ASW-2F-SRV-YXYZ-4.SHPTG</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The image ID.</p>
     * 
     * <strong>example:</strong>
     * <p>m-gx2x1dhsmusr2****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>Specifies whether the response includes cloud desktops in shared cloud desktop groups.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeDesktopGroup")
    public Boolean includeDesktopGroup;

    /**
     * <blockquote>
     * <p>This parameter is not yet available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ecd</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The number of entries per page for a paged query. Maximum value: 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NetworkInterfaceIp")
    public String networkInterfaceIp;

    /**
     * <p>The token for the next query. An empty value indicates that there are no more results.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-778418****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The start time of the operation performed on the cloud desktop. The time is in UTC format:
     * <code>yyyy-MM-dd\\&quot;T\\&quot;HH:mm:ss\\&quot;Z\\&quot;</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-01T12:00:00Z</p>
     */
    @NameInMap("OperationTimeStart")
    public String operationTimeStart;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the region to search.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SearchRegionId")
    public String searchRegionId;

    public static DescribeDesktopMetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopMetadataRequest self = new DescribeDesktopMetadataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopMetadataRequest setCreationTimeStart(String creationTimeStart) {
        this.creationTimeStart = creationTimeStart;
        return this;
    }
    public String getCreationTimeStart() {
        return this.creationTimeStart;
    }

    public DescribeDesktopMetadataRequest setDesktopIds(java.util.List<String> desktopIds) {
        this.desktopIds = desktopIds;
        return this;
    }
    public java.util.List<String> getDesktopIds() {
        return this.desktopIds;
    }

    public DescribeDesktopMetadataRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public DescribeDesktopMetadataRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeDesktopMetadataRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public DescribeDesktopMetadataRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeDesktopMetadataRequest setIncludeDesktopGroup(Boolean includeDesktopGroup) {
        this.includeDesktopGroup = includeDesktopGroup;
        return this;
    }
    public Boolean getIncludeDesktopGroup() {
        return this.includeDesktopGroup;
    }

    public DescribeDesktopMetadataRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeDesktopMetadataRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeDesktopMetadataRequest setNetworkInterfaceIp(String networkInterfaceIp) {
        this.networkInterfaceIp = networkInterfaceIp;
        return this;
    }
    public String getNetworkInterfaceIp() {
        return this.networkInterfaceIp;
    }

    public DescribeDesktopMetadataRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDesktopMetadataRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public DescribeDesktopMetadataRequest setOperationTimeStart(String operationTimeStart) {
        this.operationTimeStart = operationTimeStart;
        return this;
    }
    public String getOperationTimeStart() {
        return this.operationTimeStart;
    }

    public DescribeDesktopMetadataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDesktopMetadataRequest setSearchRegionId(String searchRegionId) {
        this.searchRegionId = searchRegionId;
        return this;
    }
    public String getSearchRegionId() {
        return this.searchRegionId;
    }

}
