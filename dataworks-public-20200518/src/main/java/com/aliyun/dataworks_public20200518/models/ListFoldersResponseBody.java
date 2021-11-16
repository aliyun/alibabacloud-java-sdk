// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListFoldersResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListFoldersResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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

    public ListFoldersResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListFoldersResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListFoldersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListFoldersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFoldersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
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
