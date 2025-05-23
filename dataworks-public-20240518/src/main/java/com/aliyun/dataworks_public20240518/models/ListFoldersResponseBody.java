// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListFoldersResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListFoldersResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Invalid.Tenant.ConnectionNotExists</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>The connection does not exist.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>0000-ABCD-****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>2735c2****</p>
         */
        @NameInMap("FolderId")
        public String folderId;

        /**
         * <strong>example:</strong>
         * <p>Business_process/my_first_business_process/MaxCompute/ods_layer</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>13</p>
         */
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
