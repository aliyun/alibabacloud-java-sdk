// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetFolderResponseBody extends TeaModel {
    @NameInMap("Folder")
    public GetFolderResponseBodyFolder folder;

    @NameInMap("RequestId")
    public String requestId;

    public static GetFolderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFolderResponseBody self = new GetFolderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFolderResponseBody setFolder(GetFolderResponseBodyFolder folder) {
        this.folder = folder;
        return this;
    }
    public GetFolderResponseBodyFolder getFolder() {
        return this.folder;
    }

    public GetFolderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetFolderResponseBodyFolder extends TeaModel {
        @NameInMap("FolderId")
        public Long folderId;

        @NameInMap("Path")
        public String path;

        public static GetFolderResponseBodyFolder build(java.util.Map<String, ?> map) throws Exception {
            GetFolderResponseBodyFolder self = new GetFolderResponseBodyFolder();
            return TeaModel.build(map, self);
        }

        public GetFolderResponseBodyFolder setFolderId(Long folderId) {
            this.folderId = folderId;
            return this;
        }
        public Long getFolderId() {
            return this.folderId;
        }

        public GetFolderResponseBodyFolder setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

}
