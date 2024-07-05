// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddPipelineRequest extends TeaModel {
    /**
     * <p>The name of the MPS queue. The name can be up to 128 bytes in size.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-pipeline</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The Message Service (MNS) configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Topic&quot;:&quot;mts-topic-1&quot;}</p>
     */
    @NameInMap("NotifyConfig")
    public String notifyConfig;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The role.</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunMTSDefaultRole</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The type of the MPS queue. Valid values:</p>
     * <ul>
     * <li><strong>Boost</strong>: MPS queue with transcoding speed boosted.</li>
     * <li><strong>Standard</strong>: standard MPS queue.</li>
     * <li><strong>NarrowBandHDV2</strong>: MPS queue that supports Narrowband HD 2.0.</li>
     * <li><strong>AIVideoCover</strong>: MPS queue for intelligent snapshot capture.</li>
     * <li><strong>AIVideoTag</strong>: MPS queue for video tagging. The supported regions are China (Shanghai), China (Beijing), and China (Hangzhou).</li>
     * </ul>
     * <p>Default value: <strong>Standard</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("Speed")
    public String speed;

    /**
     * <p>The level of the MPS queue. Valid values: <strong>1 to 3</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SpeedLevel")
    public Long speedLevel;

    public static AddPipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPipelineRequest self = new AddPipelineRequest();
        return TeaModel.build(map, self);
    }

    public AddPipelineRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddPipelineRequest setNotifyConfig(String notifyConfig) {
        this.notifyConfig = notifyConfig;
        return this;
    }
    public String getNotifyConfig() {
        return this.notifyConfig;
    }

    public AddPipelineRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AddPipelineRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddPipelineRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddPipelineRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddPipelineRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public AddPipelineRequest setSpeed(String speed) {
        this.speed = speed;
        return this;
    }
    public String getSpeed() {
        return this.speed;
    }

    public AddPipelineRequest setSpeedLevel(Long speedLevel) {
        this.speedLevel = speedLevel;
        return this;
    }
    public Long getSpeedLevel() {
        return this.speedLevel;
    }

}
