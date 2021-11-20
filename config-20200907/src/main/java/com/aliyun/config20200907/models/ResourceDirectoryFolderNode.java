// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ResourceDirectoryFolderNode extends TeaModel {
    // accountId
    @NameInMap("AccountId")
    public String accountId;

    // children
    @NameInMap("Children")
    public java.util.List<ResourceDirectoryFolderNode> children;

    // displayName
    @NameInMap("DisplayName")
    public String displayName;

    // folderId
    @NameInMap("FolderId")
    public String folderId;

    // folderName
    @NameInMap("FolderName")
    public String folderName;

    // parentFolderId
    @NameInMap("ParentFolderId")
    public String parentFolderId;

    public static ResourceDirectoryFolderNode build(java.util.Map<String, ?> map) throws Exception {
        ResourceDirectoryFolderNode self = new ResourceDirectoryFolderNode();
        return TeaModel.build(map, self);
    }

    public ResourceDirectoryFolderNode setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ResourceDirectoryFolderNode setChildren(java.util.List<ResourceDirectoryFolderNode> children) {
        this.children = children;
        return this;
    }
    public java.util.List<ResourceDirectoryFolderNode> getChildren() {
        return this.children;
    }

    public ResourceDirectoryFolderNode setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ResourceDirectoryFolderNode setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public ResourceDirectoryFolderNode setFolderName(String folderName) {
        this.folderName = folderName;
        return this;
    }
    public String getFolderName() {
        return this.folderName;
    }

    public ResourceDirectoryFolderNode setParentFolderId(String parentFolderId) {
        this.parentFolderId = parentFolderId;
        return this;
    }
    public String getParentFolderId() {
        return this.parentFolderId;
    }

}
