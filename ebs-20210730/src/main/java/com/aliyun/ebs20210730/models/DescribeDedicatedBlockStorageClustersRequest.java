// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDedicatedBlockStorageClustersRequest extends TeaModel {
    /**
     * <p>The zone ID of the dedicated block storage cluster. You can call the [DescribeZones](~~25610~~) operation to query the most recent zone list.</p>
     */
    @NameInMap("AzoneId")
    public String azoneId;

    /**
     * <p>The category of disks that can be created in the dedicated block storage cluster.</p>
     * <br>
     * <p>Set the value to cloud_essd. Only enhanced SSDs (ESSDs) can be created in dedicated block storage clusters.</p>
     */
    @NameInMap("Category")
    public String category;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DedicatedBlockStorageClusterId")
    public java.util.List<String> dedicatedBlockStorageClusterId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the dedicated block storage cluster. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the dedicated block storage cluster belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The states of dedicated block storage clusters. Valid values:</p>
     * <br>
     * <p>*   Preparing</p>
     * <p>*   Running</p>
     * <p>*   Expired</p>
     * <p>*   Offline</p>
     * <br>
     * <p>Multiple states can be specified. Valid values of N: 1, 2, 3, and 4.</p>
     */
    @NameInMap("Status")
    public java.util.List<String> status;

    /**
     * <p>The tags. Up to 20 tags are supported.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeDedicatedBlockStorageClustersRequestTag> tag;

    public static DescribeDedicatedBlockStorageClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedBlockStorageClustersRequest self = new DescribeDedicatedBlockStorageClustersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedBlockStorageClustersRequest setAzoneId(String azoneId) {
        this.azoneId = azoneId;
        return this;
    }
    public String getAzoneId() {
        return this.azoneId;
    }

    public DescribeDedicatedBlockStorageClustersRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeDedicatedBlockStorageClustersRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeDedicatedBlockStorageClustersRequest setDedicatedBlockStorageClusterId(java.util.List<String> dedicatedBlockStorageClusterId) {
        this.dedicatedBlockStorageClusterId = dedicatedBlockStorageClusterId;
        return this;
    }
    public java.util.List<String> getDedicatedBlockStorageClusterId() {
        return this.dedicatedBlockStorageClusterId;
    }

    public DescribeDedicatedBlockStorageClustersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeDedicatedBlockStorageClustersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDedicatedBlockStorageClustersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDedicatedBlockStorageClustersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDedicatedBlockStorageClustersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDedicatedBlockStorageClustersRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDedicatedBlockStorageClustersRequest setStatus(java.util.List<String> status) {
        this.status = status;
        return this;
    }
    public java.util.List<String> getStatus() {
        return this.status;
    }

    public DescribeDedicatedBlockStorageClustersRequest setTag(java.util.List<DescribeDedicatedBlockStorageClustersRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeDedicatedBlockStorageClustersRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeDedicatedBlockStorageClustersRequestTag extends TeaModel {
        /**
         * <p>The tag key of the dedicated block storage cluster.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the dedicated block storage cluster.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDedicatedBlockStorageClustersRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedBlockStorageClustersRequestTag self = new DescribeDedicatedBlockStorageClustersRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedBlockStorageClustersRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDedicatedBlockStorageClustersRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
