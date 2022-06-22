// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DescribeRdsSlowLogRecordsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeRdsSlowLogRecordsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeRdsSlowLogRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsSlowLogRecordsResponseBody self = new DescribeRdsSlowLogRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRdsSlowLogRecordsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeRdsSlowLogRecordsResponseBody setData(DescribeRdsSlowLogRecordsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeRdsSlowLogRecordsResponseBodyData getData() {
        return this.data;
    }

    public DescribeRdsSlowLogRecordsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeRdsSlowLogRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRdsSlowLogRecordsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeRdsSlowLogRecordsResponseBodyDataItems extends TeaModel {
        @NameInMap("DBName")
        public String DBName;

        @NameInMap("ExecutionStartTime")
        public Long executionStartTime;

        @NameInMap("HostAddress")
        public String hostAddress;

        @NameInMap("LockTimes")
        public Long lockTimes;

        @NameInMap("ParseRowCounts")
        public Long parseRowCounts;

        @NameInMap("QueryTimeMS")
        public Long queryTimeMS;

        @NameInMap("QueryTimes")
        public Long queryTimes;

        @NameInMap("ReturnRowCounts")
        public Long returnRowCounts;

        @NameInMap("SQLText")
        public String SQLText;

        public static DescribeRdsSlowLogRecordsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsSlowLogRecordsResponseBodyDataItems self = new DescribeRdsSlowLogRecordsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public DescribeRdsSlowLogRecordsResponseBodyDataItems setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeRdsSlowLogRecordsResponseBodyDataItems setExecutionStartTime(Long executionStartTime) {
            this.executionStartTime = executionStartTime;
            return this;
        }
        public Long getExecutionStartTime() {
            return this.executionStartTime;
        }

        public DescribeRdsSlowLogRecordsResponseBodyDataItems setHostAddress(String hostAddress) {
            this.hostAddress = hostAddress;
            return this;
        }
        public String getHostAddress() {
            return this.hostAddress;
        }

        public DescribeRdsSlowLogRecordsResponseBodyDataItems setLockTimes(Long lockTimes) {
            this.lockTimes = lockTimes;
            return this;
        }
        public Long getLockTimes() {
            return this.lockTimes;
        }

        public DescribeRdsSlowLogRecordsResponseBodyDataItems setParseRowCounts(Long parseRowCounts) {
            this.parseRowCounts = parseRowCounts;
            return this;
        }
        public Long getParseRowCounts() {
            return this.parseRowCounts;
        }

        public DescribeRdsSlowLogRecordsResponseBodyDataItems setQueryTimeMS(Long queryTimeMS) {
            this.queryTimeMS = queryTimeMS;
            return this;
        }
        public Long getQueryTimeMS() {
            return this.queryTimeMS;
        }

        public DescribeRdsSlowLogRecordsResponseBodyDataItems setQueryTimes(Long queryTimes) {
            this.queryTimes = queryTimes;
            return this;
        }
        public Long getQueryTimes() {
            return this.queryTimes;
        }

        public DescribeRdsSlowLogRecordsResponseBodyDataItems setReturnRowCounts(Long returnRowCounts) {
            this.returnRowCounts = returnRowCounts;
            return this;
        }
        public Long getReturnRowCounts() {
            return this.returnRowCounts;
        }

        public DescribeRdsSlowLogRecordsResponseBodyDataItems setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

    }

    public static class DescribeRdsSlowLogRecordsResponseBodyData extends TeaModel {
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("Items")
        public java.util.List<DescribeRdsSlowLogRecordsResponseBodyDataItems> items;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageRecordCount")
        public Integer pageRecordCount;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("TotalRecordCount")
        public Integer totalRecordCount;

        public static DescribeRdsSlowLogRecordsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsSlowLogRecordsResponseBodyData self = new DescribeRdsSlowLogRecordsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeRdsSlowLogRecordsResponseBodyData setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeRdsSlowLogRecordsResponseBodyData setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeRdsSlowLogRecordsResponseBodyData setItems(java.util.List<DescribeRdsSlowLogRecordsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeRdsSlowLogRecordsResponseBodyDataItems> getItems() {
            return this.items;
        }

        public DescribeRdsSlowLogRecordsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeRdsSlowLogRecordsResponseBodyData setPageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }
        public Integer getPageRecordCount() {
            return this.pageRecordCount;
        }

        public DescribeRdsSlowLogRecordsResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DescribeRdsSlowLogRecordsResponseBodyData setTotalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }
        public Integer getTotalRecordCount() {
            return this.totalRecordCount;
        }

    }

}
