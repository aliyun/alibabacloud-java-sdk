// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetGovernanceItemReportResponseBody extends TeaModel {
    @NameInMap("ColumnsSchema")
    public GetGovernanceItemReportResponseBodyColumnsSchema columnsSchema;

    @NameInMap("ColumnsValue")
    public GetGovernanceItemReportResponseBodyColumnsValue columnsValue;

    /**
     * <strong>example:</strong>
     * <p>2020-10-19T15:06:52Z</p>
     */
    @NameInMap("GenerateTime")
    public String generateTime;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    /**
     * <strong>example:</strong>
     * <p>EXAMPLE</p>
     */
    @NameInMap("Marker")
    public String marker;

    /**
     * <strong>example:</strong>
     * <p>Number</p>
     */
    @NameInMap("MetricType")
    public String metricType;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MetricValue")
    public Object metricValue;

    /**
     * <strong>example:</strong>
     * <p>F2CE9688-AA85-5F23-8C22-0EC23473405F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetGovernanceItemReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGovernanceItemReportResponseBody self = new GetGovernanceItemReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGovernanceItemReportResponseBody setColumnsSchema(GetGovernanceItemReportResponseBodyColumnsSchema columnsSchema) {
        this.columnsSchema = columnsSchema;
        return this;
    }
    public GetGovernanceItemReportResponseBodyColumnsSchema getColumnsSchema() {
        return this.columnsSchema;
    }

    public GetGovernanceItemReportResponseBody setColumnsValue(GetGovernanceItemReportResponseBodyColumnsValue columnsValue) {
        this.columnsValue = columnsValue;
        return this;
    }
    public GetGovernanceItemReportResponseBodyColumnsValue getColumnsValue() {
        return this.columnsValue;
    }

    public GetGovernanceItemReportResponseBody setGenerateTime(String generateTime) {
        this.generateTime = generateTime;
        return this;
    }
    public String getGenerateTime() {
        return this.generateTime;
    }

    public GetGovernanceItemReportResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public GetGovernanceItemReportResponseBody setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public GetGovernanceItemReportResponseBody setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public GetGovernanceItemReportResponseBody setMetricValue(Object metricValue) {
        this.metricValue = metricValue;
        return this;
    }
    public Object getMetricValue() {
        return this.metricValue;
    }

    public GetGovernanceItemReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetGovernanceItemReportResponseBodyColumnsSchemaColumnSchema extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>UserPrincipalName</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <strong>example:</strong>
         * <p>String</p>
         */
        @NameInMap("ColumnType")
        public String columnType;

        public static GetGovernanceItemReportResponseBodyColumnsSchemaColumnSchema build(java.util.Map<String, ?> map) throws Exception {
            GetGovernanceItemReportResponseBodyColumnsSchemaColumnSchema self = new GetGovernanceItemReportResponseBodyColumnsSchemaColumnSchema();
            return TeaModel.build(map, self);
        }

        public GetGovernanceItemReportResponseBodyColumnsSchemaColumnSchema setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetGovernanceItemReportResponseBodyColumnsSchemaColumnSchema setColumnType(String columnType) {
            this.columnType = columnType;
            return this;
        }
        public String getColumnType() {
            return this.columnType;
        }

    }

    public static class GetGovernanceItemReportResponseBodyColumnsSchema extends TeaModel {
        @NameInMap("ColumnSchema")
        public java.util.List<GetGovernanceItemReportResponseBodyColumnsSchemaColumnSchema> columnSchema;

        public static GetGovernanceItemReportResponseBodyColumnsSchema build(java.util.Map<String, ?> map) throws Exception {
            GetGovernanceItemReportResponseBodyColumnsSchema self = new GetGovernanceItemReportResponseBodyColumnsSchema();
            return TeaModel.build(map, self);
        }

        public GetGovernanceItemReportResponseBodyColumnsSchema setColumnSchema(java.util.List<GetGovernanceItemReportResponseBodyColumnsSchemaColumnSchema> columnSchema) {
            this.columnSchema = columnSchema;
            return this;
        }
        public java.util.List<GetGovernanceItemReportResponseBodyColumnsSchemaColumnSchema> getColumnSchema() {
            return this.columnSchema;
        }

    }

    public static class GetGovernanceItemReportResponseBodyColumnsValueColumnRow extends TeaModel {
        @NameInMap("ColumnValue")
        public java.util.List<?> columnValue;

        public static GetGovernanceItemReportResponseBodyColumnsValueColumnRow build(java.util.Map<String, ?> map) throws Exception {
            GetGovernanceItemReportResponseBodyColumnsValueColumnRow self = new GetGovernanceItemReportResponseBodyColumnsValueColumnRow();
            return TeaModel.build(map, self);
        }

        public GetGovernanceItemReportResponseBodyColumnsValueColumnRow setColumnValue(java.util.List<?> columnValue) {
            this.columnValue = columnValue;
            return this;
        }
        public java.util.List<?> getColumnValue() {
            return this.columnValue;
        }

    }

    public static class GetGovernanceItemReportResponseBodyColumnsValue extends TeaModel {
        @NameInMap("ColumnRow")
        public java.util.List<GetGovernanceItemReportResponseBodyColumnsValueColumnRow> columnRow;

        public static GetGovernanceItemReportResponseBodyColumnsValue build(java.util.Map<String, ?> map) throws Exception {
            GetGovernanceItemReportResponseBodyColumnsValue self = new GetGovernanceItemReportResponseBodyColumnsValue();
            return TeaModel.build(map, self);
        }

        public GetGovernanceItemReportResponseBodyColumnsValue setColumnRow(java.util.List<GetGovernanceItemReportResponseBodyColumnsValueColumnRow> columnRow) {
            this.columnRow = columnRow;
            return this;
        }
        public java.util.List<GetGovernanceItemReportResponseBodyColumnsValueColumnRow> getColumnRow() {
            return this.columnRow;
        }

    }

}
