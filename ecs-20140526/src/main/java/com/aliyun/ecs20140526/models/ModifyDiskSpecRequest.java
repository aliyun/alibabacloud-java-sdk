// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDiskSpecRequest extends TeaModel {
    /**
     * <p>The new category of the disk. Valid values:</p>
     * <br>
     * <p>*   cloud_essd: ESSD</p>
     * <p>*   cloud_ssd: standard SSD</p>
     * <p>*   cloud_efficiency: ultra disk</p>
     * <br>
     * <p>This parameter is empty by default, which indicates that the disk category is not changed.</p>
     * <br>
     * <p>>  The preceding values are listed in descending order of disk performance. The disk cannot be downgraded if it is a subscription disk.</p>
     */
    @NameInMap("DiskCategory")
    public String diskCategory;

    /**
     * <p>The ID of the disk.</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>Specifies whether to check the validity of the request without actually making the request. Valid values:</p>
     * <br>
     * <p>*   true: The validity of the request is checked but the request is not made. Check items include the required parameters, request format, service limits, and available ECS resources. If the check fails, the corresponding error message is returned. If the check succeeds, the `DryRunOperation` error code is returned.</p>
     * <p>*   false: The validity of the request is checked. If the check succeeds, a 2xx HTTP status code is returned and the request is made.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The new performance level of the ESSD. Valid values:</p>
     * <br>
     * <p>*   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</p>
     * <p>*   PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</p>
     * <p>*   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</p>
     * <p>*   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</p>
     * <br>
     * <p>Default value: PL1.</p>
     */
    @NameInMap("PerformanceLevel")
    public String performanceLevel;

    /**
     * <p>是否修改ESSD AutoPL云盘预配置读写IOPS。取值范围：0~min{50000, 1000*容量-基准性能}。</p>
     * <br>
     * <p>基准性能=min{1,800+50*容量, 50,000}</p>
     * <br>
     * <p>> 当DiskCategory取值为cloud_auto时才支持设置该参数。更多信息，请参见[ESSD AutoPL云盘](~~368372~~)和[修改ESSD AutoPL云盘预配置信息](~~413275~~)。</p>
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

}
