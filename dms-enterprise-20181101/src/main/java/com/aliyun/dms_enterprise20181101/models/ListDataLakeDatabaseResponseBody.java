// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDataLakeDatabaseResponseBody extends TeaModel {
    @NameInMap("DatabaseList")
    public ListDataLakeDatabaseResponseBodyDatabaseList databaseList;

    /**
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>4E1D2B4D-3E53-4ABC-999D-1D2520B3471A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDataLakeDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataLakeDatabaseResponseBody self = new ListDataLakeDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataLakeDatabaseResponseBody setDatabaseList(ListDataLakeDatabaseResponseBodyDatabaseList databaseList) {
        this.databaseList = databaseList;
        return this;
    }
    public ListDataLakeDatabaseResponseBodyDatabaseList getDatabaseList() {
        return this.databaseList;
    }

    public ListDataLakeDatabaseResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDataLakeDatabaseResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDataLakeDatabaseResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDataLakeDatabaseResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDataLakeDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataLakeDatabaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDataLakeDatabaseResponseBodyDatabaseList extends TeaModel {
        @NameInMap("Database")
        public java.util.List<DLDatabase> database;

        public static ListDataLakeDatabaseResponseBodyDatabaseList build(java.util.Map<String, ?> map) throws Exception {
            ListDataLakeDatabaseResponseBodyDatabaseList self = new ListDataLakeDatabaseResponseBodyDatabaseList();
            return TeaModel.build(map, self);
        }

        public ListDataLakeDatabaseResponseBodyDatabaseList setDatabase(java.util.List<DLDatabase> database) {
            this.database = database;
            return this;
        }
        public java.util.List<DLDatabase> getDatabase() {
            return this.database;
        }

    }

}
