// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class PersonalizedTextToImageQueryPreModelInferenceJobInfoResponseBody extends TeaModel {
    /**
     * <p>The data object.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public PersonalizedTextToImageQueryPreModelInferenceJobInfoResponseBodyData data;

    /**
     * <p>The fault message encoding.</p>
     * 
     * <strong>example:</strong>
     * <p>UNKNOWN_ERROR</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Unknown error</p>
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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static PersonalizedTextToImageQueryPreModelInferenceJobInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PersonalizedTextToImageQueryPreModelInferenceJobInfoResponseBody self = new PersonalizedTextToImageQueryPreModelInferenceJobInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public PersonalizedTextToImageQueryPreModelInferenceJobInfoResponseBody setData(PersonalizedTextToImageQueryPreModelInferenceJobInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PersonalizedTextToImageQueryPreModelInferenceJobInfoResponseBodyData getData() {
        return this.data;
    }

    public PersonalizedTextToImageQueryPreModelInferenceJobInfoResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public PersonalizedTextToImageQueryPreModelInferenceJobInfoResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public PersonalizedTextToImageQueryPreModelInferenceJobInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public PersonalizedTextToImageQueryPreModelInferenceJobInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PersonalizedTextToImageQueryPreModelInferenceJobInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PersonalizedTextToImageQueryPreModelInferenceJobInfoResponseBodyData extends TeaModel {
        /**
         * <p>The creation time of the model inference task.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-12-25T12:00:00</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The model inference task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3220</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The model inference task status.</p>
         * 
         * <strong>example:</strong>
         * <p>FINISHED</p>
         */
        @NameInMap("jobStatus")
        public String jobStatus;

        /**
         * <p>The model inference task progress.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("jobTrainProgress")
        public Double jobTrainProgress;

        /**
         * <p>The model ID.</p>
         * 
         * <strong>example:</strong>
         * <p>modelId-xxxx-xxxx-xxxx</p>
         */
        @NameInMap("modelId")
        public String modelId;

        /**
         * <p>promptId</p>
         * 
         * <strong>example:</strong>
         * <p>promptId-xxxx-xxxx-xxxx</p>
         */
        @NameInMap("promptId")
        public String promptId;

        /**
         * <p>The list of model inference task results.</p>
         * 
         * <strong>example:</strong>
         * <p>0000.png</p>
         */
        @NameInMap("resultImageUrl")
        public java.util.List<String> resultImageUrl;

        public static PersonalizedTextToImageQueryPreModelInferenceJobInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PersonalizedTextToImageQueryPreModelInferenceJobInfoResponseBodyData self = new PersonalizedTextToImageQueryPreModelInferenceJobInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PersonalizedTextToImageQueryPreModelInferenceJobInfoResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PersonalizedTextToImageQueryPreModelInferenceJobInfoResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PersonalizedTextToImageQueryPreModelInferenceJobInfoResponseBodyData setJobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public String getJobStatus() {
            return this.jobStatus;
        }

        public PersonalizedTextToImageQueryPreModelInferenceJobInfoResponseBodyData setJobTrainProgress(Double jobTrainProgress) {
            this.jobTrainProgress = jobTrainProgress;
            return this;
        }
        public Double getJobTrainProgress() {
            return this.jobTrainProgress;
        }

        public PersonalizedTextToImageQueryPreModelInferenceJobInfoResponseBodyData setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public PersonalizedTextToImageQueryPreModelInferenceJobInfoResponseBodyData setPromptId(String promptId) {
            this.promptId = promptId;
            return this;
        }
        public String getPromptId() {
            return this.promptId;
        }

        public PersonalizedTextToImageQueryPreModelInferenceJobInfoResponseBodyData setResultImageUrl(java.util.List<String> resultImageUrl) {
            this.resultImageUrl = resultImageUrl;
            return this;
        }
        public java.util.List<String> getResultImageUrl() {
            return this.resultImageUrl;
        }

    }

}
