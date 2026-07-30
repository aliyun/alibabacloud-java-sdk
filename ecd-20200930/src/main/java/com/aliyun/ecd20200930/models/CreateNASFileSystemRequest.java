// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateNASFileSystemRequest extends TeaModel {
    /**
     * <p>The description of the NAS file system.</p>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether the file system uses a KMS-managed key to encrypt data stored on the file system. Encrypted data does not need to be decrypted during read and write operations.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("EncryptType")
    public String encryptType;

    /**
     * <p>The NAS file system name. The name must meet the following requirements: The name must be 2 to 128 characters in length and can contain letters and Chinese characters. The name must start with a letter or a Chinese character and cannot start with <code>http://</code> or <code>https://</code>. The name can contain digits, underscores (_), or hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>testNAS</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The office network ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-363353****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The storage type of the NAS file system.</p>
     * 
     * <strong>example:</strong>
     * <p>Capacity</p>
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

    public CreateNASFileSystemRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
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
