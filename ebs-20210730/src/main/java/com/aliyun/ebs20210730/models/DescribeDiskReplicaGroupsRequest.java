// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiskReplicaGroupsRequest extends TeaModel {
    /**
     * <p>The IDs of the replication pair-consistent groups. You can specify the IDs of one or more replication pair-consistent groups. Separate the IDs with commas (,).</p>
     * <p>This parameter is empty by default, which indicates that all replication pair-consistent groups in the specified region are queried. You can specify up to the IDs of 100 replication pair-consistent groups.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2****</p>
     */
    @NameInMap("GroupIds")
    public String groupIds;

    /**
     * <p>The maximum number of entries per page. You can use this parameter together with NextToken.</p>
     * <p>Valid values: 1 to 500.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The name of the replication pair-consistent group. You can perform a fuzzy search.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-name***</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken. If you specify NextToken, the PageSize and PageNumber request parameters do not take effect, and the TotalCount response parameter is invalid.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region to which the replication pair-consistent group belongs.</p>
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
     * <p>The type of the site from which the information of replication pair-consistent groups is retrieved. This parameter is used for scenarios where data is replicated across zones in replication pairs.</p>
     * <ul>
     * <li><p>If this parameter is not specified, information such as the status of replication pair-consistent groups at the primary site is queried and returned.</p>
     * </li>
     * <li><p>Otherwise, information such as the state of replication pairs at the site specified by the Site parameter is queried and returned. Valid values:</p>
     * <ul>
     * <li>production: primary site</li>
     * <li>backup: secondary site</li>
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
     * <p>The tags to add to the replication pair-consistent group. You can specify up to 20 tags.</p>
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
         * <p>The key of tag N of the replication pair-consistent group.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the replication pair-consistent group.</p>
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
