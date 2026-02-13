// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class ChatFolderItem extends TeaModel {
    /**
     * <p>Folder ID.</p>
     * 
     * <strong>example:</strong>
     * <p>aaa</p>
     */
    @NameInMap("folderId")
    public String folderId;

    /**
     * <p>Folder name.</p>
     * 
     * <strong>example:</strong>
     * <p>default folder</p>
     */
    @NameInMap("folderName")
    public String folderName;

    /**
     * <p>Subfolder list.</p>
     */
    @NameInMap("subFolders")
    public java.util.List<ChatItem> subFolders;

    public static ChatFolderItem build(java.util.Map<String, ?> map) throws Exception {
        ChatFolderItem self = new ChatFolderItem();
        return TeaModel.build(map, self);
    }

    public ChatFolderItem setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public ChatFolderItem setFolderName(String folderName) {
        this.folderName = folderName;
        return this;
    }
    public String getFolderName() {
        return this.folderName;
    }

    public ChatFolderItem setSubFolders(java.util.List<ChatItem> subFolders) {
        this.subFolders = subFolders;
        return this;
    }
    public java.util.List<ChatItem> getSubFolders() {
        return this.subFolders;
    }

}
