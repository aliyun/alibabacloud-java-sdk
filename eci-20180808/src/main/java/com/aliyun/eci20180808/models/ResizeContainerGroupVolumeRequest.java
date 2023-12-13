// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class ResizeContainerGroupVolumeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the elastic container instance.</p>
     */
    @NameInMap("ContainerGroupId")
    public String containerGroupId;

    /**
     * <p>The size of the volume after the volume is scaled up. Unit: GiB. Valid values:</p>
     * <br>
     * <p>*   Ultra disk (cloud_efficiency): 20 to 32768</p>
     * <p>*   Standard SSD (cloud_ssd): 20 to 32768</p>
     * <p>*   Enhanced SSD (cloud_essd): 20 to 32768</p>
     * <p>*   Basic disk (cloud): 5 to 2000</p>
     * <br>
     * <p>>  The capacity of the volume after the volume is scaled up must be greater than the original capacity of the volume. If the new capacity is equal to the original capacity of the volume, only the file system is scaled up.</p>
     */
    @NameInMap("NewSize")
    public Long newSize;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The name of the volume that you want to scale up. The volume must be an Alibaba Cloud disk.</p>
     */
    @NameInMap("VolumeName")
    public String volumeName;

    public static ResizeContainerGroupVolumeRequest build(java.util.Map<String, ?> map) throws Exception {
        ResizeContainerGroupVolumeRequest self = new ResizeContainerGroupVolumeRequest();
        return TeaModel.build(map, self);
    }

    public ResizeContainerGroupVolumeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ResizeContainerGroupVolumeRequest setContainerGroupId(String containerGroupId) {
        this.containerGroupId = containerGroupId;
        return this;
    }
    public String getContainerGroupId() {
        return this.containerGroupId;
    }

    public ResizeContainerGroupVolumeRequest setNewSize(Long newSize) {
        this.newSize = newSize;
        return this;
    }
    public Long getNewSize() {
        return this.newSize;
    }

    public ResizeContainerGroupVolumeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ResizeContainerGroupVolumeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ResizeContainerGroupVolumeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ResizeContainerGroupVolumeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ResizeContainerGroupVolumeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ResizeContainerGroupVolumeRequest setVolumeName(String volumeName) {
        this.volumeName = volumeName;
        return this;
    }
    public String getVolumeName() {
        return this.volumeName;
    }

}
