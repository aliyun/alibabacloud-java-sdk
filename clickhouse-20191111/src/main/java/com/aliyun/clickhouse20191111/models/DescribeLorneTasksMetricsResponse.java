// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeLorneTasksMetricsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public DescribeLorneTasksMetricsResponseData data;

    public static DescribeLorneTasksMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLorneTasksMetricsResponse self = new DescribeLorneTasksMetricsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLorneTasksMetricsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLorneTasksMetricsResponse setData(DescribeLorneTasksMetricsResponseData data) {
        this.data = data;
        return this;
    }
    public DescribeLorneTasksMetricsResponseData getData() {
        return this.data;
    }

    public static class DescribeLorneTasksMetricsResponseData extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        @NameInMap("Columns")
        @Validation(required = true)
        public java.util.List<String> columns;

        @NameInMap("Values")
        @Validation(required = true)
        public java.util.List<String> values;

        public static DescribeLorneTasksMetricsResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLorneTasksMetricsResponseData self = new DescribeLorneTasksMetricsResponseData();
            return TeaModel.build(map, self);
        }

        public DescribeLorneTasksMetricsResponseData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeLorneTasksMetricsResponseData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeLorneTasksMetricsResponseData setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public DescribeLorneTasksMetricsResponseData setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

}
