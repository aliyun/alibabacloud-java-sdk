// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeRestoreTablesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>18D9CC47-D913-48BF-AB6B-4FA9B28FBDB1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RestoreFull")
    public DescribeRestoreTablesResponseBodyRestoreFull restoreFull;

    @NameInMap("RestoreIncrDetail")
    public DescribeRestoreTablesResponseBodyRestoreIncrDetail restoreIncrDetail;

    @NameInMap("RestoreSchema")
    public DescribeRestoreTablesResponseBodyRestoreSchema restoreSchema;

    @NameInMap("RestoreSummary")
    public DescribeRestoreTablesResponseBodyRestoreSummary restoreSummary;

    @NameInMap("Tables")
    public DescribeRestoreTablesResponseBodyTables tables;

    public static DescribeRestoreTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestoreTablesResponseBody self = new DescribeRestoreTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRestoreTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRestoreTablesResponseBody setRestoreFull(DescribeRestoreTablesResponseBodyRestoreFull restoreFull) {
        this.restoreFull = restoreFull;
        return this;
    }
    public DescribeRestoreTablesResponseBodyRestoreFull getRestoreFull() {
        return this.restoreFull;
    }

    public DescribeRestoreTablesResponseBody setRestoreIncrDetail(DescribeRestoreTablesResponseBodyRestoreIncrDetail restoreIncrDetail) {
        this.restoreIncrDetail = restoreIncrDetail;
        return this;
    }
    public DescribeRestoreTablesResponseBodyRestoreIncrDetail getRestoreIncrDetail() {
        return this.restoreIncrDetail;
    }

    public DescribeRestoreTablesResponseBody setRestoreSchema(DescribeRestoreTablesResponseBodyRestoreSchema restoreSchema) {
        this.restoreSchema = restoreSchema;
        return this;
    }
    public DescribeRestoreTablesResponseBodyRestoreSchema getRestoreSchema() {
        return this.restoreSchema;
    }

    public DescribeRestoreTablesResponseBody setRestoreSummary(DescribeRestoreTablesResponseBodyRestoreSummary restoreSummary) {
        this.restoreSummary = restoreSummary;
        return this;
    }
    public DescribeRestoreTablesResponseBodyRestoreSummary getRestoreSummary() {
        return this.restoreSummary;
    }

    public DescribeRestoreTablesResponseBody setTables(DescribeRestoreTablesResponseBodyTables tables) {
        this.tables = tables;
        return this;
    }
    public DescribeRestoreTablesResponseBodyTables getTables() {
        return this.tables;
    }

    public static class DescribeRestoreTablesResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1.2 kB</p>
         */
        @NameInMap("DataSize")
        public String dataSize;

        /**
         * <strong>example:</strong>
         * <p>2020-11-05T06:45:51Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>“”</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>14/14</p>
         */
        @NameInMap("Process")
        public String process;

        /**
         * <strong>example:</strong>
         * <p>0.00 MB/s</p>
         */
        @NameInMap("Speed")
        public String speed;

        /**
         * <strong>example:</strong>
         * <p>2020-11-05T06:45:45Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>SUCCEEDED</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>default:test1</p>
         */
        @NameInMap("Table")
        public String table;

        public static DescribeRestoreTablesResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreTablesResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail self = new DescribeRestoreTablesResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreTablesResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail setDataSize(String dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public String getDataSize() {
            return this.dataSize;
        }

        public DescribeRestoreTablesResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeRestoreTablesResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeRestoreTablesResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

        public DescribeRestoreTablesResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail setSpeed(String speed) {
            this.speed = speed;
            return this;
        }
        public String getSpeed() {
            return this.speed;
        }

        public DescribeRestoreTablesResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeRestoreTablesResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
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
        /**
         * <strong>example:</strong>
         * <p>1.2 kB</p>
         */
        @NameInMap("DataSize")
        public String dataSize;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Fail")
        public Integer fail;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("RestoreFullDetails")
        public DescribeRestoreTablesResponseBodyRestoreFullRestoreFullDetails restoreFullDetails;

        /**
         * <strong>example:</strong>
         * <p>0.00 MB/s</p>
         */
        @NameInMap("Speed")
        public String speed;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Succeed")
        public Integer succeed;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Total")
        public Long total;

        public static DescribeRestoreTablesResponseBodyRestoreFull build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreTablesResponseBodyRestoreFull self = new DescribeRestoreTablesResponseBodyRestoreFull();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreTablesResponseBodyRestoreFull setDataSize(String dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public String getDataSize() {
            return this.dataSize;
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

        public DescribeRestoreTablesResponseBodyRestoreFull setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeRestoreTablesResponseBodyRestoreFull setRestoreFullDetails(DescribeRestoreTablesResponseBodyRestoreFullRestoreFullDetails restoreFullDetails) {
            this.restoreFullDetails = restoreFullDetails;
            return this;
        }
        public DescribeRestoreTablesResponseBodyRestoreFullRestoreFullDetails getRestoreFullDetails() {
            return this.restoreFullDetails;
        }

        public DescribeRestoreTablesResponseBodyRestoreFull setSpeed(String speed) {
            this.speed = speed;
            return this;
        }
        public String getSpeed() {
            return this.speed;
        }

        public DescribeRestoreTablesResponseBodyRestoreFull setSucceed(Integer succeed) {
            this.succeed = succeed;
            return this;
        }
        public Integer getSucceed() {
            return this.succeed;
        }

        public DescribeRestoreTablesResponseBodyRestoreFull setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class DescribeRestoreTablesResponseBodyRestoreIncrDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2020-11-05T06:45:44Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>0/0</p>
         */
        @NameInMap("Process")
        public String process;

        /**
         * <strong>example:</strong>
         * <p>0 ms</p>
         */
        @NameInMap("RestoreDelay")
        public String restoreDelay;

        /**
         * <strong>example:</strong>
         * <p>2020-11-02T18:00:00Z</p>
         */
        @NameInMap("RestoreStartTs")
        public String restoreStartTs;

        /**
         * <strong>example:</strong>
         * <p>“”</p>
         */
        @NameInMap("RestoredTs")
        public String restoredTs;

        /**
         * <strong>example:</strong>
         * <p>2020-11-05T06:45:44Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>SUCCEEDED</p>
         */
        @NameInMap("State")
        public String state;

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

        public DescribeRestoreTablesResponseBodyRestoreIncrDetail setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

        public DescribeRestoreTablesResponseBodyRestoreIncrDetail setRestoreDelay(String restoreDelay) {
            this.restoreDelay = restoreDelay;
            return this;
        }
        public String getRestoreDelay() {
            return this.restoreDelay;
        }

        public DescribeRestoreTablesResponseBodyRestoreIncrDetail setRestoreStartTs(String restoreStartTs) {
            this.restoreStartTs = restoreStartTs;
            return this;
        }
        public String getRestoreStartTs() {
            return this.restoreStartTs;
        }

        public DescribeRestoreTablesResponseBodyRestoreIncrDetail setRestoredTs(String restoredTs) {
            this.restoredTs = restoredTs;
            return this;
        }
        public String getRestoredTs() {
            return this.restoredTs;
        }

        public DescribeRestoreTablesResponseBodyRestoreIncrDetail setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeRestoreTablesResponseBodyRestoreIncrDetail setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class DescribeRestoreTablesResponseBodyRestoreSchemaRestoreSchemaDetailsRestoreSchemaDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2020-11-05T06:45:18Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>2020-11-05T06:45:14Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>SUCCEEDED</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>default:test1</p>
         */
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

        public DescribeRestoreTablesResponseBodyRestoreSchemaRestoreSchemaDetailsRestoreSchemaDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
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
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Fail")
        public Integer fail;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("RestoreSchemaDetails")
        public DescribeRestoreTablesResponseBodyRestoreSchemaRestoreSchemaDetails restoreSchemaDetails;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Succeed")
        public Integer succeed;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Total")
        public Long total;

        public static DescribeRestoreTablesResponseBodyRestoreSchema build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreTablesResponseBodyRestoreSchema self = new DescribeRestoreTablesResponseBodyRestoreSchema();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreTablesResponseBodyRestoreSchema setFail(Integer fail) {
            this.fail = fail;
            return this;
        }
        public Integer getFail() {
            return this.fail;
        }

        public DescribeRestoreTablesResponseBodyRestoreSchema setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeRestoreTablesResponseBodyRestoreSchema setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeRestoreTablesResponseBodyRestoreSchema setRestoreSchemaDetails(DescribeRestoreTablesResponseBodyRestoreSchemaRestoreSchemaDetails restoreSchemaDetails) {
            this.restoreSchemaDetails = restoreSchemaDetails;
            return this;
        }
        public DescribeRestoreTablesResponseBodyRestoreSchemaRestoreSchemaDetails getRestoreSchemaDetails() {
            return this.restoreSchemaDetails;
        }

        public DescribeRestoreTablesResponseBodyRestoreSchema setSucceed(Integer succeed) {
            this.succeed = succeed;
            return this;
        }
        public Integer getSucceed() {
            return this.succeed;
        }

        public DescribeRestoreTablesResponseBodyRestoreSchema setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class DescribeRestoreTablesResponseBodyRestoreSummary extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2020-11-05T06:45:51Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>20201105144514</p>
         */
        @NameInMap("RecordId")
        public String recordId;

        /**
         * <strong>example:</strong>
         * <p>2020-11-04T05:15:00Z</p>
         */
        @NameInMap("RestoreToDate")
        public String restoreToDate;

        /**
         * <strong>example:</strong>
         * <p>2020-11-05T06:45:14Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>SUCCEEDED</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>ld-m5e2t34kr54wgxxxx</p>
         */
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

        public DescribeRestoreTablesResponseBodyRestoreSummary setTargetCluster(String targetCluster) {
            this.targetCluster = targetCluster;
            return this;
        }
        public String getTargetCluster() {
            return this.targetCluster;
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

}
