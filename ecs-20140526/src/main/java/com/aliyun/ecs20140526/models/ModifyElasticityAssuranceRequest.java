// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyElasticityAssuranceRequest extends TeaModel {
    @NameInMap("PrivatePoolOptions")
    public ModifyElasticityAssuranceRequestPrivatePoolOptions privatePoolOptions;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Description")
    public String description;

    @NameInMap("PackageType")
    public String packageType;

    public static ModifyElasticityAssuranceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyElasticityAssuranceRequest self = new ModifyElasticityAssuranceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyElasticityAssuranceRequest setPrivatePoolOptions(ModifyElasticityAssuranceRequestPrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public ModifyElasticityAssuranceRequestPrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public ModifyElasticityAssuranceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyElasticityAssuranceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyElasticityAssuranceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyElasticityAssuranceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyElasticityAssuranceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyElasticityAssuranceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyElasticityAssuranceRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public static class ModifyElasticityAssuranceRequestPrivatePoolOptions extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static ModifyElasticityAssuranceRequestPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            ModifyElasticityAssuranceRequestPrivatePoolOptions self = new ModifyElasticityAssuranceRequestPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public ModifyElasticityAssuranceRequestPrivatePoolOptions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ModifyElasticityAssuranceRequestPrivatePoolOptions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
