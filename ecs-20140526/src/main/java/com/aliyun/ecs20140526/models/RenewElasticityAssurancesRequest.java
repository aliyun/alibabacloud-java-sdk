// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RenewElasticityAssurancesRequest extends TeaModel {
    @NameInMap("PrivatePoolOptions")
    public RenewElasticityAssurancesRequestPrivatePoolOptions privatePoolOptions;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static RenewElasticityAssurancesRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewElasticityAssurancesRequest self = new RenewElasticityAssurancesRequest();
        return TeaModel.build(map, self);
    }

    public RenewElasticityAssurancesRequest setPrivatePoolOptions(RenewElasticityAssurancesRequestPrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public RenewElasticityAssurancesRequestPrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public RenewElasticityAssurancesRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public RenewElasticityAssurancesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RenewElasticityAssurancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RenewElasticityAssurancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RenewElasticityAssurancesRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public RenewElasticityAssurancesRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public RenewElasticityAssurancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RenewElasticityAssurancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RenewElasticityAssurancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class RenewElasticityAssurancesRequestPrivatePoolOptions extends TeaModel {
        @NameInMap("Id")
        public java.util.List<String> id;

        public static RenewElasticityAssurancesRequestPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            RenewElasticityAssurancesRequestPrivatePoolOptions self = new RenewElasticityAssurancesRequestPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public RenewElasticityAssurancesRequestPrivatePoolOptions setId(java.util.List<String> id) {
            this.id = id;
            return this;
        }
        public java.util.List<String> getId() {
            return this.id;
        }

    }

}
