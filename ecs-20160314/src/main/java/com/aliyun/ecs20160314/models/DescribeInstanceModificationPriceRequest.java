// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeInstanceModificationPriceRequest extends TeaModel {
    @NameInMap("SystemDisk")
    public SystemDisk systemDisk;

    @NameInMap("DataDisk")
    public java.util.List<DataDisk> dataDisk;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

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

    public DescribeInstanceModificationPriceRequest setSystemDisk(SystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public SystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public DescribeInstanceModificationPriceRequest setDataDisk(java.util.List<DataDisk> dataDisk) {
        this.dataDisk = dataDisk;
        return this;
    }
    public java.util.List<DataDisk> getDataDisk() {
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

    public static class SystemDisk extends TeaModel {
        @NameInMap("Category")
        public String category;

        public static SystemDisk build(java.util.Map<String, ?> map) throws Exception {
            SystemDisk self = new SystemDisk();
            return TeaModel.build(map, self);
        }

        public SystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

    }

    public static class DataDisk extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        @NameInMap("Size")
        public Integer size;

        public static DataDisk build(java.util.Map<String, ?> map) throws Exception {
            DataDisk self = new DataDisk();
            return TeaModel.build(map, self);
        }

        public DataDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DataDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

}
