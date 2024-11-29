// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetBlockingDetailListResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetBlockingDetailListResponseBodyData data;

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
     * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
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
        /**
         * <p>The batch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1683530096156</p>
         */
        @NameInMap("BatchId")
        public Long batchId;

        /**
         * <p>The client name.</p>
         * 
         * <strong>example:</strong>
         * <p>.Net SqlClient Data Provider</p>
         */
        @NameInMap("ClientAppName")
        public String clientAppName;

        /**
         * <p>The time when the blocking data was collected. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1700065800000</p>
         */
        @NameInMap("CurrentCollectionTime")
        public Long currentCollectionTime;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>school</p>
         */
        @NameInMap("DataBase")
        public String dataBase;

        /**
         * <p>The client hostname.</p>
         * 
         * <strong>example:</strong>
         * <p>ALLBNMGTAPPRD01</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The username that is used for the logon.</p>
         * 
         * <strong>example:</strong>
         * <p>Cheney603</p>
         */
        @NameInMap("LoginId")
        public String loginId;

        /**
         * <p>The hash value of the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>6977DD06CD9CAFF2</p>
         */
        @NameInMap("QueryHash")
        public String queryHash;

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1717</p>
         */
        @NameInMap("Spid")
        public String spid;

        /**
         * <p>The SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>select * from test1</p>
         */
        @NameInMap("SqlText")
        public String sqlText;

        /**
         * <p>The time when the execution started. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1608888296000</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The duration of the blocking. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30000</p>
         */
        @NameInMap("WaitTimeMs")
        public Long waitTimeMs;

        /**
         * <p>The wait type. For more information about wait types, see <a href="https://learn.microsoft.com/en-us/sql/relational-databases/system-dynamic-management-views/sys-dm-os-wait-stats-transact-sql?view=sql-server-ver15">sys.dm_os_wait_stats (Transact-SQL)</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>MISCELLANEOUS</p>
         */
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
        /**
         * <p>The details of the data returned.</p>
         */
        @NameInMap("List")
        public java.util.List<GetBlockingDetailListResponseBodyDataList> list;

        /**
         * <p>The page number of the page returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Long pageNo;

        /**
         * <p>The number of entries returned on each page.</p>
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
         * <p>19</p>
         */
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
