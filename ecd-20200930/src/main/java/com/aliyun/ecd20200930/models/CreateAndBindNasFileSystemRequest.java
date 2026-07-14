// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateAndBindNasFileSystemRequest extends TeaModel {
    /**
     * <p>The description of the NAS file system.</p>
     * 
     * <strong>example:</strong>
     * <p>newDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the shared cloud computer.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dg-fh0vdzyh6rdc*****</p>
     */
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    /**
     * <p>Specifies whether the file system uses a KMS-managed key to encrypt data at rest. Encrypted data does not need to be decrypted during read and write operations.</p>
     * <blockquote>
     * <p>NAS-managed keys are supported when <code>FileSystemType</code> is set to <code>standard</code> or <code>extreme</code>. User-managed keys are supported when <code>FileSystemType</code> is set to <code>extreme</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("EncryptType")
    public Integer encryptType;

    /**
     * <p>The list of user IDs.</p>
     */
    @NameInMap("EndUserIds")
    public java.util.List<String> endUserIds;

    /**
     * <p>The name of the NAS file system.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>szy-asp-upm-test</p>
     */
    @NameInMap("FileSystemName")
    public String fileSystemName;

    /**
     * <p>The ID of the office network.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing+dir-15657*****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

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
     * <p>The storage specification type of the NAS file system.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Capacity</p>
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
