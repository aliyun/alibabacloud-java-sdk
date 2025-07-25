// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class CreateLoadForecastByFileUrlJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateLoadForecastByFileUrlJobResponseBodyData data;

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

    public static CreateLoadForecastByFileUrlJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadForecastByFileUrlJobResponseBody self = new CreateLoadForecastByFileUrlJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLoadForecastByFileUrlJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateLoadForecastByFileUrlJobResponseBody setData(CreateLoadForecastByFileUrlJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateLoadForecastByFileUrlJobResponseBodyData getData() {
        return this.data;
    }

    public CreateLoadForecastByFileUrlJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateLoadForecastByFileUrlJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLoadForecastByFileUrlJobResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class CreateLoadForecastByFileUrlJobResponseBodyDataResponse extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>null</p>
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

        public static CreateLoadForecastByFileUrlJobResponseBodyDataResponse build(java.util.Map<String, ?> map) throws Exception {
            CreateLoadForecastByFileUrlJobResponseBodyDataResponse self = new CreateLoadForecastByFileUrlJobResponseBodyDataResponse();
            return TeaModel.build(map, self);
        }

        public CreateLoadForecastByFileUrlJobResponseBodyDataResponse setDebugInfo(Object debugInfo) {
            this.debugInfo = debugInfo;
            return this;
        }
        public Object getDebugInfo() {
            return this.debugInfo;
        }

        public CreateLoadForecastByFileUrlJobResponseBodyDataResponse setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public CreateLoadForecastByFileUrlJobResponseBodyDataResponse setResult(Object result) {
            this.result = result;
            return this;
        }
        public Object getResult() {
            return this.result;
        }

    }

    public static class CreateLoadForecastByFileUrlJobResponseBodyData extends TeaModel {
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
        public CreateLoadForecastByFileUrlJobResponseBodyDataResponse response;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        public static CreateLoadForecastByFileUrlJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateLoadForecastByFileUrlJobResponseBodyData self = new CreateLoadForecastByFileUrlJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateLoadForecastByFileUrlJobResponseBodyData setCompleted(Boolean completed) {
            this.completed = completed;
            return this;
        }
        public Boolean getCompleted() {
            return this.completed;
        }

        public CreateLoadForecastByFileUrlJobResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateLoadForecastByFileUrlJobResponseBodyData setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public CreateLoadForecastByFileUrlJobResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public CreateLoadForecastByFileUrlJobResponseBodyData setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public CreateLoadForecastByFileUrlJobResponseBodyData setResponse(CreateLoadForecastByFileUrlJobResponseBodyDataResponse response) {
            this.response = response;
            return this;
        }
        public CreateLoadForecastByFileUrlJobResponseBodyDataResponse getResponse() {
            return this.response;
        }

        public CreateLoadForecastByFileUrlJobResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
