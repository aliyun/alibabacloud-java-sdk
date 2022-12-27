// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ResizeDiskRequest extends TeaModel {
    // The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The **ClientToken** value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
    @NameInMap("ClientToken")
    public String clientToken;

    // The ID of the disk. You can call the [DescribeDisks](~~25514~~) operation to query available disk IDs.
    @NameInMap("DiskId")
    public String diskId;

    // The new disk capacity. Unit: GiB. Valid values:
    // 
    // *   System disk: 20 to 500.
    // 
    // *   Data disk:
    // 
    //     *   Ultra disk (cloud_efficiency): 20 to 32768.
    // 
    //     *   Standard SSD (cloud_ssd): 20 to 32768.
    // 
    //     *   ESSD (cloud_essd): Valid values when the NewSize parameter is set to cloud_essd depend on the `PerformanceLevel` value. You can call the [DescribeDisks](~~25514~~) operation to query disk information and check the `PerformanceLevel` parameter in the response.
    // 
    //         *   Valid values when the PerformanceLevel parameter is set to PL0: 40 to 32768.
    //         *   Valid values when the PerformanceLevel parameter is set to PL1: 20 to 32768.
    //         *   Valid values when the PerformanceLevel parameter is set to PL2: 461 to 32768.
    //         *   Valid values when the PerformanceLevel parameter is set to PL3: 1261 to 32768.
    // 
    //     *   Basic disk (cloud): 5 to 2000.
    // 
    // The new disk capacity must be greater than the original disk capacity.
    @NameInMap("NewSize")
    public Integer newSize;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    // RAM用户的虚拟账号ID。
    @NameInMap("OwnerId")
    public Long ownerId;

    // 资源主账号的账号名称。
    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    // 资源主账号的ID，亦即UID。
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The method to use to resize the disk. Default value: offline. Valid values:
    // 
    // *   offline: resizes the disk offline. After you resize a disk offline, you must restart its associated instance by using the ECS console or by calling the [RebootInstance](~~25502~~) operation to make the resizing operation take effect. For information about how to restart an ECS instance in the ECS console, see [Restart an instance](~~25440~~).
    // *   online: resizes the disk online. After you resize a disk online, the resizing operation takes effect immediately and you do not need to restart the instance. You can resize ultra disks, standard SSDs, and ESSDs online.
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
