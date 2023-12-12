// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetBlockingDetailListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetBlockingDetailListResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetBlockingDetailListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBlockingDetailListResponseBody self = new GetBlockingDetailListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBlockingDetailListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetBlockingDetailListResponseBody setData(GetBlockingDetailListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetBlockingDetailListResponseBodyData getData() {
        return this.data;
    }

    public GetBlockingDetailListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetBlockingDetailListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBlockingDetailListResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetBlockingDetailListResponseBodyDataList extends TeaModel {
        @NameInMap("BatchId")
        public Long batchId;

        @NameInMap("ClientAppName")
        public String clientAppName;

        @NameInMap("CurrentCollectionTime")
        public Long currentCollectionTime;

        @NameInMap("DataBase")
        public String dataBase;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("LoginId")
        public String loginId;

        @NameInMap("QueryHash")
        public String queryHash;

        @NameInMap("Spid")
        public String spid;

        @NameInMap("SqlText")
        public String sqlText;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("WaitTimeMs")
        public Long waitTimeMs;

        @NameInMap("WaitType")
        public String waitType;

        public static GetBlockingDetailListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetBlockingDetailListResponseBodyDataList self = new GetBlockingDetailListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetBlockingDetailListResponseBodyDataList setBatchId(Long batchId) {
            this.batchId = batchId;
            return this;
        }
        public Long getBatchId() {
            return this.batchId;
        }

        public GetBlockingDetailListResponseBodyDataList setClientAppName(String clientAppName) {
            this.clientAppName = clientAppName;
            return this;
        }
        public String getClientAppName() {
            return this.clientAppName;
        }

        public GetBlockingDetailListResponseBodyDataList setCurrentCollectionTime(Long currentCollectionTime) {
            this.currentCollectionTime = currentCollectionTime;
            return this;
        }
        public Long getCurrentCollectionTime() {
            return this.currentCollectionTime;
        }

        public GetBlockingDetailListResponseBodyDataList setDataBase(String dataBase) {
            this.dataBase = dataBase;
            return this;
        }
        public String getDataBase() {
            return this.dataBase;
        }

        public GetBlockingDetailListResponseBodyDataList setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public GetBlockingDetailListResponseBodyDataList setLoginId(String loginId) {
            this.loginId = loginId;
            return this;
        }
        public String getLoginId() {
            return this.loginId;
        }

        public GetBlockingDetailListResponseBodyDataList setQueryHash(String queryHash) {
            this.queryHash = queryHash;
            return this;
        }
        public String getQueryHash() {
            return this.queryHash;
        }

        public GetBlockingDetailListResponseBodyDataList setSpid(String spid) {
            this.spid = spid;
            return this;
        }
        public String getSpid() {
            return this.spid;
        }

        public GetBlockingDetailListResponseBodyDataList setSqlText(String sqlText) {
            this.sqlText = sqlText;
            return this;
        }
        public String getSqlText() {
            return this.sqlText;
        }

        public GetBlockingDetailListResponseBodyDataList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetBlockingDetailListResponseBodyDataList setWaitTimeMs(Long waitTimeMs) {
            this.waitTimeMs = waitTimeMs;
            return this;
        }
        public Long getWaitTimeMs() {
            return this.waitTimeMs;
        }

        public GetBlockingDetailListResponseBodyDataList setWaitType(String waitType) {
            this.waitType = waitType;
            return this;
        }
        public String getWaitType() {
            return this.waitType;
        }

    }

    public static class GetBlockingDetailListResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<GetBlockingDetailListResponseBodyDataList> list;

        @NameInMap("PageNo")
        public Long pageNo;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        public static GetBlockingDetailListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetBlockingDetailListResponseBodyData self = new GetBlockingDetailListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetBlockingDetailListResponseBodyData setList(java.util.List<GetBlockingDetailListResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetBlockingDetailListResponseBodyDataList> getList() {
            return this.list;
        }

        public GetBlockingDetailListResponseBodyData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public GetBlockingDetailListResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetBlockingDetailListResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
