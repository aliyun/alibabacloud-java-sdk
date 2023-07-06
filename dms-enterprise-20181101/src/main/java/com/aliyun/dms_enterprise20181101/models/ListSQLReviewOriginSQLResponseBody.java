// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSQLReviewOriginSQLResponseBody extends TeaModel {
    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The information about the parsed SQL statements.</p>
     */
    @NameInMap("OriginSQLList")
    public java.util.List<ListSQLReviewOriginSQLResponseBodyOriginSQLList> originSQLList;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of the SQL statements.</p>
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
         * <p>The review status of the SQL statement. Valid values:</p>
         * <br>
         * <p>*   **new**: The SQL statement is pending for analysis.</p>
         * <p>*   **unknown**: The SQL statement failed to be parsed.</p>
         * <p>*   **check_not_pass**: The SQL statement failed the review.</p>
         * <p>*   **check_pass**: The SQL statement passed the review.</p>
         * <p>*   **force_pass**: The SQL statement passed the review by manual effort.</p>
         * <p>*   **force_not_pass**: The SQL statement failed the review by manual effort.</p>
         */
        @NameInMap("CheckStatus")
        public String checkStatus;

        /**
         * <p>The time when the SQL statement is reviewed.</p>
         */
        @NameInMap("CheckedTime")
        public String checkedTime;

        /**
         * <p>The ID of the file.</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>The name of the file.</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The statistics of optimization suggestions for SQL statements. The value is a JSON string. The following optimization suggestions are involved:</p>
         * <br>
         * <p>*   **MUST_IMPROVE**: The SQL statement must be improved.</p>
         * <p>*   **POTENTIAL_ISSUE**: The SQL statement contains potential issues.</p>
         * <p>*   **SUGGEST_IMPROVE**: We recommend that you improve the SQL statement.</p>
         * <p>*   **USEDMSTOOLKIT**: We recommend that you change schemas without locking tables.</p>
         * <p>*   **USEDMSDML_UNLOCK**: We recommend that you change data without locking tables.</p>
         * <p>*   **TABLEINDEXSUGGEST**: We recommend that you use SQL statements that use indexes.</p>
         */
        @NameInMap("ReviewSummary")
        public String reviewSummary;

        /**
         * <p>The SQL statement.</p>
         */
        @NameInMap("SQLContent")
        public String SQLContent;

        /**
         * <p>The ID of the SQL statement.</p>
         */
        @NameInMap("SQLId")
        public Long SQLId;

        /**
         * <p>SQLName.</p>
         */
        @NameInMap("SQLName")
        public String SQLName;

        /**
         * <p>The key that is used to query the details of optimization suggestions. You can call the [GetSQLReviewOptimizeDetail](https://icms.alibaba-inc.com/content/dms/doc?l=1\&m=61777\&n=2712723\&spm) operation to query the details of optimization suggestions based on the key.</p>
         */
        @NameInMap("SQLReviewQueryKey")
        public String SQLReviewQueryKey;

        /**
         * <p>The MD5 hash value of the SQL statement.</p>
         */
        @NameInMap("SqlHash")
        public String sqlHash;

        /**
         * <p>The description of the review status.</p>
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
