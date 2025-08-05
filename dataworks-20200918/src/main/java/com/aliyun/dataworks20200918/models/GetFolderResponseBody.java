// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetFolderResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetFolderResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetFolderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFolderResponseBody self = new GetFolderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFolderResponseBody setData(GetFolderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFolderResponseBodyData getData() {
        return this.data;
    }

    public GetFolderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetFolderResponseBodyData extends TeaModel {
        @NameInMap("FolderId")
        public String folderId;

        @NameInMap("FolderPath")
        public String folderPath;

        public static GetFolderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFolderResponseBodyData self = new GetFolderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFolderResponseBodyData setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public GetFolderResponseBodyData setFolderPath(String folderPath) {
            this.folderPath = folderPath;
            return this;
        }
        public String getFolderPath() {
            return this.folderPath;
        }

    }

}
