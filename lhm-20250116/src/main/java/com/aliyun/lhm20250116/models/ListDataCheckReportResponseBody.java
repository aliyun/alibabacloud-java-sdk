// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ListDataCheckReportResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListDataCheckReportResponseBodyData> data;

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

    public static ListDataCheckReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataCheckReportResponseBody self = new ListDataCheckReportResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataCheckReportResponseBody setData(java.util.List<ListDataCheckReportResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDataCheckReportResponseBodyData> getData() {
        return this.data;
    }

    public ListDataCheckReportResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListDataCheckReportResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListDataCheckReportResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListDataCheckReportResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataCheckReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataCheckReportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDataCheckReportResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDataCheckReportResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20001</p>
         */
        @NameInMap("batchId")
        public Long batchId;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("checkColumCount")
        public Long checkColumCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("checkResult")
        public Integer checkResult;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("compareRowCount")
        public Long compareRowCount;

        /**
         * <strong>example:</strong>
         * <p>95.00%</p>
         */
        @NameInMap("completionRate")
        public String completionRate;

        /**
         * <strong>example:</strong>
         * <p>0.00%</p>
         */
        @NameInMap("diffRate")
        public String diffRate;

        /**
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("dstCompareColumn")
        public String dstCompareColumn;

        @NameInMap("dstHint")
        public String dstHint;

        /**
         * <strong>example:</strong>
         * <p>amount</p>
         */
        @NameInMap("dstMetricName")
        public String dstMetricName;

        @NameInMap("dstSqlList")
        public java.util.List<String> dstSqlList;

        /**
         * <strong>example:</strong>
         * <p>connection timeout</p>
         */
        @NameInMap("errorMsg")
        public String errorMsg;

        /**
         * <strong>example:</strong>
         * <p>2026-01-16 10:00:00</p>
         */
        @NameInMap("execTime")
        public String execTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("expDiffCount")
        public String expDiffCount;

        /**
         * <strong>example:</strong>
         * <p>2026-01-16T10:00:00Z</p>
         */
        @NameInMap("finishTime")
        public String finishTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("isSkipped")
        public Integer isSkipped;

        /**
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("jobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("jobStatus")
        public Integer jobStatus;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("metricColumCount")
        public Long metricColumCount;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("metricPassColumCount")
        public Long metricPassColumCount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("onlyDstCount")
        public Long onlyDstCount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("onlySrcCount")
        public Long onlySrcCount;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("passColumCount")
        public Long passColumCount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("realDiffCount")
        public Long realDiffCount;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("realSameCount")
        public Long realSameCount;

        /**
         * <strong>example:</strong>
         * <p>30001</p>
         */
        @NameInMap("resultId")
        public String resultId;

        /**
         * <strong>example:</strong>
         * <p>amount</p>
         */
        @NameInMap("sourceColumn")
        public String sourceColumn;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("sourceCount")
        public String sourceCount;

        /**
         * <strong>example:</strong>
         * <p>ds_demo</p>
         */
        @NameInMap("sourceDataSource")
        public String sourceDataSource;

        /**
         * <strong>example:</strong>
         * <p>Table \&quot;src_db.src_table\&quot; doesn\&quot;t exist</p>
         */
        @NameInMap("sourceError")
        public String sourceError;

        /**
         * <strong>example:</strong>
         * <p>col_a,col_b</p>
         */
        @NameInMap("sourceGroupClause")
        public String sourceGroupClause;

        /**
         * <strong>example:</strong>
         * <p>ds=20260116</p>
         */
        @NameInMap("sourcePartition")
        public String sourcePartition;

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
         * <p>id</p>
         */
        @NameInMap("srcCompareColumn")
        public String srcCompareColumn;

        @NameInMap("srcHint")
        public String srcHint;

        /**
         * <strong>example:</strong>
         * <p>amount</p>
         */
        @NameInMap("srcMetricName")
        public String srcMetricName;

        @NameInMap("srcSqlList")
        public java.util.List<String> srcSqlList;

        /**
         * <strong>example:</strong>
         * <p>amount</p>
         */
        @NameInMap("targetColumn")
        public String targetColumn;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("targetCount")
        public String targetCount;

        /**
         * <strong>example:</strong>
         * <p>ds_demo</p>
         */
        @NameInMap("targetDataSource")
        public String targetDataSource;

        /**
         * <strong>example:</strong>
         * <p>Table \&quot;dst_db.dst_table\&quot; doesn\&quot;t exist</p>
         */
        @NameInMap("targetError")
        public String targetError;

        /**
         * <strong>example:</strong>
         * <p>col_a,col_b</p>
         */
        @NameInMap("targetGroupClause")
        public String targetGroupClause;

        /**
         * <strong>example:</strong>
         * <p>ds=20260116</p>
         */
        @NameInMap("targetPartition")
        public String targetPartition;

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
         * <p>1001</p>
         */
        @NameInMap("taskConfigId")
        public Long taskConfigId;

        /**
         * <strong>example:</strong>
         * <p>数据量校验模板</p>
         */
        @NameInMap("templateName")
        public String templateName;

        /**
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("threshold")
        public Float threshold;

        /**
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("totalCountThreshold")
        public String totalCountThreshold;

        public static ListDataCheckReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataCheckReportResponseBodyData self = new ListDataCheckReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataCheckReportResponseBodyData setBatchId(Long batchId) {
            this.batchId = batchId;
            return this;
        }
        public Long getBatchId() {
            return this.batchId;
        }

        public ListDataCheckReportResponseBodyData setCheckColumCount(Long checkColumCount) {
            this.checkColumCount = checkColumCount;
            return this;
        }
        public Long getCheckColumCount() {
            return this.checkColumCount;
        }

        public ListDataCheckReportResponseBodyData setCheckResult(Integer checkResult) {
            this.checkResult = checkResult;
            return this;
        }
        public Integer getCheckResult() {
            return this.checkResult;
        }

        public ListDataCheckReportResponseBodyData setCompareRowCount(Long compareRowCount) {
            this.compareRowCount = compareRowCount;
            return this;
        }
        public Long getCompareRowCount() {
            return this.compareRowCount;
        }

        public ListDataCheckReportResponseBodyData setCompletionRate(String completionRate) {
            this.completionRate = completionRate;
            return this;
        }
        public String getCompletionRate() {
            return this.completionRate;
        }

        public ListDataCheckReportResponseBodyData setDiffRate(String diffRate) {
            this.diffRate = diffRate;
            return this;
        }
        public String getDiffRate() {
            return this.diffRate;
        }

        public ListDataCheckReportResponseBodyData setDstCompareColumn(String dstCompareColumn) {
            this.dstCompareColumn = dstCompareColumn;
            return this;
        }
        public String getDstCompareColumn() {
            return this.dstCompareColumn;
        }

        public ListDataCheckReportResponseBodyData setDstHint(String dstHint) {
            this.dstHint = dstHint;
            return this;
        }
        public String getDstHint() {
            return this.dstHint;
        }

        public ListDataCheckReportResponseBodyData setDstMetricName(String dstMetricName) {
            this.dstMetricName = dstMetricName;
            return this;
        }
        public String getDstMetricName() {
            return this.dstMetricName;
        }

        public ListDataCheckReportResponseBodyData setDstSqlList(java.util.List<String> dstSqlList) {
            this.dstSqlList = dstSqlList;
            return this;
        }
        public java.util.List<String> getDstSqlList() {
            return this.dstSqlList;
        }

        public ListDataCheckReportResponseBodyData setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public ListDataCheckReportResponseBodyData setExecTime(String execTime) {
            this.execTime = execTime;
            return this;
        }
        public String getExecTime() {
            return this.execTime;
        }

        public ListDataCheckReportResponseBodyData setExpDiffCount(String expDiffCount) {
            this.expDiffCount = expDiffCount;
            return this;
        }
        public String getExpDiffCount() {
            return this.expDiffCount;
        }

        public ListDataCheckReportResponseBodyData setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public ListDataCheckReportResponseBodyData setIsSkipped(Integer isSkipped) {
            this.isSkipped = isSkipped;
            return this;
        }
        public Integer getIsSkipped() {
            return this.isSkipped;
        }

        public ListDataCheckReportResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListDataCheckReportResponseBodyData setJobStatus(Integer jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public Integer getJobStatus() {
            return this.jobStatus;
        }

        public ListDataCheckReportResponseBodyData setMetricColumCount(Long metricColumCount) {
            this.metricColumCount = metricColumCount;
            return this;
        }
        public Long getMetricColumCount() {
            return this.metricColumCount;
        }

        public ListDataCheckReportResponseBodyData setMetricPassColumCount(Long metricPassColumCount) {
            this.metricPassColumCount = metricPassColumCount;
            return this;
        }
        public Long getMetricPassColumCount() {
            return this.metricPassColumCount;
        }

        public ListDataCheckReportResponseBodyData setOnlyDstCount(Long onlyDstCount) {
            this.onlyDstCount = onlyDstCount;
            return this;
        }
        public Long getOnlyDstCount() {
            return this.onlyDstCount;
        }

        public ListDataCheckReportResponseBodyData setOnlySrcCount(Long onlySrcCount) {
            this.onlySrcCount = onlySrcCount;
            return this;
        }
        public Long getOnlySrcCount() {
            return this.onlySrcCount;
        }

        public ListDataCheckReportResponseBodyData setPassColumCount(Long passColumCount) {
            this.passColumCount = passColumCount;
            return this;
        }
        public Long getPassColumCount() {
            return this.passColumCount;
        }

        public ListDataCheckReportResponseBodyData setRealDiffCount(Long realDiffCount) {
            this.realDiffCount = realDiffCount;
            return this;
        }
        public Long getRealDiffCount() {
            return this.realDiffCount;
        }

        public ListDataCheckReportResponseBodyData setRealSameCount(Long realSameCount) {
            this.realSameCount = realSameCount;
            return this;
        }
        public Long getRealSameCount() {
            return this.realSameCount;
        }

        public ListDataCheckReportResponseBodyData setResultId(String resultId) {
            this.resultId = resultId;
            return this;
        }
        public String getResultId() {
            return this.resultId;
        }

        public ListDataCheckReportResponseBodyData setSourceColumn(String sourceColumn) {
            this.sourceColumn = sourceColumn;
            return this;
        }
        public String getSourceColumn() {
            return this.sourceColumn;
        }

        public ListDataCheckReportResponseBodyData setSourceCount(String sourceCount) {
            this.sourceCount = sourceCount;
            return this;
        }
        public String getSourceCount() {
            return this.sourceCount;
        }

        public ListDataCheckReportResponseBodyData setSourceDataSource(String sourceDataSource) {
            this.sourceDataSource = sourceDataSource;
            return this;
        }
        public String getSourceDataSource() {
            return this.sourceDataSource;
        }

        public ListDataCheckReportResponseBodyData setSourceError(String sourceError) {
            this.sourceError = sourceError;
            return this;
        }
        public String getSourceError() {
            return this.sourceError;
        }

        public ListDataCheckReportResponseBodyData setSourceGroupClause(String sourceGroupClause) {
            this.sourceGroupClause = sourceGroupClause;
            return this;
        }
        public String getSourceGroupClause() {
            return this.sourceGroupClause;
        }

        public ListDataCheckReportResponseBodyData setSourcePartition(String sourcePartition) {
            this.sourcePartition = sourcePartition;
            return this;
        }
        public String getSourcePartition() {
            return this.sourcePartition;
        }

        public ListDataCheckReportResponseBodyData setSourceTable(String sourceTable) {
            this.sourceTable = sourceTable;
            return this;
        }
        public String getSourceTable() {
            return this.sourceTable;
        }

        public ListDataCheckReportResponseBodyData setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListDataCheckReportResponseBodyData setSourceWhereClause(String sourceWhereClause) {
            this.sourceWhereClause = sourceWhereClause;
            return this;
        }
        public String getSourceWhereClause() {
            return this.sourceWhereClause;
        }

        public ListDataCheckReportResponseBodyData setSrcCompareColumn(String srcCompareColumn) {
            this.srcCompareColumn = srcCompareColumn;
            return this;
        }
        public String getSrcCompareColumn() {
            return this.srcCompareColumn;
        }

        public ListDataCheckReportResponseBodyData setSrcHint(String srcHint) {
            this.srcHint = srcHint;
            return this;
        }
        public String getSrcHint() {
            return this.srcHint;
        }

        public ListDataCheckReportResponseBodyData setSrcMetricName(String srcMetricName) {
            this.srcMetricName = srcMetricName;
            return this;
        }
        public String getSrcMetricName() {
            return this.srcMetricName;
        }

        public ListDataCheckReportResponseBodyData setSrcSqlList(java.util.List<String> srcSqlList) {
            this.srcSqlList = srcSqlList;
            return this;
        }
        public java.util.List<String> getSrcSqlList() {
            return this.srcSqlList;
        }

        public ListDataCheckReportResponseBodyData setTargetColumn(String targetColumn) {
            this.targetColumn = targetColumn;
            return this;
        }
        public String getTargetColumn() {
            return this.targetColumn;
        }

        public ListDataCheckReportResponseBodyData setTargetCount(String targetCount) {
            this.targetCount = targetCount;
            return this;
        }
        public String getTargetCount() {
            return this.targetCount;
        }

        public ListDataCheckReportResponseBodyData setTargetDataSource(String targetDataSource) {
            this.targetDataSource = targetDataSource;
            return this;
        }
        public String getTargetDataSource() {
            return this.targetDataSource;
        }

        public ListDataCheckReportResponseBodyData setTargetError(String targetError) {
            this.targetError = targetError;
            return this;
        }
        public String getTargetError() {
            return this.targetError;
        }

        public ListDataCheckReportResponseBodyData setTargetGroupClause(String targetGroupClause) {
            this.targetGroupClause = targetGroupClause;
            return this;
        }
        public String getTargetGroupClause() {
            return this.targetGroupClause;
        }

        public ListDataCheckReportResponseBodyData setTargetPartition(String targetPartition) {
            this.targetPartition = targetPartition;
            return this;
        }
        public String getTargetPartition() {
            return this.targetPartition;
        }

        public ListDataCheckReportResponseBodyData setTargetTable(String targetTable) {
            this.targetTable = targetTable;
            return this;
        }
        public String getTargetTable() {
            return this.targetTable;
        }

        public ListDataCheckReportResponseBodyData setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public ListDataCheckReportResponseBodyData setTargetWhereClause(String targetWhereClause) {
            this.targetWhereClause = targetWhereClause;
            return this;
        }
        public String getTargetWhereClause() {
            return this.targetWhereClause;
        }

        public ListDataCheckReportResponseBodyData setTaskConfigId(Long taskConfigId) {
            this.taskConfigId = taskConfigId;
            return this;
        }
        public Long getTaskConfigId() {
            return this.taskConfigId;
        }

        public ListDataCheckReportResponseBodyData setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListDataCheckReportResponseBodyData setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public ListDataCheckReportResponseBodyData setTotalCountThreshold(String totalCountThreshold) {
            this.totalCountThreshold = totalCountThreshold;
            return this;
        }
        public String getTotalCountThreshold() {
            return this.totalCountThreshold;
        }

    }

}
