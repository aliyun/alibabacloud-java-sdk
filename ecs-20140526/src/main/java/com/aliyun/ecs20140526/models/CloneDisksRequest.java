// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CloneDisksRequest extends TeaModel {
    /**
     * <blockquote>
     * <p>This parameter is not yet available.</p>
     * </blockquote>
     */
    @NameInMap("Arn")
    public java.util.List<CloneDisksRequestArn> arn;

    /**
     * <p>Specifies whether to enable performance bursting for the new disk. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Enables performance bursting.</p>
     * </li>
     * <li><p><code>false</code>: Disables performance bursting.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is valid only when <code>DiskCategory</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/zh/ecs/user-guide/essd-autopl-disks">ESSD AutoPL cloud disks</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("BurstingEnabled")
    public Boolean burstingEnabled;

    /**
     * <p>A client-generated token that, when provided, ensures the idempotence of the request. The token must be unique for each request. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The type of the new disk. Valid values:</p>
     * <ul>
     * <li><p><code>cloud_essd</code>: ESSD cloud disk.</p>
     * </li>
     * <li><p><code>cloud_auto</code>: ESSD AutoPL cloud disk.</p>
     * </li>
     * <li><p><code>cloud_essd_entry</code>: ESSD Entry cloud disk.</p>
     * </li>
     * <li><p><code>cloud_regional_disk_auto</code>: regional disk.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Disk type limits for cloning</p>
     * <ul>
     * <li><p>A non-regional disk can be cloned only as a non-regional disk.</p>
     * </li>
     * <li><p>A regional disk can be cloned only as a regional disk.</p>
     * </li>
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
     * <p>The name of the new disk. The name must be 2 to 128 characters in length. It must start with a letter and can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
     * <p>Default value: none.</p>
     * 
     * <strong>example:</strong>
     * <p>MyDiskName</p>
     */
    @NameInMap("DiskName")
    public String diskName;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Performs a dry run to check the request without cloning the disk. The system checks whether your AccessKey is valid, whether the RAM user is authorized, and whether the required parameters are specified. If the request fails the check, the system returns the corresponding error message. If the request passes the check, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><code>false</code> (default): Sends a normal request. If the request passes the check, the system returns a 2xx HTTP status code and clones the disk.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <p>Specifies whether to encrypt the new disk. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: The disk is encrypted.</p>
     * </li>
     * <li><p><code>false</code>: The disk is not encrypted.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Encrypted")
    public Boolean encrypted;

    /**
     * <p>The ID of the KMS key to use for the new disk.</p>
     * 
     * <strong>example:</strong>
     * <p>key-szz67b2f696f4wh9yeg5d</p>
     */
    @NameInMap("KmsKeyId")
    public String kmsKeyId;

    /**
     * <p>Specifies whether to enable the multi-attach feature for the new disk. Valid values:</p>
     * <ul>
     * <li><p><code>Disabled</code>: Disables the multi-attach feature.</p>
     * </li>
     * <li><p><code>Enabled</code>: Enables the multi-attach feature. You can set this parameter to <code>Enabled</code> only for ESSD cloud disks.</p>
     * </li>
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
     * <p>The performance level of the new ESSD cloud disk. Valid values:</p>
     * <ul>
     * <li><p><code>PL0</code>: A single disk can deliver up to 10,000 random read/write IOPS.</p>
     * </li>
     * <li><p><code>PL1</code>: A single disk can deliver up to 50,000 random read/write IOPS.</p>
     * </li>
     * <li><p><code>PL2</code>: A single disk can deliver up to 100,000 random read/write IOPS.</p>
     * </li>
     * <li><p><code>PL3</code>: A single disk can deliver up to 1,000,000 random read/write IOPS.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when <code>DiskCategory</code> is set to <code>cloud_essd</code>.</p>
     * </blockquote>
     * <p>For more information about how to select an ESSD performance level, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD cloud disks</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>PL1</p>
     */
    @NameInMap("PerformanceLevel")
    public String performanceLevel;

    /**
     * <p>The provisioned read/write IOPS of the ESSD AutoPL cloud disk. Valid values:</p>
     * <ul>
     * <li><p>You cannot set this parameter for disks that are 3 GiB or smaller in size.</p>
     * </li>
     * <li><p>For disks that are 4 GiB or larger in size, the value must be in the range of <code>[0, min(1000 * Size - baseline performance, 50000)]</code>.</p>
     * </li>
     * </ul>
     * <p>baseline performance = <code>max(min(1800 + 50 * Size, 50000), 3000)</code>.</p>
     * <blockquote>
     * <p>This parameter is valid only when <code>DiskCategory</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/zh/ecs/user-guide/essd-autopl-disks">ESSD AutoPL cloud disks</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ProvisionedIops")
    public Long provisionedIops;

    /**
     * <p>The ID of the region. You can call the <a href="https://help.aliyun.com/zh/ecs/api-regions-describeregions">DescribeRegions</a> operation to view the latest list of Alibaba Cloud regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group for the new disk.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp199lyny9b3****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The size of the new disk, in GiB. The value must be greater than or equal to the size of the source disk. The value range varies based on the <code>DiskCategory</code> value:</p>
     * <ul>
     * <li><p><code>cloud_essd</code>: The value range depends on the <code>PerformanceLevel</code> value.</p>
     * <ul>
     * <li><p><code>PL0</code>: 1 to 65,536</p>
     * </li>
     * <li><p><code>PL1</code>: 20 to 65,536</p>
     * </li>
     * <li><p><code>PL2</code>: 461 to 65,536</p>
     * </li>
     * <li><p><code>PL3</code>: 1,261 to 65,536</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><code>cloud_auto</code>: 1 to 65,536</p>
     * </li>
     * <li><p><code>cloud_essd_entry</code>: 10 to 32,768</p>
     * </li>
     * <li><p><code>cloud_regional_disk_auto</code>: 10 to 65,536</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <p>The ID of the source disk.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d-bp1d6tsvznfghy7y****</p>
     */
    @NameInMap("SourceDiskId")
    public String sourceDiskId;

    /**
     * <p>The tags to add to the new disk.</p>
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
         * <p>This parameter is not yet available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("AssumeRoleFor")
        public String assumeRoleFor;

        /**
         * <blockquote>
         * <p>This parameter is not yet available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        /**
         * <blockquote>
         * <p>This parameter is not yet available.</p>
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
         * <p>The key of tag N to add to the new disk. Valid values of N: 1 to 20. The tag key must be 1 to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code> or contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the new disk. Valid values of N: 1 to 20. The tag value can be an empty string or up to 128 characters in length, and it cannot contain <code>http://</code> or <code>https://</code>.</p>
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
