// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDedicatedHostClusterRequest extends TeaModel {
    /**
     * <p>The name of the dedicated host cluster. The name must be 2 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter. It cannot contain `http://` or `https://`.</p>
     * <br>
     * <p>This parameter is empty by default.</p>
     */
    @NameInMap("DedicatedHostClusterName")
    public String dedicatedHostClusterName;

    /**
     * <p>The description of the dedicated host cluster. The description must be 2 to 256 characters in length. It cannot start with `http://` or `https://`.</p>
     * <br>
     * <p>This parameter is empty by default.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to check the validity of the request without actually making the request. Valid values:</p>
     * <br>
     * <p>*   true: The validity of the request is checked but the request is not made. Check items include whether your AccessKey pair is valid, whether RAM users are authorized, and whether the required parameters are specified. If the check fails, the corresponding error is returned. If the check succeeds, the `DryRunOperation` error code is returned.</p>
     * <p>*   false: The validity of the request is checked. If the check succeeds, a 2XX HTTP status code is returned and the request is made.</p>
     * <br>
     * <p>Default value: false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region in which to create the dedicated host cluster. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which to assign the dedicated host cluster.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags of the resource. You can enter most at 20 tags for the resource.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateDedicatedHostClusterRequestTag> tag;

    /**
     * <p>The ID of the zone in which to create the dedicated host cluster. You can call the [DescribeZones](https://help.aliyun.com/document_detail/25610.html) operation to query the most recent zone list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateDedicatedHostClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDedicatedHostClusterRequest self = new CreateDedicatedHostClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateDedicatedHostClusterRequest setDedicatedHostClusterName(String dedicatedHostClusterName) {
        this.dedicatedHostClusterName = dedicatedHostClusterName;
        return this;
    }
    public String getDedicatedHostClusterName() {
        return this.dedicatedHostClusterName;
    }

    public CreateDedicatedHostClusterRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDedicatedHostClusterRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateDedicatedHostClusterRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateDedicatedHostClusterRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDedicatedHostClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDedicatedHostClusterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDedicatedHostClusterRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDedicatedHostClusterRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDedicatedHostClusterRequest setTag(java.util.List<CreateDedicatedHostClusterRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateDedicatedHostClusterRequestTag> getTag() {
        return this.tag;
    }

    public CreateDedicatedHostClusterRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateDedicatedHostClusterRequestTag extends TeaModel {
        /**
         * <p>The key of tag N of the dedicated host cluster. Valid values of N: 1 to 20. The tag key cannot be an empty string. It can be up to 64 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the dedicated host cluster. Valid values of N: 1 to 20. The tag value cannot be an empty string. It can be up to 64 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateDedicatedHostClusterRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateDedicatedHostClusterRequestTag self = new CreateDedicatedHostClusterRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateDedicatedHostClusterRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateDedicatedHostClusterRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
