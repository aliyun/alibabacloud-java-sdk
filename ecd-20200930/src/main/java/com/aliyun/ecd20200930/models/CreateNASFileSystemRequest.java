// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateNASFileSystemRequest extends TeaModel {
    /**
     * <p>The description of the NAS file system.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to encrypt the data in the NAS file system. You can use keys that are managed by Key Management Service (KMS) to encrypt the data that is stored in a NAS file system. When you read and write the encrypted data, the data is automatically decrypted. Valid values:</p>
     * <br>
     * <p>*   0: does not encrypt the data in the NAS file system.</p>
     * <p>*   1: encrypts the data in the NAS file system by using NAS-managed keys.</p>
     * <br>
     * <p>Default value: 0.</p>
     */
    @NameInMap("EncryptType")
    public String encryptType;

    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the workspace.</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The ID of the region.</p>
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

    public static CreateNASFileSystemRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNASFileSystemRequest self = new CreateNASFileSystemRequest();
        return TeaModel.build(map, self);
    }

    public CreateNASFileSystemRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateNASFileSystemRequest setEncryptType(String encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public String getEncryptType() {
        return this.encryptType;
    }

    public CreateNASFileSystemRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateNASFileSystemRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public CreateNASFileSystemRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateNASFileSystemRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

}
