// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetAivppAlgoJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAivppAlgoJobResponseBodyData data;

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

    public static GetAivppAlgoJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAivppAlgoJobResponseBody self = new GetAivppAlgoJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAivppAlgoJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAivppAlgoJobResponseBody setData(GetAivppAlgoJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAivppAlgoJobResponseBodyData getData() {
        return this.data;
    }

    public GetAivppAlgoJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAivppAlgoJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAivppAlgoJobResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetAivppAlgoJobResponseBodyDataResponse extends TeaModel {
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
         * <p>{}</p>
         */
        @NameInMap("Result")
        public Object result;

        public static GetAivppAlgoJobResponseBodyDataResponse build(java.util.Map<String, ?> map) throws Exception {
            GetAivppAlgoJobResponseBodyDataResponse self = new GetAivppAlgoJobResponseBodyDataResponse();
            return TeaModel.build(map, self);
        }

        public GetAivppAlgoJobResponseBodyDataResponse setDebugInfo(Object debugInfo) {
            this.debugInfo = debugInfo;
            return this;
        }
        public Object getDebugInfo() {
            return this.debugInfo;
        }

        public GetAivppAlgoJobResponseBodyDataResponse setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public GetAivppAlgoJobResponseBodyDataResponse setResult(Object result) {
            this.result = result;
            return this;
        }
        public Object getResult() {
            return this.result;
        }

    }

    public static class GetAivppAlgoJobResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("Completed")
        public Boolean completed;

        /**
         * <strong>example:</strong>
         * <p>2024-12-10 17:50:48</p>
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
         * <p>5854bfa6-f002-43c2-8e1d-e9b2c28f9384</p>
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
        public GetAivppAlgoJobResponseBodyDataResponse response;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetAivppAlgoJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAivppAlgoJobResponseBodyData self = new GetAivppAlgoJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAivppAlgoJobResponseBodyData setCompleted(Boolean completed) {
            this.completed = completed;
            return this;
        }
        public Boolean getCompleted() {
            return this.completed;
        }

        public GetAivppAlgoJobResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetAivppAlgoJobResponseBodyData setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public GetAivppAlgoJobResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetAivppAlgoJobResponseBodyData setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public GetAivppAlgoJobResponseBodyData setResponse(GetAivppAlgoJobResponseBodyDataResponse response) {
            this.response = response;
            return this;
        }
        public GetAivppAlgoJobResponseBodyDataResponse getResponse() {
            return this.response;
        }

        public GetAivppAlgoJobResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
