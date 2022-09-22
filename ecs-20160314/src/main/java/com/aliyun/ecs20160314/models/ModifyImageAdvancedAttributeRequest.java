// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ModifyImageAdvancedAttributeRequest extends TeaModel {
    @NameInMap("Flag")
    public java.util.List<Flag> flag;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SupportIoOptimized")
    public String supportIoOptimized;

    public static ModifyImageAdvancedAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyImageAdvancedAttributeRequest self = new ModifyImageAdvancedAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyImageAdvancedAttributeRequest setFlag(java.util.List<Flag> flag) {
        this.flag = flag;
        return this;
    }
    public java.util.List<Flag> getFlag() {
        return this.flag;
    }

    public ModifyImageAdvancedAttributeRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ModifyImageAdvancedAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyImageAdvancedAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyImageAdvancedAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyImageAdvancedAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyImageAdvancedAttributeRequest setSupportIoOptimized(String supportIoOptimized) {
        this.supportIoOptimized = supportIoOptimized;
        return this;
    }
    public String getSupportIoOptimized() {
        return this.supportIoOptimized;
    }

    public static class Flag extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public Boolean value;

        public static Flag build(java.util.Map<String, ?> map) throws Exception {
            Flag self = new Flag();
            return TeaModel.build(map, self);
        }

        public Flag setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public Flag setValue(Boolean value) {
            this.value = value;
            return this;
        }
        public Boolean getValue() {
            return this.value;
        }

    }

}
