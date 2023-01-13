// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeElasticityAssurancesRequest extends TeaModel {
    @NameInMap("PrivatePoolOptions")
    public DescribeElasticityAssurancesRequestPrivatePoolOptions privatePoolOptions;

    /**
     * <p>The billing method of the instances to be created by using the elasticity assurance. Set the value to PostPaid. Only pay-as-you-go instances can be created by using elasticity assurances.  </p>
     * <br>
     * <p>Default value: PostPaid.</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The instance type to which the elasticity assurance applies.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     * <br>
     * <p>Maximum value: 100.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to start the next query. Set the value to the NextToken value obtained from the response to the previous request.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>>  This parameter is deprecated.</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <p>The region ID of the elasticity assurance. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the elasticity assurance belongs. If this parameter is specified to query resources, up to 1,000 resources that belong to the specified resource group can be displayed in the response.  </p>
     * <br>
     * <p>>  Resources in the default resource group are displayed in the response regardless of how this parameter is set.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The state of the elasticity assurance. Valid values:</p>
     * <br>
     * <p>- All: All states.</p>
     * <p>- Preparing: The elasticity assurance is being prepared.</p>
     * <p>- Prepared: The elasticity assurance is to take effect.</p>
     * <p>- Active: The elasticity assurance is in effect.</p>
     * <p>- Released: The elasticity assurance is released.</p>
     * <br>
     * <p>Default value: Active.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags that you want to query resources. You can specify a maximum of 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeElasticityAssurancesRequestTag> tag;

    /**
     * <p>The zone ID of the elasticity assurance.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeElasticityAssurancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticityAssurancesRequest self = new DescribeElasticityAssurancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeElasticityAssurancesRequest setPrivatePoolOptions(DescribeElasticityAssurancesRequestPrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public DescribeElasticityAssurancesRequestPrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public DescribeElasticityAssurancesRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public DescribeElasticityAssurancesRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeElasticityAssurancesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeElasticityAssurancesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeElasticityAssurancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeElasticityAssurancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeElasticityAssurancesRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public DescribeElasticityAssurancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeElasticityAssurancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeElasticityAssurancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeElasticityAssurancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeElasticityAssurancesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeElasticityAssurancesRequest setTag(java.util.List<DescribeElasticityAssurancesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeElasticityAssurancesRequestTag> getTag() {
        return this.tag;
    }

    public DescribeElasticityAssurancesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribeElasticityAssurancesRequestPrivatePoolOptions extends TeaModel {
        /**
         * <p>The IDs of elasticity assurances. The value can be a JSON array that consists of up to 100 elasticity assurance IDs. Separate the IDs with commas (,).</p>
         */
        @NameInMap("Ids")
        public String ids;

        public static DescribeElasticityAssurancesRequestPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticityAssurancesRequestPrivatePoolOptions self = new DescribeElasticityAssurancesRequestPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public DescribeElasticityAssurancesRequestPrivatePoolOptions setIds(String ids) {
            this.ids = ids;
            return this;
        }
        public String getIds() {
            return this.ids;
        }

    }

    public static class DescribeElasticityAssurancesRequestTag extends TeaModel {
        /**
         * <p>The key of tag of the elasticity assurance. You can specify multiple tag keys to query.</p>
         * <br>
         * <p>If a single tag is specified to query resources, up to 1,000 resources that have this tag added can be displayed in the response. If multiple tags are specified to query resources, up to 1,000 resources that have all these tags added can be displayed in the response. To query more than 1,000 resources that have specified tags added, call the [ListTagResources](~~110425~~) operation.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag of the elasticity assurance.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeElasticityAssurancesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticityAssurancesRequestTag self = new DescribeElasticityAssurancesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeElasticityAssurancesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeElasticityAssurancesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
