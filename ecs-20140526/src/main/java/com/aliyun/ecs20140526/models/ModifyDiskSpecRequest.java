// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDiskSpecRequest extends TeaModel {
    /**
     * <p>The new category of the disk. Default value: PL1. Valid values:</p>
     * <br>
     * <p>*   cloud_essd: ESSD.</p>
     * <p>*   cloud_auto: ESSD AutoPL disk.</p>
     * <p>*   cloud_ssd: The system creates an SSD.</p>
     * <p>*   cloud_efficiency: The system creates an ultra disk.</p>
     * <br>
     * <p>This parameter is empty by default, which indicates that the disk category is not changed.</p>
     * <br>
     * <p>> The preceding values are listed in descending order of disk performance. The performance level of a subscription cloud disk cannot be downgraded.</p>
     */
    @NameInMap("DiskCategory")
    public String diskCategory;

    /**
     * <p>The disk ID.</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>Specifies whether to perform only a dry run without performing the actual request. Default value: PL1. Valid values:</p>
     * <br>
     * <p>*   true: performs only a dry run. The system checks the required parameters, request syntax, service limits, and available ECS resources. If the request fails the dry run, the corresponding error message is returned. If the check succeeds, the `DryRunOperation` error code is returned.</p>
     * <p>*   false: The validity of the request is checked. If the check succeeds, a 2xx HTTP status code is returned and the request is made.</p>
     * <br>
     * <p>Default value: false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>磁盘性能控制参数集合</p>
     */
    @NameInMap("PerformanceControlOptions")
    public ModifyDiskSpecRequestPerformanceControlOptions performanceControlOptions;

    /**
     * <p>The new performance level of the ESSD. Default value: PL1. Valid values:</p>
     * <br>
     * <p>*   PL0: An ESSD can deliver up to 10,000 random read/write IOPS.</p>
     * <p>*   PL1: An ESSD can deliver up to 50,000 random read/write IOPS.</p>
     * <p>*   PL2: An ESSD can deliver up to 100,000 random read/write IOPS.</p>
     * <p>*   PL3: An ESSD delivers up to 1,000,000 random read/write IOPS.</p>
     * <br>
     * <p>Default value: PL1</p>
     */
    @NameInMap("PerformanceLevel")
    public String performanceLevel;

    /**
     * <p>The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50,000, 1,000 × Capacity - Baseline IOPS}</p>
     * <br>
     * <p>Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}</p>
     * <br>
     * <p>> This parameter is available only if you set DiskCategory to cloud_auto. For more information, see [ESSD AutoPL disks](~~368372~~) and [Modify the performance configurations of an ESSD AutoPL disk](~~413275~~).</p>
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
         * <p>目标云盘IOPS。仅支持修改专属存储集群云盘IOPS。</p>
         * <br>
         * <p>取值范围：900~单盘最大IOPS，步长100。</p>
         * <br>
         * <br>
         * <p>更多信息，请参见[云盘性能](~~25382~~)。</p>
         */
        @NameInMap("IOPS")
        public Integer IOPS;

        /**
         * <p>重置云盘性能，仅支持专属存储集群云盘。</p>
         * <br>
         * <p>设置该参数后，PerformanceControlOptions.IOPS和PerformanceControlOptions.Throughput参数不生效。</p>
         * <br>
         * <br>
         * <p>目前仅支持设置为All（重置云盘IOPS和吞吐量到初始值）。</p>
         */
        @NameInMap("Recover")
        public String recover;

        /**
         * <p>目标云盘吞吐量，仅支持修改专属存储集群云盘吞吐量，单位MB/s。</p>
         * <br>
         * <p>取值范围：60~单盘最大吞吐量。</p>
         * <br>
         * <p>更多信息，请参见[云盘性能](~~25382~~)。</p>
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
