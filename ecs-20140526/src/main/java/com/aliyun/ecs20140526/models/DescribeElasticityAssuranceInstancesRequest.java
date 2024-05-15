// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeElasticityAssuranceInstancesRequest extends TeaModel {
    @NameInMap("PrivatePoolOptions")
    public DescribeElasticityAssuranceInstancesRequestPrivatePoolOptions privatePoolOptions;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Maximum value: 100.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to start the query. Set the value to the NextToken value obtained from the response to the preceding request.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

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

    public static DescribeElasticityAssuranceInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticityAssuranceInstancesRequest self = new DescribeElasticityAssuranceInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeElasticityAssuranceInstancesRequest setPrivatePoolOptions(DescribeElasticityAssuranceInstancesRequestPrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public DescribeElasticityAssuranceInstancesRequestPrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public DescribeElasticityAssuranceInstancesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeElasticityAssuranceInstancesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeElasticityAssuranceInstancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeElasticityAssuranceInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeElasticityAssuranceInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeElasticityAssuranceInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeElasticityAssuranceInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class DescribeElasticityAssuranceInstancesRequestPrivatePoolOptions extends TeaModel {
        /**
         * <p>The ID of the elasticity assurance.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Id")
        public String id;

        public static DescribeElasticityAssuranceInstancesRequestPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticityAssuranceInstancesRequestPrivatePoolOptions self = new DescribeElasticityAssuranceInstancesRequestPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public DescribeElasticityAssuranceInstancesRequestPrivatePoolOptions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
