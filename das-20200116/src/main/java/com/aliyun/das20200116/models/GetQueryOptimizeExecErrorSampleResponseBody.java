// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeExecErrorSampleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetQueryOptimizeExecErrorSampleResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetQueryOptimizeExecErrorSampleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQueryOptimizeExecErrorSampleResponseBody self = new GetQueryOptimizeExecErrorSampleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQueryOptimizeExecErrorSampleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetQueryOptimizeExecErrorSampleResponseBody setData(GetQueryOptimizeExecErrorSampleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetQueryOptimizeExecErrorSampleResponseBodyData getData() {
        return this.data;
    }

    public GetQueryOptimizeExecErrorSampleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQueryOptimizeExecErrorSampleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQueryOptimizeExecErrorSampleResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetQueryOptimizeExecErrorSampleResponseBodyDataList extends TeaModel {
        @NameInMap("Dbname")
        public String dbname;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("OrigHost")
        public String origHost;

        @NameInMap("SqlId")
        public String sqlId;

        @NameInMap("SqlText")
        public String sqlText;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("User")
        public String user;

        public static GetQueryOptimizeExecErrorSampleResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetQueryOptimizeExecErrorSampleResponseBodyDataList self = new GetQueryOptimizeExecErrorSampleResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetQueryOptimizeExecErrorSampleResponseBodyDataList setDbname(String dbname) {
            this.dbname = dbname;
            return this;
        }
        public String getDbname() {
            return this.dbname;
        }

        public GetQueryOptimizeExecErrorSampleResponseBodyDataList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetQueryOptimizeExecErrorSampleResponseBodyDataList setOrigHost(String origHost) {
            this.origHost = origHost;
            return this;
        }
        public String getOrigHost() {
            return this.origHost;
        }

        public GetQueryOptimizeExecErrorSampleResponseBodyDataList setSqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public String getSqlId() {
            return this.sqlId;
        }

        public GetQueryOptimizeExecErrorSampleResponseBodyDataList setSqlText(String sqlText) {
            this.sqlText = sqlText;
            return this;
        }
        public String getSqlText() {
            return this.sqlText;
        }

        public GetQueryOptimizeExecErrorSampleResponseBodyDataList setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetQueryOptimizeExecErrorSampleResponseBodyDataList setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class GetQueryOptimizeExecErrorSampleResponseBodyData extends TeaModel {
        @NameInMap("Extra")
        public String extra;

        @NameInMap("List")
        public java.util.List<GetQueryOptimizeExecErrorSampleResponseBodyDataList> list;

        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Long total;

        public static GetQueryOptimizeExecErrorSampleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQueryOptimizeExecErrorSampleResponseBodyData self = new GetQueryOptimizeExecErrorSampleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQueryOptimizeExecErrorSampleResponseBodyData setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public GetQueryOptimizeExecErrorSampleResponseBodyData setList(java.util.List<GetQueryOptimizeExecErrorSampleResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetQueryOptimizeExecErrorSampleResponseBodyDataList> getList() {
            return this.list;
        }

        public GetQueryOptimizeExecErrorSampleResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public GetQueryOptimizeExecErrorSampleResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetQueryOptimizeExecErrorSampleResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
