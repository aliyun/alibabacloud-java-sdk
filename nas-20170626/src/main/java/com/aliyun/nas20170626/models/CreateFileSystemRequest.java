// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateFileSystemRequest extends TeaModel {
    /**
     * <p>The maximum throughput of the file system.</p>
     * <p>Unit: MB/s.</p>
     * <p>Specify a value based on the specifications on the buy page.</p>
     * <p><a href="https://common-buy-intl.alibabacloud.com/?spm=5176.nas_overview.0.0.7ea01dbft0dTui%5C&commodityCode=nas_cpfspost_public_intl#/buy">CPFS file system (Pay-as-you-go)</a></p>
     * 
     * <strong>example:</strong>
     * <p>150</p>
     */
    @NameInMap("Bandwidth")
    public Long bandwidth;

    /**
     * <p>Specify the capacity of the file system. Unit: GiB. Specify the Capacity parameter when the FileSystemType parameter is set to extreme or cpfs.</p>
     * <p>Specify a value based on the specifications on the following buy page:</p>
     * <ul>
     * <li><a href="https://common-buy-intl.alibabacloud.com/?commodityCode=nas_extpost_public_intl#/buy">Extreme NAS file system (Pay-as-you-go)</a></li>
     * <li><a href="https://common-buy-intl.alibabacloud.com/?spm=5176.nas_overview.0.0.7ea01dbft0dTui%5C&commodityCode=nas_cpfspost_public_intl#/buy">CPFS file system (Pay-as-you-go)</a></li>
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
     * <li>PayAsYouGo (default): pay-as-you-go</li>
     * <li>Subscription</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PayAsYouGo</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How do I ensure the idempotence?</a></p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
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
     * <li>The description can contain letters, digits, colons (:), underscores (_), and hyphens (-).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform a dry run.</p>
     * <p>During the dry run, the system checks whether the request parameters are valid and whether the requested resources are available. During the dry run, no file system is created and no fee is incurred.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: performs a dry run. The system checks the required parameters, request syntax, limits, and available NAS resources. If the request fails the dry run, an error message is returned. If the request passes the precheck, the HTTP status code 200 is returned. No value is returned for the FileSystemId parameter.</li>
     * <li>false (default): performs a dry run and sends the request. If the request passes the dry run, a file system is created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The subscription duration.</p>
     * <p>This parameter is valid and required only if the ChargeType parameter is set to Subscription. Unit: months.</p>
     * <p>If you do not renew a subscription file system when the file system expires, the file system is automatically released.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>Specifies whether to encrypt data in the file system.</p>
     * <p>You can use the keys that are managed by Key Management Service (KMS) to encrypt data in a file system. When you read and write the encrypted data, the data is automatically decrypted.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>0 (default): The data in the file system is not encrypted.</li>
     * <li>1: A NAS-managed key is used to encrypt the data in the file system. This value is valid only if the FileSystemType parameter is set to standard or extreme.</li>
     * <li>2: A KMS-managed key is used to encrypt the data in the file system. This value is valid only if the FileSystemType parameter is set to standard or extreme.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Extreme NAS file systems: All regions except China East 1 Finance support KMS-managed keys.</li>
     * <li>General-purpose NAS file systems: All regions support KMS-managed keys.</li>
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
     * <li>standard: General-purpose Apsara File Storage NAS (NAS) file system</li>
     * <li>extreme: Extreme NAS file system.</li>
     * <li>cpfs: CPFS file system</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("FileSystemType")
    public String fileSystemType;

    /**
     * <p>The ID of the KMS key.</p>
     * <p>This parameter is required only if the EncryptType parameter is set to 2.</p>
     * 
     * <strong>example:</strong>
     * <p>3c0b3885-2adf-483d-8a65-5e280689****</p>
     */
    @NameInMap("KmsKeyId")
    public String kmsKeyId;

    /**
     * <p>Specify the protocol type.</p>
     * <ul>
     * <li>If the FileSystemType parameter is set to standard, set the ProtocolType parameter to NFS or SMB.</li>
     * <li>If the FileSystemType parameter is set to extreme, set the ProtocolType parameter to NFS.</li>
     * <li>If the FileSystemType parameter is set to cpfs, set the ProtocolType parameter to cpfs.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NFS</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <strong>example:</strong>
     * <p>ZRS</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("RedundancyType")
    public String redundancyType;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("RedundancyVSwitchIds")
    public java.util.List<String> redundancyVSwitchIds;

    /**
     * <p>The resource group ID.</p>
     * <p>You can log on to the <a href="https://resourcemanager.console.aliyun.com/resource-groups?">Resource Management console</a> to view resource group IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmwavnfdf****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The snapshot ID.</p>
     * <p>This parameter is available only for advanced Extreme NAS file systems.</p>
     * <blockquote>
     * <p> You can create a file system from a snapshot. In this case, the version of the file system is the same as that of the source file system. For example, the source file system of the snapshot uses version 1. To create a file system of version 2, you can create File System A from the snapshot and create File System B of version 2. You can then copy the data and migrate your business from File System A to File System B.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>s-xxx</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    /**
     * <p>The storage type.</p>
     * <ul>
     * <li>If the FileSystemType parameter is set to standard, set the StorageType parameter to Performance, Capacity, or Premium.</li>
     * <li>If the FileSystemType parameter is set to extreme, set the StorageType parameter to standard or advance.</li>
     * <li>If the FileSystemType parameter is set to cpfs, set the StorageType parameter to advance_100 (100 MB/s/TiB baseline) or advance_200 (200 MB/s/TiB baseline).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Performance</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>An array of tags.</p>
     * <p>You can specify up to 20 tags. If you specify multiple tags, each tag key must be unique.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateFileSystemRequestTag> tag;

    /**
     * <p>The vSwitch ID of the cluster.</p>
     * <ul>
     * <li>This parameter is required only if you set the FileSystemType parameter to cpfs.</li>
     * <li>This parameter is reserved and not required if you set the FileSystemType parameter to standard or extreme.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vsw-2ze37k6jh8ums2fw2****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the virtual private cloud (VPC).</p>
     * <ul>
     * <li>This parameter is required only if you set the FileSystemType parameter to cpfs.</li>
     * <li>This parameter is reserved and not required if you set the FileSystemType parameter to standard or extreme.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1cbv1ljve4j5hlw****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The ID of the zone.</p>
     * <p>Each region has multiple isolated locations known as zones. Each zone has its own independent power supply and network.</p>
     * <p>This parameter is not required if the FileSystemType parameter is set to standard. By default, a random zone is selected based on the protocol type and storage type.</p>
     * <p>This parameter is required if the FileSystemType parameter is set to extreme or cpfs.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>An Elastic Compute Service (ECS) instance and a NAS file system that reside in different zones of the same region can access each other.</p>
     * </li>
     * <li><p>We recommend that you select the zone where the ECS instance resides. This prevents cross-zone latency between the file system and the ECS instance.</p>
     * </li>
     * </ul>
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
         * <li>The tag key cannot be null or an empty string.</li>
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
         * <li>The tag value cannot be null or an empty string.</li>
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
