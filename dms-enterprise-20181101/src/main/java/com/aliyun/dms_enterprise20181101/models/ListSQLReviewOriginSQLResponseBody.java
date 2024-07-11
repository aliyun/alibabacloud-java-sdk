// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSQLReviewOriginSQLResponseBody extends TeaModel {
    /**
     * <p>The error code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
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
     * 
     * <strong>example:</strong>
     * <p>0C1CB646-1DE4-4AD0-B4A4-7D47DD52E931</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of the SQL statements.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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
         * <ul>
         * <li><strong>new</strong>: The SQL statement is pending for analysis.</li>
         * <li><strong>unknown</strong>: The SQL statement failed to be parsed.</li>
         * <li><strong>check_not_pass</strong>: The SQL statement failed the review.</li>
         * <li><strong>check_pass</strong>: The SQL statement passed the review.</li>
         * <li><strong>force_pass</strong>: The SQL statement passed the review by manual effort.</li>
         * <li><strong>force_not_pass</strong>: The SQL statement failed the review by manual effort.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>check_pass</p>
         */
        @NameInMap("CheckStatus")
        public String checkStatus;

        /**
         * <p>The time when the SQL statement is reviewed.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-09 21:07:00</p>
         */
        @NameInMap("CheckedTime")
        public String checkedTime;

        /**
         * <p>The ID of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>123321</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>The name of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>test.sql</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The statistics of optimization suggestions for SQL statements. The value is a JSON string. The following optimization suggestions are involved:</p>
         * <ul>
         * <li><strong>MUST_IMPROVE</strong>: The SQL statement must be improved.</li>
         * <li><strong>POTENTIAL_ISSUE</strong>: The SQL statement contains potential issues.</li>
         * <li><strong>SUGGEST_IMPROVE</strong>: We recommend that you improve the SQL statement.</li>
         * <li><strong>USEDMSTOOLKIT</strong>: We recommend that you change schemas without locking tables.</li>
         * <li><strong>USEDMSDML_UNLOCK</strong>: We recommend that you change data without locking tables.</li>
         * <li><strong>TABLEINDEXSUGGEST</strong>: We recommend that you use SQL statements that use indexes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;POTENTIAL_ISSUE&quot;:1,&quot;SUGGEST_IMPROVE&quot;:1}</p>
         */
        @NameInMap("ReviewSummary")
        public String reviewSummary;

        /**
         * <p>The SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>select id from table_name</p>
         */
        @NameInMap("SQLContent")
        public String SQLContent;

        /**
         * <p>The ID of the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("SQLId")
        public Long SQLId;

        /**
         * <p>SQLName.</p>
         * 
         * <strong>example:</strong>
         * <p>getByPk</p>
         */
        @NameInMap("SQLName")
        public String SQLName;

        /**
         * <p>The key that is used to query the details of optimization suggestions. You can call the <a href="https://icms.alibaba-inc.com/content/dms/doc?l=1%5C&m=61777%5C&n=2712723%5C&spm">GetSQLReviewOptimizeDetail</a> operation to query the details of optimization suggestions based on the key.</p>
         * 
         * <strong>example:</strong>
         * <p>a57e54ec5433475ea3082d882fdb89c5</p>
         */
        @NameInMap("SQLReviewQueryKey")
        public String SQLReviewQueryKey;

        /**
         * <p>The MD5 hash value of the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>95adb6e77a0884d9e50232cb8c5c969d</p>
         */
        @NameInMap("SqlHash")
        public String sqlHash;

        /**
         * <p>The description of the review status.</p>
         * 
         * <strong>example:</strong>
         * <p>passed the test</p>
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
