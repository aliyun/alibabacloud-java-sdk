// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ListDataCheckConfigResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListDataCheckConfigResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListDataCheckConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataCheckConfigResponseBody self = new ListDataCheckConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataCheckConfigResponseBody setData(java.util.List<ListDataCheckConfigResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDataCheckConfigResponseBodyData> getData() {
        return this.data;
    }

    public ListDataCheckConfigResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListDataCheckConfigResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListDataCheckConfigResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListDataCheckConfigResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataCheckConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataCheckConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDataCheckConfigResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDataCheckConfigResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("algorithm")
        public Integer algorithm;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("batchSize")
        public Integer batchSize;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("checkType")
        public Integer checkType;

        /**
         * <strong>example:</strong>
         * <p>=</p>
         */
        @NameInMap("comparator")
        public String comparator;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("extra")
        public String extra;

        /**
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("groupCountThreshold")
        public Float groupCountThreshold;

        /**
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("isFullTableCount")
        public Integer isFullTableCount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("isSkipped")
        public Integer isSkipped;

        /**
         * <strong>example:</strong>
         * <p>CUSTOM_METRIC_MIX</p>
         */
        @NameInMap("metricType")
        public String metricType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sourceCheckAllColumn")
        public Integer sourceCheckAllColumn;

        /**
         * <strong>example:</strong>
         * <p>col_a,col_b</p>
         */
        @NameInMap("sourceColumns")
        public String sourceColumns;

        /**
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("sourceCompareKey")
        public String sourceCompareKey;

        /**
         * <strong>example:</strong>
         * <p>ds_demo</p>
         */
        @NameInMap("sourceDataSource")
        public String sourceDataSource;

        /**
         * <strong>example:</strong>
         * <p>col_a,col_b</p>
         */
        @NameInMap("sourceGroupClause")
        public String sourceGroupClause;

        @NameInMap("sourceHint")
        public String sourceHint;

        /**
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("sourceId")
        public String sourceId;

        /**
         * <strong>example:</strong>
         * <p>ds=20260116</p>
         */
        @NameInMap("sourcePartition")
        public String sourcePartition;

        /**
         * <strong>example:</strong>
         * <p>SELECT * FROM t;</p>
         */
        @NameInMap("sourceSql")
        public String sourceSql;

        /**
         * <strong>example:</strong>
         * <p>table_demo</p>
         */
        @NameInMap("sourceTable")
        public String sourceTable;

        /**
         * <strong>example:</strong>
         * <p>Hive</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <strong>example:</strong>
         * <p>col_a &gt; 0 and col_b = \&quot;x\&quot;</p>
         */
        @NameInMap("sourceWhereClause")
        public String sourceWhereClause;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("targetCheckAllColumn")
        public Integer targetCheckAllColumn;

        /**
         * <strong>example:</strong>
         * <p>col_a,col_b</p>
         */
        @NameInMap("targetColumns")
        public String targetColumns;

        /**
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("targetCompareKey")
        public String targetCompareKey;

        /**
         * <strong>example:</strong>
         * <p>ds_demo</p>
         */
        @NameInMap("targetDataSource")
        public String targetDataSource;

        /**
         * <strong>example:</strong>
         * <p>col_a,col_b</p>
         */
        @NameInMap("targetGroupClause")
        public String targetGroupClause;

        @NameInMap("targetHint")
        public String targetHint;

        /**
         * <strong>example:</strong>
         * <p>2001</p>
         */
        @NameInMap("targetId")
        public String targetId;

        /**
         * <strong>example:</strong>
         * <p>ds=20260116</p>
         */
        @NameInMap("targetPartition")
        public String targetPartition;

        /**
         * <strong>example:</strong>
         * <p>SELECT * FROM t;</p>
         */
        @NameInMap("targetSql")
        public String targetSql;

        /**
         * <strong>example:</strong>
         * <p>table_demo</p>
         */
        @NameInMap("targetTable")
        public String targetTable;

        /**
         * <strong>example:</strong>
         * <p>hive</p>
         */
        @NameInMap("targetType")
        public String targetType;

        /**
         * <strong>example:</strong>
         * <p>col_a &gt; 0 and col_b = \&quot;x\&quot;</p>
         */
        @NameInMap("targetWhereClause")
        public String targetWhereClause;

        /**
         * <strong>example:</strong>
         * <p>lhm|lhm_dw|*</p>
         */
        @NameInMap("taskConfigInfo")
        public String taskConfigInfo;

        /**
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("taskId")
        public Long taskId;

        /**
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("totalCountThreshold")
        public Float totalCountThreshold;

        public static ListDataCheckConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataCheckConfigResponseBodyData self = new ListDataCheckConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataCheckConfigResponseBodyData setAlgorithm(Integer algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public Integer getAlgorithm() {
            return this.algorithm;
        }

        public ListDataCheckConfigResponseBodyData setBatchSize(Integer batchSize) {
            this.batchSize = batchSize;
            return this;
        }
        public Integer getBatchSize() {
            return this.batchSize;
        }

        public ListDataCheckConfigResponseBodyData setCheckType(Integer checkType) {
            this.checkType = checkType;
            return this;
        }
        public Integer getCheckType() {
            return this.checkType;
        }

        public ListDataCheckConfigResponseBodyData setComparator(String comparator) {
            this.comparator = comparator;
            return this;
        }
        public String getComparator() {
            return this.comparator;
        }

        public ListDataCheckConfigResponseBodyData setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public ListDataCheckConfigResponseBodyData setGroupCountThreshold(Float groupCountThreshold) {
            this.groupCountThreshold = groupCountThreshold;
            return this;
        }
        public Float getGroupCountThreshold() {
            return this.groupCountThreshold;
        }

        public ListDataCheckConfigResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDataCheckConfigResponseBodyData setIsFullTableCount(Integer isFullTableCount) {
            this.isFullTableCount = isFullTableCount;
            return this;
        }
        public Integer getIsFullTableCount() {
            return this.isFullTableCount;
        }

        public ListDataCheckConfigResponseBodyData setIsSkipped(Integer isSkipped) {
            this.isSkipped = isSkipped;
            return this;
        }
        public Integer getIsSkipped() {
            return this.isSkipped;
        }

        public ListDataCheckConfigResponseBodyData setMetricType(String metricType) {
            this.metricType = metricType;
            return this;
        }
        public String getMetricType() {
            return this.metricType;
        }

        public ListDataCheckConfigResponseBodyData setSourceCheckAllColumn(Integer sourceCheckAllColumn) {
            this.sourceCheckAllColumn = sourceCheckAllColumn;
            return this;
        }
        public Integer getSourceCheckAllColumn() {
            return this.sourceCheckAllColumn;
        }

        public ListDataCheckConfigResponseBodyData setSourceColumns(String sourceColumns) {
            this.sourceColumns = sourceColumns;
            return this;
        }
        public String getSourceColumns() {
            return this.sourceColumns;
        }

        public ListDataCheckConfigResponseBodyData setSourceCompareKey(String sourceCompareKey) {
            this.sourceCompareKey = sourceCompareKey;
            return this;
        }
        public String getSourceCompareKey() {
            return this.sourceCompareKey;
        }

        public ListDataCheckConfigResponseBodyData setSourceDataSource(String sourceDataSource) {
            this.sourceDataSource = sourceDataSource;
            return this;
        }
        public String getSourceDataSource() {
            return this.sourceDataSource;
        }

        public ListDataCheckConfigResponseBodyData setSourceGroupClause(String sourceGroupClause) {
            this.sourceGroupClause = sourceGroupClause;
            return this;
        }
        public String getSourceGroupClause() {
            return this.sourceGroupClause;
        }

        public ListDataCheckConfigResponseBodyData setSourceHint(String sourceHint) {
            this.sourceHint = sourceHint;
            return this;
        }
        public String getSourceHint() {
            return this.sourceHint;
        }

        public ListDataCheckConfigResponseBodyData setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public ListDataCheckConfigResponseBodyData setSourcePartition(String sourcePartition) {
            this.sourcePartition = sourcePartition;
            return this;
        }
        public String getSourcePartition() {
            return this.sourcePartition;
        }

        public ListDataCheckConfigResponseBodyData setSourceSql(String sourceSql) {
            this.sourceSql = sourceSql;
            return this;
        }
        public String getSourceSql() {
            return this.sourceSql;
        }

        public ListDataCheckConfigResponseBodyData setSourceTable(String sourceTable) {
            this.sourceTable = sourceTable;
            return this;
        }
        public String getSourceTable() {
            return this.sourceTable;
        }

        public ListDataCheckConfigResponseBodyData setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListDataCheckConfigResponseBodyData setSourceWhereClause(String sourceWhereClause) {
            this.sourceWhereClause = sourceWhereClause;
            return this;
        }
        public String getSourceWhereClause() {
            return this.sourceWhereClause;
        }

        public ListDataCheckConfigResponseBodyData setTargetCheckAllColumn(Integer targetCheckAllColumn) {
            this.targetCheckAllColumn = targetCheckAllColumn;
            return this;
        }
        public Integer getTargetCheckAllColumn() {
            return this.targetCheckAllColumn;
        }

        public ListDataCheckConfigResponseBodyData setTargetColumns(String targetColumns) {
            this.targetColumns = targetColumns;
            return this;
        }
        public String getTargetColumns() {
            return this.targetColumns;
        }

        public ListDataCheckConfigResponseBodyData setTargetCompareKey(String targetCompareKey) {
            this.targetCompareKey = targetCompareKey;
            return this;
        }
        public String getTargetCompareKey() {
            return this.targetCompareKey;
        }

        public ListDataCheckConfigResponseBodyData setTargetDataSource(String targetDataSource) {
            this.targetDataSource = targetDataSource;
            return this;
        }
        public String getTargetDataSource() {
            return this.targetDataSource;
        }

        public ListDataCheckConfigResponseBodyData setTargetGroupClause(String targetGroupClause) {
            this.targetGroupClause = targetGroupClause;
            return this;
        }
        public String getTargetGroupClause() {
            return this.targetGroupClause;
        }

        public ListDataCheckConfigResponseBodyData setTargetHint(String targetHint) {
            this.targetHint = targetHint;
            return this;
        }
        public String getTargetHint() {
            return this.targetHint;
        }

        public ListDataCheckConfigResponseBodyData setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public ListDataCheckConfigResponseBodyData setTargetPartition(String targetPartition) {
            this.targetPartition = targetPartition;
            return this;
        }
        public String getTargetPartition() {
            return this.targetPartition;
        }

        public ListDataCheckConfigResponseBodyData setTargetSql(String targetSql) {
            this.targetSql = targetSql;
            return this;
        }
        public String getTargetSql() {
            return this.targetSql;
        }

        public ListDataCheckConfigResponseBodyData setTargetTable(String targetTable) {
            this.targetTable = targetTable;
            return this;
        }
        public String getTargetTable() {
            return this.targetTable;
        }

        public ListDataCheckConfigResponseBodyData setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public ListDataCheckConfigResponseBodyData setTargetWhereClause(String targetWhereClause) {
            this.targetWhereClause = targetWhereClause;
            return this;
        }
        public String getTargetWhereClause() {
            return this.targetWhereClause;
        }

        public ListDataCheckConfigResponseBodyData setTaskConfigInfo(String taskConfigInfo) {
            this.taskConfigInfo = taskConfigInfo;
            return this;
        }
        public String getTaskConfigInfo() {
            return this.taskConfigInfo;
        }

        public ListDataCheckConfigResponseBodyData setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public ListDataCheckConfigResponseBodyData setTotalCountThreshold(Float totalCountThreshold) {
            this.totalCountThreshold = totalCountThreshold;
            return this;
        }
        public Float getTotalCountThreshold() {
            return this.totalCountThreshold;
        }

    }

}
