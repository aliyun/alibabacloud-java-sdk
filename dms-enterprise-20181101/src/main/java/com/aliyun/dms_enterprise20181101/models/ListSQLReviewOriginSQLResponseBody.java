// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSQLReviewOriginSQLResponseBody extends TeaModel {
    /**
     * <p>The MD5 hash value of the SQL statement.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The description of the review status.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The parameters that are used to filter SQL statements involved in the ticket.</p>
     */
    @NameInMap("OriginSQLList")
    public java.util.List<ListSQLReviewOriginSQLResponseBodyOriginSQLList> originSQLList;

    /**
     * <p>The name of the file.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the SQL statement.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListSQLReviewOriginSQLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSQLReviewOriginSQLResponseBody self = new ListSQLReviewOriginSQLResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSQLReviewOriginSQLResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListSQLReviewOriginSQLResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListSQLReviewOriginSQLResponseBody setOriginSQLList(java.util.List<ListSQLReviewOriginSQLResponseBodyOriginSQLList> originSQLList) {
        this.originSQLList = originSQLList;
        return this;
    }
    public java.util.List<ListSQLReviewOriginSQLResponseBodyOriginSQLList> getOriginSQLList() {
        return this.originSQLList;
    }

    public ListSQLReviewOriginSQLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSQLReviewOriginSQLResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListSQLReviewOriginSQLResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListSQLReviewOriginSQLResponseBodyOriginSQLList extends TeaModel {
        /**
         * <p>The ID of the file.</p>
         */
        @NameInMap("CheckStatus")
        public String checkStatus;

        /**
         * <p>Queries the details of the SQL statements that are involved in an SQL review ticket.</p>
         */
        @NameInMap("CheckedTime")
        public String checkedTime;

        /**
         * <p>The key that is used to query the details of optimization suggestions. You can call the [GetSQLReviewOptimizeDetail](https://icms.alibaba-inc.com/content/dms/doc?l=1\&m=61777\&n=2712723\&spm) operation to query the details of optimization suggestions based on the key.</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>The SQL statement.</p>
         */
        @NameInMap("FileName")
        public String fileName;

        @NameInMap("ReviewSummary")
        public String reviewSummary;

        /**
         * <p>The error message returned.</p>
         */
        @NameInMap("SQLContent")
        public String SQLContent;

        /**
         * <p>The time when the SQL statement is reviewed.</p>
         */
        @NameInMap("SQLId")
        public Long SQLId;

        @NameInMap("SQLName")
        public String SQLName;

        @NameInMap("SQLReviewQueryKey")
        public String SQLReviewQueryKey;

        @NameInMap("SqlHash")
        public String sqlHash;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("StatusDesc")
        public String statusDesc;

        public static ListSQLReviewOriginSQLResponseBodyOriginSQLList build(java.util.Map<String, ?> map) throws Exception {
            ListSQLReviewOriginSQLResponseBodyOriginSQLList self = new ListSQLReviewOriginSQLResponseBodyOriginSQLList();
            return TeaModel.build(map, self);
        }

        public ListSQLReviewOriginSQLResponseBodyOriginSQLList setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public ListSQLReviewOriginSQLResponseBodyOriginSQLList setCheckedTime(String checkedTime) {
            this.checkedTime = checkedTime;
            return this;
        }
        public String getCheckedTime() {
            return this.checkedTime;
        }

        public ListSQLReviewOriginSQLResponseBodyOriginSQLList setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public ListSQLReviewOriginSQLResponseBodyOriginSQLList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListSQLReviewOriginSQLResponseBodyOriginSQLList setReviewSummary(String reviewSummary) {
            this.reviewSummary = reviewSummary;
            return this;
        }
        public String getReviewSummary() {
            return this.reviewSummary;
        }

        public ListSQLReviewOriginSQLResponseBodyOriginSQLList setSQLContent(String SQLContent) {
            this.SQLContent = SQLContent;
            return this;
        }
        public String getSQLContent() {
            return this.SQLContent;
        }

        public ListSQLReviewOriginSQLResponseBodyOriginSQLList setSQLId(Long SQLId) {
            this.SQLId = SQLId;
            return this;
        }
        public Long getSQLId() {
            return this.SQLId;
        }

        public ListSQLReviewOriginSQLResponseBodyOriginSQLList setSQLName(String SQLName) {
            this.SQLName = SQLName;
            return this;
        }
        public String getSQLName() {
            return this.SQLName;
        }

        public ListSQLReviewOriginSQLResponseBodyOriginSQLList setSQLReviewQueryKey(String SQLReviewQueryKey) {
            this.SQLReviewQueryKey = SQLReviewQueryKey;
            return this;
        }
        public String getSQLReviewQueryKey() {
            return this.SQLReviewQueryKey;
        }

        public ListSQLReviewOriginSQLResponseBodyOriginSQLList setSqlHash(String sqlHash) {
            this.sqlHash = sqlHash;
            return this;
        }
        public String getSqlHash() {
            return this.sqlHash;
        }

        public ListSQLReviewOriginSQLResponseBodyOriginSQLList setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

    }

}
