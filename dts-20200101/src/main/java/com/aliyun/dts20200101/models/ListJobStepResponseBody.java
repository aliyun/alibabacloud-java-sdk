// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ListJobStepResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("JobSteps")
    public java.util.List<ListJobStepResponseBodyJobSteps> jobSteps;

    /**
     * <strong>example:</strong>
     * <p>621BB4F8-3016-4FAA-8D5A-5D3163CC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
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
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
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
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
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
         * <strong>example:</strong>
         * <p>2025-01-02T02:00:21Z</p>
         */
        @NameInMap("BootTime")
        public String bootTime;

        /**
         * <strong>example:</strong>
         * <p>03</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>2024-09-20T02:13:12Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>UncaughtException:java.lang.NullPointerException</p>
         */
        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("ErrorDetails")
        public java.util.List<ListJobStepResponseBodyJobStepsSubJobStepsErrorDetails> errorDetails;

        /**
         * <strong>example:</strong>
         * <p>2024-03-15T02:15:14Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IncLatencyMilliseconds")
        public String incLatencyMilliseconds;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IncLatencySeconds")
        public Long incLatencySeconds;

        /**
         * <strong>example:</strong>
         * <p>mj3z9w9s10am68o_0004_0000</p>
         */
        @NameInMap("JobStepId")
        public String jobStepId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("JobStepName")
        public String jobStepName;

        /**
         * <strong>example:</strong>
         * <p>2024-08-22T02:04:35Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NeedAcceleration")
        public Boolean needAcceleration;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Serial")
        public Integer serial;

        /**
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
         * <strong>example:</strong>
         * <p>2024-04-11T09:33:23Z</p>
         */
        @NameInMap("BootTime")
        public String bootTime;

        /**
         * <strong>example:</strong>
         * <p>01</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>2023-11-28T17:13:51Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>fullcheck find different records : 2372</p>
         */
        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("ErrorDetails")
        public java.util.List<ListJobStepResponseBodyJobStepsErrorDetails> errorDetails;

        /**
         * <strong>example:</strong>
         * <p>2024-03-15T02:15:14Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IncLatencyMilliseconds")
        public Long incLatencyMilliseconds;

        /**
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("IncLatencySeconds")
        public Long incLatencySeconds;

        /**
         * <strong>example:</strong>
         * <p>l02c1f7h179****</p>
         */
        @NameInMap("JobStepId")
        public String jobStepId;

        @NameInMap("JobStepName")
        public String jobStepName;

        /**
         * <strong>example:</strong>
         * <p>2025-01-03T02:26:14Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NeedAcceleration")
        public Boolean needAcceleration;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Serial")
        public Integer serial;

        /**
         * <strong>example:</strong>
         * <p>○ Finished</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SubJobCount")
        public Integer subJobCount;

        @NameInMap("SubJobSteps")
        public java.util.List<ListJobStepResponseBodyJobStepsSubJobSteps> subJobSteps;

        /**
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
