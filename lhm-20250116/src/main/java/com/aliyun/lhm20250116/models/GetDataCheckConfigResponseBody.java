// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetDataCheckConfigResponseBody extends TeaModel {
    /**
     * <p>The data list returned by the operation. For the structure of each element, see the child field descriptions.</p>
     */
    @NameInMap("data")
    public java.util.List<GetDataCheckConfigResponseBodyData> data;

    /**
     * <p>The error code. An empty string is returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message. An empty string is returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. A value of true indicates success. A value of false indicates failure. If the call fails, check the values of errCode and errMessage for troubleshooting.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetDataCheckConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataCheckConfigResponseBody self = new GetDataCheckConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataCheckConfigResponseBody setData(java.util.List<GetDataCheckConfigResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDataCheckConfigResponseBodyData> getData() {
        return this.data;
    }

    public GetDataCheckConfigResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetDataCheckConfigResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public GetDataCheckConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataCheckConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataCheckConfigResponseBodyData extends TeaModel {
        /**
         * <p>The check algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("algorithm")
        public Integer algorithm;

        /**
         * <p>The batch size.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("batchSize")
        public Integer batchSize;

        /**
         * <p>The check type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("checkType")
        public Integer checkType;

        /**
         * <p>The comparison type. Valid values: =, !=, &gt;, &lt;, &gt;=, &lt;=, contains, does not contain, and ==.</p>
         * 
         * <strong>example:</strong>
         * <p>=</p>
         */
        @NameInMap("comparator")
        public String comparator;

        /**
         * <p>The reserved field.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("extra")
        public String extra;

        /**
         * <p>The group data volume comparison threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("groupCountThreshold")
        public Float groupCountThreshold;

        /**
         * <p>The primary key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Indicates whether a full table count is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("isFullTableCount")
        public Integer isFullTableCount;

        /**
         * <p>Indicates whether the check is skipped.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("isSkipped")
        public Integer isSkipped;

        /**
         * <p>The metric type. Valid values:</p>
         * <ul>
         * <li>CUSTOM_METRIC_NUM: built-in NUM mode.</li>
         * <li>CUSTOM_METRIC_LEN: built-in LEN mode.</li>
         * <li>CUSTOM_METRIC_MIX: built-in MIX mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CUSTOM_METRIC_MIX</p>
         */
        @NameInMap("metricType")
        public String metricType;

        /**
         * <p>Indicates whether all columns are checked on the source side. Valid values:</p>
         * <ul>
         * <li>0: No.</li>
         * <li>1: Yes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sourceCheckAllColumn")
        public Integer sourceCheckAllColumn;

        /**
         * <p>The source table columns. You can specify multiple columns separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>col_a,col_b</p>
         */
        @NameInMap("sourceColumns")
        public String sourceColumns;

        /**
         * <p>The source comparison key.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("sourceCompareKey")
        public String sourceCompareKey;

        /**
         * <p>The name of the source datasource.</p>
         * 
         * <strong>example:</strong>
         * <p>ds_demo</p>
         */
        @NameInMap("sourceDataSource")
        public String sourceDataSource;

        /**
         * <p>The GROUP BY clause for the source table.</p>
         * 
         * <strong>example:</strong>
         * <p>col_a,col_b</p>
         */
        @NameInMap("sourceGroupClause")
        public String sourceGroupClause;

        /**
         * <p>The hint for the source side.</p>
         */
        @NameInMap("sourceHint")
        public String sourceHint;

        /**
         * <p>The ID of the source datasource.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("sourceId")
        public String sourceId;

        /**
         * <p>The source partition.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=20260116</p>
         */
        @NameInMap("sourcePartition")
        public String sourcePartition;

        /**
         * <p>The SQL statement for the source side.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM t;</p>
         */
        @NameInMap("sourceSql")
        public String sourceSql;

        /**
         * <p>The source table.</p>
         * 
         * <strong>example:</strong>
         * <p>table_demo</p>
         */
        @NameInMap("sourceTable")
        public String sourceTable;

        /**
         * <p>The type of the source datasource.</p>
         * 
         * <strong>example:</strong>
         * <p>Hive</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>The WHERE clause for the source table.</p>
         * 
         * <strong>example:</strong>
         * <p>col_a &gt; 0 and col_b = \&quot;x\&quot;</p>
         */
        @NameInMap("sourceWhereClause")
        public String sourceWhereClause;

        /**
         * <p>Indicates whether all columns are checked on the target side. Valid values:</p>
         * <ul>
         * <li>0: No.</li>
         * <li>1: Yes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("targetCheckAllColumn")
        public Integer targetCheckAllColumn;

        /**
         * <p>The target table columns. You can specify multiple columns separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>col_a,col_b</p>
         */
        @NameInMap("targetColumns")
        public String targetColumns;

        /**
         * <p>The target comparison key.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("targetCompareKey")
        public String targetCompareKey;

        /**
         * <p>The target datasource.</p>
         * 
         * <strong>example:</strong>
         * <p>ds_demo</p>
         */
        @NameInMap("targetDataSource")
        public String targetDataSource;

        /**
         * <p>The GROUP BY clause for the target table.</p>
         * 
         * <strong>example:</strong>
         * <p>col_a,col_b</p>
         */
        @NameInMap("targetGroupClause")
        public String targetGroupClause;

        /**
         * <p>The hint for the target side.</p>
         */
        @NameInMap("targetHint")
        public String targetHint;

        /**
         * <p>The ID of the target datasource.</p>
         * 
         * <strong>example:</strong>
         * <p>2001</p>
         */
        @NameInMap("targetId")
        public String targetId;

        /**
         * <p>The target partition.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=20260116</p>
         */
        @NameInMap("targetPartition")
        public String targetPartition;

        /**
         * <p>The SQL statement for the target side.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM t;</p>
         */
        @NameInMap("targetSql")
        public String targetSql;

        /**
         * <p>The target table.</p>
         * 
         * <strong>example:</strong>
         * <p>table_demo</p>
         */
        @NameInMap("targetTable")
        public String targetTable;

        /**
         * <p>The type of the target datasource.</p>
         * 
         * <strong>example:</strong>
         * <p>hive</p>
         */
        @NameInMap("targetType")
        public String targetType;

        /**
         * <p>The WHERE clause for the target table.</p>
         * 
         * <strong>example:</strong>
         * <p>col_a &gt; 0 and col_b = \&quot;x\&quot;</p>
         */
        @NameInMap("targetWhereClause")
        public String targetWhereClause;

        /**
         * <p>The configuration details.</p>
         * 
         * <strong>example:</strong>
         * <p>lhm|lhm_dw|*</p>
         */
        @NameInMap("taskConfigInfo")
        public String taskConfigInfo;

        /**
         * <p>The batch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("taskId")
        public Long taskId;

        /**
         * <p>The total data volume comparison threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("totalCountThreshold")
        public Float totalCountThreshold;

        public static GetDataCheckConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataCheckConfigResponseBodyData self = new GetDataCheckConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataCheckConfigResponseBodyData setAlgorithm(Integer algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public Integer getAlgorithm() {
            return this.algorithm;
        }

        public GetDataCheckConfigResponseBodyData setBatchSize(Integer batchSize) {
            this.batchSize = batchSize;
            return this;
        }
        public Integer getBatchSize() {
            return this.batchSize;
        }

        public GetDataCheckConfigResponseBodyData setCheckType(Integer checkType) {
            this.checkType = checkType;
            return this;
        }
        public Integer getCheckType() {
            return this.checkType;
        }

        public GetDataCheckConfigResponseBodyData setComparator(String comparator) {
            this.comparator = comparator;
            return this;
        }
        public String getComparator() {
            return this.comparator;
        }

        public GetDataCheckConfigResponseBodyData setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public GetDataCheckConfigResponseBodyData setGroupCountThreshold(Float groupCountThreshold) {
            this.groupCountThreshold = groupCountThreshold;
            return this;
        }
        public Float getGroupCountThreshold() {
            return this.groupCountThreshold;
        }

        public GetDataCheckConfigResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDataCheckConfigResponseBodyData setIsFullTableCount(Integer isFullTableCount) {
            this.isFullTableCount = isFullTableCount;
            return this;
        }
        public Integer getIsFullTableCount() {
            return this.isFullTableCount;
        }

        public GetDataCheckConfigResponseBodyData setIsSkipped(Integer isSkipped) {
            this.isSkipped = isSkipped;
            return this;
        }
        public Integer getIsSkipped() {
            return this.isSkipped;
        }

        public GetDataCheckConfigResponseBodyData setMetricType(String metricType) {
            this.metricType = metricType;
            return this;
        }
        public String getMetricType() {
            return this.metricType;
        }

        public GetDataCheckConfigResponseBodyData setSourceCheckAllColumn(Integer sourceCheckAllColumn) {
            this.sourceCheckAllColumn = sourceCheckAllColumn;
            return this;
        }
        public Integer getSourceCheckAllColumn() {
            return this.sourceCheckAllColumn;
        }

        public GetDataCheckConfigResponseBodyData setSourceColumns(String sourceColumns) {
            this.sourceColumns = sourceColumns;
            return this;
        }
        public String getSourceColumns() {
            return this.sourceColumns;
        }

        public GetDataCheckConfigResponseBodyData setSourceCompareKey(String sourceCompareKey) {
            this.sourceCompareKey = sourceCompareKey;
            return this;
        }
        public String getSourceCompareKey() {
            return this.sourceCompareKey;
        }

        public GetDataCheckConfigResponseBodyData setSourceDataSource(String sourceDataSource) {
            this.sourceDataSource = sourceDataSource;
            return this;
        }
        public String getSourceDataSource() {
            return this.sourceDataSource;
        }

        public GetDataCheckConfigResponseBodyData setSourceGroupClause(String sourceGroupClause) {
            this.sourceGroupClause = sourceGroupClause;
            return this;
        }
        public String getSourceGroupClause() {
            return this.sourceGroupClause;
        }

        public GetDataCheckConfigResponseBodyData setSourceHint(String sourceHint) {
            this.sourceHint = sourceHint;
            return this;
        }
        public String getSourceHint() {
            return this.sourceHint;
        }

        public GetDataCheckConfigResponseBodyData setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public GetDataCheckConfigResponseBodyData setSourcePartition(String sourcePartition) {
            this.sourcePartition = sourcePartition;
            return this;
        }
        public String getSourcePartition() {
            return this.sourcePartition;
        }

        public GetDataCheckConfigResponseBodyData setSourceSql(String sourceSql) {
            this.sourceSql = sourceSql;
            return this;
        }
        public String getSourceSql() {
            return this.sourceSql;
        }

        public GetDataCheckConfigResponseBodyData setSourceTable(String sourceTable) {
            this.sourceTable = sourceTable;
            return this;
        }
        public String getSourceTable() {
            return this.sourceTable;
        }

        public GetDataCheckConfigResponseBodyData setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public GetDataCheckConfigResponseBodyData setSourceWhereClause(String sourceWhereClause) {
            this.sourceWhereClause = sourceWhereClause;
            return this;
        }
        public String getSourceWhereClause() {
            return this.sourceWhereClause;
        }

        public GetDataCheckConfigResponseBodyData setTargetCheckAllColumn(Integer targetCheckAllColumn) {
            this.targetCheckAllColumn = targetCheckAllColumn;
            return this;
        }
        public Integer getTargetCheckAllColumn() {
            return this.targetCheckAllColumn;
        }

        public GetDataCheckConfigResponseBodyData setTargetColumns(String targetColumns) {
            this.targetColumns = targetColumns;
            return this;
        }
        public String getTargetColumns() {
            return this.targetColumns;
        }

        public GetDataCheckConfigResponseBodyData setTargetCompareKey(String targetCompareKey) {
            this.targetCompareKey = targetCompareKey;
            return this;
        }
        public String getTargetCompareKey() {
            return this.targetCompareKey;
        }

        public GetDataCheckConfigResponseBodyData setTargetDataSource(String targetDataSource) {
            this.targetDataSource = targetDataSource;
            return this;
        }
        public String getTargetDataSource() {
            return this.targetDataSource;
        }

        public GetDataCheckConfigResponseBodyData setTargetGroupClause(String targetGroupClause) {
            this.targetGroupClause = targetGroupClause;
            return this;
        }
        public String getTargetGroupClause() {
            return this.targetGroupClause;
        }

        public GetDataCheckConfigResponseBodyData setTargetHint(String targetHint) {
            this.targetHint = targetHint;
            return this;
        }
        public String getTargetHint() {
            return this.targetHint;
        }

        public GetDataCheckConfigResponseBodyData setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public GetDataCheckConfigResponseBodyData setTargetPartition(String targetPartition) {
            this.targetPartition = targetPartition;
            return this;
        }
        public String getTargetPartition() {
            return this.targetPartition;
        }

        public GetDataCheckConfigResponseBodyData setTargetSql(String targetSql) {
            this.targetSql = targetSql;
            return this;
        }
        public String getTargetSql() {
            return this.targetSql;
        }

        public GetDataCheckConfigResponseBodyData setTargetTable(String targetTable) {
            this.targetTable = targetTable;
            return this;
        }
        public String getTargetTable() {
            return this.targetTable;
        }

        public GetDataCheckConfigResponseBodyData setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public GetDataCheckConfigResponseBodyData setTargetWhereClause(String targetWhereClause) {
            this.targetWhereClause = targetWhereClause;
            return this;
        }
        public String getTargetWhereClause() {
            return this.targetWhereClause;
        }

        public GetDataCheckConfigResponseBodyData setTaskConfigInfo(String taskConfigInfo) {
            this.taskConfigInfo = taskConfigInfo;
            return this;
        }
        public String getTaskConfigInfo() {
            return this.taskConfigInfo;
        }

        public GetDataCheckConfigResponseBodyData setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public GetDataCheckConfigResponseBodyData setTotalCountThreshold(Float totalCountThreshold) {
            this.totalCountThreshold = totalCountThreshold;
            return this;
        }
        public Float getTotalCountThreshold() {
            return this.totalCountThreshold;
        }

    }

}
