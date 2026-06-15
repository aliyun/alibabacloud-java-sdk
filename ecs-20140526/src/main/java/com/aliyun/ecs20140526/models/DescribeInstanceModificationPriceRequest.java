// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceModificationPriceRequest extends TeaModel {
    @NameInMap("SystemDisk")
    public DescribeInstanceModificationPriceRequestSystemDisk systemDisk;

    /**
     * <p>The data disk configurations.</p>
     */
    @NameInMap("DataDisk")
    public java.util.List<DescribeInstanceModificationPriceRequestDataDisk> dataDisk;

    /**
     * <strong>example:</strong>
     * <p>2025-12-06T22Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>BGP</p>
     */
    @NameInMap("ISP")
    public String ISP;

    /**
     * <strong>example:</strong>
     * <p>aliyun_2_1903_x64_20G_alibase_20200324.vhd</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The ID of the instance for which to query the modification price.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1f2o4ldh8l****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The target instance type for the instance upgrade. Call the <a href="https://help.aliyun.com/document_detail/66187.html">DescribeResourcesModification</a> operation to query the instance types available for upgrade in the specified availability zone.</p>
     * <blockquote>
     * <p>You must specify at least one of the <code>InstanceType</code> and <code>DataDisk.N.*</code> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ecs.g6e.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <strong>example:</strong>
     * <p>PayByTraffic</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to get the latest list of Alibaba Cloud regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>2025-12-05T22:40Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

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

    public DescribeInstanceModificationPriceRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeInstanceModificationPriceRequest setISP(String ISP) {
        this.ISP = ISP;
        return this;
    }
    public String getISP() {
        return this.ISP;
    }

    public DescribeInstanceModificationPriceRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
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

    public DescribeInstanceModificationPriceRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public DescribeInstanceModificationPriceRequest setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
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

    public DescribeInstanceModificationPriceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeInstanceModificationPriceRequestSystemDisk extends TeaModel {
        @NameInMap("Category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("Size")
        public Integer size;

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

        public DescribeInstanceModificationPriceRequestSystemDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DescribeInstanceModificationPriceRequestSystemDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class DescribeInstanceModificationPriceRequestDataDisk extends TeaModel {
        /**
         * <p>The category of data disk N, where N is an integer from 1 to 16. Use this parameter to query the price of adding a new data disk to the instance. Valid values:\
         * \
         * \- <code>cloud_efficiency</code>: Ultra Disk\
         * \
         * \- <code>cloud_ssd</code>: Standard SSD\
         * \
         * \- <code>cloud_essd</code>: ESSD\
         * \
         * \- <code>cloud</code>: Basic Disk\
         * \
         * Default value: None.\
         * \
         * \
         * \
         * \
         * \
         * \
         * \
         * \
         * \</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>d-bf4rupt9****</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <p>The performance level of the ESSD. This parameter is valid only when DataDisk.N.Category is set to cloud_essd. The value of N must match the N in DataDisk.N.Category. Valid values:
         * \- PL0: up to 10,000 random read/write IOPS per disk.
         * \- PL1: up to 50,000 random read/write IOPS per disk.
         * \- PL2: up to 100,000 random read/write IOPS per disk.
         * \- PL3: up to 1,000,000 random read/write IOPS per disk.
         * Default value: PL1.
         * For more information about ESSD performance levels, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The size of data disk N in GiB, where N is an integer from 1 to 16. The value range varies based on the disk category:
         * \- <code>cloud_efficiency</code> (Ultra Disk): 20 to 32768.
         * \- <code>cloud_ssd</code> (Standard SSD): 20 to 32768.
         * \- <code>cloud_essd</code>: The value range varies based on the value of <code>DataDisk.N.PerformanceLevel</code>.
         * \- PL0: 1 to 32768.
         * \- PL1: 20 to 32768.
         * \- PL2: 461 to 32768.
         * \- PL3: 1261 to 32768.
         * \- <code>cloud</code> (Basic Disk): 5 to 2000.
         * Default value: The minimum size supported by the specified data disk category.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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

        public DescribeInstanceModificationPriceRequestDataDisk setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
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
