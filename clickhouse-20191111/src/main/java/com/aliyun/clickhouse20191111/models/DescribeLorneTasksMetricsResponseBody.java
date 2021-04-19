// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeLorneTasksMetricsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DescribeLorneTasksMetricsResponseBodyData data;

    public static DescribeLorneTasksMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLorneTasksMetricsResponseBody self = new DescribeLorneTasksMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLorneTasksMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLorneTasksMetricsResponseBody setData(DescribeLorneTasksMetricsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeLorneTasksMetricsResponseBodyData getData() {
        return this.data;
    }

    public static class DescribeLorneTasksMetricsResponseBodyData extends TeaModel {
        @NameInMap("Values")
        public java.util.List<String> values;

        @NameInMap("Name")
        public String name;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Columns")
        public java.util.List<String> columns;

        public static DescribeLorneTasksMetricsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLorneTasksMetricsResponseBodyData self = new DescribeLorneTasksMetricsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeLorneTasksMetricsResponseBodyData setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

        public DescribeLorneTasksMetricsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeLorneTasksMetricsResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeLorneTasksMetricsResponseBodyData setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

    }

}
