// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSlowLogHistogramAsyncResponseBody extends TeaModel {
    /**
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
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
        @NameInMap("Count")
        public java.util.List<Long> count;

        /**
         * <strong>example:</strong>
         * <p>2492</p>
         */
        @NameInMap("InsId")
        public String insId;

        /**
         * <strong>example:</strong>
         * <p>userAdmin</p>
         */
        @NameInMap("InsRole")
        public String insRole;

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

    }

    public static class DescribeSlowLogHistogramAsyncResponseBodyDataDataItem extends TeaModel {
        @NameInMap("Count")
        public java.util.List<Long> count;

        @NameInMap("InsItems")
        public java.util.List<DescribeSlowLogHistogramAsyncResponseBodyDataDataItemInsItems> insItems;

        /**
         * <strong>example:</strong>
         * <p>r-bp1hi0wg57s3n0i3n8-db-0</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

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

        public DescribeSlowLogHistogramAsyncResponseBodyDataDataItem setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

    public static class DescribeSlowLogHistogramAsyncResponseBodyDataData extends TeaModel {
        @NameInMap("AvgCPUTime")
        public java.util.List<Double> avgCPUTime;

        @NameInMap("AvgDocExamined")
        public java.util.List<Double> avgDocExamined;

        @NameInMap("AvgFrows")
        public java.util.List<Double> avgFrows;

        @NameInMap("AvgIOWrites")
        public java.util.List<Double> avgIOWrites;

        @NameInMap("AvgKeysExamined")
        public java.util.List<Double> avgKeysExamined;

        @NameInMap("AvgLastRowsCountAffected")
        public java.util.List<Double> avgLastRowsCountAffected;

        @NameInMap("AvgLockTime")
        public java.util.List<Double> avgLockTime;

        @NameInMap("AvgLogicalIOReads")
        public java.util.List<Double> avgLogicalIOReads;

        @NameInMap("AvgPhysicalIOReads")
        public java.util.List<Double> avgPhysicalIOReads;

        @NameInMap("AvgReturnNum")
        public java.util.List<Double> avgReturnNum;

        @NameInMap("AvgRows")
        public java.util.List<Double> avgRows;

        @NameInMap("AvgRowsCountAffected")
        public java.util.List<Double> avgRowsCountAffected;

        @NameInMap("AvgRowsExamined")
        public java.util.List<Double> avgRowsExamined;

        @NameInMap("AvgRowsSent")
        public java.util.List<Double> avgRowsSent;

        @NameInMap("AvgRt")
        public java.util.List<Double> avgRt;

        @NameInMap("AvgScnt")
        public java.util.List<Double> avgScnt;

        @NameInMap("CPUTime")
        public java.util.List<Double> CPUTime;

        @NameInMap("Count")
        public java.util.List<Long> count;

        @NameInMap("DocExamined")
        public java.util.List<Long> docExamined;

        @NameInMap("Frows")
        public java.util.List<Long> frows;

        @NameInMap("IOWrites")
        public java.util.List<Long> IOWrites;

        @NameInMap("Item")
        public java.util.List<DescribeSlowLogHistogramAsyncResponseBodyDataDataItem> item;

        @NameInMap("KeysExamined")
        public java.util.List<Long> keysExamined;

        @NameInMap("LastRowsCountAffected")
        public java.util.List<Long> lastRowsCountAffected;

        @NameInMap("LockTime")
        public java.util.List<Double> lockTime;

        @NameInMap("LogicalIOReads")
        public java.util.List<Long> logicalIOReads;

        @NameInMap("MaxCPUTime")
        public java.util.List<Double> maxCPUTime;

        @NameInMap("MaxDocExamined")
        public java.util.List<Long> maxDocExamined;

        @NameInMap("MaxFrows")
        public java.util.List<Long> maxFrows;

        @NameInMap("MaxIOWrites")
        public java.util.List<Long> maxIOWrites;

        @NameInMap("MaxKeysExamined")
        public java.util.List<Long> maxKeysExamined;

        @NameInMap("MaxLastRowsCountAffected")
        public java.util.List<Long> maxLastRowsCountAffected;

        @NameInMap("MaxLockTime")
        public java.util.List<Double> maxLockTime;

        @NameInMap("MaxLogicalIOReads")
        public java.util.List<Long> maxLogicalIOReads;

        @NameInMap("MaxPhysicalIOReads")
        public java.util.List<Long> maxPhysicalIOReads;

        @NameInMap("MaxReturnNum")
        public java.util.List<Long> maxReturnNum;

        @NameInMap("MaxRows")
        public java.util.List<Long> maxRows;

        @NameInMap("MaxRowsCountAffected")
        public java.util.List<Long> maxRowsCountAffected;

        @NameInMap("MaxRowsExamined")
        public java.util.List<Long> maxRowsExamined;

        @NameInMap("MaxRowsSent")
        public java.util.List<Long> maxRowsSent;

        @NameInMap("MaxRt")
        public java.util.List<Double> maxRt;

        @NameInMap("MaxScnt")
        public java.util.List<Long> maxScnt;

        @NameInMap("PhysicalIOReads")
        public java.util.List<Long> physicalIOReads;

        @NameInMap("ReturnNum")
        public java.util.List<Long> returnNum;

        @NameInMap("Rows")
        public java.util.List<Long> rows;

        @NameInMap("RowsCountAffected")
        public java.util.List<Long> rowsCountAffected;

        @NameInMap("RowsExamined")
        public java.util.List<Long> rowsExamined;

        @NameInMap("RowsSent")
        public java.util.List<Long> rowsSent;

        @NameInMap("Rt")
        public java.util.List<Double> rt;

        @NameInMap("Scnt")
        public java.util.List<Long> scnt;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Total")
        public Long total;

        @NameInMap("Ts")
        public java.util.List<Long> ts;

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
        @NameInMap("Data")
        public DescribeSlowLogHistogramAsyncResponseBodyDataData data;

        /**
         * <strong>example:</strong>
         * <p>10910</p>
         */
        @NameInMap("ErrorCode")
        public Integer errorCode;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsFinish")
        public Boolean isFinish;

        /**
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        @NameInMap("Message")
        public String message;

        @NameInMap("RequestKey")
        public String requestKey;

        /**
         * <strong>example:</strong>
         * <p>async__20ee808e72257f16a4fe024057ca****</p>
         */
        @NameInMap("ResultId")
        public String resultId;

        /**
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("State")
        public String state;

        /**
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
