// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDataCorrectPreCheckSQLResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("PreCheckSQLList")
    public java.util.List<ListDataCorrectPreCheckSQLResponseBodyPreCheckSQLList> preCheckSQLList;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AffectRows")
        public Long affectRows;

        @NameInMap("CheckSQL")
        public String checkSQL;

        @NameInMap("DbId")
        public Long dbId;

        @NameInMap("SQLReviewQueryKey")
        public String SQLReviewQueryKey;

        @NameInMap("SqlReviewStatus")
        public String sqlReviewStatus;

        @NameInMap("SqlType")
        public String sqlType;

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

    }

}
