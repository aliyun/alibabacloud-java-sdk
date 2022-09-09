// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateAndBindNasFileSystemRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    @NameInMap("EncryptType")
    public Integer encryptType;

    @NameInMap("EndUserIds")
    public java.util.List<String> endUserIds;

    @NameInMap("FileSystemName")
    public String fileSystemName;

    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    @NameInMap("RegionId")
    public String regionId;

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
