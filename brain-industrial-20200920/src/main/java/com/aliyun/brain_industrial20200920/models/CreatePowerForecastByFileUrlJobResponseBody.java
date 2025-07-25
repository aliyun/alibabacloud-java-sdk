// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class CreatePowerForecastByFileUrlJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreatePowerForecastByFileUrlJobResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>68738E75-43C1-5AE5-9F3A-AFEF576D7B5F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public String success;

    public static CreatePowerForecastByFileUrlJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePowerForecastByFileUrlJobResponseBody self = new CreatePowerForecastByFileUrlJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePowerForecastByFileUrlJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreatePowerForecastByFileUrlJobResponseBody setData(CreatePowerForecastByFileUrlJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreatePowerForecastByFileUrlJobResponseBodyData getData() {
        return this.data;
    }

    public CreatePowerForecastByFileUrlJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePowerForecastByFileUrlJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePowerForecastByFileUrlJobResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class CreatePowerForecastByFileUrlJobResponseBodyDataResponse extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("DebugInfo")
        public Object debugInfo;

        /**
         * <strong>example:</strong>
         * <p>PowerForecast</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <strong>example:</strong>
         * <p>{&quot;runTime&quot;: \&quot;2025-01-01 00:00:00\&quot;, &quot;value&quot;: 0.0}</p>
         */
        @NameInMap("Result")
        public Object result;

        public static CreatePowerForecastByFileUrlJobResponseBodyDataResponse build(java.util.Map<String, ?> map) throws Exception {
            CreatePowerForecastByFileUrlJobResponseBodyDataResponse self = new CreatePowerForecastByFileUrlJobResponseBodyDataResponse();
            return TeaModel.build(map, self);
        }

        public CreatePowerForecastByFileUrlJobResponseBodyDataResponse setDebugInfo(Object debugInfo) {
            this.debugInfo = debugInfo;
            return this;
        }
        public Object getDebugInfo() {
            return this.debugInfo;
        }

        public CreatePowerForecastByFileUrlJobResponseBodyDataResponse setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public CreatePowerForecastByFileUrlJobResponseBodyDataResponse setResult(Object result) {
            this.result = result;
            return this;
        }
        public Object getResult() {
            return this.result;
        }

    }

    public static class CreatePowerForecastByFileUrlJobResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Completed")
        public Boolean completed;

        /**
         * <strong>example:</strong>
         * <p>2024-12-22 00:00:21</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Error")
        public String error;

        /**
         * <strong>example:</strong>
         * <p>8c0ca18a-246a-4acd-80ca-e16d8ff5ef33</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("Response")
        public CreatePowerForecastByFileUrlJobResponseBodyDataResponse response;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        public static CreatePowerForecastByFileUrlJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreatePowerForecastByFileUrlJobResponseBodyData self = new CreatePowerForecastByFileUrlJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreatePowerForecastByFileUrlJobResponseBodyData setCompleted(Boolean completed) {
            this.completed = completed;
            return this;
        }
        public Boolean getCompleted() {
            return this.completed;
        }

        public CreatePowerForecastByFileUrlJobResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreatePowerForecastByFileUrlJobResponseBodyData setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public CreatePowerForecastByFileUrlJobResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public CreatePowerForecastByFileUrlJobResponseBodyData setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public CreatePowerForecastByFileUrlJobResponseBodyData setResponse(CreatePowerForecastByFileUrlJobResponseBodyDataResponse response) {
            this.response = response;
            return this;
        }
        public CreatePowerForecastByFileUrlJobResponseBodyDataResponse getResponse() {
            return this.response;
        }

        public CreatePowerForecastByFileUrlJobResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
