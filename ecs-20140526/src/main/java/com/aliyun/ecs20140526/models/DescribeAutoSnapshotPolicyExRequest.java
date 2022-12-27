// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAutoSnapshotPolicyExRequest extends TeaModel {
    // The ID of the automatic snapshot policy.
    @NameInMap("AutoSnapshotPolicyId")
    public String autoSnapshotPolicyId;

    // The name of the automatic snapshot policy.
    @NameInMap("AutoSnapshotPolicyName")
    public String autoSnapshotPolicyName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The number of the page to return.
    // 
    // Page start from page 1.
    // 
    // Default value: 1.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page.
    // 
    // Maximum value: 100.
    // 
    // Default value: 10.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The region ID of the automatic snapshot policy. You can call the [DescribeRegions](~~25609~~) operation to query the current list of regions.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the resource group. If this parameter is specified to query resources, up to 1,000 resources that belong to the specified resource group can be displayed in the response.
    // 
    // >  Resources in the default resource group are displayed in the response regardless of how this parameter is set.
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The tags.
    @NameInMap("Tag")
    public java.util.List<DescribeAutoSnapshotPolicyExRequestTag> tag;

    public static DescribeAutoSnapshotPolicyExRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoSnapshotPolicyExRequest self = new DescribeAutoSnapshotPolicyExRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAutoSnapshotPolicyExRequest setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
        this.autoSnapshotPolicyId = autoSnapshotPolicyId;
        return this;
    }
    public String getAutoSnapshotPolicyId() {
        return this.autoSnapshotPolicyId;
    }

    public DescribeAutoSnapshotPolicyExRequest setAutoSnapshotPolicyName(String autoSnapshotPolicyName) {
        this.autoSnapshotPolicyName = autoSnapshotPolicyName;
        return this;
    }
    public String getAutoSnapshotPolicyName() {
        return this.autoSnapshotPolicyName;
    }

    public DescribeAutoSnapshotPolicyExRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeAutoSnapshotPolicyExRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeAutoSnapshotPolicyExRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAutoSnapshotPolicyExRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAutoSnapshotPolicyExRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAutoSnapshotPolicyExRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeAutoSnapshotPolicyExRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeAutoSnapshotPolicyExRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeAutoSnapshotPolicyExRequest setTag(java.util.List<DescribeAutoSnapshotPolicyExRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeAutoSnapshotPolicyExRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeAutoSnapshotPolicyExRequestTag extends TeaModel {
        // The key of tag N of the automatic snapshot policy. Valid values of N: 1 to 20. The tag key cannot be an empty string. It can be up to 128 characters in length and cannot start with acs: or aliyun. It cannot contain http:// or https://.
        @NameInMap("Key")
        public String key;

        // The value of tag N of the automatic snapshot policy. Valid values of N: 1 to 20. The tag value can be an empty string. It can be up to 128 characters in length and cannot start with acs: or contain http:// or https://.
        @NameInMap("Value")
        public String value;

        public static DescribeAutoSnapshotPolicyExRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoSnapshotPolicyExRequestTag self = new DescribeAutoSnapshotPolicyExRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeAutoSnapshotPolicyExRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAutoSnapshotPolicyExRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
