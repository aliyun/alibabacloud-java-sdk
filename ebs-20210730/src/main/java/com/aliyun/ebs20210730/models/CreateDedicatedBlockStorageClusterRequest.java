// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class CreateDedicatedBlockStorageClusterRequest extends TeaModel {
    /**
     * <p>The zone ID of the dedicated block storage cluster. You can call <a href="https://help.aliyun.com/document_detail/25610.html">DescribeZones</a> to query the zone list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-heyuan-b</p>
     */
    @NameInMap("Azone")
    public String azone;

    /**
     * <p>The capacity of the dedicated block storage cluster. Valid values: 61440 to 2334720 GiB (2280 TiB). Minimum increment: 12288 GiB.</p>
     * <blockquote>
     * <p>When the capacity of the dedicated block storage cluster is less than 576 TiB, the maximum throughput per TiB does not exceed 52 MB/s. When the capacity of the dedicated block storage cluster is greater than 576 TiB, the maximum throughput per TiB does not exceed 26 MB/s.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>61440</p>
     */
    @NameInMap("Capacity")
    public Long capacity;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>test1233</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("DbscId")
    @Deprecated
    public String dbscId;

    /**
     * <p>The name of the dedicated block storage cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>myDBSCCluster</p>
     */
    @NameInMap("DbscName")
    public String dbscName;

    /**
     * <p>The subscription duration of the instance. Valid values: 6, 7, 8, 9, 10, 11, 12, 24, and 36.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription duration specified by the <code>Period</code> parameter. Only Month is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The region ID of the dedicated block storage cluster. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-heyuan</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the dedicated block storage cluster belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmvs*******</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The list of tags. A maximum of 20 tags can be specified.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateDedicatedBlockStorageClusterRequestTag> tag;

    /**
     * <p>The performance type of the dedicated block storage cluster. Valid values:</p>
     * <ul>
     * <li>Standard: basic. You can create PL0 ESSDs in this type of dedicated block storage cluster.</li>
     * <li>Premium: performance. You can create PL1 ESSDs in this type of dedicated block storage cluster.</li>
     * </ul>
     * <p>Default value: Premium.</p>
     * <p>For more information about standard SSDs, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Premium</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateDedicatedBlockStorageClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDedicatedBlockStorageClusterRequest self = new CreateDedicatedBlockStorageClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateDedicatedBlockStorageClusterRequest setAzone(String azone) {
        this.azone = azone;
        return this;
    }
    public String getAzone() {
        return this.azone;
    }

    public CreateDedicatedBlockStorageClusterRequest setCapacity(Long capacity) {
        this.capacity = capacity;
        return this;
    }
    public Long getCapacity() {
        return this.capacity;
    }

    @Deprecated
    public CreateDedicatedBlockStorageClusterRequest setDbscId(String dbscId) {
        this.dbscId = dbscId;
        return this;
    }
    public String getDbscId() {
        return this.dbscId;
    }

    public CreateDedicatedBlockStorageClusterRequest setDbscName(String dbscName) {
        this.dbscName = dbscName;
        return this;
    }
    public String getDbscName() {
        return this.dbscName;
    }

    public CreateDedicatedBlockStorageClusterRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateDedicatedBlockStorageClusterRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateDedicatedBlockStorageClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDedicatedBlockStorageClusterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDedicatedBlockStorageClusterRequest setTag(java.util.List<CreateDedicatedBlockStorageClusterRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateDedicatedBlockStorageClusterRequestTag> getTag() {
        return this.tag;
    }

    public CreateDedicatedBlockStorageClusterRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateDedicatedBlockStorageClusterRequestTag extends TeaModel {
        /**
         * <p>The tag key of the dedicated block storage cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the dedicated block storage cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-value</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateDedicatedBlockStorageClusterRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateDedicatedBlockStorageClusterRequestTag self = new CreateDedicatedBlockStorageClusterRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateDedicatedBlockStorageClusterRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateDedicatedBlockStorageClusterRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
