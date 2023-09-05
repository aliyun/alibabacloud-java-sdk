// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiskReplicaGroupsRequest extends TeaModel {
    /**
     * <p>The IDs of replication pair-consistent groups. You can specify the IDs of one or more replication pair-consistent groups. Separate the IDs with commas (,).</p>
     * <br>
     * <p>This parameter is empty by default, which indicates that all replication pair-consistent groups in the specified region are queried.</p>
     */
    @NameInMap("GroupIds")
    public String groupIds;

    /**
     * <p>The maximum number of entries to return on each page. Valid values: 1 to 500.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The query token. Set the value to the NextToken value returned in the previous call to the DescribeDiskReplicaGroups operation. Leave this parameter empty the first time you call this operation. When NextToken is specified, the PageSize and PageNumber request parameters do not take effect and the TotalCount response parameter is invalid.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Valid values: 1 to 100.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the replication pair-consistent group.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the replication group belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The type of the site from which the information of replication pair-consistent groups is retrieved. This parameter is used for scenarios where data is replicated across zones in replication pairs.</p>
     * <br>
     * <p>*   If the Site parameter is not specified, information such as the state of replication pair-consistent groups at the primary site is queried and returned.</p>
     * <br>
     * <p>*   Otherwise, information such as the state of replication pair-consistent groups at the site specified by the Site parameter is queried and returned. Valid values:</p>
     * <br>
     * <p>    *   production: primary site</p>
     * <p>    *   backup: secondary site</p>
     */
    @NameInMap("Site")
    public String site;

    /**
     * <p>The resource tags. You can specify up to 20 tags.</p>
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
         * <p>The key of tag N of the replication group.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the replication group.</p>
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
