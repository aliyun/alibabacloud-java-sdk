// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetDataCheckTaskListResponseBody extends TeaModel {
    /**
     * <p>The task list.</p>
     */
    @NameInMap("data")
    public java.util.List<GetDataCheckTaskListResponseBodyData> data;

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
     * <p>The page size, which indicates the number of records returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues related to this call.</p>
     * 
     * <strong>example:</strong>
     * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. A value of true indicates success. A value of false indicates failure. If the call fails, check errCode and errMessage for details.</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The total number of records that match the query conditions. This parameter is used for pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static GetDataCheckTaskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataCheckTaskListResponseBody self = new GetDataCheckTaskListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataCheckTaskListResponseBody setData(java.util.List<GetDataCheckTaskListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDataCheckTaskListResponseBodyData> getData() {
        return this.data;
    }

    public GetDataCheckTaskListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetDataCheckTaskListResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public GetDataCheckTaskListResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetDataCheckTaskListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetDataCheckTaskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataCheckTaskListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDataCheckTaskListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class GetDataCheckTaskListResponseBodyData extends TeaModel {
        /**
         * <p>The check result. Valid values:</p>
         * <ul>
         * <li>0: no record.</li>
         * <li>1: passed.</li>
         * <li>2: failed.</li>
         * </ul>
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
         * <p>The check template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("checkTemplateId")
        public String checkTemplateId;

        /**
         * <p>The check type. Valid values:</p>
         * <ul>
         * <li>0: data volume comparison.</li>
         * <li>1: metric comparison.</li>
         * <li>2: weak content comparison.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("checkType")
        public Integer checkType;

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
         * <p>The destination check engine ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2001</p>
         */
        @NameInMap("dstEngineId")
        public String dstEngineId;

        /**
         * <p>The destination check engine name.</p>
         * 
         * <strong>example:</strong>
         * <p>engine_demo</p>
         */
        @NameInMap("dstEngineName")
        public String dstEngineName;

        /**
         * <p>The destination check engine type.</p>
         * 
         * <strong>example:</strong>
         * <p>Tez</p>
         */
        @NameInMap("dstEngineType")
        public String dstEngineType;

        /**
         * <p>The end time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-16 10:00:00</p>
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
         * <p>The execution status. Valid values:</p>
         * <ul>
         * <li>0: pending.</li>
         * <li>1: running.</li>
         * <li>2: stopped.</li>
         * <li>3: failed.</li>
         * <li>4: completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("execStatus")
        public Integer execStatus;

        /**
         * <p>The execution duration.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-16 10:00:00</p>
         */
        @NameInMap("execTime")
        public String execTime;

        /**
         * <p>The execution type. Valid values:</p>
         * <ul>
         * <li>0: immediate execution.</li>
         * <li>1: scheduled execution.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("executeType")
        public Integer executeType;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-16 10:00:00</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>The last modified time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-16 10:00:00</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Indicates whether scheduling is enabled. Valid values:</p>
         * <ul>
         * <li>0: Disabled.</li>
         * <li>1: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("isScheduled")
        public Integer isScheduled;

        /**
         * <p>The latest batch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20001</p>
         */
        @NameInMap("lastBatchId")
        public Long lastBatchId;

        /**
         * <p>The latest completed batch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>833</p>
         */
        @NameInMap("lastFinishedId")
        public Long lastFinishedId;

        /**
         * <p>The check pass rate.</p>
         */
        @NameInMap("passProcess")
        public java.util.Map<String, ?> passProcess;

        /**
         * <p>The execution progress (0-1).</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("process")
        public Double process;

        /**
         * <p>The report time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01 12:00:00</p>
         */
        @NameInMap("reportTime")
        public String reportTime;

        /**
         * <p>The report title.</p>
         * 
         * <strong>example:</strong>
         * <p>Data validation report</p>
         */
        @NameInMap("reportTitle")
        public String reportTitle;

        /**
         * <p>The number of skipped tables.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("skipTableNum")
        public Long skipTableNum;

        /**
         * <p>The source data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("srcDsId")
        public String srcDsId;

        /**
         * <p>The source data source name.</p>
         * 
         * <strong>example:</strong>
         * <p>ds_demo</p>
         */
        @NameInMap("srcDsName")
        public String srcDsName;

        /**
         * <p>The source data source type.</p>
         * 
         * <strong>example:</strong>
         * <p>Hive</p>
         */
        @NameInMap("srcDsType")
        public String srcDsType;

        /**
         * <p>The source check engine ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("srcEngineId")
        public String srcEngineId;

        /**
         * <p>The source check engine name.</p>
         * 
         * <strong>example:</strong>
         * <p>engine_demo</p>
         */
        @NameInMap("srcEngineName")
        public String srcEngineName;

        /**
         * <p>The source check engine type.</p>
         * 
         * <strong>example:</strong>
         * <p>Tez</p>
         */
        @NameInMap("srcEngineType")
        public String srcEngineType;

        /**
         * <p>The start time.</p>
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

        /**
         * <p>The task description.</p>
         * 
         * <strong>example:</strong>
         * <p>Data validation task description</p>
         */
        @NameInMap("taskDescription")
        public String taskDescription;

        /**
         * <p>The creation mode. Valid values:</p>
         * <ul>
         * <li>0: table-by-table fine-grained mode.</li>
         * <li>1: same-schema batch mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("taskMode")
        public Integer taskMode;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>data_check_task_demo</p>
         */
        @NameInMap("taskName")
        public String taskName;

        /**
         * <p>The check template name.</p>
         * 
         * <strong>example:</strong>
         * <p>Row Count Validation Template</p>
         */
        @NameInMap("templateName")
        public String templateName;

        public static GetDataCheckTaskListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataCheckTaskListResponseBodyData self = new GetDataCheckTaskListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataCheckTaskListResponseBodyData setCheckResult(Integer checkResult) {
            this.checkResult = checkResult;
            return this;
        }
        public Integer getCheckResult() {
            return this.checkResult;
        }

        public GetDataCheckTaskListResponseBodyData setCheckTableNum(Long checkTableNum) {
            this.checkTableNum = checkTableNum;
            return this;
        }
        public Long getCheckTableNum() {
            return this.checkTableNum;
        }

        public GetDataCheckTaskListResponseBodyData setCheckTemplateId(String checkTemplateId) {
            this.checkTemplateId = checkTemplateId;
            return this;
        }
        public String getCheckTemplateId() {
            return this.checkTemplateId;
        }

        public GetDataCheckTaskListResponseBodyData setCheckType(Integer checkType) {
            this.checkType = checkType;
            return this;
        }
        public Integer getCheckType() {
            return this.checkType;
        }

        public GetDataCheckTaskListResponseBodyData setDstDsId(String dstDsId) {
            this.dstDsId = dstDsId;
            return this;
        }
        public String getDstDsId() {
            return this.dstDsId;
        }

        public GetDataCheckTaskListResponseBodyData setDstDsName(String dstDsName) {
            this.dstDsName = dstDsName;
            return this;
        }
        public String getDstDsName() {
            return this.dstDsName;
        }

        public GetDataCheckTaskListResponseBodyData setDstDsType(String dstDsType) {
            this.dstDsType = dstDsType;
            return this;
        }
        public String getDstDsType() {
            return this.dstDsType;
        }

        public GetDataCheckTaskListResponseBodyData setDstEngineId(String dstEngineId) {
            this.dstEngineId = dstEngineId;
            return this;
        }
        public String getDstEngineId() {
            return this.dstEngineId;
        }

        public GetDataCheckTaskListResponseBodyData setDstEngineName(String dstEngineName) {
            this.dstEngineName = dstEngineName;
            return this;
        }
        public String getDstEngineName() {
            return this.dstEngineName;
        }

        public GetDataCheckTaskListResponseBodyData setDstEngineType(String dstEngineType) {
            this.dstEngineType = dstEngineType;
            return this;
        }
        public String getDstEngineType() {
            return this.dstEngineType;
        }

        public GetDataCheckTaskListResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetDataCheckTaskListResponseBodyData setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public GetDataCheckTaskListResponseBodyData setErrorTableNum(Long errorTableNum) {
            this.errorTableNum = errorTableNum;
            return this;
        }
        public Long getErrorTableNum() {
            return this.errorTableNum;
        }

        public GetDataCheckTaskListResponseBodyData setExecStatus(Integer execStatus) {
            this.execStatus = execStatus;
            return this;
        }
        public Integer getExecStatus() {
            return this.execStatus;
        }

        public GetDataCheckTaskListResponseBodyData setExecTime(String execTime) {
            this.execTime = execTime;
            return this;
        }
        public String getExecTime() {
            return this.execTime;
        }

        public GetDataCheckTaskListResponseBodyData setExecuteType(Integer executeType) {
            this.executeType = executeType;
            return this;
        }
        public Integer getExecuteType() {
            return this.executeType;
        }

        public GetDataCheckTaskListResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetDataCheckTaskListResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetDataCheckTaskListResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDataCheckTaskListResponseBodyData setIsScheduled(Integer isScheduled) {
            this.isScheduled = isScheduled;
            return this;
        }
        public Integer getIsScheduled() {
            return this.isScheduled;
        }

        public GetDataCheckTaskListResponseBodyData setLastBatchId(Long lastBatchId) {
            this.lastBatchId = lastBatchId;
            return this;
        }
        public Long getLastBatchId() {
            return this.lastBatchId;
        }

        public GetDataCheckTaskListResponseBodyData setLastFinishedId(Long lastFinishedId) {
            this.lastFinishedId = lastFinishedId;
            return this;
        }
        public Long getLastFinishedId() {
            return this.lastFinishedId;
        }

        public GetDataCheckTaskListResponseBodyData setPassProcess(java.util.Map<String, ?> passProcess) {
            this.passProcess = passProcess;
            return this;
        }
        public java.util.Map<String, ?> getPassProcess() {
            return this.passProcess;
        }

        public GetDataCheckTaskListResponseBodyData setProcess(Double process) {
            this.process = process;
            return this;
        }
        public Double getProcess() {
            return this.process;
        }

        public GetDataCheckTaskListResponseBodyData setReportTime(String reportTime) {
            this.reportTime = reportTime;
            return this;
        }
        public String getReportTime() {
            return this.reportTime;
        }

        public GetDataCheckTaskListResponseBodyData setReportTitle(String reportTitle) {
            this.reportTitle = reportTitle;
            return this;
        }
        public String getReportTitle() {
            return this.reportTitle;
        }

        public GetDataCheckTaskListResponseBodyData setSkipTableNum(Long skipTableNum) {
            this.skipTableNum = skipTableNum;
            return this;
        }
        public Long getSkipTableNum() {
            return this.skipTableNum;
        }

        public GetDataCheckTaskListResponseBodyData setSrcDsId(String srcDsId) {
            this.srcDsId = srcDsId;
            return this;
        }
        public String getSrcDsId() {
            return this.srcDsId;
        }

        public GetDataCheckTaskListResponseBodyData setSrcDsName(String srcDsName) {
            this.srcDsName = srcDsName;
            return this;
        }
        public String getSrcDsName() {
            return this.srcDsName;
        }

        public GetDataCheckTaskListResponseBodyData setSrcDsType(String srcDsType) {
            this.srcDsType = srcDsType;
            return this;
        }
        public String getSrcDsType() {
            return this.srcDsType;
        }

        public GetDataCheckTaskListResponseBodyData setSrcEngineId(String srcEngineId) {
            this.srcEngineId = srcEngineId;
            return this;
        }
        public String getSrcEngineId() {
            return this.srcEngineId;
        }

        public GetDataCheckTaskListResponseBodyData setSrcEngineName(String srcEngineName) {
            this.srcEngineName = srcEngineName;
            return this;
        }
        public String getSrcEngineName() {
            return this.srcEngineName;
        }

        public GetDataCheckTaskListResponseBodyData setSrcEngineType(String srcEngineType) {
            this.srcEngineType = srcEngineType;
            return this;
        }
        public String getSrcEngineType() {
            return this.srcEngineType;
        }

        public GetDataCheckTaskListResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetDataCheckTaskListResponseBodyData setSuccessfulTableNum(Long successfulTableNum) {
            this.successfulTableNum = successfulTableNum;
            return this;
        }
        public Long getSuccessfulTableNum() {
            return this.successfulTableNum;
        }

        public GetDataCheckTaskListResponseBodyData setTaskDescription(String taskDescription) {
            this.taskDescription = taskDescription;
            return this;
        }
        public String getTaskDescription() {
            return this.taskDescription;
        }

        public GetDataCheckTaskListResponseBodyData setTaskMode(Integer taskMode) {
            this.taskMode = taskMode;
            return this;
        }
        public Integer getTaskMode() {
            return this.taskMode;
        }

        public GetDataCheckTaskListResponseBodyData setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public GetDataCheckTaskListResponseBodyData setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

}
