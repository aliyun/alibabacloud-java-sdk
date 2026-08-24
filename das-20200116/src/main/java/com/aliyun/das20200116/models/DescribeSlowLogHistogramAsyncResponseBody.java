// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSlowLogHistogramAsyncResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>AsyncResult<Histogram>。</p>
     */
    @NameInMap("Data")
    public DescribeSlowLogHistogramAsyncResponseBodyData data;

    /**
     * <p>The message returned for the request.</p>
     * <blockquote>
     * <p> This parameter returns <strong>Successful</strong> when the request succeeds. If the request fails, an exception message (such as an error code) is returned.</p>
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
     * <p>Indicates whether the request was successful:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeSlowLogHistogramAsyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogHistogramAsyncResponseBody self = new DescribeSlowLogHistogramAsyncResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlowLogHistogramAsyncResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSlowLogHistogramAsyncResponseBody setData(DescribeSlowLogHistogramAsyncResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSlowLogHistogramAsyncResponseBodyData getData() {
        return this.data;
    }

    public DescribeSlowLogHistogramAsyncResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSlowLogHistogramAsyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlowLogHistogramAsyncResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeSlowLogHistogramAsyncResponseBodyDataDataItemInsItems extends TeaModel {
        /**
         * <p>The number of executions.</p>
         */
        @NameInMap("Count")
        public java.util.List<Long> count;

        /**
         * <p>The instance role ID.</p>
         * <blockquote>
         * <p>Supported only for ApsaraDB for MongoDB instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2492</p>
         */
        @NameInMap("InsId")
        public String insId;

        /**
         * <p>The instance role.</p>
         * <blockquote>
         * <p>Supported only for ApsaraDB for MongoDB instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>userAdmin</p>
         */
        @NameInMap("InsRole")
        public String insRole;

        /**
         * <p>The number of slow logs on the physical node.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeSlowLogHistogramAsyncResponseBodyDataDataItemInsItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogHistogramAsyncResponseBodyDataDataItemInsItems self = new DescribeSlowLogHistogramAsyncResponseBodyDataDataItemInsItems();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataDataItemInsItems setCount(java.util.List<Long> count) {
            this.count = count;
            return this;
        }
        public java.util.List<Long> getCount() {
            return this.count;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataDataItemInsItems setInsId(String insId) {
            this.insId = insId;
            return this;
        }
        public String getInsId() {
            return this.insId;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataDataItemInsItems setInsRole(String insRole) {
            this.insRole = insRole;
            return this;
        }
        public String getInsRole() {
            return this.insRole;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataDataItemInsItems setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeSlowLogHistogramAsyncResponseBodyDataDataItem extends TeaModel {
        /**
         * <p>The number of slow logs.</p>
         */
        @NameInMap("Count")
        public java.util.List<Long> count;

        /**
         * <p>The trend metrics.</p>
         * <blockquote>
         * <p>Supported only for ApsaraDB for MongoDB instances.</p>
         * </blockquote>
         */
        @NameInMap("InsItems")
        public java.util.List<DescribeSlowLogHistogramAsyncResponseBodyDataDataItemInsItems> insItems;

        /**
         * <p>The instance role.</p>
         * <blockquote>
         * <p>Supported only for ApsaraDB for MongoDB instances.</p>
         * </blockquote>
         */
        @NameInMap("InsRole")
        public String insRole;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1hi0wg57s3n0i3n8-db-0</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The total number of slow logs.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeSlowLogHistogramAsyncResponseBodyDataDataItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogHistogramAsyncResponseBodyDataDataItem self = new DescribeSlowLogHistogramAsyncResponseBodyDataDataItem();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataDataItem setCount(java.util.List<Long> count) {
            this.count = count;
            return this;
        }
        public java.util.List<Long> getCount() {
            return this.count;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataDataItem setInsItems(java.util.List<DescribeSlowLogHistogramAsyncResponseBodyDataDataItemInsItems> insItems) {
            this.insItems = insItems;
            return this;
        }
        public java.util.List<DescribeSlowLogHistogramAsyncResponseBodyDataDataItemInsItems> getInsItems() {
            return this.insItems;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataDataItem setInsRole(String insRole) {
            this.insRole = insRole;
            return this;
        }
        public String getInsRole() {
            return this.insRole;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataDataItem setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataDataItem setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeSlowLogHistogramAsyncResponseBodyDataData extends TeaModel {
        /**
         * <p>The average CPU processing duration. Unit: seconds (s).</p>
         * <blockquote>
         * <p>Only ApsaraDB RDS for SQL Server instances are supported.</p>
         * </blockquote>
         */
        @NameInMap("AvgCPUTime")
        public java.util.List<Double> avgCPUTime;

        /**
         * <p>The average number of document rows scanned.</p>
         * <blockquote>
         * <p>Supported only for ApsaraDB for MongoDB instances.</p>
         * </blockquote>
         */
        @NameInMap("AvgDocExamined")
        public java.util.List<Double> avgDocExamined;

        /**
         * <p>The average number of rows fetched.</p>
         */
        @NameInMap("AvgFrows")
        public java.util.List<Double> avgFrows;

        /**
         * <p>The average number of I/O writes.</p>
         * <blockquote>
         * <p>Only ApsaraDB RDS for SQL Server instances are supported.</p>
         * </blockquote>
         */
        @NameInMap("AvgIOWrites")
        public java.util.List<Double> avgIOWrites;

        /**
         * <p>The average number of index rows scanned.</p>
         * <blockquote>
         * <p>Supported only for ApsaraDB for MongoDB instances.</p>
         * </blockquote>
         */
        @NameInMap("AvgKeysExamined")
        public java.util.List<Double> avgKeysExamined;

        /**
         * <p>The average number of rows affected by the last statement.</p>
         * <blockquote>
         * <p>Only ApsaraDB RDS for SQL Server instances are supported.</p>
         * </blockquote>
         */
        @NameInMap("AvgLastRowsCountAffected")
        public java.util.List<Double> avgLastRowsCountAffected;

        /**
         * <p>The average lock wait time. Unit: seconds.</p>
         */
        @NameInMap("AvgLockTime")
        public java.util.List<Double> avgLockTime;

        /**
         * <p>The average number of logical reads.</p>
         * <blockquote>
         * <p>Only ApsaraDB RDS for SQL Server instances are supported.</p>
         * </blockquote>
         */
        @NameInMap("AvgLogicalIOReads")
        public java.util.List<Double> avgLogicalIOReads;

        /**
         * <p>The average number of physical reads.</p>
         * <blockquote>
         * <p>Only ApsaraDB RDS for SQL Server instances are supported.</p>
         * </blockquote>
         */
        @NameInMap("AvgPhysicalIOReads")
        public java.util.List<Double> avgPhysicalIOReads;

        /**
         * <p>The average number of rows returned.</p>
         * <blockquote>
         * <p>Supported only for ApsaraDB for MongoDB instances.</p>
         * </blockquote>
         */
        @NameInMap("AvgReturnNum")
        public java.util.List<Double> avgReturnNum;

        /**
         * <p>The average number of rows.</p>
         */
        @NameInMap("AvgRows")
        public java.util.List<Double> avgRows;

        /**
         * <p>The average number of rows affected.</p>
         * <blockquote>
         * <p>Only ApsaraDB RDS for SQL Server instances are supported.</p>
         * </blockquote>
         */
        @NameInMap("AvgRowsCountAffected")
        public java.util.List<Double> avgRowsCountAffected;

        /**
         * <p>The average number of rows scanned.</p>
         */
        @NameInMap("AvgRowsExamined")
        public java.util.List<Double> avgRowsExamined;

        /**
         * <p>The average number of rows returned.</p>
         */
        @NameInMap("AvgRowsSent")
        public java.util.List<Double> avgRowsSent;

        /**
         * <p>The average execution duration.</p>
         */
        @NameInMap("AvgRt")
        public java.util.List<Double> avgRt;

        /**
         * <p>The average number of requests.</p>
         */
        @NameInMap("AvgScnt")
        public java.util.List<Double> avgScnt;

        /**
         * <p>The CPU processing duration. Unit: seconds (s).</p>
         * <blockquote>
         * <p>Only ApsaraDB RDS for SQL Server instances are supported.</p>
         * </blockquote>
         */
        @NameInMap("CPUTime")
        public java.util.List<Double> CPUTime;

        /**
         * <p>The slow log count trend.</p>
         */
        @NameInMap("Count")
        public java.util.List<Long> count;

        /**
         * <p>The number of document rows scanned.</p>
         * <blockquote>
         * <p>Supported only for ApsaraDB for MongoDB instances.</p>
         * </blockquote>
         */
        @NameInMap("DocExamined")
        public java.util.List<Long> docExamined;

        /**
         * <p>The number of rows fetched by the compute node (CN) of the PolarDB-X 2.0 database instance.</p>
         * <blockquote>
         * <p>Only ApsaraDB PolarDB-X 2.0 instances are supported.</p>
         * </blockquote>
         */
        @NameInMap("Frows")
        public java.util.List<Long> frows;

        /**
         * <p>The number of I/O writes.</p>
         * <blockquote>
         * <p>Only ApsaraDB RDS for SQL Server instances are supported.</p>
         * </blockquote>
         */
        @NameInMap("IOWrites")
        public java.util.List<Long> IOWrites;

        /**
         * <p>The trend metrics.</p>
         */
        @NameInMap("Item")
        public java.util.List<DescribeSlowLogHistogramAsyncResponseBodyDataDataItem> item;

        /**
         * <p>The number of index rows scanned.</p>
         * <blockquote>
         * <p>Supported only for ApsaraDB for MongoDB instances.</p>
         * </blockquote>
         */
        @NameInMap("KeysExamined")
        public java.util.List<Long> keysExamined;

        /**
         * <p>The number of rows affected by the last statement.</p>
         * <blockquote>
         * <p>Only ApsaraDB RDS for SQL Server instances are supported.</p>
         * </blockquote>
         */
        @NameInMap("LastRowsCountAffected")
        public java.util.List<Long> lastRowsCountAffected;

        /**
         * <p>The total lock wait time. Unit: seconds.</p>
         */
        @NameInMap("LockTime")
        public java.util.List<Double> lockTime;

        /**
         * <p>The number of logical reads.</p>
         * <blockquote>
         * <p>Only ApsaraDB RDS for SQL Server instances are supported.</p>
         * </blockquote>
         */
        @NameInMap("LogicalIOReads")
        public java.util.List<Long> logicalIOReads;

        /**
         * <p>The maximum CPU processing duration. Unit: seconds (s).</p>
         * <blockquote>
         * <p>Only ApsaraDB RDS for SQL Server instances are supported.</p>
         * </blockquote>
         */
        @NameInMap("MaxCPUTime")
        public java.util.List<Double> maxCPUTime;

        /**
         * <p>The maximum number of document rows scanned.</p>
         * <blockquote>
         * <p>Supported only for ApsaraDB for MongoDB instances.</p>
         * </blockquote>
         */
        @NameInMap("MaxDocExamined")
        public java.util.List<Long> maxDocExamined;

        /**
         * <p>The maximum number of rows fetched.</p>
         */
        @NameInMap("MaxFrows")
        public java.util.List<Long> maxFrows;

        /**
         * <p>The maximum number of I/O writes.</p>
         * <blockquote>
         * <p>Only ApsaraDB RDS for SQL Server instances are supported.</p>
         * </blockquote>
         */
        @NameInMap("MaxIOWrites")
        public java.util.List<Long> maxIOWrites;

        /**
         * <p>The maximum number of index rows scanned.</p>
         * <blockquote>
         * <p>Supported only for ApsaraDB for MongoDB instances.</p>
         * </blockquote>
         */
        @NameInMap("MaxKeysExamined")
        public java.util.List<Long> maxKeysExamined;

        /**
         * <p>The maximum number of rows affected by the last statement.</p>
         * <blockquote>
         * <p>Only ApsaraDB RDS for SQL Server instances are supported.</p>
         * </blockquote>
         */
        @NameInMap("MaxLastRowsCountAffected")
        public java.util.List<Long> maxLastRowsCountAffected;

        /**
         * <p>The maximum lock wait time. Unit: seconds.</p>
         */
        @NameInMap("MaxLockTime")
        public java.util.List<Double> maxLockTime;

        /**
         * <p>The maximum number of logical reads.</p>
         * <blockquote>
         * <p>Only ApsaraDB RDS for SQL Server instances are supported.</p>
         * </blockquote>
         */
        @NameInMap("MaxLogicalIOReads")
        public java.util.List<Long> maxLogicalIOReads;

        /**
         * <p>The maximum number of physical reads.</p>
         * <blockquote>
         * <p>Only ApsaraDB RDS for SQL Server instances are supported.</p>
         * </blockquote>
         */
        @NameInMap("MaxPhysicalIOReads")
        public java.util.List<Long> maxPhysicalIOReads;

        /**
         * <p>The maximum number of rows returned.</p>
         * <blockquote>
         * <p>Supported only for ApsaraDB for MongoDB instances.</p>
         * </blockquote>
         */
        @NameInMap("MaxReturnNum")
        public java.util.List<Long> maxReturnNum;

        /**
         * <p>The maximum number of rows.</p>
         */
        @NameInMap("MaxRows")
        public java.util.List<Long> maxRows;

        /**
         * <p>The maximum number of rows affected.</p>
         * <blockquote>
         * <p>Only ApsaraDB RDS for SQL Server instances are supported.</p>
         * </blockquote>
         */
        @NameInMap("MaxRowsCountAffected")
        public java.util.List<Long> maxRowsCountAffected;

        /**
         * <p>The maximum number of rows scanned.</p>
         */
        @NameInMap("MaxRowsExamined")
        public java.util.List<Long> maxRowsExamined;

        /**
         * <p>The maximum number of rows returned.</p>
         */
        @NameInMap("MaxRowsSent")
        public java.util.List<Long> maxRowsSent;

        /**
         * <p>The maximum execution duration. Unit: seconds.</p>
         */
        @NameInMap("MaxRt")
        public java.util.List<Double> maxRt;

        /**
         * <p>The maximum number of requests.</p>
         */
        @NameInMap("MaxScnt")
        public java.util.List<Long> maxScnt;

        /**
         * <p>The number of physical reads.</p>
         * <blockquote>
         * <p>Only ApsaraDB RDS for SQL Server instances are supported.</p>
         * </blockquote>
         */
        @NameInMap("PhysicalIOReads")
        public java.util.List<Long> physicalIOReads;

        /**
         * <p>The number of rows returned.</p>
         * <blockquote>
         * <p>Supported only for ApsaraDB for MongoDB instances.</p>
         * </blockquote>
         */
        @NameInMap("ReturnNum")
        public java.util.List<Long> returnNum;

        /**
         * <p>The total number of rows updated or returned by compute nodes of the PolarDB-X 2.0 database instance.</p>
         * <blockquote>
         * <p>Only ApsaraDB PolarDB-X 2.0 instances are supported.</p>
         * </blockquote>
         */
        @NameInMap("Rows")
        public java.util.List<Long> rows;

        /**
         * <p>The number of rows affected.</p>
         * <blockquote>
         * <p>Only ApsaraDB RDS for SQL Server instances are supported.</p>
         * </blockquote>
         */
        @NameInMap("RowsCountAffected")
        public java.util.List<Long> rowsCountAffected;

        /**
         * <p>The total number of rows scanned.</p>
         * <blockquote>
         * <p>Databases that currently support this field: ApsaraDB RDS for MySQL, ApsaraDB RDS for PostgreSQL, and PolarDB for MySQL.</p>
         * </blockquote>
         */
        @NameInMap("RowsExamined")
        public java.util.List<Long> rowsExamined;

        /**
         * <p>The number of rows returned.</p>
         */
        @NameInMap("RowsSent")
        public java.util.List<Long> rowsSent;

        /**
         * <p>The total execution duration. Unit: seconds.</p>
         */
        @NameInMap("Rt")
        public java.util.List<Double> rt;

        /**
         * <p>The number of DN requests from the compute node (CN) of the PolarDB-X 2.0 database instance.</p>
         * <blockquote>
         * <p>Only ApsaraDB PolarDB-X 2.0 instances are supported.</p>
         * </blockquote>
         */
        @NameInMap("Scnt")
        public java.util.List<Long> scnt;

        /**
         * <p>The total number of records queried.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Total")
        public Long total;

        /**
         * <p>The total number of slow query logs.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        /**
         * <p>Used only for relational databases.</p>
         */
        @NameInMap("Ts")
        public java.util.List<Long> ts;

        /**
         * <p>Not used. Reserved field.</p>
         */
        @NameInMap("TsEnd")
        public java.util.List<Long> tsEnd;

        public static DescribeSlowLogHistogramAsyncResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogHistogramAsyncResponseBodyDataData self = new DescribeSlowLogHistogramAsyncResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setAvgCPUTime(java.util.List<Double> avgCPUTime) {
            this.avgCPUTime = avgCPUTime;
            return this;
        }
        public java.util.List<Double> getAvgCPUTime() {
            return this.avgCPUTime;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setAvgDocExamined(java.util.List<Double> avgDocExamined) {
            this.avgDocExamined = avgDocExamined;
            return this;
        }
        public java.util.List<Double> getAvgDocExamined() {
            return this.avgDocExamined;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setAvgFrows(java.util.List<Double> avgFrows) {
            this.avgFrows = avgFrows;
            return this;
        }
        public java.util.List<Double> getAvgFrows() {
            return this.avgFrows;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setAvgIOWrites(java.util.List<Double> avgIOWrites) {
            this.avgIOWrites = avgIOWrites;
            return this;
        }
        public java.util.List<Double> getAvgIOWrites() {
            return this.avgIOWrites;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setAvgKeysExamined(java.util.List<Double> avgKeysExamined) {
            this.avgKeysExamined = avgKeysExamined;
            return this;
        }
        public java.util.List<Double> getAvgKeysExamined() {
            return this.avgKeysExamined;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setAvgLastRowsCountAffected(java.util.List<Double> avgLastRowsCountAffected) {
            this.avgLastRowsCountAffected = avgLastRowsCountAffected;
            return this;
        }
        public java.util.List<Double> getAvgLastRowsCountAffected() {
            return this.avgLastRowsCountAffected;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setAvgLockTime(java.util.List<Double> avgLockTime) {
            this.avgLockTime = avgLockTime;
            return this;
        }
        public java.util.List<Double> getAvgLockTime() {
            return this.avgLockTime;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setAvgLogicalIOReads(java.util.List<Double> avgLogicalIOReads) {
            this.avgLogicalIOReads = avgLogicalIOReads;
            return this;
        }
        public java.util.List<Double> getAvgLogicalIOReads() {
            return this.avgLogicalIOReads;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setAvgPhysicalIOReads(java.util.List<Double> avgPhysicalIOReads) {
            this.avgPhysicalIOReads = avgPhysicalIOReads;
            return this;
        }
        public java.util.List<Double> getAvgPhysicalIOReads() {
            return this.avgPhysicalIOReads;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setAvgReturnNum(java.util.List<Double> avgReturnNum) {
            this.avgReturnNum = avgReturnNum;
            return this;
        }
        public java.util.List<Double> getAvgReturnNum() {
            return this.avgReturnNum;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setAvgRows(java.util.List<Double> avgRows) {
            this.avgRows = avgRows;
            return this;
        }
        public java.util.List<Double> getAvgRows() {
            return this.avgRows;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setAvgRowsCountAffected(java.util.List<Double> avgRowsCountAffected) {
            this.avgRowsCountAffected = avgRowsCountAffected;
            return this;
        }
        public java.util.List<Double> getAvgRowsCountAffected() {
            return this.avgRowsCountAffected;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setAvgRowsExamined(java.util.List<Double> avgRowsExamined) {
            this.avgRowsExamined = avgRowsExamined;
            return this;
        }
        public java.util.List<Double> getAvgRowsExamined() {
            return this.avgRowsExamined;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setAvgRowsSent(java.util.List<Double> avgRowsSent) {
            this.avgRowsSent = avgRowsSent;
            return this;
        }
        public java.util.List<Double> getAvgRowsSent() {
            return this.avgRowsSent;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setAvgRt(java.util.List<Double> avgRt) {
            this.avgRt = avgRt;
            return this;
        }
        public java.util.List<Double> getAvgRt() {
            return this.avgRt;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setAvgScnt(java.util.List<Double> avgScnt) {
            this.avgScnt = avgScnt;
            return this;
        }
        public java.util.List<Double> getAvgScnt() {
            return this.avgScnt;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setCPUTime(java.util.List<Double> CPUTime) {
            this.CPUTime = CPUTime;
            return this;
        }
        public java.util.List<Double> getCPUTime() {
            return this.CPUTime;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setCount(java.util.List<Long> count) {
            this.count = count;
            return this;
        }
        public java.util.List<Long> getCount() {
            return this.count;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setDocExamined(java.util.List<Long> docExamined) {
            this.docExamined = docExamined;
            return this;
        }
        public java.util.List<Long> getDocExamined() {
            return this.docExamined;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setFrows(java.util.List<Long> frows) {
            this.frows = frows;
            return this;
        }
        public java.util.List<Long> getFrows() {
            return this.frows;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setIOWrites(java.util.List<Long> IOWrites) {
            this.IOWrites = IOWrites;
            return this;
        }
        public java.util.List<Long> getIOWrites() {
            return this.IOWrites;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setItem(java.util.List<DescribeSlowLogHistogramAsyncResponseBodyDataDataItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<DescribeSlowLogHistogramAsyncResponseBodyDataDataItem> getItem() {
            return this.item;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setKeysExamined(java.util.List<Long> keysExamined) {
            this.keysExamined = keysExamined;
            return this;
        }
        public java.util.List<Long> getKeysExamined() {
            return this.keysExamined;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setLastRowsCountAffected(java.util.List<Long> lastRowsCountAffected) {
            this.lastRowsCountAffected = lastRowsCountAffected;
            return this;
        }
        public java.util.List<Long> getLastRowsCountAffected() {
            return this.lastRowsCountAffected;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setLockTime(java.util.List<Double> lockTime) {
            this.lockTime = lockTime;
            return this;
        }
        public java.util.List<Double> getLockTime() {
            return this.lockTime;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setLogicalIOReads(java.util.List<Long> logicalIOReads) {
            this.logicalIOReads = logicalIOReads;
            return this;
        }
        public java.util.List<Long> getLogicalIOReads() {
            return this.logicalIOReads;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setMaxCPUTime(java.util.List<Double> maxCPUTime) {
            this.maxCPUTime = maxCPUTime;
            return this;
        }
        public java.util.List<Double> getMaxCPUTime() {
            return this.maxCPUTime;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setMaxDocExamined(java.util.List<Long> maxDocExamined) {
            this.maxDocExamined = maxDocExamined;
            return this;
        }
        public java.util.List<Long> getMaxDocExamined() {
            return this.maxDocExamined;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setMaxFrows(java.util.List<Long> maxFrows) {
            this.maxFrows = maxFrows;
            return this;
        }
        public java.util.List<Long> getMaxFrows() {
            return this.maxFrows;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setMaxIOWrites(java.util.List<Long> maxIOWrites) {
            this.maxIOWrites = maxIOWrites;
            return this;
        }
        public java.util.List<Long> getMaxIOWrites() {
            return this.maxIOWrites;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setMaxKeysExamined(java.util.List<Long> maxKeysExamined) {
            this.maxKeysExamined = maxKeysExamined;
            return this;
        }
        public java.util.List<Long> getMaxKeysExamined() {
            return this.maxKeysExamined;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setMaxLastRowsCountAffected(java.util.List<Long> maxLastRowsCountAffected) {
            this.maxLastRowsCountAffected = maxLastRowsCountAffected;
            return this;
        }
        public java.util.List<Long> getMaxLastRowsCountAffected() {
            return this.maxLastRowsCountAffected;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setMaxLockTime(java.util.List<Double> maxLockTime) {
            this.maxLockTime = maxLockTime;
            return this;
        }
        public java.util.List<Double> getMaxLockTime() {
            return this.maxLockTime;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setMaxLogicalIOReads(java.util.List<Long> maxLogicalIOReads) {
            this.maxLogicalIOReads = maxLogicalIOReads;
            return this;
        }
        public java.util.List<Long> getMaxLogicalIOReads() {
            return this.maxLogicalIOReads;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setMaxPhysicalIOReads(java.util.List<Long> maxPhysicalIOReads) {
            this.maxPhysicalIOReads = maxPhysicalIOReads;
            return this;
        }
        public java.util.List<Long> getMaxPhysicalIOReads() {
            return this.maxPhysicalIOReads;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setMaxReturnNum(java.util.List<Long> maxReturnNum) {
            this.maxReturnNum = maxReturnNum;
            return this;
        }
        public java.util.List<Long> getMaxReturnNum() {
            return this.maxReturnNum;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setMaxRows(java.util.List<Long> maxRows) {
            this.maxRows = maxRows;
            return this;
        }
        public java.util.List<Long> getMaxRows() {
            return this.maxRows;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setMaxRowsCountAffected(java.util.List<Long> maxRowsCountAffected) {
            this.maxRowsCountAffected = maxRowsCountAffected;
            return this;
        }
        public java.util.List<Long> getMaxRowsCountAffected() {
            return this.maxRowsCountAffected;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setMaxRowsExamined(java.util.List<Long> maxRowsExamined) {
            this.maxRowsExamined = maxRowsExamined;
            return this;
        }
        public java.util.List<Long> getMaxRowsExamined() {
            return this.maxRowsExamined;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setMaxRowsSent(java.util.List<Long> maxRowsSent) {
            this.maxRowsSent = maxRowsSent;
            return this;
        }
        public java.util.List<Long> getMaxRowsSent() {
            return this.maxRowsSent;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setMaxRt(java.util.List<Double> maxRt) {
            this.maxRt = maxRt;
            return this;
        }
        public java.util.List<Double> getMaxRt() {
            return this.maxRt;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setMaxScnt(java.util.List<Long> maxScnt) {
            this.maxScnt = maxScnt;
            return this;
        }
        public java.util.List<Long> getMaxScnt() {
            return this.maxScnt;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setPhysicalIOReads(java.util.List<Long> physicalIOReads) {
            this.physicalIOReads = physicalIOReads;
            return this;
        }
        public java.util.List<Long> getPhysicalIOReads() {
            return this.physicalIOReads;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setReturnNum(java.util.List<Long> returnNum) {
            this.returnNum = returnNum;
            return this;
        }
        public java.util.List<Long> getReturnNum() {
            return this.returnNum;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setRows(java.util.List<Long> rows) {
            this.rows = rows;
            return this;
        }
        public java.util.List<Long> getRows() {
            return this.rows;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setRowsCountAffected(java.util.List<Long> rowsCountAffected) {
            this.rowsCountAffected = rowsCountAffected;
            return this;
        }
        public java.util.List<Long> getRowsCountAffected() {
            return this.rowsCountAffected;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setRowsExamined(java.util.List<Long> rowsExamined) {
            this.rowsExamined = rowsExamined;
            return this;
        }
        public java.util.List<Long> getRowsExamined() {
            return this.rowsExamined;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setRowsSent(java.util.List<Long> rowsSent) {
            this.rowsSent = rowsSent;
            return this;
        }
        public java.util.List<Long> getRowsSent() {
            return this.rowsSent;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setRt(java.util.List<Double> rt) {
            this.rt = rt;
            return this;
        }
        public java.util.List<Double> getRt() {
            return this.rt;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setScnt(java.util.List<Long> scnt) {
            this.scnt = scnt;
            return this;
        }
        public java.util.List<Long> getScnt() {
            return this.scnt;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setTs(java.util.List<Long> ts) {
            this.ts = ts;
            return this;
        }
        public java.util.List<Long> getTs() {
            return this.ts;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyDataData setTsEnd(java.util.List<Long> tsEnd) {
            this.tsEnd = tsEnd;
            return this;
        }
        public java.util.List<Long> getTsEnd() {
            return this.tsEnd;
        }

    }

    public static class DescribeSlowLogHistogramAsyncResponseBodyData extends TeaModel {
        /**
         * <p>The data.</p>
         */
        @NameInMap("Data")
        public DescribeSlowLogHistogramAsyncResponseBodyDataData data;

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>10910</p>
         */
        @NameInMap("ErrorCode")
        public Integer errorCode;

        /**
         * <p>Indicates whether the task is finished.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsFinish")
        public Boolean isFinish;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The key of the request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("RequestKey")
        public String requestKey;

        /**
         * <p>The result ID.</p>
         * 
         * <strong>example:</strong>
         * <p>async__20ee808e72257f16a4fe024057ca****</p>
         */
        @NameInMap("ResultId")
        public String resultId;

        /**
         * <p>The current state. Valid values:</p>
         * <ul>
         * <li><strong>RUNNING</strong>: Running.</li>
         * <li><strong>SUCCESS</strong>: Succeeded.</li>
         * <li><strong>FAIL</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The request time.</p>
         * 
         * <strong>example:</strong>
         * <p>1645668213000</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        public static DescribeSlowLogHistogramAsyncResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogHistogramAsyncResponseBodyData self = new DescribeSlowLogHistogramAsyncResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogHistogramAsyncResponseBodyData setData(DescribeSlowLogHistogramAsyncResponseBodyDataData data) {
            this.data = data;
            return this;
        }
        public DescribeSlowLogHistogramAsyncResponseBodyDataData getData() {
            return this.data;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyData setErrorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public Integer getErrorCode() {
            return this.errorCode;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyData setIsFinish(Boolean isFinish) {
            this.isFinish = isFinish;
            return this;
        }
        public Boolean getIsFinish() {
            return this.isFinish;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyData setRequestKey(String requestKey) {
            this.requestKey = requestKey;
            return this;
        }
        public String getRequestKey() {
            return this.requestKey;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyData setResultId(String resultId) {
            this.resultId = resultId;
            return this;
        }
        public String getResultId() {
            return this.resultId;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeSlowLogHistogramAsyncResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
