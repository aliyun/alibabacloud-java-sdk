// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDeploymentSetsRequest extends TeaModel {
    /**
     * <p>The IDs of deployment sets. The value can be a JSON array that consists of up to 100 deployment set IDs in the format of `["ds-xxxxxxxxx", "ds-yyyyyyyyy", … "ds-zzzzzzzzz"]`. Separate multiple deployment set IDs with commas (,).</p>
     */
    @NameInMap("DeploymentSetIds")
    public String deploymentSetIds;

    /**
     * <p>The name of the deployment set. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
     */
    @NameInMap("DeploymentSetName")
    public String deploymentSetName;

    /**
     * <p>> The parameter is deprecated.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>> The parameter is deprecated.</p>
     */
    @NameInMap("Granularity")
    public String granularity;

    /**
     * <p>> The parameter is deprecated.</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>Pages start from page 1.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Maximum value: 50.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the deployment set. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The deployment strategy. Valid values:</p>
     * <br>
     * <p>*   Availability: high availability strategy.</p>
     * <p>*   AvailabilityGroup: high availability group strategy.</p>
     */
    @NameInMap("Strategy")
    public String strategy;

    public static DescribeDeploymentSetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeploymentSetsRequest self = new DescribeDeploymentSetsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDeploymentSetsRequest setDeploymentSetIds(String deploymentSetIds) {
        this.deploymentSetIds = deploymentSetIds;
        return this;
    }
    public String getDeploymentSetIds() {
        return this.deploymentSetIds;
    }

    public DescribeDeploymentSetsRequest setDeploymentSetName(String deploymentSetName) {
        this.deploymentSetName = deploymentSetName;
        return this;
    }
    public String getDeploymentSetName() {
        return this.deploymentSetName;
    }

    public DescribeDeploymentSetsRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeDeploymentSetsRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public DescribeDeploymentSetsRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public DescribeDeploymentSetsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeDeploymentSetsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDeploymentSetsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDeploymentSetsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDeploymentSetsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDeploymentSetsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDeploymentSetsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDeploymentSetsRequest setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }
    public String getStrategy() {
        return this.strategy;
    }

}
