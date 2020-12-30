// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeRestoreTablesResponseBody extends TeaModel {
    @NameInMap("RestoreSchema")
    public DescribeRestoreTablesResponseBodyRestoreSchema restoreSchema;

    @NameInMap("RestoreFull")
    public DescribeRestoreTablesResponseBodyRestoreFull restoreFull;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tables")
    public DescribeRestoreTablesResponseBodyTables tables;

    @NameInMap("RestoreSummary")
    public DescribeRestoreTablesResponseBodyRestoreSummary restoreSummary;

    @NameInMap("RestoreIncrDetail")
    public DescribeRestoreTablesResponseBodyRestoreIncrDetail restoreIncrDetail;

    public static DescribeRestoreTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestoreTablesResponseBody self = new DescribeRestoreTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRestoreTablesResponseBody setRestoreSchema(DescribeRestoreTablesResponseBodyRestoreSchema restoreSchema) {
        this.restoreSchema = restoreSchema;
        return this;
    }
    public DescribeRestoreTablesResponseBodyRestoreSchema getRestoreSchema() {
        return this.restoreSchema;
    }

    public DescribeRestoreTablesResponseBody setRestoreFull(DescribeRestoreTablesResponseBodyRestoreFull restoreFull) {
        this.restoreFull = restoreFull;
        return this;
    }
    public DescribeRestoreTablesResponseBodyRestoreFull getRestoreFull() {
        return this.restoreFull;
    }

    public DescribeRestoreTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRestoreTablesResponseBody setTables(DescribeRestoreTablesResponseBodyTables tables) {
        this.tables = tables;
        return this;
    }
    public DescribeRestoreTablesResponseBodyTables getTables() {
        return this.tables;
    }

    public DescribeRestoreTablesResponseBody setRestoreSummary(DescribeRestoreTablesResponseBodyRestoreSummary restoreSummary) {
        this.restoreSummary = restoreSummary;
        return this;
    }
    public DescribeRestoreTablesResponseBodyRestoreSummary getRestoreSummary() {
        return this.restoreSummary;
    }

    public DescribeRestoreTablesResponseBody setRestoreIncrDetail(DescribeRestoreTablesResponseBodyRestoreIncrDetail restoreIncrDetail) {
        this.restoreIncrDetail = restoreIncrDetail;
        return this;
    }
    public DescribeRestoreTablesResponseBodyRestoreIncrDetail getRestoreIncrDetail() {
        return this.restoreIncrDetail;
    }

    public static class DescribeRestoreTablesResponseBodyRestoreSchemaRestoreSchemaDetailsRestoreSchemaDetail extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("State")
        public String state;

        @NameInMap("Message")
        public String message;

        @NameInMap("Table")
        public String table;

        public static DescribeRestoreTablesResponseBodyRestoreSchemaRestoreSchemaDetailsRestoreSchemaDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreTablesResponseBodyRestoreSchemaRestoreSchemaDetailsRestoreSchemaDetail self = new DescribeRestoreTablesResponseBodyRestoreSchemaRestoreSchemaDetailsRestoreSchemaDetail();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreTablesResponseBodyRestoreSchemaRestoreSchemaDetailsRestoreSchemaDetail setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeRestoreTablesResponseBodyRestoreSchemaRestoreSchemaDetailsRestoreSchemaDetail setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeRestoreTablesResponseBodyRestoreSchemaRestoreSchemaDetailsRestoreSchemaDetail setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeRestoreTablesResponseBodyRestoreSchemaRestoreSchemaDetailsRestoreSchemaDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeRestoreTablesResponseBodyRestoreSchemaRestoreSchemaDetailsRestoreSchemaDetail setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

    }

    public static class DescribeRestoreTablesResponseBodyRestoreSchemaRestoreSchemaDetails extends TeaModel {
        @NameInMap("RestoreSchemaDetail")
        public java.util.List<DescribeRestoreTablesResponseBodyRestoreSchemaRestoreSchemaDetailsRestoreSchemaDetail> restoreSchemaDetail;

        public static DescribeRestoreTablesResponseBodyRestoreSchemaRestoreSchemaDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreTablesResponseBodyRestoreSchemaRestoreSchemaDetails self = new DescribeRestoreTablesResponseBodyRestoreSchemaRestoreSchemaDetails();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreTablesResponseBodyRestoreSchemaRestoreSchemaDetails setRestoreSchemaDetail(java.util.List<DescribeRestoreTablesResponseBodyRestoreSchemaRestoreSchemaDetailsRestoreSchemaDetail> restoreSchemaDetail) {
            this.restoreSchemaDetail = restoreSchemaDetail;
            return this;
        }
        public java.util.List<DescribeRestoreTablesResponseBodyRestoreSchemaRestoreSchemaDetailsRestoreSchemaDetail> getRestoreSchemaDetail() {
            return this.restoreSchemaDetail;
        }

    }

    public static class DescribeRestoreTablesResponseBodyRestoreSchema extends TeaModel {
        @NameInMap("Succeed")
        public Integer succeed;

        @NameInMap("RestoreSchemaDetails")
        public DescribeRestoreTablesResponseBodyRestoreSchemaRestoreSchemaDetails restoreSchemaDetails;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("Fail")
        public Integer fail;

        @NameInMap("Total")
        public Long total;

        public static DescribeRestoreTablesResponseBodyRestoreSchema build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreTablesResponseBodyRestoreSchema self = new DescribeRestoreTablesResponseBodyRestoreSchema();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreTablesResponseBodyRestoreSchema setSucceed(Integer succeed) {
            this.succeed = succeed;
            return this;
        }
        public Integer getSucceed() {
            return this.succeed;
        }

        public DescribeRestoreTablesResponseBodyRestoreSchema setRestoreSchemaDetails(DescribeRestoreTablesResponseBodyRestoreSchemaRestoreSchemaDetails restoreSchemaDetails) {
            this.restoreSchemaDetails = restoreSchemaDetails;
            return this;
        }
        public DescribeRestoreTablesResponseBodyRestoreSchemaRestoreSchemaDetails getRestoreSchemaDetails() {
            return this.restoreSchemaDetails;
        }

        public DescribeRestoreTablesResponseBodyRestoreSchema setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeRestoreTablesResponseBodyRestoreSchema setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeRestoreTablesResponseBodyRestoreSchema setFail(Integer fail) {
            this.fail = fail;
            return this;
        }
        public Integer getFail() {
            return this.fail;
        }

        public DescribeRestoreTablesResponseBodyRestoreSchema setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class DescribeRestoreTablesResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Process")
        public String process;

        @NameInMap("DataSize")
        public String dataSize;

        @NameInMap("Speed")
        public String speed;

        @NameInMap("State")
        public String state;

        @NameInMap("Message")
        public String message;

        @NameInMap("Table")
        public String table;

        public static DescribeRestoreTablesResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreTablesResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail self = new DescribeRestoreTablesResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreTablesResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeRestoreTablesResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeRestoreTablesResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

        public DescribeRestoreTablesResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail setDataSize(String dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public String getDataSize() {
            return this.dataSize;
        }

        public DescribeRestoreTablesResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail setSpeed(String speed) {
            this.speed = speed;
            return this;
        }
        public String getSpeed() {
            return this.speed;
        }

        public DescribeRestoreTablesResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeRestoreTablesResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeRestoreTablesResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

    }

    public static class DescribeRestoreTablesResponseBodyRestoreFullRestoreFullDetails extends TeaModel {
        @NameInMap("RestoreFullDetail")
        public java.util.List<DescribeRestoreTablesResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail> restoreFullDetail;

        public static DescribeRestoreTablesResponseBodyRestoreFullRestoreFullDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreTablesResponseBodyRestoreFullRestoreFullDetails self = new DescribeRestoreTablesResponseBodyRestoreFullRestoreFullDetails();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreTablesResponseBodyRestoreFullRestoreFullDetails setRestoreFullDetail(java.util.List<DescribeRestoreTablesResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail> restoreFullDetail) {
            this.restoreFullDetail = restoreFullDetail;
            return this;
        }
        public java.util.List<DescribeRestoreTablesResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail> getRestoreFullDetail() {
            return this.restoreFullDetail;
        }

    }

    public static class DescribeRestoreTablesResponseBodyRestoreFull extends TeaModel {
        @NameInMap("Succeed")
        public Integer succeed;

        @NameInMap("DataSize")
        public String dataSize;

        @NameInMap("Speed")
        public String speed;

        @NameInMap("RestoreFullDetails")
        public DescribeRestoreTablesResponseBodyRestoreFullRestoreFullDetails restoreFullDetails;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Fail")
        public Integer fail;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("Total")
        public Long total;

        public static DescribeRestoreTablesResponseBodyRestoreFull build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreTablesResponseBodyRestoreFull self = new DescribeRestoreTablesResponseBodyRestoreFull();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreTablesResponseBodyRestoreFull setSucceed(Integer succeed) {
            this.succeed = succeed;
            return this;
        }
        public Integer getSucceed() {
            return this.succeed;
        }

        public DescribeRestoreTablesResponseBodyRestoreFull setDataSize(String dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public String getDataSize() {
            return this.dataSize;
        }

        public DescribeRestoreTablesResponseBodyRestoreFull setSpeed(String speed) {
            this.speed = speed;
            return this;
        }
        public String getSpeed() {
            return this.speed;
        }

        public DescribeRestoreTablesResponseBodyRestoreFull setRestoreFullDetails(DescribeRestoreTablesResponseBodyRestoreFullRestoreFullDetails restoreFullDetails) {
            this.restoreFullDetails = restoreFullDetails;
            return this;
        }
        public DescribeRestoreTablesResponseBodyRestoreFullRestoreFullDetails getRestoreFullDetails() {
            return this.restoreFullDetails;
        }

        public DescribeRestoreTablesResponseBodyRestoreFull setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeRestoreTablesResponseBodyRestoreFull setFail(Integer fail) {
            this.fail = fail;
            return this;
        }
        public Integer getFail() {
            return this.fail;
        }

        public DescribeRestoreTablesResponseBodyRestoreFull setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeRestoreTablesResponseBodyRestoreFull setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class DescribeRestoreTablesResponseBodyTables extends TeaModel {
        @NameInMap("Table")
        public java.util.List<String> table;

        public static DescribeRestoreTablesResponseBodyTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreTablesResponseBodyTables self = new DescribeRestoreTablesResponseBodyTables();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreTablesResponseBodyTables setTable(java.util.List<String> table) {
            this.table = table;
            return this;
        }
        public java.util.List<String> getTable() {
            return this.table;
        }

    }

    public static class DescribeRestoreTablesResponseBodyRestoreSummary extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("State")
        public String state;

        @NameInMap("RecordId")
        public String recordId;

        @NameInMap("RestoreToDate")
        public String restoreToDate;

        @NameInMap("TargetCluster")
        public String targetCluster;

        public static DescribeRestoreTablesResponseBodyRestoreSummary build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreTablesResponseBodyRestoreSummary self = new DescribeRestoreTablesResponseBodyRestoreSummary();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreTablesResponseBodyRestoreSummary setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeRestoreTablesResponseBodyRestoreSummary setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeRestoreTablesResponseBodyRestoreSummary setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeRestoreTablesResponseBodyRestoreSummary setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public DescribeRestoreTablesResponseBodyRestoreSummary setRestoreToDate(String restoreToDate) {
            this.restoreToDate = restoreToDate;
            return this;
        }
        public String getRestoreToDate() {
            return this.restoreToDate;
        }

        public DescribeRestoreTablesResponseBodyRestoreSummary setTargetCluster(String targetCluster) {
            this.targetCluster = targetCluster;
            return this;
        }
        public String getTargetCluster() {
            return this.targetCluster;
        }

    }

    public static class DescribeRestoreTablesResponseBodyRestoreIncrDetail extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Process")
        public String process;

        @NameInMap("RestoreStartTs")
        public String restoreStartTs;

        @NameInMap("State")
        public String state;

        @NameInMap("RestoredTs")
        public String restoredTs;

        @NameInMap("RestoreDelay")
        public String restoreDelay;

        public static DescribeRestoreTablesResponseBodyRestoreIncrDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreTablesResponseBodyRestoreIncrDetail self = new DescribeRestoreTablesResponseBodyRestoreIncrDetail();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreTablesResponseBodyRestoreIncrDetail setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeRestoreTablesResponseBodyRestoreIncrDetail setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeRestoreTablesResponseBodyRestoreIncrDetail setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

        public DescribeRestoreTablesResponseBodyRestoreIncrDetail setRestoreStartTs(String restoreStartTs) {
            this.restoreStartTs = restoreStartTs;
            return this;
        }
        public String getRestoreStartTs() {
            return this.restoreStartTs;
        }

        public DescribeRestoreTablesResponseBodyRestoreIncrDetail setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeRestoreTablesResponseBodyRestoreIncrDetail setRestoredTs(String restoredTs) {
            this.restoredTs = restoredTs;
            return this;
        }
        public String getRestoredTs() {
            return this.restoredTs;
        }

        public DescribeRestoreTablesResponseBodyRestoreIncrDetail setRestoreDelay(String restoreDelay) {
            this.restoreDelay = restoreDelay;
            return this;
        }
        public String getRestoreDelay() {
            return this.restoreDelay;
        }

    }

}
