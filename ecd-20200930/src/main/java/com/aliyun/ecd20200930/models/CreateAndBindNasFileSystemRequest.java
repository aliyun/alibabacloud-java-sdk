// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateAndBindNasFileSystemRequest extends TeaModel {
    /**
     * <p>The description of the NAS file system.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the desktop group.</p>
     */
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    /**
     * <p>Specifies whether to encrypt data in the NAS file system. You can use keys that are hosted by Key Management Service (KMS) to encrypt data in a file system. When you read and write the encrypted data, the data is automatically decrypted. Valid values:</p>
     * <br>
     * <p>*   0: does not encrypt data in the NAS file system.</p>
     * <p>*   1: encrypts data in the NAS file system by using a NAS-managed key. ` If you set  `FileSystemType`  to  `standard`  or  `extreme`, you can use a NAS-managed key to encrypt data in a NAS file system.`</p>
     * <p>*   2: encrypts data in the NAS file system by using a KMS-managed key. `If` you set FileSystemType`  to  `extreme`, you can use a KMS-managed key to encrypt data in a NAS file system.`</p>
     * <br>
     * <p>Default value: 0.</p>
     */
    @NameInMap("EncryptType")
    public Integer encryptType;

    /**
     * <p>The list of users.</p>
     */
    @NameInMap("EndUserIds")
    public java.util.List<String> endUserIds;

    /**
     * <p>The name of the NAS file system.</p>
     */
    @NameInMap("FileSystemName")
    public String fileSystemName;

    /**
     * <p>The ID of the workspace.</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The storage type of the NAS file system. Valid values:</p>
     * <br>
     * <p>*   Capacity</p>
     * <p>*   Performance</p>
     * <br>
     * <p>Default value: Capacity.</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    public static CreateAndBindNasFileSystemRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAndBindNasFileSystemRequest self = new CreateAndBindNasFileSystemRequest();
        return TeaModel.build(map, self);
    }

    public CreateAndBindNasFileSystemRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAndBindNasFileSystemRequest setDesktopGroupId(String desktopGroupId) {
        this.desktopGroupId = desktopGroupId;
        return this;
    }
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    public CreateAndBindNasFileSystemRequest setEncryptType(Integer encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public Integer getEncryptType() {
        return this.encryptType;
    }

    public CreateAndBindNasFileSystemRequest setEndUserIds(java.util.List<String> endUserIds) {
        this.endUserIds = endUserIds;
        return this;
    }
    public java.util.List<String> getEndUserIds() {
        return this.endUserIds;
    }

    public CreateAndBindNasFileSystemRequest setFileSystemName(String fileSystemName) {
        this.fileSystemName = fileSystemName;
        return this;
    }
    public String getFileSystemName() {
        return this.fileSystemName;
    }

    public CreateAndBindNasFileSystemRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public CreateAndBindNasFileSystemRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAndBindNasFileSystemRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

}
