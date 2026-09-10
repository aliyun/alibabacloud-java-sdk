// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetDataCheckReportOverviewResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public GetDataCheckReportOverviewResponseBodyData data;

    /**
     * <p>The fault information code.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>not supported.pos 5459, line 196, column 14, token IDENTIFIER settings</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The request ID. This value uniquely identifies the call. Provide this value when troubleshooting issues.</p>
     * 
     * <strong>example:</strong>
     * <p>FFF386FC-295C-5D2E-B2FE-410003095F06</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetDataCheckReportOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataCheckReportOverviewResponseBody self = new GetDataCheckReportOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataCheckReportOverviewResponseBody setData(GetDataCheckReportOverviewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDataCheckReportOverviewResponseBodyData getData() {
        return this.data;
    }

    public GetDataCheckReportOverviewResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetDataCheckReportOverviewResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public GetDataCheckReportOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataCheckReportOverviewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataCheckReportOverviewResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the validation job (batch).</p>
         * 
         * <strong>example:</strong>
         * <p>20001</p>
         */
        @NameInMap("batchId")
        public Long batchId;

        /**
         * <p>The number of validated fields.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("checkColumnCount")
        public Long checkColumnCount;

        /**
         * <p>The number of validated partitions.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("checkPtCount")
        public Long checkPtCount;

        /**
         * <p>The validation result. Valid values:</p>
         * <ul>
         * <li>0: No record.</li>
         * <li>1: Passed.</li>
         * <li>2: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("checkResult")
        public Integer checkResult;

        /**
         * <p>The number of validated data rows.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("checkRowCount")
        public Long checkRowCount;

        /**
         * <p>The number of rows that passed validation.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("checkRowPassCount")
        public Long checkRowPassCount;

        /**
         * <p>The row pass rate for the export report. This value is calculated by dividing the number of passed rows by the total number of validated rows. The value is returned as a percentage string with two decimal places.</p>
         * 
         * <strong>example:</strong>
         * <p>100.00%</p>
         */
        @NameInMap("checkRowPassExport")
        public String checkRowPassExport;

        /**
         * <p>The number of validation SQL statements.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("checkSqlNum")
        public Long checkSqlNum;

        /**
         * <p>The number of validated tables.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("checkTableNum")
        public Long checkTableNum;

        /**
         * <p>The validation template name. This field is available only for metric validation.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("checkTemplateId")
        public String checkTemplateId;

        /**
         * <p>The validation template name. This field is available only for metric validation.</p>
         * 
         * <strong>example:</strong>
         * <p>Data volume comparison built-in template</p>
         */
        @NameInMap("checkTemplateName")
        public String checkTemplateName;

        /**
         * <p>The validation type. Valid values:</p>
         * <ul>
         * <li>0: data volume comparison.</li>
         * <li>1: metric comparison.</li>
         * <li>2: weak content comparison.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("checkType")
        public Integer checkType;

        /**
         * <p>The name of the destination datasource.</p>
         * 
         * <strong>example:</strong>
         * <p>ds_demo</p>
         */
        @NameInMap("dstDsName")
        public String dstDsName;

        /**
         * <p>The type of the destination datasource.</p>
         * 
         * <strong>example:</strong>
         * <p>Hive</p>
         */
        @NameInMap("dstDsType")
        public String dstDsType;

        /**
         * <p>The number of tables with errors.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("errorTableNum")
        public Long errorTableNum;

        /**
         * <p>The number of fields that passed validation.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("passColumnCount")
        public Long passColumnCount;

        /**
         * <p>The number of metrics that passed validation.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("passColumnRate")
        public Double passColumnRate;

        /**
         * <p>The pass rate.</p>
         * 
         * <strong>example:</strong>
         * <p>0.95</p>
         */
        @NameInMap("passProcess")
        public Double passProcess;

        /**
         * <p>The pass rate for the export report. This value is calculated by dividing the number of passed tables by the total number of validated tables. The value is returned as a percentage string with two decimal places (for example, 100.00%). A hyphen (-) is returned when no validated table data exists.</p>
         * 
         * <strong>example:</strong>
         * <p>100.00%</p>
         */
        @NameInMap("passProcessExport")
        public String passProcessExport;

        /**
         * <p>The number of partitions that passed validation.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("passPtNum")
        public Long passPtNum;

        /**
         * <p>The partition pass rate for the export report. This value is calculated by dividing the number of passed partitions by the total number of validated partitions. The value is returned as a percentage string with four decimal places. A hyphen (-) is returned when no partition data exists.</p>
         * 
         * <strong>example:</strong>
         * <p>100.0000%</p>
         */
        @NameInMap("passPtProcessExport")
        public String passPtProcessExport;

        /**
         * <p>The number of tables that passed validation.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("passTableNum")
        public Long passTableNum;

        /**
         * <p>The partition pass rate.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("ptPassProcess")
        public Double ptPassProcess;

        /**
         * <p>The report generation message.</p>
         * 
         * <strong>example:</strong>
         * <p>Validation report refresh completed</p>
         */
        @NameInMap("reportGenerateMessage")
        public String reportGenerateMessage;

        /**
         * <p>The validation report status. Valid values:</p>
         * <ul>
         * <li>0: Not generated.</li>
         * <li>1: Generating.</li>
         * <li>2: Generated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("reportStatus")
        public Integer reportStatus;

        /**
         * <p>The time when the report was generated.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01 12:00:00</p>
         */
        @NameInMap("reportTime")
        public String reportTime;

        /**
         * <p>The title of the validation report.</p>
         * 
         * <strong>example:</strong>
         * <p>Data Validation Report</p>
         */
        @NameInMap("reportTitle")
        public String reportTitle;

        /**
         * <p>The number of skipped partitions.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("skipPtNum")
        public Long skipPtNum;

        /**
         * <p>The number of skipped tables.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("skipTableNum")
        public Integer skipTableNum;

        /**
         * <p>The name of the source datasource.</p>
         * 
         * <strong>example:</strong>
         * <p>ds_demo</p>
         */
        @NameInMap("srcDsName")
        public String srcDsName;

        /**
         * <p>The type of the source datasource.</p>
         * 
         * <strong>example:</strong>
         * <p>Hive</p>
         */
        @NameInMap("srcDsType")
        public String srcDsType;

        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01 11:00:00</p>
         */
        @NameInMap("taskCreateTime")
        public String taskCreateTime;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>551</p>
         */
        @NameInMap("taskId")
        public Long taskId;

        /**
         * <p>The time when the task was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01 12:00:00</p>
         */
        @NameInMap("taskModifyTime")
        public String taskModifyTime;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>data_check_task_demo</p>
         */
        @NameInMap("taskName")
        public String taskName;

        public static GetDataCheckReportOverviewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataCheckReportOverviewResponseBodyData self = new GetDataCheckReportOverviewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataCheckReportOverviewResponseBodyData setBatchId(Long batchId) {
            this.batchId = batchId;
            return this;
        }
        public Long getBatchId() {
            return this.batchId;
        }

        public GetDataCheckReportOverviewResponseBodyData setCheckColumnCount(Long checkColumnCount) {
            this.checkColumnCount = checkColumnCount;
            return this;
        }
        public Long getCheckColumnCount() {
            return this.checkColumnCount;
        }

        public GetDataCheckReportOverviewResponseBodyData setCheckPtCount(Long checkPtCount) {
            this.checkPtCount = checkPtCount;
            return this;
        }
        public Long getCheckPtCount() {
            return this.checkPtCount;
        }

        public GetDataCheckReportOverviewResponseBodyData setCheckResult(Integer checkResult) {
            this.checkResult = checkResult;
            return this;
        }
        public Integer getCheckResult() {
            return this.checkResult;
        }

        public GetDataCheckReportOverviewResponseBodyData setCheckRowCount(Long checkRowCount) {
            this.checkRowCount = checkRowCount;
            return this;
        }
        public Long getCheckRowCount() {
            return this.checkRowCount;
        }

        public GetDataCheckReportOverviewResponseBodyData setCheckRowPassCount(Long checkRowPassCount) {
            this.checkRowPassCount = checkRowPassCount;
            return this;
        }
        public Long getCheckRowPassCount() {
            return this.checkRowPassCount;
        }

        public GetDataCheckReportOverviewResponseBodyData setCheckRowPassExport(String checkRowPassExport) {
            this.checkRowPassExport = checkRowPassExport;
            return this;
        }
        public String getCheckRowPassExport() {
            return this.checkRowPassExport;
        }

        public GetDataCheckReportOverviewResponseBodyData setCheckSqlNum(Long checkSqlNum) {
            this.checkSqlNum = checkSqlNum;
            return this;
        }
        public Long getCheckSqlNum() {
            return this.checkSqlNum;
        }

        public GetDataCheckReportOverviewResponseBodyData setCheckTableNum(Long checkTableNum) {
            this.checkTableNum = checkTableNum;
            return this;
        }
        public Long getCheckTableNum() {
            return this.checkTableNum;
        }

        public GetDataCheckReportOverviewResponseBodyData setCheckTemplateId(String checkTemplateId) {
            this.checkTemplateId = checkTemplateId;
            return this;
        }
        public String getCheckTemplateId() {
            return this.checkTemplateId;
        }

        public GetDataCheckReportOverviewResponseBodyData setCheckTemplateName(String checkTemplateName) {
            this.checkTemplateName = checkTemplateName;
            return this;
        }
        public String getCheckTemplateName() {
            return this.checkTemplateName;
        }

        public GetDataCheckReportOverviewResponseBodyData setCheckType(Integer checkType) {
            this.checkType = checkType;
            return this;
        }
        public Integer getCheckType() {
            return this.checkType;
        }

        public GetDataCheckReportOverviewResponseBodyData setDstDsName(String dstDsName) {
            this.dstDsName = dstDsName;
            return this;
        }
        public String getDstDsName() {
            return this.dstDsName;
        }

        public GetDataCheckReportOverviewResponseBodyData setDstDsType(String dstDsType) {
            this.dstDsType = dstDsType;
            return this;
        }
        public String getDstDsType() {
            return this.dstDsType;
        }

        public GetDataCheckReportOverviewResponseBodyData setErrorTableNum(Long errorTableNum) {
            this.errorTableNum = errorTableNum;
            return this;
        }
        public Long getErrorTableNum() {
            return this.errorTableNum;
        }

        public GetDataCheckReportOverviewResponseBodyData setPassColumnCount(Long passColumnCount) {
            this.passColumnCount = passColumnCount;
            return this;
        }
        public Long getPassColumnCount() {
            return this.passColumnCount;
        }

        public GetDataCheckReportOverviewResponseBodyData setPassColumnRate(Double passColumnRate) {
            this.passColumnRate = passColumnRate;
            return this;
        }
        public Double getPassColumnRate() {
            return this.passColumnRate;
        }

        public GetDataCheckReportOverviewResponseBodyData setPassProcess(Double passProcess) {
            this.passProcess = passProcess;
            return this;
        }
        public Double getPassProcess() {
            return this.passProcess;
        }

        public GetDataCheckReportOverviewResponseBodyData setPassProcessExport(String passProcessExport) {
            this.passProcessExport = passProcessExport;
            return this;
        }
        public String getPassProcessExport() {
            return this.passProcessExport;
        }

        public GetDataCheckReportOverviewResponseBodyData setPassPtNum(Long passPtNum) {
            this.passPtNum = passPtNum;
            return this;
        }
        public Long getPassPtNum() {
            return this.passPtNum;
        }

        public GetDataCheckReportOverviewResponseBodyData setPassPtProcessExport(String passPtProcessExport) {
            this.passPtProcessExport = passPtProcessExport;
            return this;
        }
        public String getPassPtProcessExport() {
            return this.passPtProcessExport;
        }

        public GetDataCheckReportOverviewResponseBodyData setPassTableNum(Long passTableNum) {
            this.passTableNum = passTableNum;
            return this;
        }
        public Long getPassTableNum() {
            return this.passTableNum;
        }

        public GetDataCheckReportOverviewResponseBodyData setPtPassProcess(Double ptPassProcess) {
            this.ptPassProcess = ptPassProcess;
            return this;
        }
        public Double getPtPassProcess() {
            return this.ptPassProcess;
        }

        public GetDataCheckReportOverviewResponseBodyData setReportGenerateMessage(String reportGenerateMessage) {
            this.reportGenerateMessage = reportGenerateMessage;
            return this;
        }
        public String getReportGenerateMessage() {
            return this.reportGenerateMessage;
        }

        public GetDataCheckReportOverviewResponseBodyData setReportStatus(Integer reportStatus) {
            this.reportStatus = reportStatus;
            return this;
        }
        public Integer getReportStatus() {
            return this.reportStatus;
        }

        public GetDataCheckReportOverviewResponseBodyData setReportTime(String reportTime) {
            this.reportTime = reportTime;
            return this;
        }
        public String getReportTime() {
            return this.reportTime;
        }

        public GetDataCheckReportOverviewResponseBodyData setReportTitle(String reportTitle) {
            this.reportTitle = reportTitle;
            return this;
        }
        public String getReportTitle() {
            return this.reportTitle;
        }

        public GetDataCheckReportOverviewResponseBodyData setSkipPtNum(Long skipPtNum) {
            this.skipPtNum = skipPtNum;
            return this;
        }
        public Long getSkipPtNum() {
            return this.skipPtNum;
        }

        public GetDataCheckReportOverviewResponseBodyData setSkipTableNum(Integer skipTableNum) {
            this.skipTableNum = skipTableNum;
            return this;
        }
        public Integer getSkipTableNum() {
            return this.skipTableNum;
        }

        public GetDataCheckReportOverviewResponseBodyData setSrcDsName(String srcDsName) {
            this.srcDsName = srcDsName;
            return this;
        }
        public String getSrcDsName() {
            return this.srcDsName;
        }

        public GetDataCheckReportOverviewResponseBodyData setSrcDsType(String srcDsType) {
            this.srcDsType = srcDsType;
            return this;
        }
        public String getSrcDsType() {
            return this.srcDsType;
        }

        public GetDataCheckReportOverviewResponseBodyData setTaskCreateTime(String taskCreateTime) {
            this.taskCreateTime = taskCreateTime;
            return this;
        }
        public String getTaskCreateTime() {
            return this.taskCreateTime;
        }

        public GetDataCheckReportOverviewResponseBodyData setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public GetDataCheckReportOverviewResponseBodyData setTaskModifyTime(String taskModifyTime) {
            this.taskModifyTime = taskModifyTime;
            return this;
        }
        public String getTaskModifyTime() {
            return this.taskModifyTime;
        }

        public GetDataCheckReportOverviewResponseBodyData setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

}
