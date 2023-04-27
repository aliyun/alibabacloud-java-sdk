// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDataCorrectPreCheckSQLResponseBody extends TeaModel {
    /**
     * <p>The SQL statement.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The ID of the data change ticket. You can call the [ListOrders](~~144643~~) operation to query the ID of the data change ticket.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the database. The database can be a physical database or a logical database.</p>
     * <br>
     * <p>*   To query the ID of a physical database, call the [ListDatabases](~~141873~~) or [SearchDatabase](~~141876~~) operation.</p>
     * <p>*   To query the ID of a logical database, call the [ListLogicDatabases](~~141874~~) or [SearchDatabase](~~141876~~) operation.</p>
     */
    @NameInMap("PreCheckSQLList")
    public java.util.List<ListDataCorrectPreCheckSQLResponseBodyPreCheckSQLList> preCheckSQLList;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the database.</p>
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
         * <p>The review status of the SQL statement. Valid values:</p>
         * <br>
         * <p>*   **WAITING**: The SQL statement is pending for review.</p>
         * <p>*   **RUNNING**: The SQL statement is being reviewed.</p>
         * <p>*   **IGNORE**: The SQL statement review is skipped.</p>
         * <p>*   **PASS**: The SQL statement passed the review.</p>
         * <p>*   **BLOCK**: The SQL statement failed the review.</p>
         */
        @NameInMap("AffectRows")
        public Long affectRows;

        /**
         * <p>The estimated number of affected rows.</p>
         */
        @NameInMap("CheckSQL")
        public String checkSQL;

        /**
         * <p>The name of the table whose data is changed.</p>
         */
        @NameInMap("DbId")
        public Long dbId;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("SQLReviewQueryKey")
        public String SQLReviewQueryKey;

        @NameInMap("SqlReviewStatus")
        public String sqlReviewStatus;

        @NameInMap("SqlType")
        public String sqlType;

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
