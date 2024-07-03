// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetDasSQLLogHotDataResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetDasSQLLogHotDataResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <blockquote>
     * <p>If the request was successful, <strong>Successful</strong> is returned. If the request failed, an error message such as an error code is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0A74B755-98B7-59DB-8724-1321B394****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static GetDasSQLLogHotDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDasSQLLogHotDataResponseBody self = new GetDasSQLLogHotDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDasSQLLogHotDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDasSQLLogHotDataResponseBody setData(GetDasSQLLogHotDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDasSQLLogHotDataResponseBodyData getData() {
        return this.data;
    }

    public GetDasSQLLogHotDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDasSQLLogHotDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDasSQLLogHotDataResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetDasSQLLogHotDataResponseBodyDataList extends TeaModel {
        /**
         * <p>The account of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>testuser</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>testDB</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <p>The execution time. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-23 T12:11:20Z</p>
         */
        @NameInMap("ExecuteTime")
        public String executeTime;

        /**
         * <p>The extended information. This parameter is a reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Ext")
        public String ext;

        /**
         * <p>The IP address of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>47.100.XX.XX</p>
         */
        @NameInMap("HostAddress")
        public String hostAddress;

        /**
         * <p>The execution duration. Unit: microseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("Latancy")
        public Long latancy;

        /**
         * <p>The lock wait duration. Unit: microseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LockTime")
        public Long lockTime;

        /**
         * <p>The number of logical reads.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("LogicRead")
        public Long logicRead;

        /**
         * <p>The execution time. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-23 T12:11:20.999Z</p>
         */
        @NameInMap("OriginTime")
        public String originTime;

        /**
         * <p>The number of physical asynchronous reads.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PhysicAsyncRead")
        public Long physicAsyncRead;

        /**
         * <p>The number of physical synchronous reads.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PhysicSyncRead")
        public Long physicSyncRead;

        /**
         * <p>The number of rows returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReturnRows")
        public Long returnRows;

        /**
         * <p>The content of the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>select 1</p>
         */
        @NameInMap("SQLText")
        public String SQLText;

        /**
         * <p>The number of rows scanned by the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>29</p>
         */
        @NameInMap("ScanRows")
        public Long scanRows;

        /**
         * <p>The type of the SQL statement. Valid values:</p>
         * <ul>
         * <li><strong>SELECT</strong></li>
         * <li><strong>UPDATE</strong></li>
         * <li><strong>DELETE</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SELECT</p>
         */
        @NameInMap("SqlType")
        public String sqlType;

        /**
         * <p>The execution result. If a <strong>0</strong> is returned, the SQL statement was successfully executed. If an error code is returned, the SQL statement failed to be executed.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The thread ID.</p>
         * 
         * <strong>example:</strong>
         * <p>657</p>
         */
        @NameInMap("ThreadID")
        public Long threadID;

        /**
         * <p>The transaction ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TransactionId")
        public String transactionId;

        /**
         * <p>The number of updated rows.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("UpdateRows")
        public Long updateRows;

        public static GetDasSQLLogHotDataResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetDasSQLLogHotDataResponseBodyDataList self = new GetDasSQLLogHotDataResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetDasSQLLogHotDataResponseBodyDataList setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public GetDasSQLLogHotDataResponseBodyDataList setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public GetDasSQLLogHotDataResponseBodyDataList setExecuteTime(String executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public String getExecuteTime() {
            return this.executeTime;
        }

        public GetDasSQLLogHotDataResponseBodyDataList setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public GetDasSQLLogHotDataResponseBodyDataList setHostAddress(String hostAddress) {
            this.hostAddress = hostAddress;
            return this;
        }
        public String getHostAddress() {
            return this.hostAddress;
        }

        public GetDasSQLLogHotDataResponseBodyDataList setLatancy(Long latancy) {
            this.latancy = latancy;
            return this;
        }
        public Long getLatancy() {
            return this.latancy;
        }

        public GetDasSQLLogHotDataResponseBodyDataList setLockTime(Long lockTime) {
            this.lockTime = lockTime;
            return this;
        }
        public Long getLockTime() {
            return this.lockTime;
        }

        public GetDasSQLLogHotDataResponseBodyDataList setLogicRead(Long logicRead) {
            this.logicRead = logicRead;
            return this;
        }
        public Long getLogicRead() {
            return this.logicRead;
        }

        public GetDasSQLLogHotDataResponseBodyDataList setOriginTime(String originTime) {
            this.originTime = originTime;
            return this;
        }
        public String getOriginTime() {
            return this.originTime;
        }

        public GetDasSQLLogHotDataResponseBodyDataList setPhysicAsyncRead(Long physicAsyncRead) {
            this.physicAsyncRead = physicAsyncRead;
            return this;
        }
        public Long getPhysicAsyncRead() {
            return this.physicAsyncRead;
        }

        public GetDasSQLLogHotDataResponseBodyDataList setPhysicSyncRead(Long physicSyncRead) {
            this.physicSyncRead = physicSyncRead;
            return this;
        }
        public Long getPhysicSyncRead() {
            return this.physicSyncRead;
        }

        public GetDasSQLLogHotDataResponseBodyDataList setReturnRows(Long returnRows) {
            this.returnRows = returnRows;
            return this;
        }
        public Long getReturnRows() {
            return this.returnRows;
        }

        public GetDasSQLLogHotDataResponseBodyDataList setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public GetDasSQLLogHotDataResponseBodyDataList setScanRows(Long scanRows) {
            this.scanRows = scanRows;
            return this;
        }
        public Long getScanRows() {
            return this.scanRows;
        }

        public GetDasSQLLogHotDataResponseBodyDataList setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

        public GetDasSQLLogHotDataResponseBodyDataList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetDasSQLLogHotDataResponseBodyDataList setThreadID(Long threadID) {
            this.threadID = threadID;
            return this;
        }
        public Long getThreadID() {
            return this.threadID;
        }

        public GetDasSQLLogHotDataResponseBodyDataList setTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }
        public String getTransactionId() {
            return this.transactionId;
        }

        public GetDasSQLLogHotDataResponseBodyDataList setUpdateRows(Long updateRows) {
            this.updateRows = updateRows;
            return this;
        }
        public Long getUpdateRows() {
            return this.updateRows;
        }

    }

    public static class GetDasSQLLogHotDataResponseBodyData extends TeaModel {
        /**
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Extra")
        public Object extra;

        /**
         * <p>The details of the data returned.</p>
         */
        @NameInMap("List")
        public java.util.List<GetDasSQLLogHotDataResponseBodyDataList> list;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PageNo")
        public Long pageNo;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetDasSQLLogHotDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDasSQLLogHotDataResponseBodyData self = new GetDasSQLLogHotDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDasSQLLogHotDataResponseBodyData setExtra(Object extra) {
            this.extra = extra;
            return this;
        }
        public Object getExtra() {
            return this.extra;
        }

        public GetDasSQLLogHotDataResponseBodyData setList(java.util.List<GetDasSQLLogHotDataResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetDasSQLLogHotDataResponseBodyDataList> getList() {
            return this.list;
        }

        public GetDasSQLLogHotDataResponseBodyData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public GetDasSQLLogHotDataResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetDasSQLLogHotDataResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
