// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetDataCheckTaskConfigResponseBody extends TeaModel {
    /**
     * <p>The data body returned by the operation. For the field structure, see the descriptions of child fields.</p>
     */
    @NameInMap("data")
    public GetDataCheckTaskConfigResponseBodyData data;

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
     * <p>Indicates whether the call is successful. A value of true indicates success. A value of false indicates failure. If the call fails, check errCode and errMessage for troubleshooting.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetDataCheckTaskConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataCheckTaskConfigResponseBody self = new GetDataCheckTaskConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataCheckTaskConfigResponseBody setData(GetDataCheckTaskConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDataCheckTaskConfigResponseBodyData getData() {
        return this.data;
    }

    public GetDataCheckTaskConfigResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetDataCheckTaskConfigResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public GetDataCheckTaskConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataCheckTaskConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataCheckTaskConfigResponseBodyDataDataCheckConfig extends TeaModel {
        /**
         * <p>The validation algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("algorithm")
        public Integer algorithm;

        /**
         * <p>The batch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20001</p>
         */
        @NameInMap("batchId")
        public Long batchId;

        /**
         * <p>The batch size.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("batchSize")
        public Integer batchSize;

        /**
         * <p>The validation rule type. Valid values:</p>
         * <ul>
         * <li>0: data volume comparison.</li>
         * <li>1: metric comparison.</li>
         * <li>2: weak content comparison.</li>
         * <li>3: custom comparison.</li>
         * <li>4: full-text comparison.</li>
         * <li>5: null value ratio comparison.</li>
         * </ul>
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
        public Object extra;

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
         * <p>Specifies whether to perform a full table count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("isFullTableCount")
        public Integer isFullTableCount;

        /**
         * <p>Specifies whether to skip the task. Valid values:</p>
         * <ul>
         * <li>0: No.</li>
         * <li>1: Yes.</li>
         * </ul>
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
         * <p>The source table columns. You can specify multiple columns separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>col_a,col_b</p>
         */
        @NameInMap("sourceColumns")
        public String sourceColumns;

        /**
         * <p>The source comparison key (the key field used for data comparison between the source and destination).</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("sourceCompareKey")
        public String sourceCompareKey;

        /**
         * <p>The source data source name.</p>
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

        @NameInMap("sourceHint")
        public String sourceHint;

        /**
         * <p>The source data source ID.</p>
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
         * <p>The source SQL statement.</p>
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
         * <p>The source data source type.</p>
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
         * <p>The destination table columns. You can specify multiple columns separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>col_a,col_b</p>
         */
        @NameInMap("targetColumns")
        public String targetColumns;

        /**
         * <p>The destination comparison key (the key field used for data comparison between the source and destination).</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("targetCompareKey")
        public String targetCompareKey;

        /**
         * <p>The destination data source.</p>
         * 
         * <strong>example:</strong>
         * <p>ds_demo</p>
         */
        @NameInMap("targetDataSource")
        public String targetDataSource;

        /**
         * <p>The GROUP BY clause for the destination table.</p>
         * 
         * <strong>example:</strong>
         * <p>col_a,col_b</p>
         */
        @NameInMap("targetGroupClause")
        public String targetGroupClause;

        @NameInMap("targetHint")
        public String targetHint;

        /**
         * <p>The destination ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2001</p>
         */
        @NameInMap("targetId")
        public String targetId;

        /**
         * <p>The destination partition.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=20260116</p>
         */
        @NameInMap("targetPartition")
        public String targetPartition;

        /**
         * <p>The destination SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM t;</p>
         */
        @NameInMap("targetSql")
        public String targetSql;

        /**
         * <p>The destination table.</p>
         * 
         * <strong>example:</strong>
         * <p>table_demo</p>
         */
        @NameInMap("targetTable")
        public String targetTable;

        /**
         * <p>The destination data source type.</p>
         * 
         * <strong>example:</strong>
         * <p>hive</p>
         */
        @NameInMap("targetType")
        public String targetType;

        /**
         * <p>The WHERE clause for the destination table.</p>
         * 
         * <strong>example:</strong>
         * <p>col_a &gt; 0 and col_b = \&quot;x\&quot;</p>
         */
        @NameInMap("targetWhereClause")
        public String targetWhereClause;

        /**
         * <p>The validation task configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("taskConfigId")
        public Long taskConfigId;

        /**
         * <p>The validation task configuration information (regular expression matching rules). This parameter takes effect only when taskMode is set to 1.</p>
         * 
         * <strong>example:</strong>
         * <p>lhm|lhm_dw|*</p>
         */
        @NameInMap("taskConfigInfo")
        public String taskConfigInfo;

        /**
         * <p>The validation batch token. Together with batchId, it identifies the result records generated by a validation batch.</p>
         * 
         * <strong>example:</strong>
         * <p>9f2c7a1e4b8d****</p>
         */
        @NameInMap("token")
        public String token;

        /**
         * <p>The total data volume comparison threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("totalCountThreshold")
        public Float totalCountThreshold;

        public static GetDataCheckTaskConfigResponseBodyDataDataCheckConfig build(java.util.Map<String, ?> map) throws Exception {
            GetDataCheckTaskConfigResponseBodyDataDataCheckConfig self = new GetDataCheckTaskConfigResponseBodyDataDataCheckConfig();
            return TeaModel.build(map, self);
        }

        public GetDataCheckTaskConfigResponseBodyDataDataCheckConfig setAlgorithm(Integer algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public Integer getAlgorithm() {
            return this.algorithm;
        }

        public GetDataCheckTaskConfigResponseBodyDataDataCheckConfig setBatchId(Long batchId) {
            this.batchId = batchId;
            return this;
        }
        public Long getBatchId() {
            return this.batchId;
        }

        public GetDataCheckTaskConfigResponseBodyDataDataCheckConfig setBatchSize(Integer batchSize) {
            this.batchSize = batchSize;
            return this;
        }
        public Integer getBatchSize() {
            return this.batchSize;
        }

        public GetDataCheckTaskConfigResponseBodyDataDataCheckConfig setCheckType(Integer checkType) {
            this.checkType = checkType;
            return this;
        }
        public Integer getCheckType() {
            return this.checkType;
        }

        public GetDataCheckTaskConfigResponseBodyDataDataCheckConfig setComparator(String comparator) {
            this.comparator = comparator;
            return this;
        }
        public String getComparator() {
            return this.comparator;
        }

        public GetDataCheckTaskConfigResponseBodyDataDataCheckConfig setExtra(Object extra) {
            this.extra = extra;
            return this;
        }
        public Object getExtra() {
            return this.extra;
        }

        public GetDataCheckTaskConfigResponseBodyDataDataCheckConfig setGroupCountThreshold(Float groupCountThreshold) {
            this.groupCountThreshold = groupCountThreshold;
            return this;
        }
        public Float getGroupCountThreshold() {
            return this.groupCountThreshold;
        }

        public GetDataCheckTaskConfigResponseBodyDataDataCheckConfig setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDataCheckTaskConfigResponseBodyDataDataCheckConfig setIsFullTableCount(Integer isFullTableCount) {
            this.isFullTableCount = isFullTableCount;
            return this;
        }
        public Integer getIsFullTableCount() {
            return this.isFullTableCount;
        }

        public GetDataCheckTaskConfigResponseBodyDataDataCheckConfig setIsSkipped(Integer isSkipped) {
            this.isSkipped = isSkipped;
            return this;
        }
        public Integer getIsSkipped() {
            return this.isSkipped;
        }

        public GetDataCheckTaskConfigResponseBodyDataDataCheckConfig setMetricType(String metricType) {
            this.metricType = metricType;
            return this;
        }
        public String getMetricType() {
            return this.metricType;
        }

        public GetDataCheckTaskConfigResponseBodyDataDataCheckConfig setSourceColumns(String sourceColumns) {
            this.sourceColumns = sourceColumns;
            return this;
        }
        public String getSourceColumns() {
            return this.sourceColumns;
        }

        public GetDataCheckTaskConfigResponseBodyDataDataCheckConfig setSourceCompareKey(String sourceCompareKey) {
            this.sourceCompareKey = sourceCompareKey;
            return this;
        }
        public String getSourceCompareKey() {
            return this.sourceCompareKey;
        }

        public GetDataCheckTaskConfigResponseBodyDataDataCheckConfig setSourceDataSource(String sourceDataSource) {
            this.sourceDataSource = sourceDataSource;
            return this;
        }
        public String getSourceDataSource() {
            return this.sourceDataSource;
        }

        public GetDataCheckTaskConfigResponseBodyDataDataCheckConfig setSourceGroupClause(String sourceGroupClause) {
            this.sourceGroupClause = sourceGroupClause;
            return this;
        }
        public String getSourceGroupClause() {
            return this.sourceGroupClause;
        }

        public GetDataCheckTaskConfigResponseBodyDataDataCheckConfig setSourceHint(String sourceHint) {
            this.sourceHint = sourceHint;
            return this;
        }
        public String getSourceHint() {
            return this.sourceHint;
        }

        public GetDataCheckTaskConfigResponseBodyDataDataCheckConfig setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public GetDataCheckTaskConfigResponseBodyDataDataCheckConfig setSourcePartition(String sourcePartition) {
            this.sourcePartition = sourcePartition;
            return this;
        }
        public String getSourcePartition() {
            return this.sourcePartition;
        }

        public GetDataCheckTaskConfigResponseBodyDataDataCheckConfig setSourceSql(String sourceSql) {
            this.sourceSql = sourceSql;
            return this;
        }
        public String getSourceSql() {
            return this.sourceSql;
        }

        public GetDataCheckTaskConfigResponseBodyDataDataCheckConfig setSourceTable(String sourceTable) {
            this.sourceTable = sourceTable;
            return this;
        }
        public String getSourceTable() {
            return this.sourceTable;
        }

        public GetDataCheckTaskConfigResponseBodyDataDataCheckConfig setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public GetDataCheckTaskConfigResponseBodyDataDataCheckConfig setSourceWhereClause(String sourceWhereClause) {
            this.sourceWhereClause = sourceWhereClause;
            return this;
        }
        public String getSourceWhereClause() {
            return this.sourceWhereClause;
        }

        public GetDataCheckTaskConfigResponseBodyDataDataCheckConfig setTargetColumns(String targetColumns) {
            this.targetColumns = targetColumns;
            return this;
        }
        public String getTargetColumns() {
            return this.targetColumns;
        }

        public GetDataCheckTaskConfigResponseBodyDataDataCheckConfig setTargetCompareKey(String targetCompareKey) {
            this.targetCompareKey = targetCompareKey;
            return this;
        }
        public String getTargetCompareKey() {
            return this.targetCompareKey;
        }

        public GetDataCheckTaskConfigResponseBodyDataDataCheckConfig setTargetDataSource(String targetDataSource) {
            this.targetDataSource = targetDataSource;
            return this;
        }
        public String getTargetDataSource() {
            return this.targetDataSource;
        }

        public GetDataCheckTaskConfigResponseBodyDataDataCheckConfig setTargetGroupClause(String targetGroupClause) {
            this.targetGroupClause = targetGroupClause;
            return this;
        }
        public String getTargetGroupClause() {
            return this.targetGroupClause;
        }

        public GetDataCheckTaskConfigResponseBodyDataDataCheckConfig setTargetHint(String targetHint) {
            this.targetHint = targetHint;
            return this;
        }
        public String getTargetHint() {
            return this.targetHint;
        }

        public GetDataCheckTaskConfigResponseBodyDataDataCheckConfig setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public GetDataCheckTaskConfigResponseBodyDataDataCheckConfig setTargetPartition(String targetPartition) {
            this.targetPartition = targetPartition;
            return this;
        }
        public String getTargetPartition() {
            return this.targetPartition;
        }

        public GetDataCheckTaskConfigResponseBodyDataDataCheckConfig setTargetSql(String targetSql) {
            this.targetSql = targetSql;
            return this;
        }
        public String getTargetSql() {
            return this.targetSql;
        }

        public GetDataCheckTaskConfigResponseBodyDataDataCheckConfig setTargetTable(String targetTable) {
            this.targetTable = targetTable;
            return this;
        }
        public String getTargetTable() {
            return this.targetTable;
        }

        public GetDataCheckTaskConfigResponseBodyDataDataCheckConfig setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public GetDataCheckTaskConfigResponseBodyDataDataCheckConfig setTargetWhereClause(String targetWhereClause) {
            this.targetWhereClause = targetWhereClause;
            return this;
        }
        public String getTargetWhereClause() {
            return this.targetWhereClause;
        }

        public GetDataCheckTaskConfigResponseBodyDataDataCheckConfig setTaskConfigId(Long taskConfigId) {
            this.taskConfigId = taskConfigId;
            return this;
        }
        public Long getTaskConfigId() {
            return this.taskConfigId;
        }

        public GetDataCheckTaskConfigResponseBodyDataDataCheckConfig setTaskConfigInfo(String taskConfigInfo) {
            this.taskConfigInfo = taskConfigInfo;
            return this;
        }
        public String getTaskConfigInfo() {
            return this.taskConfigInfo;
        }

        public GetDataCheckTaskConfigResponseBodyDataDataCheckConfig setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public GetDataCheckTaskConfigResponseBodyDataDataCheckConfig setTotalCountThreshold(Float totalCountThreshold) {
            this.totalCountThreshold = totalCountThreshold;
            return this;
        }
        public Float getTotalCountThreshold() {
            return this.totalCountThreshold;
        }

    }

    public static class GetDataCheckTaskConfigResponseBodyDataScopeFilter extends TeaModel {
        /**
         * <p>The end time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-14 13:59:00</p>
         */
        @NameInMap("end")
        public String end;

        /**
         * <p>The last N parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("lastN")
        public Integer lastN;

        /**
         * <p>The filter type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("scopeFilterType")
        public Integer scopeFilterType;

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-14 11:21:00</p>
         */
        @NameInMap("start")
        public String start;

        public static GetDataCheckTaskConfigResponseBodyDataScopeFilter build(java.util.Map<String, ?> map) throws Exception {
            GetDataCheckTaskConfigResponseBodyDataScopeFilter self = new GetDataCheckTaskConfigResponseBodyDataScopeFilter();
            return TeaModel.build(map, self);
        }

        public GetDataCheckTaskConfigResponseBodyDataScopeFilter setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public GetDataCheckTaskConfigResponseBodyDataScopeFilter setLastN(Integer lastN) {
            this.lastN = lastN;
            return this;
        }
        public Integer getLastN() {
            return this.lastN;
        }

        public GetDataCheckTaskConfigResponseBodyDataScopeFilter setScopeFilterType(Integer scopeFilterType) {
            this.scopeFilterType = scopeFilterType;
            return this;
        }
        public Integer getScopeFilterType() {
            return this.scopeFilterType;
        }

        public GetDataCheckTaskConfigResponseBodyDataScopeFilter setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class GetDataCheckTaskConfigResponseBodyData extends TeaModel {
        /**
         * <p>The batch ID that uniquely identifies a data validation batch.</p>
         * 
         * <strong>example:</strong>
         * <p>20001</p>
         */
        @NameInMap("batchId")
        public Long batchId;

        /**
         * <p>The global node parameter settings (built-in configuration of the data validation service).</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("checkGlobalParams")
        public String checkGlobalParams;

        /**
         * <p>The validation template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("checkTemplateId")
        public String checkTemplateId;

        /**
         * <p>The validation rule type. Valid values:</p>
         * <ul>
         * <li>0: data volume comparison.</li>
         * <li>1: metric comparison.</li>
         * <li>2: weak content comparison.</li>
         * <li>3: custom comparison.</li>
         * <li>4: full-text comparison.</li>
         * <li>5: null value ratio comparison.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("checkType")
        public Integer checkType;

        /**
         * <p>The batch concurrency.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("concurrency")
        public Integer concurrency;

        /**
         * <p>The scheduling cycle expression (cron expression).</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 2 * * ?</p>
         */
        @NameInMap("cronExp")
        public String cronExp;

        /**
         * <p>The task configuration table.</p>
         */
        @NameInMap("dataCheckConfig")
        public java.util.List<GetDataCheckTaskConfigResponseBodyDataDataCheckConfig> dataCheckConfig;

        /**
         * <p>The destination data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2001</p>
         */
        @NameInMap("dstDsId")
        public String dstDsId;

        /**
         * <p>The destination data source name.</p>
         * 
         * <strong>example:</strong>
         * <p>ds_demo</p>
         */
        @NameInMap("dstDsName")
        public String dstDsName;

        /**
         * <p>The destination data source type.</p>
         * 
         * <strong>example:</strong>
         * <p>Hive</p>
         */
        @NameInMap("dstDsType")
        public String dstDsType;

        /**
         * <p>The ID of the destination verification engine.</p>
         * 
         * <strong>example:</strong>
         * <p>2001</p>
         */
        @NameInMap("dstEngineId")
        public String dstEngineId;

        /**
         * <p>The name of the destination verification engine.</p>
         * 
         * <strong>example:</strong>
         * <p>engine_demo</p>
         */
        @NameInMap("dstEngineName")
        public String dstEngineName;

        /**
         * <p>The type of the destination verification engine.</p>
         * 
         * <strong>example:</strong>
         * <p>Tez</p>
         */
        @NameInMap("dstEngineType")
        public String dstEngineType;

        /**
         * <p>The execution type. Valid values:</p>
         * <ul>
         * <li>0: immediate execution</li>
         * <li>1: scheduled execution</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("executeType")
        public Integer executeType;

        /**
         * <p>The count mode. Valid values:</p>
         * <ul>
         * <li>0: count by partition</li>
         * <li>1: count the entire table</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("fullTableCount")
        public Integer fullTableCount;

        /**
         * <p>The group data volume comparison threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("groupCountThreshold")
        public Float groupCountThreshold;

        /**
         * <p>Indicates whether the template is a built-in template. Valid values:</p>
         * <ul>
         * <li>0: No.</li>
         * <li>1: Yes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("isBuiltin")
        public Integer isBuiltin;

        /**
         * <p>Indicates whether scheduling is enabled. Valid values:</p>
         * <ul>
         * <li>0: No.</li>
         * <li>1: Yes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("isScheduled")
        public Integer isScheduled;

        /**
         * <p>Indicates whether the task is on the whitelist. Valid values:</p>
         * <ul>
         * <li>0: No.</li>
         * <li>1: Yes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("isWhiteList")
        public Integer isWhiteList;

        /**
         * <p>The request ID, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
         */
        @NameInMap("requestId")
        public String requestId;

        /**
         * <p>The ID of the scheduled task (scheduling ID).</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("scheduleId")
        public Long scheduleId;

        /**
         * <p>The scope filter JSON data.</p>
         */
        @NameInMap("scopeFilter")
        public GetDataCheckTaskConfigResponseBodyDataScopeFilter scopeFilter;

        /**
         * <p>The source node parameter settings (source execute parameters).</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("sourceGlobalParams")
        public String sourceGlobalParams;

        /**
         * <p>The ID of the source data source.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("srcDsId")
        public String srcDsId;

        /**
         * <p>The name of the source data source.</p>
         * 
         * <strong>example:</strong>
         * <p>ds_demo</p>
         */
        @NameInMap("srcDsName")
        public String srcDsName;

        /**
         * <p>The type of the source data source.</p>
         * 
         * <strong>example:</strong>
         * <p>Hive</p>
         */
        @NameInMap("srcDsType")
        public String srcDsType;

        /**
         * <p>The ID of the source verification engine.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("srcEngineId")
        public String srcEngineId;

        /**
         * <p>The name of the source verification engine.</p>
         * 
         * <strong>example:</strong>
         * <p>engine_demo</p>
         */
        @NameInMap("srcEngineName")
        public String srcEngineName;

        /**
         * <p>The type of the source verification engine.</p>
         * 
         * <strong>example:</strong>
         * <p>Tez</p>
         */
        @NameInMap("srcEngineType")
        public String srcEngineType;

        /**
         * <p>Indicates whether to start the task immediately. Valid values:</p>
         * <ul>
         * <li>0: No.</li>
         * <li>1: Yes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("startImmediately")
        public Integer startImmediately;

        /**
         * <p>The destination node parameter settings (destination execute parameters).</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("targetGlobalParams")
        public String targetGlobalParams;

        /**
         * <p>The regular expression information of the verification task.</p>
         * 
         * <strong>example:</strong>
         * <p>lhm|lhm_dw|*</p>
         */
        @NameInMap("taskConfigInfo")
        public String taskConfigInfo;

        /**
         * <p>The task description.</p>
         * 
         * <strong>example:</strong>
         * <p>Data validation node description</p>
         */
        @NameInMap("taskDescription")
        public String taskDescription;

        /**
         * <p>The task ID, which uniquely identifies a task.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("taskId")
        public Long taskId;

        /**
         * <p>The parameter creation mode. Valid values:</p>
         * <ul>
         * <li>0: fine-grained creation on a per-table basis</li>
         * <li>1: batch creation with the same pattern</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("taskMode")
        public Integer taskMode;

        /**
         * <p>The task name. When used as a query condition, fuzzy matching with % is supported (SQL syntax).</p>
         * 
         * <strong>example:</strong>
         * <p>data_check_task_demo</p>
         */
        @NameInMap("taskName")
        public String taskName;

        /**
         * <p>The name of the verification template.</p>
         * 
         * <strong>example:</strong>
         * <p>Data volume verification template</p>
         */
        @NameInMap("templateName")
        public String templateName;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        /**
         * <p>The total data volume comparison threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("totalCountThreshold")
        public Float totalCountThreshold;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("uid")
        public String uid;

        public static GetDataCheckTaskConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataCheckTaskConfigResponseBodyData self = new GetDataCheckTaskConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataCheckTaskConfigResponseBodyData setBatchId(Long batchId) {
            this.batchId = batchId;
            return this;
        }
        public Long getBatchId() {
            return this.batchId;
        }

        public GetDataCheckTaskConfigResponseBodyData setCheckGlobalParams(String checkGlobalParams) {
            this.checkGlobalParams = checkGlobalParams;
            return this;
        }
        public String getCheckGlobalParams() {
            return this.checkGlobalParams;
        }

        public GetDataCheckTaskConfigResponseBodyData setCheckTemplateId(String checkTemplateId) {
            this.checkTemplateId = checkTemplateId;
            return this;
        }
        public String getCheckTemplateId() {
            return this.checkTemplateId;
        }

        public GetDataCheckTaskConfigResponseBodyData setCheckType(Integer checkType) {
            this.checkType = checkType;
            return this;
        }
        public Integer getCheckType() {
            return this.checkType;
        }

        public GetDataCheckTaskConfigResponseBodyData setConcurrency(Integer concurrency) {
            this.concurrency = concurrency;
            return this;
        }
        public Integer getConcurrency() {
            return this.concurrency;
        }

        public GetDataCheckTaskConfigResponseBodyData setCronExp(String cronExp) {
            this.cronExp = cronExp;
            return this;
        }
        public String getCronExp() {
            return this.cronExp;
        }

        public GetDataCheckTaskConfigResponseBodyData setDataCheckConfig(java.util.List<GetDataCheckTaskConfigResponseBodyDataDataCheckConfig> dataCheckConfig) {
            this.dataCheckConfig = dataCheckConfig;
            return this;
        }
        public java.util.List<GetDataCheckTaskConfigResponseBodyDataDataCheckConfig> getDataCheckConfig() {
            return this.dataCheckConfig;
        }

        public GetDataCheckTaskConfigResponseBodyData setDstDsId(String dstDsId) {
            this.dstDsId = dstDsId;
            return this;
        }
        public String getDstDsId() {
            return this.dstDsId;
        }

        public GetDataCheckTaskConfigResponseBodyData setDstDsName(String dstDsName) {
            this.dstDsName = dstDsName;
            return this;
        }
        public String getDstDsName() {
            return this.dstDsName;
        }

        public GetDataCheckTaskConfigResponseBodyData setDstDsType(String dstDsType) {
            this.dstDsType = dstDsType;
            return this;
        }
        public String getDstDsType() {
            return this.dstDsType;
        }

        public GetDataCheckTaskConfigResponseBodyData setDstEngineId(String dstEngineId) {
            this.dstEngineId = dstEngineId;
            return this;
        }
        public String getDstEngineId() {
            return this.dstEngineId;
        }

        public GetDataCheckTaskConfigResponseBodyData setDstEngineName(String dstEngineName) {
            this.dstEngineName = dstEngineName;
            return this;
        }
        public String getDstEngineName() {
            return this.dstEngineName;
        }

        public GetDataCheckTaskConfigResponseBodyData setDstEngineType(String dstEngineType) {
            this.dstEngineType = dstEngineType;
            return this;
        }
        public String getDstEngineType() {
            return this.dstEngineType;
        }

        public GetDataCheckTaskConfigResponseBodyData setExecuteType(Integer executeType) {
            this.executeType = executeType;
            return this;
        }
        public Integer getExecuteType() {
            return this.executeType;
        }

        public GetDataCheckTaskConfigResponseBodyData setFullTableCount(Integer fullTableCount) {
            this.fullTableCount = fullTableCount;
            return this;
        }
        public Integer getFullTableCount() {
            return this.fullTableCount;
        }

        public GetDataCheckTaskConfigResponseBodyData setGroupCountThreshold(Float groupCountThreshold) {
            this.groupCountThreshold = groupCountThreshold;
            return this;
        }
        public Float getGroupCountThreshold() {
            return this.groupCountThreshold;
        }

        public GetDataCheckTaskConfigResponseBodyData setIsBuiltin(Integer isBuiltin) {
            this.isBuiltin = isBuiltin;
            return this;
        }
        public Integer getIsBuiltin() {
            return this.isBuiltin;
        }

        public GetDataCheckTaskConfigResponseBodyData setIsScheduled(Integer isScheduled) {
            this.isScheduled = isScheduled;
            return this;
        }
        public Integer getIsScheduled() {
            return this.isScheduled;
        }

        public GetDataCheckTaskConfigResponseBodyData setIsWhiteList(Integer isWhiteList) {
            this.isWhiteList = isWhiteList;
            return this;
        }
        public Integer getIsWhiteList() {
            return this.isWhiteList;
        }

        public GetDataCheckTaskConfigResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public GetDataCheckTaskConfigResponseBodyData setScheduleId(Long scheduleId) {
            this.scheduleId = scheduleId;
            return this;
        }
        public Long getScheduleId() {
            return this.scheduleId;
        }

        public GetDataCheckTaskConfigResponseBodyData setScopeFilter(GetDataCheckTaskConfigResponseBodyDataScopeFilter scopeFilter) {
            this.scopeFilter = scopeFilter;
            return this;
        }
        public GetDataCheckTaskConfigResponseBodyDataScopeFilter getScopeFilter() {
            return this.scopeFilter;
        }

        public GetDataCheckTaskConfigResponseBodyData setSourceGlobalParams(String sourceGlobalParams) {
            this.sourceGlobalParams = sourceGlobalParams;
            return this;
        }
        public String getSourceGlobalParams() {
            return this.sourceGlobalParams;
        }

        public GetDataCheckTaskConfigResponseBodyData setSrcDsId(String srcDsId) {
            this.srcDsId = srcDsId;
            return this;
        }
        public String getSrcDsId() {
            return this.srcDsId;
        }

        public GetDataCheckTaskConfigResponseBodyData setSrcDsName(String srcDsName) {
            this.srcDsName = srcDsName;
            return this;
        }
        public String getSrcDsName() {
            return this.srcDsName;
        }

        public GetDataCheckTaskConfigResponseBodyData setSrcDsType(String srcDsType) {
            this.srcDsType = srcDsType;
            return this;
        }
        public String getSrcDsType() {
            return this.srcDsType;
        }

        public GetDataCheckTaskConfigResponseBodyData setSrcEngineId(String srcEngineId) {
            this.srcEngineId = srcEngineId;
            return this;
        }
        public String getSrcEngineId() {
            return this.srcEngineId;
        }

        public GetDataCheckTaskConfigResponseBodyData setSrcEngineName(String srcEngineName) {
            this.srcEngineName = srcEngineName;
            return this;
        }
        public String getSrcEngineName() {
            return this.srcEngineName;
        }

        public GetDataCheckTaskConfigResponseBodyData setSrcEngineType(String srcEngineType) {
            this.srcEngineType = srcEngineType;
            return this;
        }
        public String getSrcEngineType() {
            return this.srcEngineType;
        }

        public GetDataCheckTaskConfigResponseBodyData setStartImmediately(Integer startImmediately) {
            this.startImmediately = startImmediately;
            return this;
        }
        public Integer getStartImmediately() {
            return this.startImmediately;
        }

        public GetDataCheckTaskConfigResponseBodyData setTargetGlobalParams(String targetGlobalParams) {
            this.targetGlobalParams = targetGlobalParams;
            return this;
        }
        public String getTargetGlobalParams() {
            return this.targetGlobalParams;
        }

        public GetDataCheckTaskConfigResponseBodyData setTaskConfigInfo(String taskConfigInfo) {
            this.taskConfigInfo = taskConfigInfo;
            return this;
        }
        public String getTaskConfigInfo() {
            return this.taskConfigInfo;
        }

        public GetDataCheckTaskConfigResponseBodyData setTaskDescription(String taskDescription) {
            this.taskDescription = taskDescription;
            return this;
        }
        public String getTaskDescription() {
            return this.taskDescription;
        }

        public GetDataCheckTaskConfigResponseBodyData setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public GetDataCheckTaskConfigResponseBodyData setTaskMode(Integer taskMode) {
            this.taskMode = taskMode;
            return this;
        }
        public Integer getTaskMode() {
            return this.taskMode;
        }

        public GetDataCheckTaskConfigResponseBodyData setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public GetDataCheckTaskConfigResponseBodyData setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public GetDataCheckTaskConfigResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetDataCheckTaskConfigResponseBodyData setTotalCountThreshold(Float totalCountThreshold) {
            this.totalCountThreshold = totalCountThreshold;
            return this;
        }
        public Float getTotalCountThreshold() {
            return this.totalCountThreshold;
        }

        public GetDataCheckTaskConfigResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
