// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class DescribeFineTuneJobResponseBody extends TeaModel {
    @NameInMap("BaseModel")
    public String baseModel;

    @NameInMap("FineTunedModel")
    public String fineTunedModel;

    @NameInMap("HyperParameters")
    public DescribeFineTuneJobResponseBodyHyperParameters hyperParameters;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("Message")
    public String message;

    @NameInMap("ModelName")
    public String modelName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("TrainingFiles")
    public java.util.List<String> trainingFiles;

    @NameInMap("ValidationFiles")
    public java.util.List<String> validationFiles;

    public static DescribeFineTuneJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFineTuneJobResponseBody self = new DescribeFineTuneJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFineTuneJobResponseBody setBaseModel(String baseModel) {
        this.baseModel = baseModel;
        return this;
    }
    public String getBaseModel() {
        return this.baseModel;
    }

    public DescribeFineTuneJobResponseBody setFineTunedModel(String fineTunedModel) {
        this.fineTunedModel = fineTunedModel;
        return this;
    }
    public String getFineTunedModel() {
        return this.fineTunedModel;
    }

    public DescribeFineTuneJobResponseBody setHyperParameters(DescribeFineTuneJobResponseBodyHyperParameters hyperParameters) {
        this.hyperParameters = hyperParameters;
        return this;
    }
    public DescribeFineTuneJobResponseBodyHyperParameters getHyperParameters() {
        return this.hyperParameters;
    }

    public DescribeFineTuneJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DescribeFineTuneJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeFineTuneJobResponseBody setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public DescribeFineTuneJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFineTuneJobResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeFineTuneJobResponseBody setTrainingFiles(java.util.List<String> trainingFiles) {
        this.trainingFiles = trainingFiles;
        return this;
    }
    public java.util.List<String> getTrainingFiles() {
        return this.trainingFiles;
    }

    public DescribeFineTuneJobResponseBody setValidationFiles(java.util.List<String> validationFiles) {
        this.validationFiles = validationFiles;
        return this;
    }
    public java.util.List<String> getValidationFiles() {
        return this.validationFiles;
    }

    public static class DescribeFineTuneJobResponseBodyHyperParameters extends TeaModel {
        @NameInMap("BatchSize")
        public Integer batchSize;

        @NameInMap("Epochs")
        public Integer epochs;

        @NameInMap("LearningRate")
        public String learningRate;

        @NameInMap("PromptLossWeight")
        public Double promptLossWeight;

        public static DescribeFineTuneJobResponseBodyHyperParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeFineTuneJobResponseBodyHyperParameters self = new DescribeFineTuneJobResponseBodyHyperParameters();
            return TeaModel.build(map, self);
        }

        public DescribeFineTuneJobResponseBodyHyperParameters setBatchSize(Integer batchSize) {
            this.batchSize = batchSize;
            return this;
        }
        public Integer getBatchSize() {
            return this.batchSize;
        }

        public DescribeFineTuneJobResponseBodyHyperParameters setEpochs(Integer epochs) {
            this.epochs = epochs;
            return this;
        }
        public Integer getEpochs() {
            return this.epochs;
        }

        public DescribeFineTuneJobResponseBodyHyperParameters setLearningRate(String learningRate) {
            this.learningRate = learningRate;
            return this;
        }
        public String getLearningRate() {
            return this.learningRate;
        }

        public DescribeFineTuneJobResponseBodyHyperParameters setPromptLossWeight(Double promptLossWeight) {
            this.promptLossWeight = promptLossWeight;
            return this;
        }
        public Double getPromptLossWeight() {
            return this.promptLossWeight;
        }

    }

}
