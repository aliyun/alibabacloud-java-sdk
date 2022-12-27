// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceModificationPriceRequest extends TeaModel {
    @NameInMap("SystemDisk")
    public DescribeInstanceModificationPriceRequestSystemDisk systemDisk;

    // The list of data disk. The list size can up to 16.
    @NameInMap("DataDisk")
    public java.util.List<DescribeInstanceModificationPriceRequestDataDisk> dataDisk;

    // The ID of the instance for which you want to query pricing information for a configuration upgrade.
    @NameInMap("InstanceId")
    public String instanceId;

    // The new instance type. We recommend that you call the [DescribeResourcesModification](~~66187~~) operation to query the instance types available for configuration upgrades in a specified zone.
    // 
    // >  When you call the DescribeInstanceModificationPrice operation, you must specify at least one of the following parameters: `InstanceType` and `DataDisk.N.*`.
    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The region ID of the instance. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeInstanceModificationPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceModificationPriceRequest self = new DescribeInstanceModificationPriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceModificationPriceRequest setSystemDisk(DescribeInstanceModificationPriceRequestSystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public DescribeInstanceModificationPriceRequestSystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public DescribeInstanceModificationPriceRequest setDataDisk(java.util.List<DescribeInstanceModificationPriceRequestDataDisk> dataDisk) {
        this.dataDisk = dataDisk;
        return this;
    }
    public java.util.List<DescribeInstanceModificationPriceRequestDataDisk> getDataDisk() {
        return this.dataDisk;
    }

    public DescribeInstanceModificationPriceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceModificationPriceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeInstanceModificationPriceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeInstanceModificationPriceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeInstanceModificationPriceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInstanceModificationPriceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeInstanceModificationPriceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class DescribeInstanceModificationPriceRequestSystemDisk extends TeaModel {
        // The category of the system disk. You must specify this parameter only when you upgrade a non-I/O optimized instance of a retired instance type to an I/O optimized instance of an available instance type. For more information about instance types, see [Instance families](~~25378~~) and [Retired instance types](~~55263~~).
        // 
        // Valid values:
        // 
        // *   cloud_efficiency: ultra disk
        // *   cloud_ssd: standard SSD
        // 
        // This parameter is empty by default.
        @NameInMap("Category")
        public String category;

        public static DescribeInstanceModificationPriceRequestSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceModificationPriceRequestSystemDisk self = new DescribeInstanceModificationPriceRequestSystemDisk();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceModificationPriceRequestSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

    }

    public static class DescribeInstanceModificationPriceRequestDataDisk extends TeaModel {
        // The category of data disk. You can specify this parameter if you want to query the pricing information about newly attached subscription data disks. Valid values:
        // 
        // *   cloud_efficiency: ultra disk
        // *   cloud_ssd: standard SSD
        // *   cloud_essd: ESSD
        // *   cloud: basic disk
        // 
        // This parameter is empty by default.
        // 
        // >  When you call the DescribeInstanceModificationPrice operation, you must specify at least one of the following parameters: `InstanceType` and `DataDisk.N.*`.
        @NameInMap("Category")
        public String category;

        // The performance level of data disk N that is an enhanced SSD (ESSD). The N value must be the same as that in `DataDisk.N.Category` when DataDisk.N.Category is set to cloud_essd. Valid values:
        // 
        // *   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.
        // *   PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.
        // *   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.
        // *   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.
        // 
        // Default value: PL1.
        // 
        // For more information about ESSD performance levels, see [ESSDs](~~122389~~).
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        // The capacity of data disk. Unit: GiB. Valid values:
        // 
        // *   Valid values when Category is set to cloud_efficiency: 20 to 32768.
        // *   Valid values when Category is set to cloud_ssd: 20 to 32768.
        // *   Valid values when Category is set to cloud_essd: depend on the `DataDisk.N.PerformanceLevel` value.
        //     *   Valid values when PerformanceLevel is set to PL0: 40 to 32768.
        //     *   Valid values when PerformanceLevel is set to PL1: 20 to 32768.
        //     *   Valid values when PerformanceLevel is set to PL2: 461 to 32768.
        //     *   Valid values when PerformanceLevel is set to PL3: 1261 to 32768.
        // *   Valid values when Category is set to cloud: 5 to 2000.
        // 
        // The default value is the minimum capacity allowed for the specified data disk category.
        @NameInMap("Size")
        public Integer size;

        public static DescribeInstanceModificationPriceRequestDataDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceModificationPriceRequestDataDisk self = new DescribeInstanceModificationPriceRequestDataDisk();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceModificationPriceRequestDataDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeInstanceModificationPriceRequestDataDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DescribeInstanceModificationPriceRequestDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

}
