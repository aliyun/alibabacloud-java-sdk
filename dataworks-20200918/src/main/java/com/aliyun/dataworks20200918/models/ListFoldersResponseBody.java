// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListFoldersResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListFoldersResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListFoldersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFoldersResponseBody self = new ListFoldersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFoldersResponseBody setData(ListFoldersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListFoldersResponseBodyData getData() {
        return this.data;
    }

    public ListFoldersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFoldersResponseBodyDataFolders extends TeaModel {
        @NameInMap("FolderId")
        public String folderId;

        @NameInMap("FolderPath")
        public String folderPath;

        public static ListFoldersResponseBodyDataFolders build(java.util.Map<String, ?> map) throws Exception {
            ListFoldersResponseBodyDataFolders self = new ListFoldersResponseBodyDataFolders();
            return TeaModel.build(map, self);
        }

        public ListFoldersResponseBodyDataFolders setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public ListFoldersResponseBodyDataFolders setFolderPath(String folderPath) {
            this.folderPath = folderPath;
            return this;
        }
        public String getFolderPath() {
            return this.folderPath;
        }

    }

    public static class ListFoldersResponseBodyData extends TeaModel {
        @NameInMap("Folders")
        public java.util.List<ListFoldersResponseBodyDataFolders> folders;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListFoldersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFoldersResponseBodyData self = new ListFoldersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFoldersResponseBodyData setFolders(java.util.List<ListFoldersResponseBodyDataFolders> folders) {
            this.folders = folders;
            return this;
        }
        public java.util.List<ListFoldersResponseBodyDataFolders> getFolders() {
            return this.folders;
        }

        public ListFoldersResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListFoldersResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListFoldersResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
