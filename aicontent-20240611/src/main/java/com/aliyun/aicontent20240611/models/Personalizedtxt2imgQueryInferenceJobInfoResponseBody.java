// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class Personalizedtxt2imgQueryInferenceJobInfoResponseBody extends TeaModel {
    /**
     * <p>The object that contains the query results.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public Personalizedtxt2imgQueryInferenceJobInfoResponseBodyData data;

    /**
     * <p>The error code returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>UNKNOWN_ERROR</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>未知错误</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static Personalizedtxt2imgQueryInferenceJobInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        Personalizedtxt2imgQueryInferenceJobInfoResponseBody self = new Personalizedtxt2imgQueryInferenceJobInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public Personalizedtxt2imgQueryInferenceJobInfoResponseBody setData(Personalizedtxt2imgQueryInferenceJobInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public Personalizedtxt2imgQueryInferenceJobInfoResponseBodyData getData() {
        return this.data;
    }

    public Personalizedtxt2imgQueryInferenceJobInfoResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public Personalizedtxt2imgQueryInferenceJobInfoResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public Personalizedtxt2imgQueryInferenceJobInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public Personalizedtxt2imgQueryInferenceJobInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Personalizedtxt2imgQueryInferenceJobInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class Personalizedtxt2imgQueryInferenceJobInfoResponseBodyData extends TeaModel {
        /**
         * <p>The time when the inference job was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-12-25T12:00:00</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The ID of the inference job.</p>
         * 
         * <strong>example:</strong>
         * <p>3220</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The status of the inference job.</p>
         * 
         * <strong>example:</strong>
         * <p>FINISHED</p>
         */
        @NameInMap("jobStatus")
        public String jobStatus;

        /**
         * <p>The progress of the inference job.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("jobTrainProgress")
        public Double jobTrainProgress;

        /**
         * <p>The ID of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>modelId-xxxx-xxxx-xxxx</p>
         */
        @NameInMap("modelId")
        public String modelId;

        /**
         * <p>The ID of the prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>promptId-xxxx-xxxx-xxxx</p>
         */
        @NameInMap("promptId")
        public String promptId;

        /**
         * <p>A list of URLs for the generated images.</p>
         * 
         * <strong>example:</strong>
         * <p>0000.png</p>
         */
        @NameInMap("resultImageUrl")
        public java.util.List<String> resultImageUrl;

        public static Personalizedtxt2imgQueryInferenceJobInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            Personalizedtxt2imgQueryInferenceJobInfoResponseBodyData self = new Personalizedtxt2imgQueryInferenceJobInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public Personalizedtxt2imgQueryInferenceJobInfoResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public Personalizedtxt2imgQueryInferenceJobInfoResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public Personalizedtxt2imgQueryInferenceJobInfoResponseBodyData setJobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public String getJobStatus() {
            return this.jobStatus;
        }

        public Personalizedtxt2imgQueryInferenceJobInfoResponseBodyData setJobTrainProgress(Double jobTrainProgress) {
            this.jobTrainProgress = jobTrainProgress;
            return this;
        }
        public Double getJobTrainProgress() {
            return this.jobTrainProgress;
        }

        public Personalizedtxt2imgQueryInferenceJobInfoResponseBodyData setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public Personalizedtxt2imgQueryInferenceJobInfoResponseBodyData setPromptId(String promptId) {
            this.promptId = promptId;
            return this;
        }
        public String getPromptId() {
            return this.promptId;
        }

        public Personalizedtxt2imgQueryInferenceJobInfoResponseBodyData setResultImageUrl(java.util.List<String> resultImageUrl) {
            this.resultImageUrl = resultImageUrl;
            return this;
        }
        public java.util.List<String> getResultImageUrl() {
            return this.resultImageUrl;
        }

    }

}
