// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StartElasticityAssuranceRequest extends TeaModel {
    @NameInMap("PrivatePoolOptions")
    public StartElasticityAssuranceRequestPrivatePoolOptions privatePoolOptions;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static StartElasticityAssuranceRequest build(java.util.Map<String, ?> map) throws Exception {
        StartElasticityAssuranceRequest self = new StartElasticityAssuranceRequest();
        return TeaModel.build(map, self);
    }

    public StartElasticityAssuranceRequest setPrivatePoolOptions(StartElasticityAssuranceRequestPrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public StartElasticityAssuranceRequestPrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public StartElasticityAssuranceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public StartElasticityAssuranceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public StartElasticityAssuranceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartElasticityAssuranceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public StartElasticityAssuranceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class StartElasticityAssuranceRequestPrivatePoolOptions extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Id")
        public String id;

        public static StartElasticityAssuranceRequestPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            StartElasticityAssuranceRequestPrivatePoolOptions self = new StartElasticityAssuranceRequestPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public StartElasticityAssuranceRequestPrivatePoolOptions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
