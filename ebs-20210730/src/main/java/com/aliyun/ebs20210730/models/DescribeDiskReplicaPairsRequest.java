// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiskReplicaPairsRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return on each page. Use this parameter with NextToken.</p>
     * <p>Valid values: 1 to 500.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The name of the replication pair. Fuzzy matching is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>name***</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The query token. Set this parameter to the NextToken value returned from the previous call to this operation. You do not need to set this parameter for the first call. If you set NextToken, the PageSize and PageNumber parameters are ignored, and the TotalCount value in the response is invalid.</p>
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
     * <p>The IDs of replication pairs. Specify one or more replication pair IDs. The IDs must be in the <code>pair-cn-dsa****,pair-cn-asd****</code> format.</p>
     * <p>If you leave this parameter empty, all replication pairs in the current region are queried. You can specify up to 100 replication pair IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>pair-cn-dsa****</p>
     */
    @NameInMap("PairIds")
    public String pairIds;

    /**
     * <p>The ID of the region where the primary or secondary disk of the replication pair resides. Call the <a href="https://help.aliyun.com/document_detail/354276.html">DescribeRegions</a> operation to query the regions that support asynchronous replication.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the replication pair-consistent group. Specify the ID of a replication pair-consistent group to query the replication pairs in the group. The ID must be in the <code>pg-****</code> format.</p>
     * <p>If you leave this parameter empty, all replication pairs in the current region are queried.</p>
     * <blockquote>
     * <p>If you set this parameter to <code>-</code>, replication pairs that are not in any replication pair-consistent group are returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pg-****</p>
     */
    @NameInMap("ReplicaGroupId")
    public String replicaGroupId;

    /**
     * <p>The ID of the resource group to which the replication pair belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmvs******</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The site from which to query data. Query data from the production site or the disaster recovery site. Valid values:</p>
     * <ul>
     * <li><p>production: the production site.</p>
     * </li>
     * <li><p>backup: the disaster recovery site.</p>
     * </li>
     * </ul>
     * <p>Default value: production.</p>
     * 
     * <strong>example:</strong>
     * <p>production</p>
     */
    @NameInMap("Site")
    public String site;

    /**
     * <p>The tags. You can specify up to 20 tags.</p>
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

    public DescribeDiskReplicaPairsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
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
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
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
