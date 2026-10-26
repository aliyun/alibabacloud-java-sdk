// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDiskSpecRequest extends TeaModel {
    /**
     * <blockquote>
     * <p>This parameter is in invitational preview and is not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-g</p>
     */
    @NameInMap("DestinationZoneId")
    public String destinationZoneId;

    /**
     * <p>Changes the category of a disk. Valid values:</p>
     * <ul>
     * <li><p>cloud_essd: enterprise SSD.</p>
     * </li>
     * <li><p>cloud_auto: ESSD AutoPL disk.</p>
     * </li>
     * <li><p>cloud_ssd: standard SSD.
     * &lt;props=&quot;china&quot;&gt;</p>
     * </li>
     * <li><p>cloud_essd_entry: ESSD Entry disk.</p>
     * </li>
     * <li><p>cloud_efficiency: ultra disk.</p>
     * </li>
     * </ul>
     * <p>Default value: null, which indicates that no specification change is performed on the disk.</p>
     * <blockquote>
     * <ul>
     * <li>The preceding valid values are listed in descending order of disk performance. If the specified disk is a subscription disk, you cannot downgrade the disk category.</li>
     * </ul>
     * </blockquote>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>ESSD Entry disks can only be changed to enterprise SSDs or ESSD AutoPL disks. For more information, see <a href="https://help.aliyun.com/document_detail/161980.html">Change the category of a disk</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cloud_essd</p>
     */
    @NameInMap("DiskCategory")
    public String diskCategory;

    /**
     * <p>The ID of the disk.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d-bp131n0q38u3a4zi****</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li><p>true: The request is prechecked. The system checks whether required parameters are specified, the request format is valid, the business limits are met, and the ECS inventory is sufficient. If the request fails the precheck, the corresponding error is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p>false: The request is sent. If the request passes the precheck, a 2xx HTTP status code is returned and the disk category or ESSD performance level is directly changed.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The disk performance control parameters.</p>
     */
    @NameInMap("PerformanceControlOptions")
    public ModifyDiskSpecRequestPerformanceControlOptions performanceControlOptions;

    /**
     * <p>Modifies the performance level (PL) of an enterprise SSD. Valid values:</p>
     * <ul>
     * <li>PL0: A single disk can deliver up to 10,000 random read/write IOPS.</li>
     * <li>PL1: A single disk can deliver up to 50,000 random read/write IOPS.</li>
     * <li>PL2: A single disk can deliver up to 100,000 random read/write IOPS.</li>
     * <li>PL3: A single disk can deliver up to 1,000,000 random read/write IOPS.</li>
     * </ul>
     * <p>Default value: PL1.</p>
     * 
     * <strong>example:</strong>
     * <p>PL2</p>
     */
    @NameInMap("PerformanceLevel")
    public String performanceLevel;

    /**
     * <p>The provisioned read and write IOPS of the ESSD AutoPL disk.</p>
     * <p>Valid values: 0 to min{50000, 1000 × Capacity - Baseline performance}.</p>
     * <p>Baseline performance = min{1,800 + 50 × Capacity, 50,000}.</p>
     * <blockquote>
     * <p>This parameter is supported only when <code>DiskCategory</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a> and <a href="https://help.aliyun.com/document_detail/413275.html">Modify the provisioned information of an ESSD AutoPL disk</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>50000</p>
     */
    @NameInMap("ProvisionedIops")
    public Long provisionedIops;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyDiskSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskSpecRequest self = new ModifyDiskSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDiskSpecRequest setDestinationZoneId(String destinationZoneId) {
        this.destinationZoneId = destinationZoneId;
        return this;
    }
    public String getDestinationZoneId() {
        return this.destinationZoneId;
    }

    public ModifyDiskSpecRequest setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
        return this;
    }
    public String getDiskCategory() {
        return this.diskCategory;
    }

    public ModifyDiskSpecRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public ModifyDiskSpecRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyDiskSpecRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDiskSpecRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDiskSpecRequest setPerformanceControlOptions(ModifyDiskSpecRequestPerformanceControlOptions performanceControlOptions) {
        this.performanceControlOptions = performanceControlOptions;
        return this;
    }
    public ModifyDiskSpecRequestPerformanceControlOptions getPerformanceControlOptions() {
        return this.performanceControlOptions;
    }

    public ModifyDiskSpecRequest setPerformanceLevel(String performanceLevel) {
        this.performanceLevel = performanceLevel;
        return this;
    }
    public String getPerformanceLevel() {
        return this.performanceLevel;
    }

    public ModifyDiskSpecRequest setProvisionedIops(Long provisionedIops) {
        this.provisionedIops = provisionedIops;
        return this;
    }
    public Long getProvisionedIops() {
        return this.provisionedIops;
    }

    public ModifyDiskSpecRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDiskSpecRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class ModifyDiskSpecRequestPerformanceControlOptions extends TeaModel {
        /**
         * <p>The target IOPS of the disk. You can only modify the IOPS of disks in a dedicated block storage cluster.</p>
         * <p>Valid values: 900 to the maximum IOPS of a single disk. Step size: 100.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/25382.html">Disk performance</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("IOPS")
        public Integer IOPS;

        /**
         * <p>Resets the disk performance. This parameter is supported only for disks in a dedicated block storage cluster.</p>
         * <p>After this parameter is specified, the PerformanceControlOptions.IOPS and PerformanceControlOptions.Throughput parameters do not take effect.</p>
         * <p>Currently, you can only set this parameter to All, which resets the disk IOPS and throughput to their initial values.</p>
         * 
         * <strong>example:</strong>
         * <p>All</p>
         */
        @NameInMap("Recover")
        public String recover;

        /**
         * <p>The target throughput of the disk. Unit: MB/s. You can only modify the throughput of disks in a dedicated block storage cluster.</p>
         * <p>Valid values: 60 to the maximum throughput of a single disk.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/25382.html">Disk performance</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Throughput")
        public Integer throughput;

        public static ModifyDiskSpecRequestPerformanceControlOptions build(java.util.Map<String, ?> map) throws Exception {
            ModifyDiskSpecRequestPerformanceControlOptions self = new ModifyDiskSpecRequestPerformanceControlOptions();
            return TeaModel.build(map, self);
        }

        public ModifyDiskSpecRequestPerformanceControlOptions setIOPS(Integer IOPS) {
            this.IOPS = IOPS;
            return this;
        }
        public Integer getIOPS() {
            return this.IOPS;
        }

        public ModifyDiskSpecRequestPerformanceControlOptions setRecover(String recover) {
            this.recover = recover;
            return this;
        }
        public String getRecover() {
            return this.recover;
        }

        public ModifyDiskSpecRequestPerformanceControlOptions setThroughput(Integer throughput) {
            this.throughput = throughput;
            return this;
        }
        public Integer getThroughput() {
            return this.throughput;
        }

    }

}
