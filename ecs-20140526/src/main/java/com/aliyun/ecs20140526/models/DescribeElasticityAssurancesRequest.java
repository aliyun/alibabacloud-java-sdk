// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeElasticityAssurancesRequest extends TeaModel {
    @NameInMap("PrivatePoolOptions")
    public DescribeElasticityAssurancesRequestPrivatePoolOptions privatePoolOptions;

    /**
     * <p>The billing method of the instances. Only <code>PostPaid</code> (pay-as-you-go) is supported.</p>
     * <p>Default value: <code>PostPaid</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The instance type. You can use this parameter to query only active elasticity assurances. To query released elasticity assurances, you must use <code>PrivatePoolOptions.Ids</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.c6.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     * <p>Maximum value: 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The type of the Elasticity Assurance. Valid values:</p>
     * <ul>
     * <li><p><code>ElasticityAssurance</code>: a standard elasticity assurance. This type of elasticity assurance is created when you do not specify <code>RecurrenceRules</code>.</p>
     * </li>
     * <li><p><code>TimeDivisionElasticityAssurance</code>: a time-division elasticity assurance. This type of elasticity assurance is created when you specify <code>RecurrenceRules</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ElasticityAssurance</p>
     */
    @NameInMap("PackageType")
    public String packageType;

    /**
     * <blockquote>
     * <p>This parameter is deprecated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <p>The ID of the region where the Elasticity Assurance is located. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the latest list of Alibaba Cloud regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group. When you use this parameter to filter resources, the number of matching resources cannot exceed 1,000.</p>
     * <blockquote>
     * <p>Filtering by the default resource group is not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The status of the Elasticity Assurance. Valid values:</p>
     * <ul>
     * <li><p><code>All</code>: all statuses.</p>
     * </li>
     * <li><p><code>Deactivated</code>: The Elasticity Assurance is pending activation. This status is available only for invitational preview.</p>
     * </li>
     * <li><p><code>Preparing</code>: The Elasticity Assurance is being prepared.</p>
     * </li>
     * <li><p><code>Prepared</code>: The Elasticity Assurance is ready to take effect.</p>
     * </li>
     * <li><p><code>Active</code>: The Elasticity Assurance is active.</p>
     * </li>
     * <li><p><code>Released</code>: The Elasticity Assurance is released.</p>
     * </li>
     * </ul>
     * <p>If you do not specify this parameter, elasticity assurances in all states are returned, except for those in the <code>Pending</code> and <code>Released</code> states.</p>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags used to filter Elasticity Assurances.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeElasticityAssurancesRequestTag> tag;

    /**
     * <p>The ID of the zone where the Elasticity Assurance is located.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
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

    public DescribeElasticityAssurancesRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
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
         * <p>The IDs of the elasticity assurances. You can specify a JSON array of up to 100 elasticity assurance IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;eap-bp67acfmxazb4****&quot;, &quot;eap-bp67acfmxazb5****&quot;]</p>
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
         * <p>The tag key. You can specify up to 20 tag keys to filter resources.</p>
         * <p>The query returns a maximum of 1,000 resources that match the specified tags. If more than 1,000 resources match the tags, call the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation to query all the resources.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. You can specify up to 20 tag values.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
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
