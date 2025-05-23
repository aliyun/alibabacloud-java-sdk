// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListFileVersionsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListFileVersionsResponseBodyData data;

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
     * <p>0000-ABCD-EFG****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListFileVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFileVersionsResponseBody self = new ListFileVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFileVersionsResponseBody setData(ListFileVersionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListFileVersionsResponseBodyData getData() {
        return this.data;
    }

    public ListFileVersionsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListFileVersionsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListFileVersionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListFileVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFileVersionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListFileVersionsResponseBodyDataFileVersions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>UPDATE</p>
         */
        @NameInMap("ChangeType")
        public String changeType;

        /**
         * <strong>example:</strong>
         * <p>Second version submission</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>1593881265000</p>
         */
        @NameInMap("CommitTime")
        public Long commitTime;

        /**
         * <strong>example:</strong>
         * <p>73842342****</p>
         */
        @NameInMap("CommitUser")
        public String commitUser;

        /**
         * <strong>example:</strong>
         * <p>SHOW TABLES;</p>
         */
        @NameInMap("FileContent")
        public String fileContent;

        /**
         * <strong>example:</strong>
         * <p>ods_user_info_d</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>{&quot;fileName&quot;:&quot;ods_user_info_d&quot;,&quot;fileType&quot;:10}</p>
         */
        @NameInMap("FilePropertyContent")
        public String filePropertyContent;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("FileVersion")
        public Integer fileVersion;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsCurrentProd")
        public Boolean isCurrentProd;

        /**
         * <strong>example:</strong>
         * <p>{&quot;cycleType&quot;:0,&quot;cronExpress&quot;:&quot;00 05 00 * * ?&quot;}</p>
         */
        @NameInMap("NodeContent")
        public String nodeContent;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <strong>example:</strong>
         * <p>COMMITTED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("UseType")
        public String useType;

        public static ListFileVersionsResponseBodyDataFileVersions build(java.util.Map<String, ?> map) throws Exception {
            ListFileVersionsResponseBodyDataFileVersions self = new ListFileVersionsResponseBodyDataFileVersions();
            return TeaModel.build(map, self);
        }

        public ListFileVersionsResponseBodyDataFileVersions setChangeType(String changeType) {
            this.changeType = changeType;
            return this;
        }
        public String getChangeType() {
            return this.changeType;
        }

        public ListFileVersionsResponseBodyDataFileVersions setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListFileVersionsResponseBodyDataFileVersions setCommitTime(Long commitTime) {
            this.commitTime = commitTime;
            return this;
        }
        public Long getCommitTime() {
            return this.commitTime;
        }

        public ListFileVersionsResponseBodyDataFileVersions setCommitUser(String commitUser) {
            this.commitUser = commitUser;
            return this;
        }
        public String getCommitUser() {
            return this.commitUser;
        }

        public ListFileVersionsResponseBodyDataFileVersions setFileContent(String fileContent) {
            this.fileContent = fileContent;
            return this;
        }
        public String getFileContent() {
            return this.fileContent;
        }

        public ListFileVersionsResponseBodyDataFileVersions setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListFileVersionsResponseBodyDataFileVersions setFilePropertyContent(String filePropertyContent) {
            this.filePropertyContent = filePropertyContent;
            return this;
        }
        public String getFilePropertyContent() {
            return this.filePropertyContent;
        }

        public ListFileVersionsResponseBodyDataFileVersions setFileVersion(Integer fileVersion) {
            this.fileVersion = fileVersion;
            return this;
        }
        public Integer getFileVersion() {
            return this.fileVersion;
        }

        public ListFileVersionsResponseBodyDataFileVersions setIsCurrentProd(Boolean isCurrentProd) {
            this.isCurrentProd = isCurrentProd;
            return this;
        }
        public Boolean getIsCurrentProd() {
            return this.isCurrentProd;
        }

        public ListFileVersionsResponseBodyDataFileVersions setNodeContent(String nodeContent) {
            this.nodeContent = nodeContent;
            return this;
        }
        public String getNodeContent() {
            return this.nodeContent;
        }

        public ListFileVersionsResponseBodyDataFileVersions setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public ListFileVersionsResponseBodyDataFileVersions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListFileVersionsResponseBodyDataFileVersions setUseType(String useType) {
            this.useType = useType;
            return this;
        }
        public String getUseType() {
            return this.useType;
        }

    }

    public static class ListFileVersionsResponseBodyData extends TeaModel {
        @NameInMap("FileVersions")
        public java.util.List<ListFileVersionsResponseBodyDataFileVersions> fileVersions;

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

        public static ListFileVersionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFileVersionsResponseBodyData self = new ListFileVersionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFileVersionsResponseBodyData setFileVersions(java.util.List<ListFileVersionsResponseBodyDataFileVersions> fileVersions) {
            this.fileVersions = fileVersions;
            return this;
        }
        public java.util.List<ListFileVersionsResponseBodyDataFileVersions> getFileVersions() {
            return this.fileVersions;
        }

        public ListFileVersionsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListFileVersionsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListFileVersionsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
