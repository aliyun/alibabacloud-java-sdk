// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DescribeRdsSlowLogsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeRdsSlowLogsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeRdsSlowLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsSlowLogsResponseBody self = new DescribeRdsSlowLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRdsSlowLogsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeRdsSlowLogsResponseBody setData(DescribeRdsSlowLogsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeRdsSlowLogsResponseBodyData getData() {
        return this.data;
    }

    public DescribeRdsSlowLogsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeRdsSlowLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRdsSlowLogsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeRdsSlowLogsResponseBodyDataItems extends TeaModel {
        @NameInMap("AvgExecutionTime")
        public Long avgExecutionTime;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DBName")
        public String DBName;

        @NameInMap("MaxExecutionTime")
        public Long maxExecutionTime;

        @NameInMap("MaxLockTime")
        public Long maxLockTime;

        @NameInMap("MySQLTotalExecutionCounts")
        public Long mySQLTotalExecutionCounts;

        @NameInMap("MySQLTotalExecutionTimes")
        public Long mySQLTotalExecutionTimes;

        @NameInMap("ParseMaxRowCount")
        public Long parseMaxRowCount;

        @NameInMap("ParseTotalRowCounts")
        public Long parseTotalRowCounts;

        @NameInMap("ReportTime")
        public String reportTime;

        @NameInMap("ReturnMaxRowCount")
        public Long returnMaxRowCount;

        @NameInMap("ReturnTotalRowCounts")
        public Long returnTotalRowCounts;

        @NameInMap("SQLHASH")
        public String SQLHASH;

        @NameInMap("SQLIdStr")
        public String SQLIdStr;

        @NameInMap("SQLServerTotalExecutionCounts")
        public Long SQLServerTotalExecutionCounts;

        @NameInMap("SQLServerTotalExecutionTimes")
        public Long SQLServerTotalExecutionTimes;

        @NameInMap("SQLText")
        public String SQLText;

        @NameInMap("SlowLogId")
        public Long slowLogId;

        @NameInMap("TotalLockTimes")
        public Long totalLockTimes;

        @NameInMap("TotalLogicalReadCounts")
        public Long totalLogicalReadCounts;

        @NameInMap("TotalPhysicalReadCounts")
        public Long totalPhysicalReadCounts;

        public static DescribeRdsSlowLogsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsSlowLogsResponseBodyDataItems self = new DescribeRdsSlowLogsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public DescribeRdsSlowLogsResponseBodyDataItems setAvgExecutionTime(Long avgExecutionTime) {
            this.avgExecutionTime = avgExecutionTime;
            return this;
        }
        public Long getAvgExecutionTime() {
            return this.avgExecutionTime;
        }

        public DescribeRdsSlowLogsResponseBodyDataItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeRdsSlowLogsResponseBodyDataItems setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeRdsSlowLogsResponseBodyDataItems setMaxExecutionTime(Long maxExecutionTime) {
            this.maxExecutionTime = maxExecutionTime;
            return this;
        }
        public Long getMaxExecutionTime() {
            return this.maxExecutionTime;
        }

        public DescribeRdsSlowLogsResponseBodyDataItems setMaxLockTime(Long maxLockTime) {
            this.maxLockTime = maxLockTime;
            return this;
        }
        public Long getMaxLockTime() {
            return this.maxLockTime;
        }

        public DescribeRdsSlowLogsResponseBodyDataItems setMySQLTotalExecutionCounts(Long mySQLTotalExecutionCounts) {
            this.mySQLTotalExecutionCounts = mySQLTotalExecutionCounts;
            return this;
        }
        public Long getMySQLTotalExecutionCounts() {
            return this.mySQLTotalExecutionCounts;
        }

        public DescribeRdsSlowLogsResponseBodyDataItems setMySQLTotalExecutionTimes(Long mySQLTotalExecutionTimes) {
            this.mySQLTotalExecutionTimes = mySQLTotalExecutionTimes;
            return this;
        }
        public Long getMySQLTotalExecutionTimes() {
            return this.mySQLTotalExecutionTimes;
        }

        public DescribeRdsSlowLogsResponseBodyDataItems setParseMaxRowCount(Long parseMaxRowCount) {
            this.parseMaxRowCount = parseMaxRowCount;
            return this;
        }
        public Long getParseMaxRowCount() {
            return this.parseMaxRowCount;
        }

        public DescribeRdsSlowLogsResponseBodyDataItems setParseTotalRowCounts(Long parseTotalRowCounts) {
            this.parseTotalRowCounts = parseTotalRowCounts;
            return this;
        }
        public Long getParseTotalRowCounts() {
            return this.parseTotalRowCounts;
        }

        public DescribeRdsSlowLogsResponseBodyDataItems setReportTime(String reportTime) {
            this.reportTime = reportTime;
            return this;
        }
        public String getReportTime() {
            return this.reportTime;
        }

        public DescribeRdsSlowLogsResponseBodyDataItems setReturnMaxRowCount(Long returnMaxRowCount) {
            this.returnMaxRowCount = returnMaxRowCount;
            return this;
        }
        public Long getReturnMaxRowCount() {
            return this.returnMaxRowCount;
        }

        public DescribeRdsSlowLogsResponseBodyDataItems setReturnTotalRowCounts(Long returnTotalRowCounts) {
            this.returnTotalRowCounts = returnTotalRowCounts;
            return this;
        }
        public Long getReturnTotalRowCounts() {
            return this.returnTotalRowCounts;
        }

        public DescribeRdsSlowLogsResponseBodyDataItems setSQLHASH(String SQLHASH) {
            this.SQLHASH = SQLHASH;
            return this;
        }
        public String getSQLHASH() {
            return this.SQLHASH;
        }

        public DescribeRdsSlowLogsResponseBodyDataItems setSQLIdStr(String SQLIdStr) {
            this.SQLIdStr = SQLIdStr;
            return this;
        }
        public String getSQLIdStr() {
            return this.SQLIdStr;
        }

        public DescribeRdsSlowLogsResponseBodyDataItems setSQLServerTotalExecutionCounts(Long SQLServerTotalExecutionCounts) {
            this.SQLServerTotalExecutionCounts = SQLServerTotalExecutionCounts;
            return this;
        }
        public Long getSQLServerTotalExecutionCounts() {
            return this.SQLServerTotalExecutionCounts;
        }

        public DescribeRdsSlowLogsResponseBodyDataItems setSQLServerTotalExecutionTimes(Long SQLServerTotalExecutionTimes) {
            this.SQLServerTotalExecutionTimes = SQLServerTotalExecutionTimes;
            return this;
        }
        public Long getSQLServerTotalExecutionTimes() {
            return this.SQLServerTotalExecutionTimes;
        }

        public DescribeRdsSlowLogsResponseBodyDataItems setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeRdsSlowLogsResponseBodyDataItems setSlowLogId(Long slowLogId) {
            this.slowLogId = slowLogId;
            return this;
        }
        public Long getSlowLogId() {
            return this.slowLogId;
        }

        public DescribeRdsSlowLogsResponseBodyDataItems setTotalLockTimes(Long totalLockTimes) {
            this.totalLockTimes = totalLockTimes;
            return this;
        }
        public Long getTotalLockTimes() {
            return this.totalLockTimes;
        }

        public DescribeRdsSlowLogsResponseBodyDataItems setTotalLogicalReadCounts(Long totalLogicalReadCounts) {
            this.totalLogicalReadCounts = totalLogicalReadCounts;
            return this;
        }
        public Long getTotalLogicalReadCounts() {
            return this.totalLogicalReadCounts;
        }

        public DescribeRdsSlowLogsResponseBodyDataItems setTotalPhysicalReadCounts(Long totalPhysicalReadCounts) {
            this.totalPhysicalReadCounts = totalPhysicalReadCounts;
            return this;
        }
        public Long getTotalPhysicalReadCounts() {
            return this.totalPhysicalReadCounts;
        }

    }

    public static class DescribeRdsSlowLogsResponseBodyData extends TeaModel {
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("Items")
        public java.util.List<DescribeRdsSlowLogsResponseBodyDataItems> items;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageRecordCount")
        public Integer pageRecordCount;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("TotalRecordCount")
        public Integer totalRecordCount;

        public static DescribeRdsSlowLogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsSlowLogsResponseBodyData self = new DescribeRdsSlowLogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeRdsSlowLogsResponseBodyData setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeRdsSlowLogsResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeRdsSlowLogsResponseBodyData setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeRdsSlowLogsResponseBodyData setItems(java.util.List<DescribeRdsSlowLogsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeRdsSlowLogsResponseBodyDataItems> getItems() {
            return this.items;
        }

        public DescribeRdsSlowLogsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeRdsSlowLogsResponseBodyData setPageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }
        public Integer getPageRecordCount() {
            return this.pageRecordCount;
        }

        public DescribeRdsSlowLogsResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DescribeRdsSlowLogsResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeRdsSlowLogsResponseBodyData setTotalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }
        public Integer getTotalRecordCount() {
            return this.totalRecordCount;
        }

    }

}
