// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class CreateDedicatedBlockStorageClusterRequest extends TeaModel {
    /**
     * <p>The ID of the zone in which to create the dedicated block storage cluster. You can call the [DescribeZones](~~25610~~) operation to query the most recent zone list.</p>
     */
    @NameInMap("Azone")
    public String azone;

    /**
     * <p>The capacity of the dedicated block storage cluster. Valid values: 61440 to 2334720. Unit: GiB. 2,334,720 GiB is equal to 2,280 TiB. The capacity increases in a minimum increment of 12,288 GB.</p>
     * <br>
     * <p>>  If the capacity of a dedicated block storage cluster is less than 576 TiB, the maximum throughput supported per TiB does not exceed 52 MB/s. If the capacity of a dedicated block storage cluster is greater than 576 TiB, the maximum throughput supported per TiB does not exceed 26 MB/s.</p>
     */
    @NameInMap("Capacity")
    public Long capacity;

    /**
     * <p>This parameter is no longer used.</p>
     */
    @NameInMap("DbscId")
    @Deprecated
    public String dbscId;

    /**
     * <p>The name of the dedicated block storage cluster.</p>
     */
    @NameInMap("DbscName")
    public String dbscName;

    /**
     * <p>The specific number of PeriodUnit.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription duration for the dedicated block storage cluster,</p>
     * <p>Valid values:</p>
     * <br>
     * <p>*   **Month**</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The ID of the region in which to create the dedicated block storage cluster. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which to assign the dedicated block storage cluster.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The resource tags. You can specify up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateDedicatedBlockStorageClusterRequestTag> tag;

    /**
     * <p>The type of the dedicated block storage cluster. Valid values:</p>
     * <br>
     * <p>*   Standard: basic type. When you set Type to Standard, enhanced SSDs (ESSDs) at performance level 0 (PL0 ESSDs) can be created in the dedicated block storage cluster.</p>
     * <p>*   Premium: performance type. When you set Type to Premium, ESSDs at performance level 1 (PL1 ESSDs) can be created in the dedicated block storage cluster.</p>
     * <br>
     * <p>Default value: Premium.</p>
     * <br>
     * <p>For more information about ESSDs, see [ESSDs](~~122389~~).</p>
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
         * <p>The key of tag N used for exact search of EBS resources. The tag key must be 1 to 128 characters in length. Valid values of N: 1 to 20.</p>
         * <br>
         * <p>The `Tag.N` parameter pair (Tag.N.Key and Tag.N.Value) is used for exact search of EBS resources that have specified tags added. Each tag is a key-value pair.</p>
         * <br>
         * <p>*   If you specify only `Tag.N.Key`, all EBS resources whose tags contain the specified tag key are returned.</p>
         * <p>*   If you specify only `Tag.N.Value`, the `InvalidParameter.TagValue` error is returned.</p>
         * <p>*   If you specify multiple tag key-value pairs at the same time, only EBS resources that match all tag key-value pairs are returned.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the resource. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot start with `acs:` or contain `http://` or `https://`.</p>
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
