// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ResizeDiskRequest extends TeaModel {
    /**
     * <p>The ID of the order.</p>
     * <br>
     * <p>> This parameter is returned only when you resize subscription disks.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The method that you want to use to resize the disk. Default value: offline. Valid values:</p>
     * <br>
     * <p>*   offline: resizes the disk offline. After you resize a disk offline, you must restart its associated instance by using the Elastic Compute Service (ECS) console or by calling the [RebootInstance](~~25502~~) operation to make the resizing operation take effect. For information about how to restart an ECS instance in the ECS console, see [Restart an instance](~~25440~~).</p>
     * <p>*   online: resizes the disk online. After you resize a disk online, the resizing operation takes effect immediately and you do not need to restart the instance. Ultra disks, standard SSDs, and ESSDs can be resized online.</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>32768</p>
     */
    @NameInMap("NewSize")
    public Integer newSize;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The new disk capacity. Unit: GiB. Valid values:</p>
     * <br>
     * <p>*   System disk: 20 to 500.</p>
     * <br>
     * <p>*   Data disk:</p>
     * <br>
     * <p>    *   Ultra disk (cloud_efficiency): 20 to 32768.</p>
     * <br>
     * <p>    *   Standard SSD (cloud_ssd): 20 to 32768.</p>
     * <br>
     * <p>    *   ESSD (cloud_essd): Valid values when the NewSize parameter is set to cloud_essd depend on the `PerformanceLevel` value. You can call the [DescribeDisks](~~25514~~) operation to query disk information and check the `PerformanceLevel` value in the response.</p>
     * <br>
     * <p>        *   Valid values when PerformanceLevel is set to PL0: 40 to 32768.</p>
     * <p>        *   Valid values when PerformanceLevel is set to PL1: 20 to 32768.</p>
     * <p>        *   Valid values when PerformanceLevel is set to PL2: 461 to 32768.</p>
     * <p>        *   Valid values when PerformanceLevel is set to PL3: 1261 to 32768.</p>
     * <br>
     * <p>    *   Basic disk (cloud): 5 to 2000.</p>
     * <br>
     * <p>The new disk capacity must be greater than the original disk capacity.</p>
     */
    @NameInMap("Type")
    public String type;

    public static ResizeDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        ResizeDiskRequest self = new ResizeDiskRequest();
        return TeaModel.build(map, self);
    }

    public ResizeDiskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ResizeDiskRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public ResizeDiskRequest setNewSize(Integer newSize) {
        this.newSize = newSize;
        return this;
    }
    public Integer getNewSize() {
        return this.newSize;
    }

    public ResizeDiskRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ResizeDiskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ResizeDiskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ResizeDiskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ResizeDiskRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
