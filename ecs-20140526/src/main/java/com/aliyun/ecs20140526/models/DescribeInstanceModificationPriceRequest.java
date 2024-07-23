// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceModificationPriceRequest extends TeaModel {
    @NameInMap("SystemDisk")
    public DescribeInstanceModificationPriceRequestSystemDisk systemDisk;

    /**
     * <p>The information about data disks.</p>
     */
    @NameInMap("DataDisk")
    public java.util.List<DescribeInstanceModificationPriceRequestDataDisk> dataDisk;

    /**
     * <p>The ID of the instance for which you want to query pricing information for a configuration upgrade.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1f2o4ldh8l****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The new instance type. We recommend that you call the <a href="https://help.aliyun.com/document_detail/66187.html">DescribeResourcesModification</a> operation to query the instance types available for configuration upgrades in a specified zone.</p>
     * <blockquote>
     * <p>When you call the DescribeInstanceModificationPrice operation, you must specify at least one of the following parameters: <code>InstanceType</code> and <code>DataDisk.N.*</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ecs.g6e.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
        /**
         * <p>The category of the system disk. You must specify this parameter only when you upgrade a non-I/O optimized instance of a retired instance type to an I/O optimized instance of an available instance type. For more information about instance types, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> and <a href="https://help.aliyun.com/document_detail/55263.html">Retired instance types</a>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>cloud_efficiency: ultra disk</li>
         * <li>cloud_ssd: standard SSD</li>
         * </ul>
         * <p>This parameter is empty by default.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
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
        /**
         * <p>The category of data disk N. You can specify this parameter if you want to query the pricing information about newly attached subscription data disks. Valid values of N: 1 to 16. Valid values:</p>
         * <ul>
         * <li>cloud_efficiency: utra disk.</li>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>cloud_essd: ESSD.</li>
         * <li>cloud: basic disk.</li>
         * </ul>
         * <p>This parameter is empty by default.</p>
         * <blockquote>
         * <p> When you call the DescribeInstanceModificationPrice operation, you must specify at least one of the following parameters: <code>InstanceType</code> and <code>DataDisk.N.*</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The performance level of data disk N that is an enhanced SSD (ESSD). The value of N must be the same as that in <code>DataDisk.N.Category</code> when DataDisk.N.Category is set to cloud_essd. Valid values:</p>
         * <ul>
         * <li>PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</li>
         * <li>PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</li>
         * <li>PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * <p>Default value: PL1.</p>
         * <p>For more information about ESSD performance levels, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The capacity of data disk N. Valid values of N: 1 to 16. Unit: GiB. Valid values:</p>
         * <ul>
         * <li><p>Valid values when DataDisk.N.Category is set to cloud_efficiency: 20 to 32768.</p>
         * </li>
         * <li><p>Valid values when DataDisk.N.Category is set to cloud_ssd: 20 to 32768.</p>
         * </li>
         * <li><p>Valid values when DataDisk.N.Category is set to cloud_essd: vary based on the <code>DataDisk.N.PerformanceLevel</code> value.</p>
         * <ul>
         * <li>Valid values when DataDisk.N.PerformanceLevel is set to PL0: 1 to 32768.</li>
         * <li>Valid values when DataDisk.N.PerformanceLevel is set to PL1: 20 to 32768.</li>
         * <li>Valid values when DataDisk.N.PerformanceLevel is set to PL2: 461 to 32768.</li>
         * <li>Valid values when DataDisk.N.PerformanceLevel is set to PL3: 1261 to 32768.</li>
         * </ul>
         * </li>
         * <li><p>Valid values when DataDisk.N.Category is set to cloud: 5 to 2000.</p>
         * </li>
         * </ul>
         * <p>The default value is the minimum capacity allowed for the specified data disk category.</p>
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
