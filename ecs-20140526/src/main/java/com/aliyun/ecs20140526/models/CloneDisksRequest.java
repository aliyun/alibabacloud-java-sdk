// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CloneDisksRequest extends TeaModel {
    /**
     * <blockquote>
     * <p>This parameter is not available.</p>
     * </blockquote>
     */
    @NameInMap("Arn")
    public java.util.List<CloneDisksRequestArn> arn;

    /**
     * <p>Specifies whether to enable performance bursting for the new cloud disk. Valid values:</p>
     * <ul>
     * <li>true: enables performance bursting.</li>
     * <li>false: disables performance bursting.<blockquote>
     * <p>This parameter is supported only when DiskCategory is set to cloud_auto. For more information, see <a href="https://www.alibabacloud.com/help/en/ecs/user-guide/essd-autopl-disks">ESSD AutoPLs</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("BurstingEnabled")
    public Boolean burstingEnabled;

    /**
     * <p>Ensures the idempotence of the request. You can generate a parameter value from your client to ensure that the value is unique across different requests. The ClientToken parameter only supports ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The category of the new cloud disk. Valid values:</p>
     * <ul>
     * <li>cloud_essd: ESSD.</li>
     * <li>cloud_auto: ESSD AutoPL.</li>
     * <li>cloud_essd_entry: ESSD Entry.</li>
     * <li>cloud_regional_disk_auto: zone-redundant ESSD.</li>
     * </ul>
     * <blockquote>
     * <p>Limits on cloud disk categories for cloning</p>
     * <ul>
     * <li>Non-zone-redundant cloud disks can only be cloned to non-zone-redundant types.</li>
     * <li>Zone-redundant cloud disks can only be cloned to zone-redundant types.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_essd</p>
     */
    @NameInMap("DiskCategory")
    public String diskCategory;

    /**
     * <p>The name of the cloud disk. The name must be 2 to 128 characters in length and can contain letters in the Unicode letter category (including English and Chinese characters) and ASCII digits (0-9). It can contain colons (:), underscores (_), periods (.), and hyphens (-). It must start with a letter in the Unicode letter category.</p>
     * <p>Default value: empty.</p>
     * 
     * <strong>example:</strong>
     * <p>MyDiskName</p>
     */
    @NameInMap("DiskName")
    public String diskName;

    /**
     * <p>Specifies whether to only perform a dry run for this request. Valid values:</p>
     * <ul>
     * <li>true: sends a check request and does not perform the actual operation. The check items include whether the AccessKey pair is valid, the authorization of the Resource Access Management (RAM) user, and whether the required parameters are specified. If the check fails, the corresponding error is returned. If the check succeeds, the DryRunOperation error code is returned.</li>
     * <li>false (default): sends a Normal request. If the check succeeds, a 2XX HTTP status code is returned and the actual operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <p>Specifies whether the new cloud disk is encrypted. Valid values:</p>
     * <ul>
     * <li>true: The cloud disk is encrypted.</li>
     * <li>false: The cloud disk is not encrypted.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Encrypted")
    public Boolean encrypted;

    /**
     * <p>The KMS key ID used by the new cloud disk.</p>
     * 
     * <strong>example:</strong>
     * <p>key-szz67b2f696f4wh9yeg5d</p>
     */
    @NameInMap("KmsKeyId")
    public String kmsKeyId;

    /**
     * <p>Specifies whether to enable the multi-attach feature for the new cloud disk. Valid values:</p>
     * <ul>
     * <li>Disabled: disables the feature.</li>
     * <li>Enabled: enables the feature. Only ESSDs support this value.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Disabled</p>
     */
    @NameInMap("MultiAttach")
    public String multiAttach;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The performance level settings of the cloud disk when you create an ESSD. Valid values:</p>
     * <ul>
     * <li>PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</li>
     * <li>PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</li>
     * <li>PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</li>
     * <li>PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</li>
     * </ul>
     * <blockquote>
     * <p>If DiskCategory is set to cloud_essd, the PerformanceLevel parameter is required.</p>
     * </blockquote>
     * <p>For more information about how to select the performance level of an ESSD, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD standard SSDs</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>PL1</p>
     */
    @NameInMap("PerformanceLevel")
    public String performanceLevel;

    /**
     * <p>The provisioned read and write IOPS for a single ESSD AutoPL. Valid values:</p>
     * <ul>
     * <li>If the capacity is less than or equal to 3 GiB, provisioned performance is not supported.</li>
     * <li>If the capacity is greater than or equal to 4 GiB, the valid values are 0 to the minimum of (1,000 IOPS/GiB × Capacity - Baseline IOPS) and 50,000.</li>
     * </ul>
     * <p>Baseline performance = the maximum of the minimum of (1,800 + 50 × Capacity) and 50,000, and 3,000.</p>
     * <blockquote>
     * <p>This parameter is supported only when DiskCategory is set to cloud_auto. For more information, see <a href="https://www.alibabacloud.com/help/en/ecs/user-guide/essd-autopl-disks">ESSD AutoPLs</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ProvisionedIops")
    public Long provisionedIops;

    /**
     * <p>The region ID. You can call the <a href="https://www.alibabacloud.com/help/en/ecs/api-regions-describeregions">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the cloud disk belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp199lyny9b3****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The capacity of the new cloud disk. Unit: GiB. You must specify a value for this parameter. Valid values:</p>
     * <ul>
     * <li>cloud_essd: The valid values vary based on the performance level.<ul>
     * <li>PL0: 1 to 65,536.</li>
     * <li>PL1: 20 to 65,536.</li>
     * <li>PL2: 461 to 65,536.</li>
     * <li>PL3: 1,261 to 65,536.</li>
     * </ul>
     * </li>
     * <li>cloud_auto: 1 to 65,536.</li>
     * <li>cloud_essd_entry: 10 to 32,768.</li>
     * <li>cloud_regional_disk_auto: 10 to 65,536.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <p>The ID of the source cloud disk.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d-bp1d6tsvznfghy7y****</p>
     */
    @NameInMap("SourceDiskId")
    public String sourceDiskId;

    /**
     * <p>The list of tag information for the cloud disk.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CloneDisksRequestTag> tag;

    public static CloneDisksRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneDisksRequest self = new CloneDisksRequest();
        return TeaModel.build(map, self);
    }

    public CloneDisksRequest setArn(java.util.List<CloneDisksRequestArn> arn) {
        this.arn = arn;
        return this;
    }
    public java.util.List<CloneDisksRequestArn> getArn() {
        return this.arn;
    }

    public CloneDisksRequest setBurstingEnabled(Boolean burstingEnabled) {
        this.burstingEnabled = burstingEnabled;
        return this;
    }
    public Boolean getBurstingEnabled() {
        return this.burstingEnabled;
    }

    public CloneDisksRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CloneDisksRequest setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
        return this;
    }
    public String getDiskCategory() {
        return this.diskCategory;
    }

    public CloneDisksRequest setDiskName(String diskName) {
        this.diskName = diskName;
        return this;
    }
    public String getDiskName() {
        return this.diskName;
    }

    public CloneDisksRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
    }

    public CloneDisksRequest setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    public CloneDisksRequest setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    public CloneDisksRequest setMultiAttach(String multiAttach) {
        this.multiAttach = multiAttach;
        return this;
    }
    public String getMultiAttach() {
        return this.multiAttach;
    }

    public CloneDisksRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CloneDisksRequest setPerformanceLevel(String performanceLevel) {
        this.performanceLevel = performanceLevel;
        return this;
    }
    public String getPerformanceLevel() {
        return this.performanceLevel;
    }

    public CloneDisksRequest setProvisionedIops(Long provisionedIops) {
        this.provisionedIops = provisionedIops;
        return this;
    }
    public Long getProvisionedIops() {
        return this.provisionedIops;
    }

    public CloneDisksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CloneDisksRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CloneDisksRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CloneDisksRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public CloneDisksRequest setSourceDiskId(String sourceDiskId) {
        this.sourceDiskId = sourceDiskId;
        return this;
    }
    public String getSourceDiskId() {
        return this.sourceDiskId;
    }

    public CloneDisksRequest setTag(java.util.List<CloneDisksRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CloneDisksRequestTag> getTag() {
        return this.tag;
    }

    public static class CloneDisksRequestArn extends TeaModel {
        /**
         * <blockquote>
         * <p>This parameter is not available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("AssumeRoleFor")
        public String assumeRoleFor;

        /**
         * <blockquote>
         * <p>This parameter is not available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        /**
         * <blockquote>
         * <p>This parameter is not available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Rolearn")
        public String rolearn;

        public static CloneDisksRequestArn build(java.util.Map<String, ?> map) throws Exception {
            CloneDisksRequestArn self = new CloneDisksRequestArn();
            return TeaModel.build(map, self);
        }

        public CloneDisksRequestArn setAssumeRoleFor(String assumeRoleFor) {
            this.assumeRoleFor = assumeRoleFor;
            return this;
        }
        public String getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        public CloneDisksRequestArn setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

        public CloneDisksRequestArn setRolearn(String rolearn) {
            this.rolearn = rolearn;
            return this;
        }
        public String getRolearn() {
            return this.rolearn;
        }

    }

    public static class CloneDisksRequestTag extends TeaModel {
        /**
         * <p>The tag key of the cloud disk. Valid values of N: 1 to 20. If you specify Tag.N.Key, it cannot be an empty string. The tag key can be up to 128 characters in length. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the cloud disk. Valid values of N: 1 to 20. If you specify Tag.N.Value, it can be an empty string. The tag value can be up to 128 characters in length and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CloneDisksRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CloneDisksRequestTag self = new CloneDisksRequestTag();
            return TeaModel.build(map, self);
        }

        public CloneDisksRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CloneDisksRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
