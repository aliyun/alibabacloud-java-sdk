// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDataCorrectPreCheckSQLResponseBody extends TeaModel {
    // The error code returned.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The error message returned.
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // The precheck information about SQL statements.
    @NameInMap("PreCheckSQLList")
    public java.util.List<ListDataCorrectPreCheckSQLResponseBodyPreCheckSQLList> preCheckSQLList;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request is successful. Valid values:
    // 
    // *   **true**: The request is successful.
    // *   **false**: The request fails.
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
        // The estimated number of affected rows.
        @NameInMap("AffectRows")
        public Long affectRows;

        // The SQL statement.
        @NameInMap("CheckSQL")
        public String checkSQL;

        // The ID of the database.
        @NameInMap("DbId")
        public Long dbId;

        // The key that is used to query the details of optimization suggestions. You can call the [GetSQLReviewOptimizeDetail](~~265977~~) operation to query the details of optimization suggestions based on the key.
        @NameInMap("SQLReviewQueryKey")
        public String SQLReviewQueryKey;

        // The review status of the SQL statement. Valid values:
        // 
        // *   **WAITING**: The SQL statement is pending for review.
        // *   **RUNNING**: The SQL statement is being reviewed.
        // *   **IGNORE**: The SQL statement review is skipped.
        // *   **PASS**: The SQL statement passed the review.
        // *   **BLOCK**: The SQL statement failed the review.
        @NameInMap("SqlReviewStatus")
        public String sqlReviewStatus;

        // The type of the SQL statement, such as DELETE, UPDATE, or ALTER_TABLE.
        @NameInMap("SqlType")
        public String sqlType;

        // The name of the table whose data is changed.
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
