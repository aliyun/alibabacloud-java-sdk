// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeRestoreSummaryResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("HasMoreRestoreRecord")
    public Integer hasMoreRestoreRecord;

    @NameInMap("Rescords")
    public DescribeRestoreSummaryResponseBodyRescords rescords;

    public static DescribeRestoreSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestoreSummaryResponseBody self = new DescribeRestoreSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRestoreSummaryResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRestoreSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRestoreSummaryResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRestoreSummaryResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeRestoreSummaryResponseBody setHasMoreRestoreRecord(Integer hasMoreRestoreRecord) {
        this.hasMoreRestoreRecord = hasMoreRestoreRecord;
        return this;
    }
    public Integer getHasMoreRestoreRecord() {
        return this.hasMoreRestoreRecord;
    }

    public DescribeRestoreSummaryResponseBody setRescords(DescribeRestoreSummaryResponseBodyRescords rescords) {
        this.rescords = rescords;
        return this;
    }
    public DescribeRestoreSummaryResponseBodyRescords getRescords() {
        return this.rescords;
    }

    public static class DescribeRestoreSummaryResponseBodyRescordsRescord extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("SchemaProcess")
        public String schemaProcess;

        @NameInMap("BulkLoadProcess")
        public String bulkLoadProcess;

        @NameInMap("RecordId")
        public String recordId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("LogProcess")
        public String logProcess;

        @NameInMap("HfileRestoreProcess")
        public String hfileRestoreProcess;

        public static DescribeRestoreSummaryResponseBodyRescordsRescord build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreSummaryResponseBodyRescordsRescord self = new DescribeRestoreSummaryResponseBodyRescordsRescord();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreSummaryResponseBodyRescordsRescord setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRestoreSummaryResponseBodyRescordsRescord setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeRestoreSummaryResponseBodyRescordsRescord setSchemaProcess(String schemaProcess) {
            this.schemaProcess = schemaProcess;
            return this;
        }
        public String getSchemaProcess() {
            return this.schemaProcess;
        }

        public DescribeRestoreSummaryResponseBodyRescordsRescord setBulkLoadProcess(String bulkLoadProcess) {
            this.bulkLoadProcess = bulkLoadProcess;
            return this;
        }
        public String getBulkLoadProcess() {
            return this.bulkLoadProcess;
        }

        public DescribeRestoreSummaryResponseBodyRescordsRescord setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public DescribeRestoreSummaryResponseBodyRescordsRescord setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeRestoreSummaryResponseBodyRescordsRescord setLogProcess(String logProcess) {
            this.logProcess = logProcess;
            return this;
        }
        public String getLogProcess() {
            return this.logProcess;
        }

        public DescribeRestoreSummaryResponseBodyRescordsRescord setHfileRestoreProcess(String hfileRestoreProcess) {
            this.hfileRestoreProcess = hfileRestoreProcess;
            return this;
        }
        public String getHfileRestoreProcess() {
            return this.hfileRestoreProcess;
        }

    }

    public static class DescribeRestoreSummaryResponseBodyRescords extends TeaModel {
        @NameInMap("Rescord")
        public java.util.List<DescribeRestoreSummaryResponseBodyRescordsRescord> rescord;

        public static DescribeRestoreSummaryResponseBodyRescords build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreSummaryResponseBodyRescords self = new DescribeRestoreSummaryResponseBodyRescords();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreSummaryResponseBodyRescords setRescord(java.util.List<DescribeRestoreSummaryResponseBodyRescordsRescord> rescord) {
            this.rescord = rescord;
            return this;
        }
        public java.util.List<DescribeRestoreSummaryResponseBodyRescordsRescord> getRescord() {
            return this.rescord;
        }

    }

}
