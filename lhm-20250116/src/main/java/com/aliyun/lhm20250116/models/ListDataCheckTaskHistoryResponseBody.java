// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ListDataCheckTaskHistoryResponseBody extends TeaModel {
    /**
     * <p>The data list returned by the operation. For the element structure, see the child field descriptions.</p>
     */
    @NameInMap("data")
    public java.util.List<ListDataCheckTaskHistoryResponseBodyData> data;

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

    /**
     * <p>The total number of records that match the query conditions. This value is used for pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListDataCheckTaskHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataCheckTaskHistoryResponseBody self = new ListDataCheckTaskHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataCheckTaskHistoryResponseBody setData(java.util.List<ListDataCheckTaskHistoryResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDataCheckTaskHistoryResponseBodyData> getData() {
        return this.data;
    }

    public ListDataCheckTaskHistoryResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListDataCheckTaskHistoryResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListDataCheckTaskHistoryResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListDataCheckTaskHistoryResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataCheckTaskHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataCheckTaskHistoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDataCheckTaskHistoryResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDataCheckTaskHistoryResponseBodyData extends TeaModel {
        /**
         * <p>The batch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20001</p>
         */
        @NameInMap("batchId")
        public Long batchId;

        /**
         * <p>The business field.</p>
         * 
         * <strong>example:</strong>
         * <p>lhm</p>
         */
        @NameInMap("biz")
        public String biz;

        /**
         * <p>The execution result. Valid values: no record, passed, or not passed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("checkResult")
        public Integer checkResult;

        /**
         * <p>The number of checked tables.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("checkTableNum")
        public Long checkTableNum;

        /**
         * <p>The concurrency of the batch.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("concurrency")
        public Long concurrency;

        /**
         * <p>The creator.</p>
         * 
         * <strong>example:</strong>
         * <p>user001</p>
         */
        @NameInMap("creator")
        public String creator;

        /**
         * <p>The scheduling cycle expression.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 2 * * ?</p>
         */
        @NameInMap("cronExp")
        public String cronExp;

        /**
         * <p>The end time, in the format of YYYY-MM-DD HH:MM:SS.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-16 12:00:00</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>connection timeout</p>
         */
        @NameInMap("errorMsg")
        public String errorMsg;

        /**
         * <p>The number of error tables.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("errorTableNum")
        public Long errorTableNum;

        /**
         * <p>The execution status. Valid values: pending, running, stopped, failed, or completed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("execStatus")
        public Integer execStatus;

        /**
         * <p>The execution duration, in the format of HH:MM:SS.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-16 10:00:00</p>
         */
        @NameInMap("execTime")
        public String execTime;

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
         * <p>2026-01-16 10:00:00</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>The last modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-16 10:00:00</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>The updater.</p>
         * 
         * <strong>example:</strong>
         * <p>user001</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>The original batch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("originBatchId")
        public Long originBatchId;

        /**
         * <p>The check pass rate.</p>
         * 
         * <strong>example:</strong>
         * <p>0.95</p>
         */
        @NameInMap("passProcess")
        public Double passProcess;

        /**
         * <p>The pass rate (export report field), calculated by dividing the number of passed tables by the total number of checked tables. The value is returned as a string with a percent sign and two decimal places (for example, 100.00%). If no checked table data exists, the value is -.</p>
         * 
         * <strong>example:</strong>
         * <p>100.00%</p>
         */
        @NameInMap("passProcessExport")
        public String passProcessExport;

        /**
         * <p>The task progress.</p>
         * 
         * <strong>example:</strong>
         * <p>0.95</p>
         */
        @NameInMap("progress")
        public Double progress;

        /**
         * <p>The check report time, which is the completion time of the last job.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01 12:00:00</p>
         */
        @NameInMap("reportTime")
        public String reportTime;

        /**
         * <p>The check report title.</p>
         * 
         * <strong>example:</strong>
         * <p>Data Validation Report</p>
         */
        @NameInMap("reportTitle")
        public String reportTitle;

        /**
         * <p>The scheduled task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("scheduleId")
        public Long scheduleId;

        /**
         * <p>The task number.</p>
         * 
         * <strong>example:</strong>
         * <p>SEQ20260116001</p>
         */
        @NameInMap("seqId")
        public String seqId;

        /**
         * <p>The number of skipped tables.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("skipTableNum")
        public Integer skipTableNum;

        /**
         * <p>The start time, in the format of YYYY-MM-DD HH:MM:SS.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-16 10:00:00</p>
         */
        @NameInMap("startTime")
        public String startTime;

        /**
         * <p>The number of successful tables.</p>
         * 
         * <strong>example:</strong>
         * <p>95</p>
         */
        @NameInMap("successfulTableNum")
        public Long successfulTableNum;

        public static ListDataCheckTaskHistoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataCheckTaskHistoryResponseBodyData self = new ListDataCheckTaskHistoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataCheckTaskHistoryResponseBodyData setBatchId(Long batchId) {
            this.batchId = batchId;
            return this;
        }
        public Long getBatchId() {
            return this.batchId;
        }

        public ListDataCheckTaskHistoryResponseBodyData setBiz(String biz) {
            this.biz = biz;
            return this;
        }
        public String getBiz() {
            return this.biz;
        }

        public ListDataCheckTaskHistoryResponseBodyData setCheckResult(Integer checkResult) {
            this.checkResult = checkResult;
            return this;
        }
        public Integer getCheckResult() {
            return this.checkResult;
        }

        public ListDataCheckTaskHistoryResponseBodyData setCheckTableNum(Long checkTableNum) {
            this.checkTableNum = checkTableNum;
            return this;
        }
        public Long getCheckTableNum() {
            return this.checkTableNum;
        }

        public ListDataCheckTaskHistoryResponseBodyData setConcurrency(Long concurrency) {
            this.concurrency = concurrency;
            return this;
        }
        public Long getConcurrency() {
            return this.concurrency;
        }

        public ListDataCheckTaskHistoryResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListDataCheckTaskHistoryResponseBodyData setCronExp(String cronExp) {
            this.cronExp = cronExp;
            return this;
        }
        public String getCronExp() {
            return this.cronExp;
        }

        public ListDataCheckTaskHistoryResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListDataCheckTaskHistoryResponseBodyData setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public ListDataCheckTaskHistoryResponseBodyData setErrorTableNum(Long errorTableNum) {
            this.errorTableNum = errorTableNum;
            return this;
        }
        public Long getErrorTableNum() {
            return this.errorTableNum;
        }

        public ListDataCheckTaskHistoryResponseBodyData setExecStatus(Integer execStatus) {
            this.execStatus = execStatus;
            return this;
        }
        public Integer getExecStatus() {
            return this.execStatus;
        }

        public ListDataCheckTaskHistoryResponseBodyData setExecTime(String execTime) {
            this.execTime = execTime;
            return this;
        }
        public String getExecTime() {
            return this.execTime;
        }

        public ListDataCheckTaskHistoryResponseBodyData setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public ListDataCheckTaskHistoryResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDataCheckTaskHistoryResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListDataCheckTaskHistoryResponseBodyData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListDataCheckTaskHistoryResponseBodyData setOriginBatchId(Long originBatchId) {
            this.originBatchId = originBatchId;
            return this;
        }
        public Long getOriginBatchId() {
            return this.originBatchId;
        }

        public ListDataCheckTaskHistoryResponseBodyData setPassProcess(Double passProcess) {
            this.passProcess = passProcess;
            return this;
        }
        public Double getPassProcess() {
            return this.passProcess;
        }

        public ListDataCheckTaskHistoryResponseBodyData setPassProcessExport(String passProcessExport) {
            this.passProcessExport = passProcessExport;
            return this;
        }
        public String getPassProcessExport() {
            return this.passProcessExport;
        }

        public ListDataCheckTaskHistoryResponseBodyData setProgress(Double progress) {
            this.progress = progress;
            return this;
        }
        public Double getProgress() {
            return this.progress;
        }

        public ListDataCheckTaskHistoryResponseBodyData setReportTime(String reportTime) {
            this.reportTime = reportTime;
            return this;
        }
        public String getReportTime() {
            return this.reportTime;
        }

        public ListDataCheckTaskHistoryResponseBodyData setReportTitle(String reportTitle) {
            this.reportTitle = reportTitle;
            return this;
        }
        public String getReportTitle() {
            return this.reportTitle;
        }

        public ListDataCheckTaskHistoryResponseBodyData setScheduleId(Long scheduleId) {
            this.scheduleId = scheduleId;
            return this;
        }
        public Long getScheduleId() {
            return this.scheduleId;
        }

        public ListDataCheckTaskHistoryResponseBodyData setSeqId(String seqId) {
            this.seqId = seqId;
            return this;
        }
        public String getSeqId() {
            return this.seqId;
        }

        public ListDataCheckTaskHistoryResponseBodyData setSkipTableNum(Integer skipTableNum) {
            this.skipTableNum = skipTableNum;
            return this;
        }
        public Integer getSkipTableNum() {
            return this.skipTableNum;
        }

        public ListDataCheckTaskHistoryResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListDataCheckTaskHistoryResponseBodyData setSuccessfulTableNum(Long successfulTableNum) {
            this.successfulTableNum = successfulTableNum;
            return this;
        }
        public Long getSuccessfulTableNum() {
            return this.successfulTableNum;
        }

    }

}
