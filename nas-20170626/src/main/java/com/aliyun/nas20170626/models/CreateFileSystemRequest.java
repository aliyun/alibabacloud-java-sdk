// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateFileSystemRequest extends TeaModel {
    /**
     * <p>The maximum throughput of the file system.</p>
     * <br>
     * <p>Unit: MB/s.</p>
     * <br>
     * <p>Specify a value based on the specifications on the buy page.</p>
     */
    @NameInMap("Bandwidth")
    public Long bandwidth;

    /**
     * <p>The capacity of the file system. Unit: GiB.</p>
     * <br>
     * <p>This parameter is valid and required if the FileSystemType parameter is set to extreme.</p>
     * <br>
     * <p>Specify a value based on the specifications on the following buy page:</p>
     * <br>
     * <p>[Extreme NAS file system (Pay-as-you-go)](https://common-buy-intl.alibabacloud.com/?commodityCode=nas_extpost_public_intl#/buy)</p>
     */
    @NameInMap("Capacity")
    public Long capacity;

    /**
     * <p>The billing method.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   PayAsYouGo (default): pay-as-you-go</p>
     * <p>*   Subscription: subscription</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How do I ensure the idempotence?](~~25693~~)</p>
     * <br>
     * <p>> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the file system.</p>
     * <br>
     * <p>Limits:</p>
     * <br>
     * <p>*   The description must be 2 to 128 characters in length.</p>
     * <p>*   The description must start with a letter and cannot start with `http://` or `https://`.</p>
     * <p>*   The description can contain letters, digits, colons (:), underscores (\_), and hyphens (-).</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform a dry run.</p>
     * <br>
     * <p>During the dry run, the system checks whether the request parameters are valid and whether the requested resources are available. During the dry run, no file system is created and no fee is incurred.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true: performs a dry run. The system checks the required parameters, request syntax, limits, and available NAS resources. If the request fails the dry run, an error message is returned. If the request passes the precheck, the HTTP status code 200 is returned. No value is returned for the FileSystemId parameter.</p>
     * <p>*   false (default): performs a dry run and sends the request. If the request passes the dry run, a file system is created.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The subscription duration.</p>
     * <br>
     * <p>This parameter is valid and required only if the ChargeType parameter is set to Subscription. Unit: months.</p>
     * <br>
     * <p>If you do not renew a subscription file system when the file system expires, the file system is automatically released.</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>Specifies whether to encrypt the data in the NAS file system.</p>
     * <br>
     * <p>You can use a key that is managed by Key Management Service (KMS) to encrypt the data that is stored in a file system. When you read and write the encrypted data, the data is automatically decrypted.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   0: The data in the file system is not encrypted.</p>
     * <p>*   1: A NAS-managed key is used to encrypt the data in the file system. This value is valid only if the FileSystemType parameter is set to standard or extreme.</p>
     * <p>*   2: A KMS-managed key is used to encrypt the data in the file system. This value is valid only if the FileSystemType parameter is set to extreme.</p>
     * <br>
     * <p>> You can use KMS-managed keys only in the following regions: US (Silicon Valley), US (Virginia), UK (London), Australia (Sydney), Germany (Frankfurt), India (Mumbai), and Singapore.</p>
     */
    @NameInMap("EncryptType")
    public Integer encryptType;

    /**
     * <p>The type of the file system.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   standard (default): General-purpose NAS file system</p>
     * <p>*   extreme: Extreme NAS file system</p>
     * <p>*   cpfs: Cloud Parallel File Storage (CPFS) file system</p>
     * <br>
     * <p>> CPFS file systems are available only on the China site (aliyun.com).</p>
     */
    @NameInMap("FileSystemType")
    public String fileSystemType;

    /**
     * <p>The ID of the KMS-managed key.</p>
     * <br>
     * <p>This parameter is required only if the EncryptType parameter is set to 2.</p>
     */
    @NameInMap("KmsKeyId")
    public String kmsKeyId;

    /**
     * <p>The protocol type.</p>
     * <br>
     * <p>*   If the FileSystemType parameter is set to standard, you can set the ProtocolType parameter to NFS or SMB.</p>
     * <p>*   If the FileSystemType parameter is set to extreme, you can set the ProtocolType parameter to NFS.</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The snapshot ID.</p>
     * <br>
     * <p>This parameter is available only for Extreme NAS file systems.</p>
     * <br>
     * <p>> You can create a file system from a snapshot. In this case, the version of the file system is the same as that of the source file system. For example, the source file system of the snapshot uses version 1. To create a file system of version 2, you can create File System A from the snapshot and create File System B of version 2. You can then copy the data and migrate your business from File System A to File System B.</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    /**
     * <p>The storage type.</p>
     * <br>
     * <p>*   If the FileSystemType parameter is set to standard, you can set the StorageType parameter to Performance or Capacity.</p>
     * <p>*   If the FileSystemType parameter is set to extreme, you can set the StorageType parameter to standard or advance.</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The ID of the vSwitch.</p>
     * <br>
     * <p>This parameter is reserved and does not take effect. You do not need to configure this parameter.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the virtual private cloud (VPC).</p>
     * <br>
     * <p>This parameter is reserved and does not take effect. You do not need to configure this parameter.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zone ID.</p>
     * <br>
     * <p>Each region has multiple isolated locations known as zones. Each zone has its own independent power supply and networks.</p>
     * <br>
     * <p>This parameter is not required if the FileSystemType parameter is set to standard. By default, a random zone is selected based on the protocol type and storage type.</p>
     * <br>
     * <p>This parameter is required if the FileSystemType parameter is set to extreme.</p>
     * <br>
     * <p>> *   An Elastic Compute Service (ECS) instance and a NAS file system that reside in different zones of the same region can access each other.</p>
     * <p>>*   We recommend that you select the zone where the ECS instance resides. This prevents cross-zone latency between the file system and the ECS instance.</p>
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

}
