// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSQLLogsOnSliceResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SliceLogItems")
    public java.util.List<DescribeSQLLogsOnSliceResponseBodySliceLogItems> sliceLogItems;

    public static DescribeSQLLogsOnSliceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogsOnSliceResponseBody self = new DescribeSQLLogsOnSliceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogsOnSliceResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSQLLogsOnSliceResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeSQLLogsOnSliceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSQLLogsOnSliceResponseBody setSliceLogItems(java.util.List<DescribeSQLLogsOnSliceResponseBodySliceLogItems> sliceLogItems) {
        this.sliceLogItems = sliceLogItems;
        return this;
    }
    public java.util.List<DescribeSQLLogsOnSliceResponseBodySliceLogItems> getSliceLogItems() {
        return this.sliceLogItems;
    }

    public static class DescribeSQLLogsOnSliceResponseBodySliceLogItems extends TeaModel {
        @NameInMap("ExecuteCost")
        public Float executeCost;

        @NameInMap("ExecuteStatus")
        public String executeStatus;

        @NameInMap("OperationExecuteEndTime")
        public String operationExecuteEndTime;

        @NameInMap("OperationExecuteTime")
        public String operationExecuteTime;

        @NameInMap("PeakMemory")
        public Float peakMemory;

        @NameInMap("ReturnRowCounts")
        public Long returnRowCounts;

        @NameInMap("SegmentId")
        public String segmentId;

        @NameInMap("SegmentName")
        public String segmentName;

        public static DescribeSQLLogsOnSliceResponseBodySliceLogItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogsOnSliceResponseBodySliceLogItems self = new DescribeSQLLogsOnSliceResponseBodySliceLogItems();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogsOnSliceResponseBodySliceLogItems setExecuteCost(Float executeCost) {
            this.executeCost = executeCost;
            return this;
        }
        public Float getExecuteCost() {
            return this.executeCost;
        }

        public DescribeSQLLogsOnSliceResponseBodySliceLogItems setExecuteStatus(String executeStatus) {
            this.executeStatus = executeStatus;
            return this;
        }
        public String getExecuteStatus() {
            return this.executeStatus;
        }

        public DescribeSQLLogsOnSliceResponseBodySliceLogItems setOperationExecuteEndTime(String operationExecuteEndTime) {
            this.operationExecuteEndTime = operationExecuteEndTime;
            return this;
        }
        public String getOperationExecuteEndTime() {
            return this.operationExecuteEndTime;
        }

        public DescribeSQLLogsOnSliceResponseBodySliceLogItems setOperationExecuteTime(String operationExecuteTime) {
            this.operationExecuteTime = operationExecuteTime;
            return this;
        }
        public String getOperationExecuteTime() {
            return this.operationExecuteTime;
        }

        public DescribeSQLLogsOnSliceResponseBodySliceLogItems setPeakMemory(Float peakMemory) {
            this.peakMemory = peakMemory;
            return this;
        }
        public Float getPeakMemory() {
            return this.peakMemory;
        }

        public DescribeSQLLogsOnSliceResponseBodySliceLogItems setReturnRowCounts(Long returnRowCounts) {
            this.returnRowCounts = returnRowCounts;
            return this;
        }
        public Long getReturnRowCounts() {
            return this.returnRowCounts;
        }

        public DescribeSQLLogsOnSliceResponseBodySliceLogItems setSegmentId(String segmentId) {
            this.segmentId = segmentId;
            return this;
        }
        public String getSegmentId() {
            return this.segmentId;
        }

        public DescribeSQLLogsOnSliceResponseBodySliceLogItems setSegmentName(String segmentName) {
            this.segmentName = segmentName;
            return this;
        }
        public String getSegmentName() {
            return this.segmentName;
        }

    }

}
