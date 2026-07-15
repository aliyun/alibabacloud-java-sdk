// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateFileSystemRequest extends TeaModel {
    /**
     * <p>The maximum throughput of the file system.</p>
     * <p>Unit: MB/s.</p>
     * <p>For available specification values, see the actual specifications on the buy page.</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p><a href="https://common-buy.aliyun.com/?commodityCode=nas_cpfs_post#/buy">Parallel file system CPFS pay-as-you-go buy page</a></p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <p><a href="https://common-buy-intl.alibabacloud.com/?spm=5176.nas_overview.0.0.7ea01dbft0dTui&commodityCode=nas_cpfspost_public_intl#/buy">Parallel file system CPFS pay-as-you-go buy page</a></p>
     * 
     * <strong>example:</strong>
     * <p>150</p>
     */
    @NameInMap("Bandwidth")
    public Long bandwidth;

    /**
     * <p>The capacity of the file system. Unit: GiB.
     * This parameter is required and takes effect only when FileSystemType is set to extreme, cpfs, or cpfsse.</p>
     * <p>For available values, see the actual specifications on the buy page:</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li><a href="https://common-buy.aliyun.com/?commodityCode=nas_extreme_post#/buy">Extreme NAS pay-as-you-go buy page</a></li>
     * <li><a href="https://common-buy.aliyun.com/?commodityCode=nas_cpfs_post#/buy">Parallel file system CPFS pay-as-you-go buy page</a></li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li><p><a href="https://common-buy-intl.alibabacloud.com/?commodityCode=nas_extpost_public_intl#/buy">Extreme NAS pay-as-you-go buy page</a></p>
     * </li>
     * <li><p><a href="https://common-buy-intl.alibabacloud.com/?spm=5176.nas_overview.0.0.7ea01dbft0dTui&commodityCode=nas_cpfspost_public_intl#/buy">Parallel file system CPFS pay-as-you-go buy page</a></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Capacity")
    public Long capacity;

    /**
     * <p>The billing method.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>PayAsYouGo (default): Pay-as-you-go.</li>
     * <li>Subscription: Subscription.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PayAsYouGo</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>Ensures the idempotence of the request. Generate a unique parameter value from your client. The ClientToken value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system uses the RequestId of the API request as the ClientToken. The RequestId may vary for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the file system.</p>
     * <p>Limits:</p>
     * <ul>
     * <li>The description must be 2 to 128 characters in length.</li>
     * <li>The description must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</li>
     * <li>The description can contain digits, colons (:), underscores (_), and hyphens (-).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>此文件系统的描述。</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform a dry run for this request.</p>
     * <p>A dry run checks parameter validity and resource availability without actually creating the instance or incurring charges.</p>
     * <p>Valid values:  </p>
     * <ul>
     * <li>true: Sends a dry run request without creating the instance. The check items include required parameters, request format, service limits, and NAS inventory. If the check fails, the corresponding error is returned. If the check succeeds, HTTP status code 200 is returned, but FileSystemId is empty.  </li>
     * <li>false (default): Sends a normal request. After the check succeeds, the instance is created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The subscription duration.</p>
     * <p>Unit: months. This parameter is required and takes effect only when ChargeType is set to Subscription.</p>
     * <p>If a subscription instance is not renewed upon expiration, the instance is automatically released.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>Specifies whether to encrypt the file system.</p>
     * <p>Uses keys managed by Key Management Service (KMS) to encrypt data stored on the file system. No decryption is required when reading or writing encrypted data.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>0 (default): Not encrypted.</li>
     * <li>1: NAS-managed key. Supported when FileSystemType is set to standard or extreme.</li>
     * <li>2: Custom Key (KMS). Supported when FileSystemType is set to standard or extreme.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Extreme NAS: The Custom Key (KMS) feature is supported in all regions except China (Hangzhou) Finance Cloud.</li>
     * <li>General-purpose NAS: The Custom Key (KMS) feature is supported in all regions.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EncryptType")
    public Integer encryptType;

    /**
     * <p>The type of the file system.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>standard (default): General-purpose NAS file system.</li>
     * <li>extreme: Extreme NAS file system.</li>
     * <li>cpfs: Cloud Parallel File Storage (CPFS) (locally redundant).</li>
     * <li>cpfsse: Cloud Parallel File Storage (CPFS) SE (zone-redundant).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("FileSystemType")
    public String fileSystemType;

    /**
     * <p>The KMS key ID.</p>
     * <p>This parameter is required only when EncryptType is set to 2.</p>
     * 
     * <strong>example:</strong>
     * <p>fcbd****-62**-4a**-b605-c58cc1d5****</p>
     */
    @NameInMap("KmsKeyId")
    public String kmsKeyId;

    /**
     * <p>The file transfer protocol type.</p>
     * <ul>
     * <li>If FileSystemType is set to standard, valid values: NFS and SMB.</li>
     * <li>If FileSystemType is set to extreme, valid values: NFS.</li>
     * <li>If FileSystemType is set to cpfs, valid values: cpfs.</li>
     * <li>If FileSystemType is set to cpfsse, valid values: cpfs.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NFS</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The storage redundancy type. This parameter takes effect only for CPFS SE.
     * Valid values: ZRS.</p>
     * 
     * <strong>example:</strong>
     * <p>ZRS</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("RedundancyType")
    public String redundancyType;

    /**
     * <p>The list of zone-redundant vSwitch IDs.
     * If RedundancyType is set to ZRS, this parameter is required. You must specify three vSwitch IDs, each from a different zone.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("RedundancyVSwitchIds")
    public java.util.List<String> redundancyVSwitchIds;

    /**
     * <p>The resource group ID.</p>
     * <p>You can view resource group IDs in the <a href="https://resourcemanager.console.aliyun.com/resource-groups?">Resource Management console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmwavnfdf****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The snapshot ID.</p>
     * <p>This parameter is supported only for Extreme NAS file systems with the Advanced storage type.</p>
     * <blockquote>
     * <p>A file system created from a snapshot has the same version as the source file system of the snapshot. For example, if the source file system version is 1 and you want to create a version 2 file system, first create file system A from the snapshot, then create file system B that meets the version 2 configuration. Copy the data from file system A to file system B, and migrate your workloads to file system B after the copy is complete.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>s-extreme-snapsho****</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    /**
     * <p>The storage type.</p>
     * <ul>
     * <li>If FileSystemType is set to standard, valid values: Performance, Capacity, and Premium.</li>
     * <li>If FileSystemType is set to extreme, valid values: standard and advance.</li>
     * <li>If FileSystemType is set to cpfs, valid values: advance_100 (100 MB/s/TiB baseline), advance_200 (200 MB/s/TiB baseline), and economic.</li>
     * <li>If FileSystemType is set to cpfsse, valid values: advance_100 (100 MB/s/TiB baseline).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Performance</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The tags.</p>
     * <p>Array length: 1 to 20. If the array contains multiple tag objects, the tag key (Key) must be unique.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateFileSystemRequestTag> tag;

    /**
     * <p>The vSwitch ID.</p>
     * <ul>
     * <li>If FileSystemType is set to cpfs, this parameter is required.</li>
     * <li>If FileSystemType is not set to cpfs, this parameter is reserved and does not take effect. You do not need to configure it.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp131dkqilvw5pnlt****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The VPC ID.</p>
     * <ul>
     * <li>If FileSystemType is set to cpfs or cpfsse, this parameter is required.</li>
     * <li>If FileSystemType is set to standard or extreme, this parameter is reserved and does not take effect. You do not need to configure it.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp18cx9a7zoh0h9b4****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zone ID.</p>
     * <p>A zone is an independent physical area within a region that has its own power supply and network.</p>
     * <p>If FileSystemType is set to standard, this parameter is optional. By default, an active zone that matches the conditional ProtocolType and StorageType is randomly selected.</p>
     * <p>If FileSystemType is set to extreme or cpfs, this parameter is required.</p>
     * <blockquote>
     * <ul>
     * <li>File systems and Elastic Computing Service (ECS) instances in different zones of the same region can communicate with each other.</li>
     * <li>Place the file system and the ECS server in the same zone to avoid cross-zone latency.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateFileSystemRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFileSystemRequest self = new CreateFileSystemRequest();
        return TeaModel.build(map, self);
    }

    public CreateFileSystemRequest setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Long getBandwidth() {
        return this.bandwidth;
    }

    public CreateFileSystemRequest setCapacity(Long capacity) {
        this.capacity = capacity;
        return this;
    }
    public Long getCapacity() {
        return this.capacity;
    }

    public CreateFileSystemRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateFileSystemRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateFileSystemRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateFileSystemRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateFileSystemRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreateFileSystemRequest setEncryptType(Integer encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public Integer getEncryptType() {
        return this.encryptType;
    }

    public CreateFileSystemRequest setFileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType;
        return this;
    }
    public String getFileSystemType() {
        return this.fileSystemType;
    }

    public CreateFileSystemRequest setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    public CreateFileSystemRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public CreateFileSystemRequest setRedundancyType(String redundancyType) {
        this.redundancyType = redundancyType;
        return this;
    }
    public String getRedundancyType() {
        return this.redundancyType;
    }

    public CreateFileSystemRequest setRedundancyVSwitchIds(java.util.List<String> redundancyVSwitchIds) {
        this.redundancyVSwitchIds = redundancyVSwitchIds;
        return this;
    }
    public java.util.List<String> getRedundancyVSwitchIds() {
        return this.redundancyVSwitchIds;
    }

    public CreateFileSystemRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateFileSystemRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public CreateFileSystemRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public CreateFileSystemRequest setTag(java.util.List<CreateFileSystemRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateFileSystemRequestTag> getTag() {
        return this.tag;
    }

    public CreateFileSystemRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateFileSystemRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateFileSystemRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateFileSystemRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>The tag key cannot be empty.</li>
         * <li>The tag key can be up to 128 characters in length.</li>
         * <li>The tag key cannot start with <code>aliyun</code> or <code>acs:</code>.</li>
         * <li>The tag key cannot contain <code>http://</code> or <code>https://</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>nastest</p>
         * 
         * <strong>if can be null:</strong>
         * <p>false</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>The tag value cannot be empty.</li>
         * <li>The tag value can be up to 128 characters in length.</li>
         * <li>The tag value cannot contain <code>http://</code> or <code>https://</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>testValue</p>
         * 
         * <strong>if can be null:</strong>
         * <p>false</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateFileSystemRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateFileSystemRequestTag self = new CreateFileSystemRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateFileSystemRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateFileSystemRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
