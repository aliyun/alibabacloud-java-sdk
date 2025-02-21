// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class CreateEssOptJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateEssOptJobResponseBodyData data;

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

    public static CreateEssOptJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEssOptJobResponseBody self = new CreateEssOptJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEssOptJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateEssOptJobResponseBody setData(CreateEssOptJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateEssOptJobResponseBodyData getData() {
        return this.data;
    }

    public CreateEssOptJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateEssOptJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEssOptJobResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class CreateEssOptJobResponseBodyDataResponse extends TeaModel {
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

        public static CreateEssOptJobResponseBodyDataResponse build(java.util.Map<String, ?> map) throws Exception {
            CreateEssOptJobResponseBodyDataResponse self = new CreateEssOptJobResponseBodyDataResponse();
            return TeaModel.build(map, self);
        }

        public CreateEssOptJobResponseBodyDataResponse setDebugInfo(Object debugInfo) {
            this.debugInfo = debugInfo;
            return this;
        }
        public Object getDebugInfo() {
            return this.debugInfo;
        }

        public CreateEssOptJobResponseBodyDataResponse setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public CreateEssOptJobResponseBodyDataResponse setResult(Object result) {
            this.result = result;
            return this;
        }
        public Object getResult() {
            return this.result;
        }

    }

    public static class CreateEssOptJobResponseBodyData extends TeaModel {
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
        public CreateEssOptJobResponseBodyDataResponse response;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        public static CreateEssOptJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateEssOptJobResponseBodyData self = new CreateEssOptJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateEssOptJobResponseBodyData setCompleted(Boolean completed) {
            this.completed = completed;
            return this;
        }
        public Boolean getCompleted() {
            return this.completed;
        }

        public CreateEssOptJobResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateEssOptJobResponseBodyData setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public CreateEssOptJobResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public CreateEssOptJobResponseBodyData setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public CreateEssOptJobResponseBodyData setResponse(CreateEssOptJobResponseBodyDataResponse response) {
            this.response = response;
            return this;
        }
        public CreateEssOptJobResponseBodyDataResponse getResponse() {
            return this.response;
        }

        public CreateEssOptJobResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
