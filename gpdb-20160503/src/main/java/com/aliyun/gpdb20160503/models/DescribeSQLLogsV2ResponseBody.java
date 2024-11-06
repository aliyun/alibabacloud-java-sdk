// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSQLLogsV2ResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>account name invalid</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The queried SQL execution logs.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeSQLLogsV2ResponseBodyItems> items;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A7941C94-B92F-46A0-BD3E-2D**********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSQLLogsV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogsV2ResponseBody self = new DescribeSQLLogsV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogsV2ResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeSQLLogsV2ResponseBody setItems(java.util.List<DescribeSQLLogsV2ResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeSQLLogsV2ResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeSQLLogsV2ResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSQLLogsV2ResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeSQLLogsV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSQLLogsV2ResponseBodyItems extends TeaModel {
        /**
         * <p>The database account that executes the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>testadmin</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>adbpgadmin</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <p>The role of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("DBRole")
        public String DBRole;

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>User not authorized to operate on the specified resource.</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>The execution duration of the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ExecuteCost")
        public Float executeCost;

        /**
         * <p>The execution status of the SQL statement. Valid values:</p>
         * <ul>
         * <li><strong>success</strong></li>
         * <li><strong>fail</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("ExecuteState")
        public String executeState;

        /**
         * <p>The type of the query language.</p>
         * 
         * <strong>example:</strong>
         * <p>DQL</p>
         */
        @NameInMap("OperationClass")
        public String operationClass;

        /**
         * <p>The time when the SQL statement was executed.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-15T17:02:32Z</p>
         */
        @NameInMap("OperationExecuteTime")
        public String operationExecuteTime;

        /**
         * <p>The type of the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT</p>
         */
        @NameInMap("OperationType")
        public String operationType;

        /**
         * <p>The query ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2548026401648157601713924318883</p>
         */
        @NameInMap("QueryId")
        public String queryId;

        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReturnRowCounts")
        public Long returnRowCounts;

        /**
         * <p>The SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>select 1</p>
         */
        @NameInMap("SQLText")
        public String SQLText;

        /**
         * <p>The number of entries scanned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScanRowCounts")
        public Long scanRowCounts;

        /**
         * <p>The ID of the session.</p>
         * 
         * <strong>example:</strong>
         * <p>efc33bd7-f1dc-4b24-b4fb-ab0d5329b7bb</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <p>The source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>100.<strong>.</strong>.90</p>
         */
        @NameInMap("SourceIP")
        public String sourceIP;

        /**
         * <p>The number of the source port.</p>
         * 
         * <strong>example:</strong>
         * <p>50514</p>
         */
        @NameInMap("SourcePort")
        public Integer sourcePort;

        public static DescribeSQLLogsV2ResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogsV2ResponseBodyItems self = new DescribeSQLLogsV2ResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogsV2ResponseBodyItems setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeSQLLogsV2ResponseBodyItems setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeSQLLogsV2ResponseBodyItems setDBRole(String DBRole) {
            this.DBRole = DBRole;
            return this;
        }
        public String getDBRole() {
            return this.DBRole;
        }

        public DescribeSQLLogsV2ResponseBodyItems setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeSQLLogsV2ResponseBodyItems setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public DescribeSQLLogsV2ResponseBodyItems setExecuteCost(Float executeCost) {
            this.executeCost = executeCost;
            return this;
        }
        public Float getExecuteCost() {
            return this.executeCost;
        }

        public DescribeSQLLogsV2ResponseBodyItems setExecuteState(String executeState) {
            this.executeState = executeState;
            return this;
        }
        public String getExecuteState() {
            return this.executeState;
        }

        public DescribeSQLLogsV2ResponseBodyItems setOperationClass(String operationClass) {
            this.operationClass = operationClass;
            return this;
        }
        public String getOperationClass() {
            return this.operationClass;
        }

        public DescribeSQLLogsV2ResponseBodyItems setOperationExecuteTime(String operationExecuteTime) {
            this.operationExecuteTime = operationExecuteTime;
            return this;
        }
        public String getOperationExecuteTime() {
            return this.operationExecuteTime;
        }

        public DescribeSQLLogsV2ResponseBodyItems setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public DescribeSQLLogsV2ResponseBodyItems setQueryId(String queryId) {
            this.queryId = queryId;
            return this;
        }
        public String getQueryId() {
            return this.queryId;
        }

        public DescribeSQLLogsV2ResponseBodyItems setReturnRowCounts(Long returnRowCounts) {
            this.returnRowCounts = returnRowCounts;
            return this;
        }
        public Long getReturnRowCounts() {
            return this.returnRowCounts;
        }

        public DescribeSQLLogsV2ResponseBodyItems setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeSQLLogsV2ResponseBodyItems setScanRowCounts(Long scanRowCounts) {
            this.scanRowCounts = scanRowCounts;
            return this;
        }
        public Long getScanRowCounts() {
            return this.scanRowCounts;
        }

        public DescribeSQLLogsV2ResponseBodyItems setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public DescribeSQLLogsV2ResponseBodyItems setSourceIP(String sourceIP) {
            this.sourceIP = sourceIP;
            return this;
        }
        public String getSourceIP() {
            return this.sourceIP;
        }

        public DescribeSQLLogsV2ResponseBodyItems setSourcePort(Integer sourcePort) {
            this.sourcePort = sourcePort;
            return this;
        }
        public Integer getSourcePort() {
            return this.sourcePort;
        }

    }

}
