// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class RdAccountFolderDTO extends TeaModel {
    @NameInMap("AccountCount")
    public Integer accountCount;

    @NameInMap("AccountList")
    public java.util.List<RdAccountDTO> accountList;

    @NameInMap("FolderId")
    public String folderId;

    @NameInMap("FolderList")
    public java.util.List<RdAccountFolderDTO> folderList;

    @NameInMap("FolderName")
    public String folderName;

    @NameInMap("ResourceDirectoryId")
    public String resourceDirectoryId;

    @NameInMap("ResourceDirectoryPath")
    public String resourceDirectoryPath;

    @NameInMap("ResourceDirectoryPathName")
    public String resourceDirectoryPathName;

    @NameInMap("SelectedCount")
    public Integer selectedCount;

    public static RdAccountFolderDTO build(java.util.Map<String, ?> map) throws Exception {
        RdAccountFolderDTO self = new RdAccountFolderDTO();
        return TeaModel.build(map, self);
    }

    public RdAccountFolderDTO setAccountCount(Integer accountCount) {
        this.accountCount = accountCount;
        return this;
    }
    public Integer getAccountCount() {
        return this.accountCount;
    }

    public RdAccountFolderDTO setAccountList(java.util.List<RdAccountDTO> accountList) {
        this.accountList = accountList;
        return this;
    }
    public java.util.List<RdAccountDTO> getAccountList() {
        return this.accountList;
    }

    public RdAccountFolderDTO setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public RdAccountFolderDTO setFolderList(java.util.List<RdAccountFolderDTO> folderList) {
        this.folderList = folderList;
        return this;
    }
    public java.util.List<RdAccountFolderDTO> getFolderList() {
        return this.folderList;
    }

    public RdAccountFolderDTO setFolderName(String folderName) {
        this.folderName = folderName;
        return this;
    }
    public String getFolderName() {
        return this.folderName;
    }

    public RdAccountFolderDTO setResourceDirectoryId(String resourceDirectoryId) {
        this.resourceDirectoryId = resourceDirectoryId;
        return this;
    }
    public String getResourceDirectoryId() {
        return this.resourceDirectoryId;
    }

    public RdAccountFolderDTO setResourceDirectoryPath(String resourceDirectoryPath) {
        this.resourceDirectoryPath = resourceDirectoryPath;
        return this;
    }
    public String getResourceDirectoryPath() {
        return this.resourceDirectoryPath;
    }

    public RdAccountFolderDTO setResourceDirectoryPathName(String resourceDirectoryPathName) {
        this.resourceDirectoryPathName = resourceDirectoryPathName;
        return this;
    }
    public String getResourceDirectoryPathName() {
        return this.resourceDirectoryPathName;
    }

    public RdAccountFolderDTO setSelectedCount(Integer selectedCount) {
        this.selectedCount = selectedCount;
        return this;
    }
    public Integer getSelectedCount() {
        return this.selectedCount;
    }

}
