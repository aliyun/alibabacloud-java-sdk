// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopMetadataRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2025-01-01T12:00:00Z</p>
     */
    @NameInMap("CreationTimeStart")
    public String creationTimeStart;

    @NameInMap("DesktopIds")
    public java.util.List<String> desktopIds;

    /**
     * <strong>example:</strong>
     * <p>dg-i1ruuudp92qpj****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <strong>example:</strong>
     * <p>ASW-2F-SRV-YXYZ-4.SHPTG</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <strong>example:</strong>
     * <p>m-gx2x1dhsmusr2****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeDesktopGroup")
    public Boolean includeDesktopGroup;

    /**
     * <strong>example:</strong>
     * <p>ecd</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-778418****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <strong>example:</strong>
     * <p>2025-01-01T12:00:00Z</p>
     */
    @NameInMap("OperationTimeStart")
    public String operationTimeStart;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
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
