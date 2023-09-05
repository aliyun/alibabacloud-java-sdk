// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiskReplicaPairsRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return on each page.</p>
     * <br>
     * <p>Valid values: 1 to 500.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The query token. Set the value to the NextToken value returned in the previous call to the DescribeDiskReplicaPairs operation. Leave this parameter empty the first time you call this operation. When NextToken is specified, the PageSize and PageNumber request parameters do not take effect and the TotalCount response parameter is invalid.</p>
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
     * <p>The IDs of replication pairs. You can specify the IDs of one or more replication pairs and separate the IDs with commas (,). Example: `pair-cn-dsa****,pair-cn-asd****`.</p>
     * <br>
     * <p>This parameter is empty by default, which indicates that all replication pairs in the specified region are queried.</p>
     */
    @NameInMap("PairIds")
    public String pairIds;

    /**
     * <p>The region ID of the primary or secondary disk in the replication pair. You can call the [DescribeRegions](~~354276~~) operation to query the most recent list of regions in which async replication is supported.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the replication pair-consistent group. You can specify the ID of a replication pair-consistent group to query the replication pairs that are added to this group. Example: `pg-****`.</p>
     * <br>
     * <p>This parameter is empty by default, which indicates that all replication pairs in the specified region are queried.</p>
     * <br>
     * <p>>  If you set this parameter to `-`, replication pairs that are not added to replication pair-consistent groups are queried.</p>
     */
    @NameInMap("ReplicaGroupId")
    public String replicaGroupId;

    /**
     * <p>The ID of the resource group to which the replication pair belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The type of the site from which the information of replication pairs is retrieved. Valid values:</p>
     * <br>
     * <p>*   production: primary site</p>
     * <p>*   backup: secondary site</p>
     * <br>
     * <p>Default value: production.</p>
     */
    @NameInMap("Site")
    public String site;

    /**
     * <p>The resource tags. You can specify up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeDiskReplicaPairsRequestTag> tag;

    public static DescribeDiskReplicaPairsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskReplicaPairsRequest self = new DescribeDiskReplicaPairsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDiskReplicaPairsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public DescribeDiskReplicaPairsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDiskReplicaPairsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDiskReplicaPairsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDiskReplicaPairsRequest setPairIds(String pairIds) {
        this.pairIds = pairIds;
        return this;
    }
    public String getPairIds() {
        return this.pairIds;
    }

    public DescribeDiskReplicaPairsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDiskReplicaPairsRequest setReplicaGroupId(String replicaGroupId) {
        this.replicaGroupId = replicaGroupId;
        return this;
    }
    public String getReplicaGroupId() {
        return this.replicaGroupId;
    }

    public DescribeDiskReplicaPairsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDiskReplicaPairsRequest setSite(String site) {
        this.site = site;
        return this;
    }
    public String getSite() {
        return this.site;
    }

    public DescribeDiskReplicaPairsRequest setTag(java.util.List<DescribeDiskReplicaPairsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeDiskReplicaPairsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeDiskReplicaPairsRequestTag extends TeaModel {
        /**
         * <p>The key of tag N of the replication pair.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the replication pair.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDiskReplicaPairsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiskReplicaPairsRequestTag self = new DescribeDiskReplicaPairsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeDiskReplicaPairsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDiskReplicaPairsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
