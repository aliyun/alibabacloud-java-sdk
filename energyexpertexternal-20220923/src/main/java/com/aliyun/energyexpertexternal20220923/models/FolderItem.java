// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class FolderItem extends TeaModel {
    @NameInMap("currentLevel")
    public Integer currentLevel;

    @NameInMap("docCount")
    public Integer docCount;

    @NameInMap("folderDefault")
    public Integer folderDefault;

    @NameInMap("folderId")
    public String folderId;

    @NameInMap("folderName")
    public String folderName;

    @NameInMap("folderNum")
    public Integer folderNum;

    @NameInMap("ossDomain")
    public String ossDomain;

    @NameInMap("ossPath")
    public String ossPath;

    @NameInMap("ossUpdateBy")
    public String ossUpdateBy;

    @NameInMap("parentFolderId")
    public String parentFolderId;

    @NameInMap("resourcePath")
    public String resourcePath;

    @NameInMap("storageType")
    public Integer storageType;

    @NameInMap("subFolderList")
    public java.util.List<FolderItem> subFolderList;

    @NameInMap("syncParsingStatus")
    public Integer syncParsingStatus;

    @NameInMap("syncStatus")
    public Integer syncStatus;

    @NameInMap("taskId")
    public Long taskId;

    public static FolderItem build(java.util.Map<String, ?> map) throws Exception {
        FolderItem self = new FolderItem();
        return TeaModel.build(map, self);
    }

    public FolderItem setCurrentLevel(Integer currentLevel) {
        this.currentLevel = currentLevel;
        return this;
    }
    public Integer getCurrentLevel() {
        return this.currentLevel;
    }

    public FolderItem setDocCount(Integer docCount) {
        this.docCount = docCount;
        return this;
    }
    public Integer getDocCount() {
        return this.docCount;
    }

    public FolderItem setFolderDefault(Integer folderDefault) {
        this.folderDefault = folderDefault;
        return this;
    }
    public Integer getFolderDefault() {
        return this.folderDefault;
    }

    public FolderItem setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public FolderItem setFolderName(String folderName) {
        this.folderName = folderName;
        return this;
    }
    public String getFolderName() {
        return this.folderName;
    }

    public FolderItem setFolderNum(Integer folderNum) {
        this.folderNum = folderNum;
        return this;
    }
    public Integer getFolderNum() {
        return this.folderNum;
    }

    public FolderItem setOssDomain(String ossDomain) {
        this.ossDomain = ossDomain;
        return this;
    }
    public String getOssDomain() {
        return this.ossDomain;
    }

    public FolderItem setOssPath(String ossPath) {
        this.ossPath = ossPath;
        return this;
    }
    public String getOssPath() {
        return this.ossPath;
    }

    public FolderItem setOssUpdateBy(String ossUpdateBy) {
        this.ossUpdateBy = ossUpdateBy;
        return this;
    }
    public String getOssUpdateBy() {
        return this.ossUpdateBy;
    }

    public FolderItem setParentFolderId(String parentFolderId) {
        this.parentFolderId = parentFolderId;
        return this;
    }
    public String getParentFolderId() {
        return this.parentFolderId;
    }

    public FolderItem setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
        return this;
    }
    public String getResourcePath() {
        return this.resourcePath;
    }

    public FolderItem setStorageType(Integer storageType) {
        this.storageType = storageType;
        return this;
    }
    public Integer getStorageType() {
        return this.storageType;
    }

    public FolderItem setSubFolderList(java.util.List<FolderItem> subFolderList) {
        this.subFolderList = subFolderList;
        return this;
    }
    public java.util.List<FolderItem> getSubFolderList() {
        return this.subFolderList;
    }

    public FolderItem setSyncParsingStatus(Integer syncParsingStatus) {
        this.syncParsingStatus = syncParsingStatus;
        return this;
    }
    public Integer getSyncParsingStatus() {
        return this.syncParsingStatus;
    }

    public FolderItem setSyncStatus(Integer syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }
    public Integer getSyncStatus() {
        return this.syncStatus;
    }

    public FolderItem setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
