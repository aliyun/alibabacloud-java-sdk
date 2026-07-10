// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CloneDisksRequest extends TeaModel {
    /**
     * <blockquote>
     * <p>This parameter is not publicly available.</p>
     * </blockquote>
     */
    @NameInMap("Arn")
    public java.util.List<CloneDisksRequestArn> arn;

    /**
     * <p>Specifies whether to enable the performance burst feature for the new disk. Valid values:</p>
     * <ul>
     * <li>true: enables the performance burst feature.</li>
     * <li>false: does not enable the performance burst feature.<blockquote>
     * <p>This parameter is supported only when DiskCategory is set to cloud_auto. For more information, see <a href="https://www.alibabacloud.com/help/en/ecs/user-guide/essd-autopl-disks">ESSD AutoPL disks</a>.</p>
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
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The ClientToken value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The category of the new disk. Valid values:</p>
     * <ul>
     * <li>cloud_essd: standard SSD.</li>
     * <li>cloud_auto: ESSD AutoPL disk.</li>
     * <li>cloud_essd_entry: ESSD Entry disk.</li>
     * <li>cloud_regional_disk_auto: regional Standard SSD (ESSD).</li>
     * </ul>
     * <blockquote>
     * <p>Disk category restrictions for disk cloning:</p>
     * <ul>
     * <li>Non-regional disks can only be cloned to non-regional disk types.</li>
     * <li>Regional disks can only be cloned to regional disk types.</li>
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
     * <p>The name of the disk. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-). The name must start with a letter.</p>
     * <p>Default value: empty.</p>
     * 
     * <strong>example:</strong>
     * <p>MyDiskName</p>
     */
    @NameInMap("DiskName")
    public String diskName;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li>true: sends a check request without querying the filing status. The system checks whether your AccessKey pair is valid, whether RAM user authorization is granted, and whether the required parameters are specified. If the check fails, the corresponding error is returned. If the check passes, the DryRunOperation error code is returned.</li>
     * <li>false (default): sends a normal request. After the check passes, a 2XX HTTP status code is returned and the filing status is queried.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <p>Specifies whether the new disk is encrypted. Valid values:</p>
     * <ul>
     * <li>true: The new disk is encrypted.</li>
     * <li>false: The new disk is not encrypted.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Encrypted")
    public Boolean encrypted;

    /**
     * <p>The key ID of the KMS key used by the new disk.</p>
     * 
     * <strong>example:</strong>
     * <p>key-szz67b2f696f4wh9yeg5d</p>
     */
    @NameInMap("KmsKeyId")
    public String kmsKeyId;

    /**
     * <p>Specifies whether to enable the multi-attach attribute for the new disk. Settings for this parameter. Valid values:</p>
     * <ul>
     * <li>Disabled: disables the multi-attach attribute.</li>
     * <li>Enabled: enables the multi-attach attribute. Only standard SSDs support the value <code>Enabled</code>.</li>
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
     * <p>The performance level (PL) of the enterprise SSD to create. Settings for this parameter vary based on the standard SSD type. Valid values:</p>
     * <ul>
     * <li>PL0: a single disk can deliver up to 10,000 random read/write IOPS.</li>
     * <li>PL1: a single disk can deliver up to 50,000 random read/write IOPS.</li>
     * <li>PL2: a single disk can deliver up to 100,000 random read/write IOPS.</li>
     * <li>PL3: a single disk can deliver up to 1,000,000 random read/write IOPS.</li>
     * </ul>
     * <blockquote>
     * <p>If DiskCategory is set to cloud_essd, PerformanceLevel is required.</p>
     * </blockquote>
     * <p>For more information about how to select an ESSD performance level, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>PL1</p>
     */
    @NameInMap("PerformanceLevel")
    public String performanceLevel;

    /**
     * <p>The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values:</p>
     * <ul>
     * <li>Capacity (GiB) &lt;= 3: provisioned performance is not supported.</li>
     * <li>Capacity (GiB) &gt;= 4: [0, min{(1,000 IOPS/GiB × Capacity - Baseline IOPS), 50,000}]</li>
     * </ul>
     * <p>Baseline performance = max{min{1,800 + 50 × Capacity, 50,000}, 3,000}.</p>
     * <blockquote>
     * <p>This parameter is supported only when DiskCategory is set to cloud_auto. For more information, see <a href="https://www.alibabacloud.com/help/en/ecs/user-guide/essd-autopl-disks">ESSD AutoPL disks</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ProvisionedIops")
    public Long provisionedIops;

    /**
     * <p>The region ID. You can call <a href="https://www.alibabacloud.com/help/en/ecs/api-regions-describeregions">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the disk belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp199lyny9b3****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The capacity of the new disk. Unit: GiB. You must specify a value for this parameter. Valid values:</p>
     * <ul>
     * <li>cloud_essd: the valid value range varies based on the performance level.<ul>
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
     * <p>The ID of the source disk.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d-bp1d6tsvznfghy7y****</p>
     */
    @NameInMap("SourceDiskId")
    public String sourceDiskId;

    /**
     * <p>The list of tags for the disk.</p>
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
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("AssumeRoleFor")
        public String assumeRoleFor;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
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
         * <p>The tag key of the disk. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with aliyun or acs:. The tag key cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the disk. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot contain http:// or https://.</p>
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
