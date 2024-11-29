// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetDeadLockDetailListResponseBody extends TeaModel {
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
    public GetDeadLockDetailListResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <blockquote>
     * <p> If the request is successful, <strong>Successful</strong> is returned. Otherwise, an error message such as an error code is returned.</p>
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
     * <p>840F51F7-9C01-538D-94F6-AE712905****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
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

    public static GetDeadLockDetailListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeadLockDetailListResponseBody self = new GetDeadLockDetailListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeadLockDetailListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDeadLockDetailListResponseBody setData(GetDeadLockDetailListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDeadLockDetailListResponseBodyData getData() {
        return this.data;
    }

    public GetDeadLockDetailListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDeadLockDetailListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeadLockDetailListResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetDeadLockDetailListResponseBodyDataListBlockProcessList extends TeaModel {
        /**
         * <p>The name of the client that initiates the transaction in the session.</p>
         * 
         * <strong>example:</strong>
         * <p>Microsoft SQL Server Management Studio - Query</p>
         */
        @NameInMap("ClientApp")
        public String clientApp;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>school</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The hostname.</p>
         * 
         * <strong>example:</strong>
         * <p>sd74020124</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The time when the transaction was started. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1702301152000</p>
         */
        @NameInMap("LastTranStarted")
        public Long lastTranStarted;

        /**
         * <p>The mode of the lock. For more information, see <a href="https://help.aliyun.com/document_detail/2362804.html">Lock modes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>U</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <p>The size of the logs generated in the session. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>352</p>
         */
        @NameInMap("LogUsed")
        public Long logUsed;

        /**
         * <p>The logon name of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>sd74020124\\Administrator</p>
         */
        @NameInMap("LoginName")
        public String loginName;

        /**
         * <p>The locked object.</p>
         * 
         * <strong>example:</strong>
         * <p>school.dbo.test2</p>
         */
        @NameInMap("ObjectOwned")
        public String objectOwned;

        /**
         * <p>The object that the transaction requested to lock.</p>
         * 
         * <strong>example:</strong>
         * <p>school.dbo.test1</p>
         */
        @NameInMap("ObjectRequested")
        public String objectRequested;

        /**
         * <p>The lock mode held by the session. For more information, see <a href="https://help.aliyun.com/document_detail/2362804.html">Lock modes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>X</p>
         */
        @NameInMap("OwnMode")
        public String ownMode;

        /**
         * <p>The ID of the session in which the transaction is started.</p>
         * 
         * <strong>example:</strong>
         * <p>61</p>
         */
        @NameInMap("Spid")
        public Long spid;

        /**
         * <p>The SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>update test1 set col1 =9</p>
         */
        @NameInMap("SqlText")
        public String sqlText;

        /**
         * <p>The status of the transaction.</p>
         * 
         * <strong>example:</strong>
         * <p>suspended</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Indicates whether the session is the victim of the deadlock. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no.</li>
         * <li><strong>1</strong>: yes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Victim")
        public Long victim;

        /**
         * <p>The lock mode requested by the session. For more information, see <a href="https://help.aliyun.com/document_detail/2362804.html">Lock modes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>U</p>
         */
        @NameInMap("WaitMode")
        public String waitMode;

        /**
         * <p>The resources requested by the transaction.</p>
         * 
         * <strong>example:</strong>
         * <p>RID: 5:1:312:0</p>
         */
        @NameInMap("WaitResource")
        public String waitResource;

        /**
         * <p>The details of the resources requested by the transaction.</p>
         * 
         * <strong>example:</strong>
         * <p>RID:school:school.mdf:312:0</p>
         */
        @NameInMap("WaitResourceDescription")
        public String waitResourceDescription;

        public static GetDeadLockDetailListResponseBodyDataListBlockProcessList build(java.util.Map<String, ?> map) throws Exception {
            GetDeadLockDetailListResponseBodyDataListBlockProcessList self = new GetDeadLockDetailListResponseBodyDataListBlockProcessList();
            return TeaModel.build(map, self);
        }

        public GetDeadLockDetailListResponseBodyDataListBlockProcessList setClientApp(String clientApp) {
            this.clientApp = clientApp;
            return this;
        }
        public String getClientApp() {
            return this.clientApp;
        }

        public GetDeadLockDetailListResponseBodyDataListBlockProcessList setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public GetDeadLockDetailListResponseBodyDataListBlockProcessList setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public GetDeadLockDetailListResponseBodyDataListBlockProcessList setLastTranStarted(Long lastTranStarted) {
            this.lastTranStarted = lastTranStarted;
            return this;
        }
        public Long getLastTranStarted() {
            return this.lastTranStarted;
        }

        public GetDeadLockDetailListResponseBodyDataListBlockProcessList setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public GetDeadLockDetailListResponseBodyDataListBlockProcessList setLogUsed(Long logUsed) {
            this.logUsed = logUsed;
            return this;
        }
        public Long getLogUsed() {
            return this.logUsed;
        }

        public GetDeadLockDetailListResponseBodyDataListBlockProcessList setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public GetDeadLockDetailListResponseBodyDataListBlockProcessList setObjectOwned(String objectOwned) {
            this.objectOwned = objectOwned;
            return this;
        }
        public String getObjectOwned() {
            return this.objectOwned;
        }

        public GetDeadLockDetailListResponseBodyDataListBlockProcessList setObjectRequested(String objectRequested) {
            this.objectRequested = objectRequested;
            return this;
        }
        public String getObjectRequested() {
            return this.objectRequested;
        }

        public GetDeadLockDetailListResponseBodyDataListBlockProcessList setOwnMode(String ownMode) {
            this.ownMode = ownMode;
            return this;
        }
        public String getOwnMode() {
            return this.ownMode;
        }

        public GetDeadLockDetailListResponseBodyDataListBlockProcessList setSpid(Long spid) {
            this.spid = spid;
            return this;
        }
        public Long getSpid() {
            return this.spid;
        }

        public GetDeadLockDetailListResponseBodyDataListBlockProcessList setSqlText(String sqlText) {
            this.sqlText = sqlText;
            return this;
        }
        public String getSqlText() {
            return this.sqlText;
        }

        public GetDeadLockDetailListResponseBodyDataListBlockProcessList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDeadLockDetailListResponseBodyDataListBlockProcessList setVictim(Long victim) {
            this.victim = victim;
            return this;
        }
        public Long getVictim() {
            return this.victim;
        }

        public GetDeadLockDetailListResponseBodyDataListBlockProcessList setWaitMode(String waitMode) {
            this.waitMode = waitMode;
            return this;
        }
        public String getWaitMode() {
            return this.waitMode;
        }

        public GetDeadLockDetailListResponseBodyDataListBlockProcessList setWaitResource(String waitResource) {
            this.waitResource = waitResource;
            return this;
        }
        public String getWaitResource() {
            return this.waitResource;
        }

        public GetDeadLockDetailListResponseBodyDataListBlockProcessList setWaitResourceDescription(String waitResourceDescription) {
            this.waitResourceDescription = waitResourceDescription;
            return this;
        }
        public String getWaitResourceDescription() {
            return this.waitResourceDescription;
        }

    }

    public static class GetDeadLockDetailListResponseBodyDataList extends TeaModel {
        /**
         * <p>The time when the data was collected. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1702301170701</p>
         */
        @NameInMap("BatchId")
        public Long batchId;

        /**
         * <p>The blocking details of the instance. The details are information about the session that caused the lock.</p>
         */
        @NameInMap("BlockProcessList")
        public java.util.List<GetDeadLockDetailListResponseBodyDataListBlockProcessList> blockProcessList;

        /**
         * <p>The name of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>Microsoft SQL Server Management Studio - Query</p>
         */
        @NameInMap("ClientApp")
        public String clientApp;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>school</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The hostname.</p>
         * 
         * <strong>example:</strong>
         * <p>sd74020124</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The time when the transaction was started. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1702301141000</p>
         */
        @NameInMap("LastTranStarted")
        public Long lastTranStarted;

        /**
         * <p>The mode of the lock. For more information, see <a href="https://help.aliyun.com/document_detail/2362804.html">Lock modes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>U</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <p>The size of the logs generated in the session. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>352</p>
         */
        @NameInMap("LogUsed")
        public Long logUsed;

        /**
         * <p>The logon name of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>sd74020124\\Administrator</p>
         */
        @NameInMap("LoginName")
        public String loginName;

        /**
         * <p>The locked object.</p>
         * 
         * <strong>example:</strong>
         * <p>school.dbo.test1</p>
         */
        @NameInMap("ObjectOwned")
        public String objectOwned;

        /**
         * <p>The object that the transaction requested to lock.</p>
         * 
         * <strong>example:</strong>
         * <p>school.dbo.test2</p>
         */
        @NameInMap("ObjectRequested")
        public String objectRequested;

        /**
         * <p>The lock mode held by the session. For more information, see <a href="https://help.aliyun.com/document_detail/2362804.html">Lock modes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>X</p>
         */
        @NameInMap("OwnMode")
        public String ownMode;

        /**
         * <p>The ID of the session in which the transaction is started.</p>
         * 
         * <strong>example:</strong>
         * <p>56</p>
         */
        @NameInMap("Spid")
        public Long spid;

        /**
         * <p>The SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>update test2 set col1 =88</p>
         */
        @NameInMap("SqlText")
        public String sqlText;

        /**
         * <p>The status of the transaction.</p>
         * 
         * <strong>example:</strong>
         * <p>suspended</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Indicates whether the session is the victim of the deadlock. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no.</li>
         * <li><strong>1</strong>: yes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Victim")
        public Long victim;

        /**
         * <p>The lock mode requested by the session. For more information, see <a href="https://help.aliyun.com/document_detail/2362804.html">Lock modes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>U</p>
         */
        @NameInMap("WaitMode")
        public String waitMode;

        /**
         * <p>The resources requested by the transaction.</p>
         * 
         * <strong>example:</strong>
         * <p>RID: 5:1:376:0</p>
         */
        @NameInMap("WaitResource")
        public String waitResource;

        /**
         * <p>The details of the resources requested by the transaction.</p>
         * 
         * <strong>example:</strong>
         * <p>RID:school:school.mdf:376:0</p>
         */
        @NameInMap("WaitResourceDescription")
        public String waitResourceDescription;

        public static GetDeadLockDetailListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetDeadLockDetailListResponseBodyDataList self = new GetDeadLockDetailListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetDeadLockDetailListResponseBodyDataList setBatchId(Long batchId) {
            this.batchId = batchId;
            return this;
        }
        public Long getBatchId() {
            return this.batchId;
        }

        public GetDeadLockDetailListResponseBodyDataList setBlockProcessList(java.util.List<GetDeadLockDetailListResponseBodyDataListBlockProcessList> blockProcessList) {
            this.blockProcessList = blockProcessList;
            return this;
        }
        public java.util.List<GetDeadLockDetailListResponseBodyDataListBlockProcessList> getBlockProcessList() {
            return this.blockProcessList;
        }

        public GetDeadLockDetailListResponseBodyDataList setClientApp(String clientApp) {
            this.clientApp = clientApp;
            return this;
        }
        public String getClientApp() {
            return this.clientApp;
        }

        public GetDeadLockDetailListResponseBodyDataList setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public GetDeadLockDetailListResponseBodyDataList setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public GetDeadLockDetailListResponseBodyDataList setLastTranStarted(Long lastTranStarted) {
            this.lastTranStarted = lastTranStarted;
            return this;
        }
        public Long getLastTranStarted() {
            return this.lastTranStarted;
        }

        public GetDeadLockDetailListResponseBodyDataList setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public GetDeadLockDetailListResponseBodyDataList setLogUsed(Long logUsed) {
            this.logUsed = logUsed;
            return this;
        }
        public Long getLogUsed() {
            return this.logUsed;
        }

        public GetDeadLockDetailListResponseBodyDataList setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public GetDeadLockDetailListResponseBodyDataList setObjectOwned(String objectOwned) {
            this.objectOwned = objectOwned;
            return this;
        }
        public String getObjectOwned() {
            return this.objectOwned;
        }

        public GetDeadLockDetailListResponseBodyDataList setObjectRequested(String objectRequested) {
            this.objectRequested = objectRequested;
            return this;
        }
        public String getObjectRequested() {
            return this.objectRequested;
        }

        public GetDeadLockDetailListResponseBodyDataList setOwnMode(String ownMode) {
            this.ownMode = ownMode;
            return this;
        }
        public String getOwnMode() {
            return this.ownMode;
        }

        public GetDeadLockDetailListResponseBodyDataList setSpid(Long spid) {
            this.spid = spid;
            return this;
        }
        public Long getSpid() {
            return this.spid;
        }

        public GetDeadLockDetailListResponseBodyDataList setSqlText(String sqlText) {
            this.sqlText = sqlText;
            return this;
        }
        public String getSqlText() {
            return this.sqlText;
        }

        public GetDeadLockDetailListResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDeadLockDetailListResponseBodyDataList setVictim(Long victim) {
            this.victim = victim;
            return this;
        }
        public Long getVictim() {
            return this.victim;
        }

        public GetDeadLockDetailListResponseBodyDataList setWaitMode(String waitMode) {
            this.waitMode = waitMode;
            return this;
        }
        public String getWaitMode() {
            return this.waitMode;
        }

        public GetDeadLockDetailListResponseBodyDataList setWaitResource(String waitResource) {
            this.waitResource = waitResource;
            return this;
        }
        public String getWaitResource() {
            return this.waitResource;
        }

        public GetDeadLockDetailListResponseBodyDataList setWaitResourceDescription(String waitResourceDescription) {
            this.waitResourceDescription = waitResourceDescription;
            return this;
        }
        public String getWaitResourceDescription() {
            return this.waitResourceDescription;
        }

    }

    public static class GetDeadLockDetailListResponseBodyData extends TeaModel {
        /**
         * <p>The details of the data returned.</p>
         */
        @NameInMap("List")
        public java.util.List<GetDeadLockDetailListResponseBodyDataList> list;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>2</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetDeadLockDetailListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDeadLockDetailListResponseBodyData self = new GetDeadLockDetailListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDeadLockDetailListResponseBodyData setList(java.util.List<GetDeadLockDetailListResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetDeadLockDetailListResponseBodyDataList> getList() {
            return this.list;
        }

        public GetDeadLockDetailListResponseBodyData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public GetDeadLockDetailListResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetDeadLockDetailListResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
