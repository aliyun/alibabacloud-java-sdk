// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDataCorrectPreCheckSQLResponseBody extends TeaModel {
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
     * <p>The precheck information about SQL statements.</p>
     */
    @NameInMap("PreCheckSQLList")
    public java.util.List<ListDataCorrectPreCheckSQLResponseBodyPreCheckSQLList> preCheckSQLList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>31853A2B-DC9D-5B39-8492-D2AC8BCF550E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request is successful.</li>
     * <li><strong>false</strong>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDataCorrectPreCheckSQLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataCorrectPreCheckSQLResponseBody self = new ListDataCorrectPreCheckSQLResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataCorrectPreCheckSQLResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDataCorrectPreCheckSQLResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDataCorrectPreCheckSQLResponseBody setPreCheckSQLList(java.util.List<ListDataCorrectPreCheckSQLResponseBodyPreCheckSQLList> preCheckSQLList) {
        this.preCheckSQLList = preCheckSQLList;
        return this;
    }
    public java.util.List<ListDataCorrectPreCheckSQLResponseBodyPreCheckSQLList> getPreCheckSQLList() {
        return this.preCheckSQLList;
    }

    public ListDataCorrectPreCheckSQLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataCorrectPreCheckSQLResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDataCorrectPreCheckSQLResponseBodyPreCheckSQLList extends TeaModel {
        /**
         * <p>The estimated number of affected rows.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AffectRows")
        public Long affectRows;

        /**
         * <p>The SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>OPTIMIZE TABLE <code>Text_TableNames</code></p>
         */
        @NameInMap("CheckSQL")
        public String checkSQL;

        /**
         * <p>The ID of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>1930****</p>
         */
        @NameInMap("DbId")
        public Long dbId;

        /**
         * <p>The key that is used to query the details of optimization suggestions. You can call the <a href="https://help.aliyun.com/document_detail/265977.html">GetSQLReviewOptimizeDetail</a> operation to query the details of optimization suggestions based on the key.</p>
         * 
         * <strong>example:</strong>
         * <p>b9e771fc6ec247dea6d06a32c777****</p>
         */
        @NameInMap("SQLReviewQueryKey")
        public String SQLReviewQueryKey;

        /**
         * <p>The review status of the SQL statement. Valid values:</p>
         * <ul>
         * <li><strong>WAITING</strong>: The SQL statement is pending for review.</li>
         * <li><strong>RUNNING</strong>: The SQL statement is being reviewed.</li>
         * <li><strong>IGNORE</strong>: The SQL statement review is skipped.</li>
         * <li><strong>PASS</strong>: The SQL statement passed the review.</li>
         * <li><strong>BLOCK</strong>: The SQL statement failed the review.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WAITING</p>
         */
        @NameInMap("SqlReviewStatus")
        public String sqlReviewStatus;

        /**
         * <p>The type of the SQL statement, such as DELETE, UPDATE, or ALTER_TABLE.</p>
         * 
         * <strong>example:</strong>
         * <p>OPTIMIZE</p>
         */
        @NameInMap("SqlType")
        public String sqlType;

        /**
         * <p>The name of the table whose data is changed.</p>
         * 
         * <strong>example:</strong>
         * <p>Text_TableNames</p>
         */
        @NameInMap("TableNames")
        public String tableNames;

        public static ListDataCorrectPreCheckSQLResponseBodyPreCheckSQLList build(java.util.Map<String, ?> map) throws Exception {
            ListDataCorrectPreCheckSQLResponseBodyPreCheckSQLList self = new ListDataCorrectPreCheckSQLResponseBodyPreCheckSQLList();
            return TeaModel.build(map, self);
        }

        public ListDataCorrectPreCheckSQLResponseBodyPreCheckSQLList setAffectRows(Long affectRows) {
            this.affectRows = affectRows;
            return this;
        }
        public Long getAffectRows() {
            return this.affectRows;
        }

        public ListDataCorrectPreCheckSQLResponseBodyPreCheckSQLList setCheckSQL(String checkSQL) {
            this.checkSQL = checkSQL;
            return this;
        }
        public String getCheckSQL() {
            return this.checkSQL;
        }

        public ListDataCorrectPreCheckSQLResponseBodyPreCheckSQLList setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public ListDataCorrectPreCheckSQLResponseBodyPreCheckSQLList setSQLReviewQueryKey(String SQLReviewQueryKey) {
            this.SQLReviewQueryKey = SQLReviewQueryKey;
            return this;
        }
        public String getSQLReviewQueryKey() {
            return this.SQLReviewQueryKey;
        }

        public ListDataCorrectPreCheckSQLResponseBodyPreCheckSQLList setSqlReviewStatus(String sqlReviewStatus) {
            this.sqlReviewStatus = sqlReviewStatus;
            return this;
        }
        public String getSqlReviewStatus() {
            return this.sqlReviewStatus;
        }

        public ListDataCorrectPreCheckSQLResponseBodyPreCheckSQLList setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

        public ListDataCorrectPreCheckSQLResponseBodyPreCheckSQLList setTableNames(String tableNames) {
            this.tableNames = tableNames;
            return this;
        }
        public String getTableNames() {
            return this.tableNames;
        }

    }

}
