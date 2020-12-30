// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeMetaTablePreviewTaskResponseBody extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskProcess")
    public Integer taskProcess;

    @NameInMap("ExecuteTime")
    public Long executeTime;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Data")
    public DescribeMetaTablePreviewTaskResponseBodyData data;

    @NameInMap("TaskStatus")
    public String taskStatus;

    public static DescribeMetaTablePreviewTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetaTablePreviewTaskResponseBody self = new DescribeMetaTablePreviewTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMetaTablePreviewTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeMetaTablePreviewTaskResponseBody setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeMetaTablePreviewTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMetaTablePreviewTaskResponseBody setTaskProcess(Integer taskProcess) {
        this.taskProcess = taskProcess;
        return this;
    }
    public Integer getTaskProcess() {
        return this.taskProcess;
    }

    public DescribeMetaTablePreviewTaskResponseBody setExecuteTime(Long executeTime) {
        this.executeTime = executeTime;
        return this;
    }
    public Long getExecuteTime() {
        return this.executeTime;
    }

    public DescribeMetaTablePreviewTaskResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeMetaTablePreviewTaskResponseBody setData(DescribeMetaTablePreviewTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeMetaTablePreviewTaskResponseBodyData getData() {
        return this.data;
    }

    public DescribeMetaTablePreviewTaskResponseBody setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public static class DescribeMetaTablePreviewTaskResponseBodyDataRowsRowColumns extends TeaModel {
        @NameInMap("Column")
        public java.util.List<String> column;

        public static DescribeMetaTablePreviewTaskResponseBodyDataRowsRowColumns build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetaTablePreviewTaskResponseBodyDataRowsRowColumns self = new DescribeMetaTablePreviewTaskResponseBodyDataRowsRowColumns();
            return TeaModel.build(map, self);
        }

        public DescribeMetaTablePreviewTaskResponseBodyDataRowsRowColumns setColumn(java.util.List<String> column) {
            this.column = column;
            return this;
        }
        public java.util.List<String> getColumn() {
            return this.column;
        }

    }

    public static class DescribeMetaTablePreviewTaskResponseBodyDataRowsRow extends TeaModel {
        @NameInMap("Columns")
        public DescribeMetaTablePreviewTaskResponseBodyDataRowsRowColumns columns;

        public static DescribeMetaTablePreviewTaskResponseBodyDataRowsRow build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetaTablePreviewTaskResponseBodyDataRowsRow self = new DescribeMetaTablePreviewTaskResponseBodyDataRowsRow();
            return TeaModel.build(map, self);
        }

        public DescribeMetaTablePreviewTaskResponseBodyDataRowsRow setColumns(DescribeMetaTablePreviewTaskResponseBodyDataRowsRowColumns columns) {
            this.columns = columns;
            return this;
        }
        public DescribeMetaTablePreviewTaskResponseBodyDataRowsRowColumns getColumns() {
            return this.columns;
        }

    }

    public static class DescribeMetaTablePreviewTaskResponseBodyDataRows extends TeaModel {
        @NameInMap("Row")
        public java.util.List<DescribeMetaTablePreviewTaskResponseBodyDataRowsRow> row;

        public static DescribeMetaTablePreviewTaskResponseBodyDataRows build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetaTablePreviewTaskResponseBodyDataRows self = new DescribeMetaTablePreviewTaskResponseBodyDataRows();
            return TeaModel.build(map, self);
        }

        public DescribeMetaTablePreviewTaskResponseBodyDataRows setRow(java.util.List<DescribeMetaTablePreviewTaskResponseBodyDataRowsRow> row) {
            this.row = row;
            return this;
        }
        public java.util.List<DescribeMetaTablePreviewTaskResponseBodyDataRowsRow> getRow() {
            return this.row;
        }

    }

    public static class DescribeMetaTablePreviewTaskResponseBodyDataHeaders extends TeaModel {
        @NameInMap("Header")
        public java.util.List<String> header;

        public static DescribeMetaTablePreviewTaskResponseBodyDataHeaders build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetaTablePreviewTaskResponseBodyDataHeaders self = new DescribeMetaTablePreviewTaskResponseBodyDataHeaders();
            return TeaModel.build(map, self);
        }

        public DescribeMetaTablePreviewTaskResponseBodyDataHeaders setHeader(java.util.List<String> header) {
            this.header = header;
            return this;
        }
        public java.util.List<String> getHeader() {
            return this.header;
        }

    }

    public static class DescribeMetaTablePreviewTaskResponseBodyData extends TeaModel {
        @NameInMap("Rows")
        public DescribeMetaTablePreviewTaskResponseBodyDataRows rows;

        @NameInMap("Headers")
        public DescribeMetaTablePreviewTaskResponseBodyDataHeaders headers;

        public static DescribeMetaTablePreviewTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetaTablePreviewTaskResponseBodyData self = new DescribeMetaTablePreviewTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMetaTablePreviewTaskResponseBodyData setRows(DescribeMetaTablePreviewTaskResponseBodyDataRows rows) {
            this.rows = rows;
            return this;
        }
        public DescribeMetaTablePreviewTaskResponseBodyDataRows getRows() {
            return this.rows;
        }

        public DescribeMetaTablePreviewTaskResponseBodyData setHeaders(DescribeMetaTablePreviewTaskResponseBodyDataHeaders headers) {
            this.headers = headers;
            return this;
        }
        public DescribeMetaTablePreviewTaskResponseBodyDataHeaders getHeaders() {
            return this.headers;
        }

    }

}
