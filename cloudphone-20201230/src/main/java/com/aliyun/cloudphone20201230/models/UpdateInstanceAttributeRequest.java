// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class UpdateInstanceAttributeRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Resolution")
    public String resolution;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    // 标签列表，最多包含20个子项
    @NameInMap("Tag")
    public java.util.List<UpdateInstanceAttributeRequestTag> tag;

    @NameInMap("VncPassword")
    public String vncPassword;

    public static UpdateInstanceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceAttributeRequest self = new UpdateInstanceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateInstanceAttributeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateInstanceAttributeRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public UpdateInstanceAttributeRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public UpdateInstanceAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateInstanceAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateInstanceAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateInstanceAttributeRequest setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

    public UpdateInstanceAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateInstanceAttributeRequest setTag(java.util.List<UpdateInstanceAttributeRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<UpdateInstanceAttributeRequestTag> getTag() {
        return this.tag;
    }

    public UpdateInstanceAttributeRequest setVncPassword(String vncPassword) {
        this.vncPassword = vncPassword;
        return this;
    }
    public String getVncPassword() {
        return this.vncPassword;
    }

    public static class UpdateInstanceAttributeRequestTag extends TeaModel {
        // 标签键
        @NameInMap("Key")
        public String key;

        // 标签值
        @NameInMap("Value")
        public String value;

        public static UpdateInstanceAttributeRequestTag build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceAttributeRequestTag self = new UpdateInstanceAttributeRequestTag();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceAttributeRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateInstanceAttributeRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
