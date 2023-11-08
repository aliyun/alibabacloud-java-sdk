// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class UpdateInstanceAttributeRequest extends TeaModel {
    /**
     * <p>The instance description. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance name. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://` or `https://`. The name can contain letters, digits, colons (:), underscores (\_), and hyphens (-).</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The name of the key pair that is used to connect to the instance. To improve the security of an instance, we recommend that you use a key pair to connect to the instance.</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The instance resolution.</p>
     */
    @NameInMap("Resolution")
    public String resolution;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>Details of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<UpdateInstanceAttributeRequestTag> tag;

    /**
     * <p>The VNC password of the instance. The password must be six characters in length and can contain only uppercase letters, lowercase letters, and digits.</p>
     */
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
        /**
         * <p>The tag key of the instance. Valid values of N: 1 to 20.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the instance. Valid values of N: 1 to 20.</p>
         */
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
