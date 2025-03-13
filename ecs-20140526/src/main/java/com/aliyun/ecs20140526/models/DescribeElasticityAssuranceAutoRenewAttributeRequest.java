// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeElasticityAssuranceAutoRenewAttributeRequest extends TeaModel {
    @NameInMap("PrivatePoolOptions")
    public DescribeElasticityAssuranceAutoRenewAttributeRequestPrivatePoolOptions privatePoolOptions;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the elasticity assurance. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeElasticityAssuranceAutoRenewAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticityAssuranceAutoRenewAttributeRequest self = new DescribeElasticityAssuranceAutoRenewAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeElasticityAssuranceAutoRenewAttributeRequest setPrivatePoolOptions(DescribeElasticityAssuranceAutoRenewAttributeRequestPrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public DescribeElasticityAssuranceAutoRenewAttributeRequestPrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public DescribeElasticityAssuranceAutoRenewAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeElasticityAssuranceAutoRenewAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeElasticityAssuranceAutoRenewAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeElasticityAssuranceAutoRenewAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeElasticityAssuranceAutoRenewAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class DescribeElasticityAssuranceAutoRenewAttributeRequestPrivatePoolOptions extends TeaModel {
        /**
         * <p>The IDs of elasticity assurances.</p>
         * <p><strong>Limits</strong>: You can specify up to 50 elasticity assurance IDs in a single request.</p>
         */
        @NameInMap("Id")
        public java.util.List<String> id;

        public static DescribeElasticityAssuranceAutoRenewAttributeRequestPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticityAssuranceAutoRenewAttributeRequestPrivatePoolOptions self = new DescribeElasticityAssuranceAutoRenewAttributeRequestPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public DescribeElasticityAssuranceAutoRenewAttributeRequestPrivatePoolOptions setId(java.util.List<String> id) {
            this.id = id;
            return this;
        }
        public java.util.List<String> getId() {
            return this.id;
        }

    }

}
