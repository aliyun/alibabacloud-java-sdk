// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListFoldersResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Data")
    @Validation(required = true)
    public ListFoldersResponseData data;

    public static ListFoldersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFoldersResponse self = new ListFoldersResponse();
        return TeaModel.build(map, self);
    }

    public ListFoldersResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFoldersResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListFoldersResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListFoldersResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListFoldersResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListFoldersResponse setData(ListFoldersResponseData data) {
        this.data = data;
        return this;
    }
    public ListFoldersResponseData getData() {
        return this.data;
    }

    public static class ListFoldersResponseDataFolders extends TeaModel {
        @NameInMap("FolderId")
        @Validation(required = true)
        public String folderId;

        @NameInMap("FolderPath")
        @Validation(required = true)
        public String folderPath;

        public static ListFoldersResponseDataFolders build(java.util.Map<String, ?> map) throws Exception {
            ListFoldersResponseDataFolders self = new ListFoldersResponseDataFolders();
            return TeaModel.build(map, self);
        }

        public ListFoldersResponseDataFolders setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public ListFoldersResponseDataFolders setFolderPath(String folderPath) {
            this.folderPath = folderPath;
            return this;
        }
        public String getFolderPath() {
            return this.folderPath;
        }

    }

    public static class ListFoldersResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("Folders")
        @Validation(required = true)
        public java.util.List<ListFoldersResponseDataFolders> folders;

        public static ListFoldersResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListFoldersResponseData self = new ListFoldersResponseData();
            return TeaModel.build(map, self);
        }

        public ListFoldersResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListFoldersResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListFoldersResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListFoldersResponseData setFolders(java.util.List<ListFoldersResponseDataFolders> folders) {
            this.folders = folders;
            return this;
        }
        public java.util.List<ListFoldersResponseDataFolders> getFolders() {
            return this.folders;
        }

    }

}
