// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ListJobStepResponseBody extends TeaModel {
    /**
     * <p>Error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The task step information.</p>
     */
    @NameInMap("JobSteps")
    public java.util.List<ListJobStepResponseBodyJobSteps> jobSteps;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>621BB4F8-3016-4FAA-8D5A-5D3163CC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Indicates whether the Console 2.0 API is used.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("UseV2API")
    public Boolean useV2API;

    public static ListJobStepResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobStepResponseBody self = new ListJobStepResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobStepResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListJobStepResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListJobStepResponseBody setJobSteps(java.util.List<ListJobStepResponseBodyJobSteps> jobSteps) {
        this.jobSteps = jobSteps;
        return this;
    }
    public java.util.List<ListJobStepResponseBodyJobSteps> getJobSteps() {
        return this.jobSteps;
    }

    public ListJobStepResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJobStepResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListJobStepResponseBody setUseV2API(Boolean useV2API) {
        this.useV2API = useV2API;
        return this;
    }
    public Boolean getUseV2API() {
        return this.useV2API;
    }

    public static class ListJobStepResponseBodyJobStepsErrorDetails extends TeaModel {
        /**
         * <p>Error code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>URL of the help document.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("HelpUrl")
        public String helpUrl;

        public static ListJobStepResponseBodyJobStepsErrorDetails build(java.util.Map<String, ?> map) throws Exception {
            ListJobStepResponseBodyJobStepsErrorDetails self = new ListJobStepResponseBodyJobStepsErrorDetails();
            return TeaModel.build(map, self);
        }

        public ListJobStepResponseBodyJobStepsErrorDetails setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListJobStepResponseBodyJobStepsErrorDetails setHelpUrl(String helpUrl) {
            this.helpUrl = helpUrl;
            return this;
        }
        public String getHelpUrl() {
            return this.helpUrl;
        }

    }

    public static class ListJobStepResponseBodyJobStepsSubJobStepsErrorDetails extends TeaModel {
        /**
         * <p>Error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>URL of the help document.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("HelpUrl")
        public String helpUrl;

        public static ListJobStepResponseBodyJobStepsSubJobStepsErrorDetails build(java.util.Map<String, ?> map) throws Exception {
            ListJobStepResponseBodyJobStepsSubJobStepsErrorDetails self = new ListJobStepResponseBodyJobStepsSubJobStepsErrorDetails();
            return TeaModel.build(map, self);
        }

        public ListJobStepResponseBodyJobStepsSubJobStepsErrorDetails setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListJobStepResponseBodyJobStepsSubJobStepsErrorDetails setHelpUrl(String helpUrl) {
            this.helpUrl = helpUrl;
            return this;
        }
        public String getHelpUrl() {
            return this.helpUrl;
        }

    }

    public static class ListJobStepResponseBodyJobStepsSubJobSteps extends TeaModel {
        /**
         * <p>The time when the sub-job was started, in the format <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-02T02:00:21Z</p>
         */
        @NameInMap("BootTime")
        public String bootTime;

        /**
         * <p>Sub-task step identity.</p>
         * 
         * <strong>example:</strong>
         * <p>03</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The time when the sub-job was created, in the format <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-20T02:13:12Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Error message.</p>
         * 
         * <strong>example:</strong>
         * <p>UncaughtException:java.lang.NullPointerException</p>
         */
        @NameInMap("ErrMsg")
        public String errMsg;

        /**
         * <p>Error message.</p>
         */
        @NameInMap("ErrorDetails")
        public java.util.List<ListJobStepResponseBodyJobStepsSubJobStepsErrorDetails> errorDetails;

        /**
         * <p>End time of the sub-task, in the format <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-15T02:15:14Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>Incremental data latency, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IncLatencyMilliseconds")
        public String incLatencyMilliseconds;

        /**
         * <p>Incremental data latency, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IncLatencySeconds")
        public Long incLatencySeconds;

        /**
         * <p>Job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mj3z9w9s10am68o_0004_0000</p>
         */
        @NameInMap("JobStepId")
        public String jobStepId;

        /**
         * <p>Sub-job step information. Valid values are as follows:</p>
         * <ul>
         * <li>Precheck: precheck phase</li>
         * <li>Incremental data service: incremental data collection phase</li>
         * <li>dts.step.struct.load: schema migration phase</li>
         * <li>dts.step.data.load: full migration phase</li>
         * <li>etl-check: extract, transform, and load (ETL) phase</li>
         * <li>Consistency validation: data verification phase</li>
         * <li>Synchronization: incremental synchronization phase</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("JobStepName")
        public String jobStepName;

        /**
         * <p>The time when the sub-job was updated, in the format <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-22T02:04:35Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>Indicates whether the acceleration feature is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NeedAcceleration")
        public Boolean needAcceleration;

        /**
         * <p>Progress of the sub-job step.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>Serial number of the sub-task step. Indicates the task execution order; the smaller the numeric value, the earlier the execution order.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Serial")
        public Integer serial;

        /**
         * <p>Status of the sub-task step. Valid values:</p>
         * <ul>
         * <li>Failed: failed.</li>
         * <li>Pause: paused.</li>
         * <li>Schedule: scheduled.</li>
         * <li>Init: initialization.</li>
         * <li>Running: synchronizing.</li>
         * <li>Catched: waiting for synchronization.</li>
         * <li>Finished: ended.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("State")
        public String state;

        public static ListJobStepResponseBodyJobStepsSubJobSteps build(java.util.Map<String, ?> map) throws Exception {
            ListJobStepResponseBodyJobStepsSubJobSteps self = new ListJobStepResponseBodyJobStepsSubJobSteps();
            return TeaModel.build(map, self);
        }

        public ListJobStepResponseBodyJobStepsSubJobSteps setBootTime(String bootTime) {
            this.bootTime = bootTime;
            return this;
        }
        public String getBootTime() {
            return this.bootTime;
        }

        public ListJobStepResponseBodyJobStepsSubJobSteps setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListJobStepResponseBodyJobStepsSubJobSteps setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListJobStepResponseBodyJobStepsSubJobSteps setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public ListJobStepResponseBodyJobStepsSubJobSteps setErrorDetails(java.util.List<ListJobStepResponseBodyJobStepsSubJobStepsErrorDetails> errorDetails) {
            this.errorDetails = errorDetails;
            return this;
        }
        public java.util.List<ListJobStepResponseBodyJobStepsSubJobStepsErrorDetails> getErrorDetails() {
            return this.errorDetails;
        }

        public ListJobStepResponseBodyJobStepsSubJobSteps setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public ListJobStepResponseBodyJobStepsSubJobSteps setIncLatencyMilliseconds(String incLatencyMilliseconds) {
            this.incLatencyMilliseconds = incLatencyMilliseconds;
            return this;
        }
        public String getIncLatencyMilliseconds() {
            return this.incLatencyMilliseconds;
        }

        public ListJobStepResponseBodyJobStepsSubJobSteps setIncLatencySeconds(Long incLatencySeconds) {
            this.incLatencySeconds = incLatencySeconds;
            return this;
        }
        public Long getIncLatencySeconds() {
            return this.incLatencySeconds;
        }

        public ListJobStepResponseBodyJobStepsSubJobSteps setJobStepId(String jobStepId) {
            this.jobStepId = jobStepId;
            return this;
        }
        public String getJobStepId() {
            return this.jobStepId;
        }

        public ListJobStepResponseBodyJobStepsSubJobSteps setJobStepName(String jobStepName) {
            this.jobStepName = jobStepName;
            return this;
        }
        public String getJobStepName() {
            return this.jobStepName;
        }

        public ListJobStepResponseBodyJobStepsSubJobSteps setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListJobStepResponseBodyJobStepsSubJobSteps setNeedAcceleration(Boolean needAcceleration) {
            this.needAcceleration = needAcceleration;
            return this;
        }
        public Boolean getNeedAcceleration() {
            return this.needAcceleration;
        }

        public ListJobStepResponseBodyJobStepsSubJobSteps setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public ListJobStepResponseBodyJobStepsSubJobSteps setSerial(Integer serial) {
            this.serial = serial;
            return this;
        }
        public Integer getSerial() {
            return this.serial;
        }

        public ListJobStepResponseBodyJobStepsSubJobSteps setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class ListJobStepResponseBodyJobSteps extends TeaModel {
        /**
         * <p>The job start time, in the format <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-11T09:33:23Z</p>
         */
        @NameInMap("BootTime")
        public String bootTime;

        /**
         * <p>Task step identity.</p>
         * 
         * <strong>example:</strong>
         * <p>01</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The job creation time, in the format <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2023-11-28T17:13:51Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>fullcheck find different records : 2372</p>
         */
        @NameInMap("ErrMsg")
        public String errMsg;

        /**
         * <p>The error message.</p>
         */
        @NameInMap("ErrorDetails")
        public java.util.List<ListJobStepResponseBodyJobStepsErrorDetails> errorDetails;

        /**
         * <p>Task end time, in the format <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-15T02:15:14Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>Incremental data latency, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IncLatencyMilliseconds")
        public Long incLatencyMilliseconds;

        /**
         * <p>Incremental data latency, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("IncLatencySeconds")
        public Long incLatencySeconds;

        /**
         * <p>The task step ID.</p>
         * 
         * <strong>example:</strong>
         * <p>l02c1f7h179****</p>
         */
        @NameInMap("JobStepId")
        public String jobStepId;

        /**
         * <p>Task step information. Valid values:</p>
         * <ul>
         * <li>Precheck: precheck phase</li>
         * <li>Incremental data service: incremental data collection phase</li>
         * <li>dts.step.struct.load: schema migration phase</li>
         * <li>dts.step.data.load: full migration phase</li>
         * <li>etl-check: extract, transform, and load phase</li>
         * <li>Consistency validation: data verification phase</li>
         * <li>Synchronization: incremental synchronization phase</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>预检查</p>
         */
        @NameInMap("JobStepName")
        public String jobStepName;

        /**
         * <p>The time when the job was updated, in the format <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-03T02:26:14Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>Indicates whether the acceleration feature should be provided.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NeedAcceleration")
        public Boolean needAcceleration;

        /**
         * <p>The progress of the task step.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>Task step serial number. Indicates the task execution order. A smaller value indicates an earlier execution order.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Serial")
        public Integer serial;

        /**
         * <p>Task step status.</p>
         * 
         * <strong>example:</strong>
         * <p>○ Finished</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The number of sub-jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SubJobCount")
        public Integer subJobCount;

        /**
         * <p>Step information of the sub-job.</p>
         */
        @NameInMap("SubJobSteps")
        public java.util.List<ListJobStepResponseBodyJobStepsSubJobSteps> subJobSteps;

        /**
         * <p>Used to distinguish between the Redis full and incremental phases. Valid values:</p>
         * <ul>
         * <li>full: Full phase</li>
         * <li>inc: Incremental phase</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>full</p>
         */
        @NameInMap("redisPhaseType")
        public String redisPhaseType;

        public static ListJobStepResponseBodyJobSteps build(java.util.Map<String, ?> map) throws Exception {
            ListJobStepResponseBodyJobSteps self = new ListJobStepResponseBodyJobSteps();
            return TeaModel.build(map, self);
        }

        public ListJobStepResponseBodyJobSteps setBootTime(String bootTime) {
            this.bootTime = bootTime;
            return this;
        }
        public String getBootTime() {
            return this.bootTime;
        }

        public ListJobStepResponseBodyJobSteps setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListJobStepResponseBodyJobSteps setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListJobStepResponseBodyJobSteps setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public ListJobStepResponseBodyJobSteps setErrorDetails(java.util.List<ListJobStepResponseBodyJobStepsErrorDetails> errorDetails) {
            this.errorDetails = errorDetails;
            return this;
        }
        public java.util.List<ListJobStepResponseBodyJobStepsErrorDetails> getErrorDetails() {
            return this.errorDetails;
        }

        public ListJobStepResponseBodyJobSteps setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public ListJobStepResponseBodyJobSteps setIncLatencyMilliseconds(Long incLatencyMilliseconds) {
            this.incLatencyMilliseconds = incLatencyMilliseconds;
            return this;
        }
        public Long getIncLatencyMilliseconds() {
            return this.incLatencyMilliseconds;
        }

        public ListJobStepResponseBodyJobSteps setIncLatencySeconds(Long incLatencySeconds) {
            this.incLatencySeconds = incLatencySeconds;
            return this;
        }
        public Long getIncLatencySeconds() {
            return this.incLatencySeconds;
        }

        public ListJobStepResponseBodyJobSteps setJobStepId(String jobStepId) {
            this.jobStepId = jobStepId;
            return this;
        }
        public String getJobStepId() {
            return this.jobStepId;
        }

        public ListJobStepResponseBodyJobSteps setJobStepName(String jobStepName) {
            this.jobStepName = jobStepName;
            return this;
        }
        public String getJobStepName() {
            return this.jobStepName;
        }

        public ListJobStepResponseBodyJobSteps setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListJobStepResponseBodyJobSteps setNeedAcceleration(Boolean needAcceleration) {
            this.needAcceleration = needAcceleration;
            return this;
        }
        public Boolean getNeedAcceleration() {
            return this.needAcceleration;
        }

        public ListJobStepResponseBodyJobSteps setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public ListJobStepResponseBodyJobSteps setSerial(Integer serial) {
            this.serial = serial;
            return this;
        }
        public Integer getSerial() {
            return this.serial;
        }

        public ListJobStepResponseBodyJobSteps setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListJobStepResponseBodyJobSteps setSubJobCount(Integer subJobCount) {
            this.subJobCount = subJobCount;
            return this;
        }
        public Integer getSubJobCount() {
            return this.subJobCount;
        }

        public ListJobStepResponseBodyJobSteps setSubJobSteps(java.util.List<ListJobStepResponseBodyJobStepsSubJobSteps> subJobSteps) {
            this.subJobSteps = subJobSteps;
            return this;
        }
        public java.util.List<ListJobStepResponseBodyJobStepsSubJobSteps> getSubJobSteps() {
            return this.subJobSteps;
        }

        public ListJobStepResponseBodyJobSteps setRedisPhaseType(String redisPhaseType) {
            this.redisPhaseType = redisPhaseType;
            return this;
        }
        public String getRedisPhaseType() {
            return this.redisPhaseType;
        }

    }

}
