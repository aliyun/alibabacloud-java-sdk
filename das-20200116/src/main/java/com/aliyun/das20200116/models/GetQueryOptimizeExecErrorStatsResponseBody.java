// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeExecErrorStatsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetQueryOptimizeExecErrorStatsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetQueryOptimizeExecErrorStatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQueryOptimizeExecErrorStatsResponseBody self = new GetQueryOptimizeExecErrorStatsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQueryOptimizeExecErrorStatsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetQueryOptimizeExecErrorStatsResponseBody setData(GetQueryOptimizeExecErrorStatsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetQueryOptimizeExecErrorStatsResponseBodyData getData() {
        return this.data;
    }

    public GetQueryOptimizeExecErrorStatsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQueryOptimizeExecErrorStatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQueryOptimizeExecErrorStatsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetQueryOptimizeExecErrorStatsResponseBodyDataList extends TeaModel {
        @NameInMap("Dbname")
        public String dbname;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorCount")
        public Long errorCount;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("SqlId")
        public String sqlId;

        @NameInMap("SqlText")
        public String sqlText;

        public static GetQueryOptimizeExecErrorStatsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetQueryOptimizeExecErrorStatsResponseBodyDataList self = new GetQueryOptimizeExecErrorStatsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetQueryOptimizeExecErrorStatsResponseBodyDataList setDbname(String dbname) {
            this.dbname = dbname;
            return this;
        }
        public String getDbname() {
            return this.dbname;
        }

        public GetQueryOptimizeExecErrorStatsResponseBodyDataList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetQueryOptimizeExecErrorStatsResponseBodyDataList setErrorCount(Long errorCount) {
            this.errorCount = errorCount;
            return this;
        }
        public Long getErrorCount() {
            return this.errorCount;
        }

        public GetQueryOptimizeExecErrorStatsResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetQueryOptimizeExecErrorStatsResponseBodyDataList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetQueryOptimizeExecErrorStatsResponseBodyDataList setSqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public String getSqlId() {
            return this.sqlId;
        }

        public GetQueryOptimizeExecErrorStatsResponseBodyDataList setSqlText(String sqlText) {
            this.sqlText = sqlText;
            return this;
        }
        public String getSqlText() {
            return this.sqlText;
        }

    }

    public static class GetQueryOptimizeExecErrorStatsResponseBodyData extends TeaModel {
        @NameInMap("Extra")
        public String extra;

        @NameInMap("List")
        public java.util.List<GetQueryOptimizeExecErrorStatsResponseBodyDataList> list;

        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Long total;

        public static GetQueryOptimizeExecErrorStatsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQueryOptimizeExecErrorStatsResponseBodyData self = new GetQueryOptimizeExecErrorStatsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQueryOptimizeExecErrorStatsResponseBodyData setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public GetQueryOptimizeExecErrorStatsResponseBodyData setList(java.util.List<GetQueryOptimizeExecErrorStatsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetQueryOptimizeExecErrorStatsResponseBodyDataList> getList() {
            return this.list;
        }

        public GetQueryOptimizeExecErrorStatsResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public GetQueryOptimizeExecErrorStatsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetQueryOptimizeExecErrorStatsResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
