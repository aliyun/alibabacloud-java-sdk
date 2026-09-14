// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiskReplicaGroupsRequest extends TeaModel {
    /**
     * <p>The IDs of the replication pair-consistent groups. You can specify one or more group IDs. Separate multiple IDs with a comma (,).</p>
     * <p>If you do not specify this parameter, all replication pair-consistent groups in the current region are queried. You can specify up to 100 group IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2****</p>
     */
    @NameInMap("GroupIds")
    public String groupIds;

    /**
     * <p>The maximum number of entries to return on a single page. You can use this parameter with NextToken.</p>
     * <p>Valid values: 1 to 500.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The name of the replication group. Fuzzy search is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-name***</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The query token. Set this parameter to the NextToken value returned from the previous call to this operation. You do not need to set this parameter for the first call. If you set NextToken, the PageSize and PageNumber parameters are ignored, and the TotalCount in the response is invalid.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.
     * Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the replication pair-consistent group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the replication pair-consistent group belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekz*****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The site to query. This parameter is used when replication pairs are deployed across zones.</p>
     * <ul>
     * <li><p>If you do not specify this parameter, the records and status information of replication pairs at the production site are returned.</p>
     * </li>
     * <li><p>If you specify this parameter, only the records and status information of replication pairs at the specified site are returned. Valid values:</p>
     * <ul>
     * <li><p>production: The production site.</p>
     * </li>
     * <li><p>backup: The disaster recovery site.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>production</p>
     */
    @NameInMap("Site")
    public String site;

    /**
     * <p>The tags. The list can contain up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeDiskReplicaGroupsRequestTag> tag;

    public static DescribeDiskReplicaGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskReplicaGroupsRequest self = new DescribeDiskReplicaGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDiskReplicaGroupsRequest setGroupIds(String groupIds) {
        this.groupIds = groupIds;
        return this;
    }
    public String getGroupIds() {
        return this.groupIds;
    }

    public DescribeDiskReplicaGroupsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public DescribeDiskReplicaGroupsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeDiskReplicaGroupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDiskReplicaGroupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDiskReplicaGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDiskReplicaGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDiskReplicaGroupsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDiskReplicaGroupsRequest setSite(String site) {
        this.site = site;
        return this;
    }
    public String getSite() {
        return this.site;
    }

    public DescribeDiskReplicaGroupsRequest setTag(java.util.List<DescribeDiskReplicaGroupsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeDiskReplicaGroupsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeDiskReplicaGroupsRequestTag extends TeaModel {
        /**
         * <p>The key of the tag of the replication pair-consistent group.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag of the replication pair-consistent group.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-value</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDiskReplicaGroupsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiskReplicaGroupsRequestTag self = new DescribeDiskReplicaGroupsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeDiskReplicaGroupsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDiskReplicaGroupsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
