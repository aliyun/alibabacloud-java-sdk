// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class CreatePowerForecastJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreatePowerForecastJobResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
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

    public static CreatePowerForecastJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePowerForecastJobResponseBody self = new CreatePowerForecastJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePowerForecastJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreatePowerForecastJobResponseBody setData(CreatePowerForecastJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreatePowerForecastJobResponseBodyData getData() {
        return this.data;
    }

    public CreatePowerForecastJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePowerForecastJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePowerForecastJobResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class CreatePowerForecastJobResponseBodyDataResponse extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("DebugInfo")
        public Object debugInfo;

        /**
         * <strong>example:</strong>
         * <p>LoadForecast</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Result")
        public Object result;

        public static CreatePowerForecastJobResponseBodyDataResponse build(java.util.Map<String, ?> map) throws Exception {
            CreatePowerForecastJobResponseBodyDataResponse self = new CreatePowerForecastJobResponseBodyDataResponse();
            return TeaModel.build(map, self);
        }

        public CreatePowerForecastJobResponseBodyDataResponse setDebugInfo(Object debugInfo) {
            this.debugInfo = debugInfo;
            return this;
        }
        public Object getDebugInfo() {
            return this.debugInfo;
        }

        public CreatePowerForecastJobResponseBodyDataResponse setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public CreatePowerForecastJobResponseBodyDataResponse setResult(Object result) {
            this.result = result;
            return this;
        }
        public Object getResult() {
            return this.result;
        }

    }

    public static class CreatePowerForecastJobResponseBodyData extends TeaModel {
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
         * <p>25</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("Response")
        public CreatePowerForecastJobResponseBodyDataResponse response;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        public static CreatePowerForecastJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreatePowerForecastJobResponseBodyData self = new CreatePowerForecastJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreatePowerForecastJobResponseBodyData setCompleted(Boolean completed) {
            this.completed = completed;
            return this;
        }
        public Boolean getCompleted() {
            return this.completed;
        }

        public CreatePowerForecastJobResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreatePowerForecastJobResponseBodyData setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public CreatePowerForecastJobResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public CreatePowerForecastJobResponseBodyData setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public CreatePowerForecastJobResponseBodyData setResponse(CreatePowerForecastJobResponseBodyDataResponse response) {
            this.response = response;
            return this;
        }
        public CreatePowerForecastJobResponseBodyDataResponse getResponse() {
            return this.response;
        }

        public CreatePowerForecastJobResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
