// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAutoProvisioningGroupsRequest extends TeaModel {
    /**
     * <p>The ID of the auto provisioning group. You can specify up to 20 IDs.</p>
     */
    @NameInMap("AutoProvisioningGroupId")
    public java.util.List<String> autoProvisioningGroupId;

    /**
     * <p>The name of the auto provisioning group.</p>
     */
    @NameInMap("AutoProvisioningGroupName")
    public String autoProvisioningGroupName;

    /**
     * <p>The status of the auto provisioning group.</p>
     */
    @NameInMap("AutoProvisioningGroupStatus")
    public java.util.List<String> autoProvisioningGroupStatus;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number.</p>
     * <br>
     * <p>Pages start from page 1.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <br>
     * <p>Valid values: 1 to 100.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the auto provisioning group.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the auto provisioning group belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags that are added to the auto provisioning group.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeAutoProvisioningGroupsRequestTag> tag;

    public static DescribeAutoProvisioningGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoProvisioningGroupsRequest self = new DescribeAutoProvisioningGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAutoProvisioningGroupsRequest setAutoProvisioningGroupId(java.util.List<String> autoProvisioningGroupId) {
        this.autoProvisioningGroupId = autoProvisioningGroupId;
        return this;
    }
    public java.util.List<String> getAutoProvisioningGroupId() {
        return this.autoProvisioningGroupId;
    }

    public DescribeAutoProvisioningGroupsRequest setAutoProvisioningGroupName(String autoProvisioningGroupName) {
        this.autoProvisioningGroupName = autoProvisioningGroupName;
        return this;
    }
    public String getAutoProvisioningGroupName() {
        return this.autoProvisioningGroupName;
    }

    public DescribeAutoProvisioningGroupsRequest setAutoProvisioningGroupStatus(java.util.List<String> autoProvisioningGroupStatus) {
        this.autoProvisioningGroupStatus = autoProvisioningGroupStatus;
        return this;
    }
    public java.util.List<String> getAutoProvisioningGroupStatus() {
        return this.autoProvisioningGroupStatus;
    }

    public DescribeAutoProvisioningGroupsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeAutoProvisioningGroupsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeAutoProvisioningGroupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAutoProvisioningGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAutoProvisioningGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAutoProvisioningGroupsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeAutoProvisioningGroupsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeAutoProvisioningGroupsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeAutoProvisioningGroupsRequest setTag(java.util.List<DescribeAutoProvisioningGroupsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeAutoProvisioningGroupsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeAutoProvisioningGroupsRequestTag extends TeaModel {
        /**
         * <p>The key of tag N that is added to the auto provisioning group.</p>
         * <br>
         * <p>Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot contain http:// or https://. The tag key cannot start with acs: or aliyun.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N that is added to the auto provisioning group.</p>
         * <br>
         * <p>Valid values of N: 1 to 20. The tag value can be an empty string. The tag key can be up to 128 characters in length and cannot contain http:// or https://.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeAutoProvisioningGroupsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupsRequestTag self = new DescribeAutoProvisioningGroupsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeAutoProvisioningGroupsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAutoProvisioningGroupsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
