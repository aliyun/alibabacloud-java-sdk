// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ListChildFolderResponseBody extends TeaModel {
    @NameInMap("Folders")
    public ListChildFolderResponseBodyFolders folders;

    @NameInMap("RequestId")
    public String requestId;

    public static ListChildFolderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChildFolderResponseBody self = new ListChildFolderResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChildFolderResponseBody setFolders(ListChildFolderResponseBodyFolders folders) {
        this.folders = folders;
        return this;
    }
    public ListChildFolderResponseBodyFolders getFolders() {
        return this.folders;
    }

    public ListChildFolderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListChildFolderResponseBodyFoldersFolder extends TeaModel {
        @NameInMap("FolderId")
        public Long folderId;

        @NameInMap("Path")
        public String path;

        public static ListChildFolderResponseBodyFoldersFolder build(java.util.Map<String, ?> map) throws Exception {
            ListChildFolderResponseBodyFoldersFolder self = new ListChildFolderResponseBodyFoldersFolder();
            return TeaModel.build(map, self);
        }

        public ListChildFolderResponseBodyFoldersFolder setFolderId(Long folderId) {
            this.folderId = folderId;
            return this;
        }
        public Long getFolderId() {
            return this.folderId;
        }

        public ListChildFolderResponseBodyFoldersFolder setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class ListChildFolderResponseBodyFolders extends TeaModel {
        @NameInMap("Folder")
        public java.util.List<ListChildFolderResponseBodyFoldersFolder> folder;

        public static ListChildFolderResponseBodyFolders build(java.util.Map<String, ?> map) throws Exception {
            ListChildFolderResponseBodyFolders self = new ListChildFolderResponseBodyFolders();
            return TeaModel.build(map, self);
        }

        public ListChildFolderResponseBodyFolders setFolder(java.util.List<ListChildFolderResponseBodyFoldersFolder> folder) {
            this.folder = folder;
            return this;
        }
        public java.util.List<ListChildFolderResponseBodyFoldersFolder> getFolder() {
            return this.folder;
        }

    }

}
