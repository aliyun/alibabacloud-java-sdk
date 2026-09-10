// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ListDataCheckReportStepByJobIdResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListDataCheckReportStepByJobIdResponseBodyData> data;

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

    public static ListDataCheckReportStepByJobIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataCheckReportStepByJobIdResponseBody self = new ListDataCheckReportStepByJobIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataCheckReportStepByJobIdResponseBody setData(java.util.List<ListDataCheckReportStepByJobIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDataCheckReportStepByJobIdResponseBodyData> getData() {
        return this.data;
    }

    public ListDataCheckReportStepByJobIdResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListDataCheckReportStepByJobIdResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListDataCheckReportStepByJobIdResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListDataCheckReportStepByJobIdResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataCheckReportStepByJobIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataCheckReportStepByJobIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDataCheckReportStepByJobIdResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDataCheckReportStepByJobIdResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>R[1-&gt;1000)</p>
         */
        @NameInMap("boundary")
        public String boundary;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("checkColumCount")
        public Long checkColumCount;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("dstCount")
        public String dstCount;

        /**
         * <strong>example:</strong>
         * <p>SELECT * FROM dst_table;</p>
         */
        @NameInMap("dstSql")
        public String dstSql;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("errMessage")
        public String errMessage;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("extra")
        public String extra;

        /**
         * <strong>example:</strong>
         * <p>2026-01-16T10:00:00Z</p>
         */
        @NameInMap("gmtEnd")
        public String gmtEnd;

        /**
         * <strong>example:</strong>
         * <p>2026-01-16T10:00:00Z</p>
         */
        @NameInMap("gmtStart")
        public String gmtStart;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("isConsistent")
        public Integer isConsistent;

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
         * <p>8</p>
         */
        @NameInMap("passColumCount")
        public Long passColumCount;

        /**
         * <strong>example:</strong>
         * <p>30001</p>
         */
        @NameInMap("resultId")
        public String resultId;

        /**
         * <strong>example:</strong>
         * <p>ds=20260116</p>
         */
        @NameInMap("sourcePtName")
        public String sourcePtName;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("srcCount")
        public String srcCount;

        /**
         * <strong>example:</strong>
         * <p>SELECT * FROM src_table;</p>
         */
        @NameInMap("srcSql")
        public String srcSql;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("stepId")
        public String stepId;

        /**
         * <strong>example:</strong>
         * <p>ds=20260116</p>
         */
        @NameInMap("targetPtName")
        public String targetPtName;

        public static ListDataCheckReportStepByJobIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataCheckReportStepByJobIdResponseBodyData self = new ListDataCheckReportStepByJobIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataCheckReportStepByJobIdResponseBodyData setBoundary(String boundary) {
            this.boundary = boundary;
            return this;
        }
        public String getBoundary() {
            return this.boundary;
        }

        public ListDataCheckReportStepByJobIdResponseBodyData setCheckColumCount(Long checkColumCount) {
            this.checkColumCount = checkColumCount;
            return this;
        }
        public Long getCheckColumCount() {
            return this.checkColumCount;
        }

        public ListDataCheckReportStepByJobIdResponseBodyData setDstCount(String dstCount) {
            this.dstCount = dstCount;
            return this;
        }
        public String getDstCount() {
            return this.dstCount;
        }

        public ListDataCheckReportStepByJobIdResponseBodyData setDstSql(String dstSql) {
            this.dstSql = dstSql;
            return this;
        }
        public String getDstSql() {
            return this.dstSql;
        }

        public ListDataCheckReportStepByJobIdResponseBodyData setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
        }

        public ListDataCheckReportStepByJobIdResponseBodyData setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public ListDataCheckReportStepByJobIdResponseBodyData setGmtEnd(String gmtEnd) {
            this.gmtEnd = gmtEnd;
            return this;
        }
        public String getGmtEnd() {
            return this.gmtEnd;
        }

        public ListDataCheckReportStepByJobIdResponseBodyData setGmtStart(String gmtStart) {
            this.gmtStart = gmtStart;
            return this;
        }
        public String getGmtStart() {
            return this.gmtStart;
        }

        public ListDataCheckReportStepByJobIdResponseBodyData setIsConsistent(Integer isConsistent) {
            this.isConsistent = isConsistent;
            return this;
        }
        public Integer getIsConsistent() {
            return this.isConsistent;
        }

        public ListDataCheckReportStepByJobIdResponseBodyData setMetricColumCount(Long metricColumCount) {
            this.metricColumCount = metricColumCount;
            return this;
        }
        public Long getMetricColumCount() {
            return this.metricColumCount;
        }

        public ListDataCheckReportStepByJobIdResponseBodyData setMetricPassColumCount(Long metricPassColumCount) {
            this.metricPassColumCount = metricPassColumCount;
            return this;
        }
        public Long getMetricPassColumCount() {
            return this.metricPassColumCount;
        }

        public ListDataCheckReportStepByJobIdResponseBodyData setPassColumCount(Long passColumCount) {
            this.passColumCount = passColumCount;
            return this;
        }
        public Long getPassColumCount() {
            return this.passColumCount;
        }

        public ListDataCheckReportStepByJobIdResponseBodyData setResultId(String resultId) {
            this.resultId = resultId;
            return this;
        }
        public String getResultId() {
            return this.resultId;
        }

        public ListDataCheckReportStepByJobIdResponseBodyData setSourcePtName(String sourcePtName) {
            this.sourcePtName = sourcePtName;
            return this;
        }
        public String getSourcePtName() {
            return this.sourcePtName;
        }

        public ListDataCheckReportStepByJobIdResponseBodyData setSrcCount(String srcCount) {
            this.srcCount = srcCount;
            return this;
        }
        public String getSrcCount() {
            return this.srcCount;
        }

        public ListDataCheckReportStepByJobIdResponseBodyData setSrcSql(String srcSql) {
            this.srcSql = srcSql;
            return this;
        }
        public String getSrcSql() {
            return this.srcSql;
        }

        public ListDataCheckReportStepByJobIdResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListDataCheckReportStepByJobIdResponseBodyData setStepId(String stepId) {
            this.stepId = stepId;
            return this;
        }
        public String getStepId() {
            return this.stepId;
        }

        public ListDataCheckReportStepByJobIdResponseBodyData setTargetPtName(String targetPtName) {
            this.targetPtName = targetPtName;
            return this;
        }
        public String getTargetPtName() {
            return this.targetPtName;
        }

    }

}
