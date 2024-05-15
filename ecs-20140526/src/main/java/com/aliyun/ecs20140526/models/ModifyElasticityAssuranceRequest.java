// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyElasticityAssuranceRequest extends TeaModel {
    @NameInMap("PrivatePoolOptions")
    public ModifyElasticityAssuranceRequestPrivatePoolOptions privatePoolOptions;

    /**
     * <p>The description of the elasticity assurance. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the elasticity assurance. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

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

    public ModifyElasticityAssuranceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyElasticityAssuranceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyElasticityAssuranceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyElasticityAssuranceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

    public static class ModifyElasticityAssuranceRequestPrivatePoolOptions extends TeaModel {
        /**
         * <p>The ID of the elasticity assurance.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the elasticity assurance. The name must be 2 to 128 characters in length. It must start with a letter but cannot start with http:// or https://. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
         */
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
