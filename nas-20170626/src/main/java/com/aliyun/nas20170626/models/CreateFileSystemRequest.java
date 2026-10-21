// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateFileSystemRequest extends TeaModel {
    /**
     * <p>The maximum throughput of the file system. Unit: MB/s.
     * For valid values, refer to the specifications on the buy page.</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p><a href="https://common-buy.aliyun.com/?commodityCode=nas_cpfs_post#/buy">Buy page for pay-as-you-go Parallel file systems</a></p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <p><a href="https://common-buy-intl.alibabacloud.com/?spm=5176.nas_overview.0.0.7ea01dbft0dTui&commodityCode=nas_cpfspost_public_intl#/buy">Buy page for pay-as-you-go Parallel file systems</a></p>
     * 
     * <strong>example:</strong>
     * <p>150</p>
     */
    @NameInMap("Bandwidth")
    public Long bandwidth;

    /**
     * <p>The capacity of the file system. Unit: GiB.
     * This parameter is required and valid only when FileSystemType is set to extreme, cpfs, or cpfsse.
     * For valid values, refer to the specifications on the buy page:</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li><a href="https://common-buy.aliyun.com/?commodityCode=nas_extreme_post#/buy">Buy page for pay-as-you-go Extreme NAS file systems</a></li>
     * <li><a href="https://common-buy.aliyun.com/?commodityCode=nas_cpfs_post#/buy">Buy page for pay-as-you-go Parallel file systems</a></li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li><p><a href="https://common-buy-intl.alibabacloud.com/?commodityCode=nas_extpost_public_intl#/buy">Buy page for pay-as-you-go Extreme NAS file systems</a></p>
     * </li>
     * <li><p><a href="https://common-buy-intl.alibabacloud.com/?spm=5176.nas_overview.0.0.7ea01dbft0dTui&commodityCode=nas_cpfspost_public_intl#/buy">Buy page for pay-as-you-go Parallel file systems</a></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Capacity")
    public Long capacity;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li>PayAsYouGo: pay-as-you-go. This is the default value.</li>
     * <li>Subscription: subscription.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PayAsYouGo</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the client token. The RequestId of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the file system.
     * Limits:</p>
     * <ul>
     * <li>The description must be 2 to 128 characters in length.</li>
     * <li>It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</li>
     * <li>It can contain digits, colons (:), underscores (_), and hyphens (-).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>The description of this file system</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform a dry run on the creation request.
     * A dry run checks whether the parameters are valid and whether resources are sufficient, but does not actually create the instance or incur fees.
     * Valid values:  </p>
     * <ul>
     * <li>true: performs a dry run without creating the instance. The system checks whether required parameters are specified, the request format is valid, the service limits are met, and NAS resources are sufficient. If the request fails the dry run, an error message is returned. If the request passes the dry run, the 200 HTTP status code is returned, but FileSystemId is empty.  </li>
     * <li>false: performs a normal request and creates the instance directly after the request passes the check. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The subscription duration. Unit: months. This parameter is required and valid only when ChargeType is set to Subscription.
     * If a subscription instance is not renewed upon expiration, it is automatically released.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>Specifies whether to encrypt the file system.
     * Uses KMS-managed keys to encrypt data at rest in the file system. You do not need to perform decryption when reading or writing the encrypted data.
     * Valid values:</p>
     * <ul>
     * <li>0: Not encrypted. This is the default value.</li>
     * <li>1: NAS-managed key. Supported when FileSystemType is set to standard or extreme.</li>
     * <li>2: Custom key. Supported when FileSystemType is set to standard or extreme.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Extreme NAS file systems: The custom key (KMS) feature is supported in all regions except China East 1 Finance Cloud.</li>
     * <li>General-purpose NAS file systems: The custom key (KMS) feature is supported in all regions.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EncryptType")
    public Integer encryptType;

    /**
     * <p>The file system type. Valid values:</p>
     * <ul>
     * <li>standard: General-purpose NAS file system. This is the default value.</li>
     * <li>extreme: Extreme NAS file system.</li>
     * <li>cpfs: Cloud Parallel File Storage (CPFS) with locally redundant storage (LRS).</li>
     * <li>cpfsse: Cloud Parallel File Storage SE with zone-redundant storage (ZRS).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("FileSystemType")
    public String fileSystemType;

    /**
     * <p>The cluster ID of the high-performance network zone. This parameter is required when FileSystemType is set to bmcpfs and cannot be modified after creation. You can call the DescribeSpecifications operation to query valid values. Example: B1.</p>
     * 
     * <strong>example:</strong>
     * <p>B1</p>
     */
    @NameInMap("HpnZone")
    public String hpnZone;

    /**
     * <p>The ID of the KMS key.
     * This parameter is required only when EncryptType is set to 2.</p>
     * 
     * <strong>example:</strong>
     * <p>fcbd****-62**-4a**-b605-c58cc1d5****</p>
     */
    @NameInMap("KmsKeyId")
    public String kmsKeyId;

    /**
     * <p>The file transfer protocol type.</p>
     * <ul>
     * <li>When FileSystemType is set to standard, valid values are NFS and SMB.</li>
     * <li>When FileSystemType is set to extreme, the valid value is NFS.</li>
     * <li>When FileSystemType is set to cpfs, the valid value is cpfs.</li>
     * <li>When FileSystemType is set to cpfsse, the valid value is cpfs.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NFS</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The storage redundancy type. This parameter takes effect only for CPFS SE. Valid value: ZRS.</p>
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
     * <p>The zone-redundant vSwitch IDs.
     * This parameter is required when RedundancyType is set to ZRS. You must specify three vSwitch IDs, and they must belong to three different zones.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("RedundancyVSwitchIds")
    public java.util.List<String> redundancyVSwitchIds;

    /**
     * <p>The resource group ID.
     * You can view the resource group ID in the <a href="https://resourcemanager.console.aliyun.com/resource-groups?">Resource Management console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmwavnfdf****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The snapshot ID.
     * This parameter is supported only for Extreme NAS file systems with the Advanced storage type.</p>
     * <blockquote>
     * <p>When you create a file system from a snapshot, the created file system has the same version as the source file system of the snapshot. For example, if the source file system of the snapshot is version 1 and you want to create a version 2 file system, you can first create File System A from the snapshot, then create File System B that meets the version 2 configurations, copy the data from File System A to File System B, and migrate your business to File System B after the copy is complete.</p>
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
     * <li>When FileSystemType is set to standard, valid values are Performance, Capacity, Premium, and Agentic.</li>
     * <li>When FileSystemType is set to extreme, valid values are standard and advance.</li>
     * <li>When FileSystemType is set to cpfs, valid values are advance_100 (100 MB/s/TiB baseline), advance_200 (200 MB/s/TiB baseline), and economic (Economy).</li>
     * <li>When FileSystemType is set to cpfsse, the valid value is advance_100 (100 MB/s/TiB baseline).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Performance</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The tags.
     * Array length: 1 to 20. If the array contains multiple tag objects, the tag keys must be unique.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateFileSystemRequestTag> tag;

    /**
     * <p>The vSwitch ID.</p>
     * <ul>
     * <li>This parameter is required when FileSystemType is set to cpfs.</li>
     * <li>This parameter is reserved and does not take effect when FileSystemType is not set to cpfs. You do not need to configure it.</li>
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
     * <li>This parameter is required when FileSystemType is set to cpfs or cpfsse.</li>
     * <li>This parameter is reserved and does not take effect when FileSystemType is set to standard or extreme. You do not need to configure it.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp18cx9a7zoh0h9b4****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zone ID.
     * A zone is a physical area with independent power grids and networks in the same region.
     * When FileSystemType is set to standard, this parameter is optional. By default, a zone that meets the conditional requirements is randomly selected based on the ProtocolType and StorageType settings.
     * When FileSystemType is set to extreme or cpfs, this parameter is required.</p>
     * <blockquote>
     * <ul>
     * <li>File systems and Elastic Compute Service (ECS) instances in different zones of the same region can communicate with each other.</li>
     * <li>Deploy the file system and the ECS instance in the same zone to avoid cross-zone latency.</li>
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

    public CreateFileSystemRequest setHpnZone(String hpnZone) {
        this.hpnZone = hpnZone;
        return this;
    }
    public String getHpnZone() {
        return this.hpnZone;
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
         * <p>The tag key.
         * Limits:</p>
         * <ul>
         * <li>It cannot be empty or an empty string.</li>
         * <li>It can be up to 128 characters in length.</li>
         * <li>It cannot start with <code>aliyun</code> or <code>acs:</code>.</li>
         * <li>It cannot contain <code>http://</code> or <code>https://</code>.</li>
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
         * <p>The tag value.
         * Limits:</p>
         * <ul>
         * <li>It cannot be empty or an empty string.</li>
         * <li>It can be up to 128 characters in length.</li>
         * <li>It cannot contain <code>http://</code> or <code>https://</code>.</li>
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
