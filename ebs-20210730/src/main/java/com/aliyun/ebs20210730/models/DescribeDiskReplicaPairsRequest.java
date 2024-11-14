// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiskReplicaPairsRequest extends TeaModel {
    /**
     * <p>The maximum number of entries per page. You can use this parameter together with NextToken.</p>
     * <p>Valid values: 1 to 500.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The name of the replication pair. Fuzzy search is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>name***</p>
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
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The IDs of replication pairs. You can specify the IDs of one or more replication pairs and separate the IDs with commas (,). Example: <code>pair-cn-dsa****,pair-cn-asd****</code>.</p>
     * <p>This parameter is empty by default, which indicates that all replication pairs in the specified region are queried. You can specify a maximum of 100 replication pair IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>pair-cn-dsa****</p>
     */
    @NameInMap("PairIds")
    public String pairIds;

    /**
     * <p>The region ID of the primary or secondary disk in the replication pair. You can call the <a href="https://help.aliyun.com/document_detail/354276.html">DescribeRegions</a> operation to query the most recent list of regions in which async replication is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the replication pair-consistent group. You can specify the ID of a replication pair-consistent group to query the replication pairs in the group. Example: <code>pg-****</code>.</p>
     * <p>This parameter is empty by default, which indicates that all replication pairs in the specified region are queried.</p>
     * <blockquote>
     * <p> If this parameter is set to<code>-</code>, replication pairs that are not added to any replication pair-consistent groups are returned.</p>
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
     * <p>The type of the site from which the information of replication pairs is retrieved. Valid value:</p>
     * <ul>
     * <li>production: primary site</li>
     * <li>backup: secondary site</li>
     * </ul>
     * <p>Default value: production.</p>
     * 
     * <strong>example:</strong>
     * <p>production</p>
     */
    @NameInMap("Site")
    public String site;

    /**
     * <p>The tags. Up to 20 tags are supported.</p>
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
