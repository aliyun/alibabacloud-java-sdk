// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class OpenApiMultiResponse extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public java.util.List<OpenApiMultiResponseData> data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static OpenApiMultiResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenApiMultiResponse self = new OpenApiMultiResponse();
        return TeaModel.build(map, self);
    }

    public OpenApiMultiResponse setData(java.util.List<OpenApiMultiResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<OpenApiMultiResponseData> getData() {
        return this.data;
    }

    public OpenApiMultiResponse setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public OpenApiMultiResponse setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public OpenApiMultiResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public OpenApiMultiResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OpenApiMultiResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class OpenApiMultiResponseDataInferenceJobList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2023-12-25T12:00:00</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>3220</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>FINISHED</p>
         */
        @NameInMap("jobStatus")
        public String jobStatus;

        /**
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("jobTrainProgress")
        public Double jobTrainProgress;

        /**
         * <strong>example:</strong>
         * <p>modelId-xxxx-xxxx-xxxx</p>
         */
        @NameInMap("modelId")
        public String modelId;

        /**
         * <strong>example:</strong>
         * <p>promptId-xxxx-xxxx-xxxx</p>
         */
        @NameInMap("promptId")
        public String promptId;

        /**
         * <strong>example:</strong>
         * <p>0000.png</p>
         */
        @NameInMap("resultImageUrl")
        public java.util.List<String> resultImageUrl;

        public static OpenApiMultiResponseDataInferenceJobList build(java.util.Map<String, ?> map) throws Exception {
            OpenApiMultiResponseDataInferenceJobList self = new OpenApiMultiResponseDataInferenceJobList();
            return TeaModel.build(map, self);
        }

        public OpenApiMultiResponseDataInferenceJobList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public OpenApiMultiResponseDataInferenceJobList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public OpenApiMultiResponseDataInferenceJobList setJobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public String getJobStatus() {
            return this.jobStatus;
        }

        public OpenApiMultiResponseDataInferenceJobList setJobTrainProgress(Double jobTrainProgress) {
            this.jobTrainProgress = jobTrainProgress;
            return this;
        }
        public Double getJobTrainProgress() {
            return this.jobTrainProgress;
        }

        public OpenApiMultiResponseDataInferenceJobList setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public OpenApiMultiResponseDataInferenceJobList setPromptId(String promptId) {
            this.promptId = promptId;
            return this;
        }
        public String getPromptId() {
            return this.promptId;
        }

        public OpenApiMultiResponseDataInferenceJobList setResultImageUrl(java.util.List<String> resultImageUrl) {
            this.resultImageUrl = resultImageUrl;
            return this;
        }
        public java.util.List<String> getResultImageUrl() {
            return this.resultImageUrl;
        }

    }

    public static class OpenApiMultiResponseData extends TeaModel {
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>456</p>
         */
        @NameInMap("id")
        public String id;

        @NameInMap("imageUrl")
        public java.util.List<String> imageUrl;

        @NameInMap("inferenceImageCount")
        public Integer inferenceImageCount;

        @NameInMap("inferenceJobList")
        public java.util.List<OpenApiMultiResponseDataInferenceJobList> inferenceJobList;

        /**
         * <strong>example:</strong>
         * <p>TRAINING</p>
         */
        @NameInMap("jobStatus")
        public String jobStatus;

        /**
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("jobTrainProgress")
        public Double jobTrainProgress;

        /**
         * <strong>example:</strong>
         * <p>modelId-xxxx-xxxx-xxxx</p>
         */
        @NameInMap("modelId")
        public String modelId;

        /**
         * <strong>example:</strong>
         * <p>可爱熊猫模型训练任务</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>panda</p>
         */
        @NameInMap("objectType")
        public String objectType;

        public static OpenApiMultiResponseData build(java.util.Map<String, ?> map) throws Exception {
            OpenApiMultiResponseData self = new OpenApiMultiResponseData();
            return TeaModel.build(map, self);
        }

        public OpenApiMultiResponseData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public OpenApiMultiResponseData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public OpenApiMultiResponseData setImageUrl(java.util.List<String> imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public java.util.List<String> getImageUrl() {
            return this.imageUrl;
        }

        public OpenApiMultiResponseData setInferenceImageCount(Integer inferenceImageCount) {
            this.inferenceImageCount = inferenceImageCount;
            return this;
        }
        public Integer getInferenceImageCount() {
            return this.inferenceImageCount;
        }

        public OpenApiMultiResponseData setInferenceJobList(java.util.List<OpenApiMultiResponseDataInferenceJobList> inferenceJobList) {
            this.inferenceJobList = inferenceJobList;
            return this;
        }
        public java.util.List<OpenApiMultiResponseDataInferenceJobList> getInferenceJobList() {
            return this.inferenceJobList;
        }

        public OpenApiMultiResponseData setJobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public String getJobStatus() {
            return this.jobStatus;
        }

        public OpenApiMultiResponseData setJobTrainProgress(Double jobTrainProgress) {
            this.jobTrainProgress = jobTrainProgress;
            return this;
        }
        public Double getJobTrainProgress() {
            return this.jobTrainProgress;
        }

        public OpenApiMultiResponseData setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public OpenApiMultiResponseData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public OpenApiMultiResponseData setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

    }

}
