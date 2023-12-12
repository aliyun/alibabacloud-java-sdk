// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetDeadLockDetailListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetDeadLockDetailListResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ClientApp")
        public String clientApp;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("LastTranStarted")
        public Long lastTranStarted;

        @NameInMap("LockMode")
        public String lockMode;

        @NameInMap("LogUsed")
        public Long logUsed;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("ObjectOwned")
        public String objectOwned;

        @NameInMap("ObjectRequested")
        public String objectRequested;

        @NameInMap("OwnMode")
        public String ownMode;

        @NameInMap("Spid")
        public Long spid;

        @NameInMap("SqlText")
        public String sqlText;

        @NameInMap("Status")
        public String status;

        @NameInMap("Victim")
        public Long victim;

        @NameInMap("WaitMode")
        public String waitMode;

        @NameInMap("WaitResource")
        public String waitResource;

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
        @NameInMap("BatchId")
        public Long batchId;

        @NameInMap("BlockProcessList")
        public java.util.List<GetDeadLockDetailListResponseBodyDataListBlockProcessList> blockProcessList;

        @NameInMap("ClientApp")
        public String clientApp;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("LastTranStarted")
        public Long lastTranStarted;

        @NameInMap("LockMode")
        public String lockMode;

        @NameInMap("LogUsed")
        public Long logUsed;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("ObjectOwned")
        public String objectOwned;

        @NameInMap("ObjectRequested")
        public String objectRequested;

        @NameInMap("OwnMode")
        public String ownMode;

        @NameInMap("Spid")
        public Long spid;

        @NameInMap("SqlText")
        public String sqlText;

        @NameInMap("Status")
        public String status;

        @NameInMap("Victim")
        public Long victim;

        @NameInMap("WaitMode")
        public String waitMode;

        @NameInMap("WaitResource")
        public String waitResource;

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
        @NameInMap("List")
        public java.util.List<GetDeadLockDetailListResponseBodyDataList> list;

        @NameInMap("PageNo")
        public Long pageNo;

        @NameInMap("PageSize")
        public Long pageSize;

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
