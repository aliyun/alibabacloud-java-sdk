// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ListDataCheckReportStepResponseBody extends TeaModel {
    /**
     * <p>The data list returned by the operation. For the structure of each element, see the child field descriptions.</p>
     */
    @NameInMap("data")
    public java.util.List<ListDataCheckReportStepResponseBodyData> data;

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
     * <p>The page number, starting from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <p>The page size, which is the number of records returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues with this call.</p>
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

    /**
     * <p>The total number of records that meet the query conditions. This value is used for pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListDataCheckReportStepResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataCheckReportStepResponseBody self = new ListDataCheckReportStepResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataCheckReportStepResponseBody setData(java.util.List<ListDataCheckReportStepResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDataCheckReportStepResponseBodyData> getData() {
        return this.data;
    }

    public ListDataCheckReportStepResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListDataCheckReportStepResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListDataCheckReportStepResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListDataCheckReportStepResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataCheckReportStepResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataCheckReportStepResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDataCheckReportStepResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDataCheckReportStepResponseBodyData extends TeaModel {
        /**
         * <p>The shard boundary information.</p>
         * 
         * <strong>example:</strong>
         * <p>R[1-&gt;1000)</p>
         */
        @NameInMap("boundary")
        public String boundary;

        /**
         * <p>The number of verified fields.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("checkColumCount")
        public Long checkColumCount;

        /**
         * <p>The destination data volume. For single-SQL verification, this indicates the data volume of the destination result set. For data volume verification and full verification, this indicates the total data volume on the destination.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("dstCount")
        public String dstCount;

        /**
         * <p>The SQL statement executed on the destination.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM dst_table;</p>
         */
        @NameInMap("dstSql")
        public String dstSql;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("errMessage")
        public String errMessage;

        /**
         * <p>The reserved field.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("extra")
        public String extra;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-16T10:00:00Z</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>The job end time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-16T10:00:00Z</p>
         */
        @NameInMap("gmtEnd")
        public String gmtEnd;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-16T10:00:00Z</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>The job start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-16T10:00:00Z</p>
         */
        @NameInMap("gmtStart")
        public String gmtStart;

        /**
         * <p>The primary key ID that uniquely identifies a record.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Indicates whether the data is consistent. Valid values:</p>
         * <ul>
         * <li>0: inconsistent.</li>
         * <li>1: consistent.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("isConsistent")
        public Integer isConsistent;

        /**
         * <p>The unique job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("jobId")
        public Long jobId;

        /**
         * <p>The number of verified metrics.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("metricColumCount")
        public Long metricColumCount;

        /**
         * <p>The number of metrics that passed verification.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("metricPassColumCount")
        public Long metricPassColumCount;

        /**
         * <p>The number of fields that passed verification.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("passColumCount")
        public Long passColumCount;

        /**
         * <p>The unique ID of the verification result.</p>
         * 
         * <strong>example:</strong>
         * <p>30001</p>
         */
        @NameInMap("resultId")
        public String resultId;

        /**
         * <p>The list of label names.</p>
         */
        @NameInMap("signNameList")
        public java.util.List<String> signNameList;

        /**
         * <p>The source partition name.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=20260116</p>
         */
        @NameInMap("sourcePtName")
        public String sourcePtName;

        /**
         * <p>The source data volume. For single-SQL verification, this indicates the data volume of the source result set. For data volume verification and full verification, this indicates the total data volume on the source.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("srcCount")
        public String srcCount;

        /**
         * <p>The SQL statement executed on the source.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM src_table;</p>
         */
        @NameInMap("srcSql")
        public String srcSql;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>0: created.</li>
         * <li>1: running.</li>
         * <li>2: completed.</li>
         * <li>3: stopped.</li>
         * <li>4: canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("status")
        public Integer status;

        /**
         * <p>The step ID that uniquely identifies an execution step within the job.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("stepId")
        public String stepId;

        /**
         * <p>The destination partition name.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=20260116</p>
         */
        @NameInMap("targetPtName")
        public String targetPtName;

        public static ListDataCheckReportStepResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataCheckReportStepResponseBodyData self = new ListDataCheckReportStepResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataCheckReportStepResponseBodyData setBoundary(String boundary) {
            this.boundary = boundary;
            return this;
        }
        public String getBoundary() {
            return this.boundary;
        }

        public ListDataCheckReportStepResponseBodyData setCheckColumCount(Long checkColumCount) {
            this.checkColumCount = checkColumCount;
            return this;
        }
        public Long getCheckColumCount() {
            return this.checkColumCount;
        }

        public ListDataCheckReportStepResponseBodyData setDstCount(String dstCount) {
            this.dstCount = dstCount;
            return this;
        }
        public String getDstCount() {
            return this.dstCount;
        }

        public ListDataCheckReportStepResponseBodyData setDstSql(String dstSql) {
            this.dstSql = dstSql;
            return this;
        }
        public String getDstSql() {
            return this.dstSql;
        }

        public ListDataCheckReportStepResponseBodyData setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
        }

        public ListDataCheckReportStepResponseBodyData setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public ListDataCheckReportStepResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDataCheckReportStepResponseBodyData setGmtEnd(String gmtEnd) {
            this.gmtEnd = gmtEnd;
            return this;
        }
        public String getGmtEnd() {
            return this.gmtEnd;
        }

        public ListDataCheckReportStepResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListDataCheckReportStepResponseBodyData setGmtStart(String gmtStart) {
            this.gmtStart = gmtStart;
            return this;
        }
        public String getGmtStart() {
            return this.gmtStart;
        }

        public ListDataCheckReportStepResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDataCheckReportStepResponseBodyData setIsConsistent(Integer isConsistent) {
            this.isConsistent = isConsistent;
            return this;
        }
        public Integer getIsConsistent() {
            return this.isConsistent;
        }

        public ListDataCheckReportStepResponseBodyData setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public ListDataCheckReportStepResponseBodyData setMetricColumCount(Long metricColumCount) {
            this.metricColumCount = metricColumCount;
            return this;
        }
        public Long getMetricColumCount() {
            return this.metricColumCount;
        }

        public ListDataCheckReportStepResponseBodyData setMetricPassColumCount(Long metricPassColumCount) {
            this.metricPassColumCount = metricPassColumCount;
            return this;
        }
        public Long getMetricPassColumCount() {
            return this.metricPassColumCount;
        }

        public ListDataCheckReportStepResponseBodyData setPassColumCount(Long passColumCount) {
            this.passColumCount = passColumCount;
            return this;
        }
        public Long getPassColumCount() {
            return this.passColumCount;
        }

        public ListDataCheckReportStepResponseBodyData setResultId(String resultId) {
            this.resultId = resultId;
            return this;
        }
        public String getResultId() {
            return this.resultId;
        }

        public ListDataCheckReportStepResponseBodyData setSignNameList(java.util.List<String> signNameList) {
            this.signNameList = signNameList;
            return this;
        }
        public java.util.List<String> getSignNameList() {
            return this.signNameList;
        }

        public ListDataCheckReportStepResponseBodyData setSourcePtName(String sourcePtName) {
            this.sourcePtName = sourcePtName;
            return this;
        }
        public String getSourcePtName() {
            return this.sourcePtName;
        }

        public ListDataCheckReportStepResponseBodyData setSrcCount(String srcCount) {
            this.srcCount = srcCount;
            return this;
        }
        public String getSrcCount() {
            return this.srcCount;
        }

        public ListDataCheckReportStepResponseBodyData setSrcSql(String srcSql) {
            this.srcSql = srcSql;
            return this;
        }
        public String getSrcSql() {
            return this.srcSql;
        }

        public ListDataCheckReportStepResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListDataCheckReportStepResponseBodyData setStepId(String stepId) {
            this.stepId = stepId;
            return this;
        }
        public String getStepId() {
            return this.stepId;
        }

        public ListDataCheckReportStepResponseBodyData setTargetPtName(String targetPtName) {
            this.targetPtName = targetPtName;
            return this;
        }
        public String getTargetPtName() {
            return this.targetPtName;
        }

    }

}
