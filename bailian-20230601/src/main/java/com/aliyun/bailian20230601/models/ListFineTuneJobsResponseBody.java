// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class ListFineTuneJobsResponseBody extends TeaModel {
    @NameInMap("Jobs")
    public java.util.List<ListFineTuneJobsResponseBodyJobs> jobs;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    public static ListFineTuneJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFineTuneJobsResponseBody self = new ListFineTuneJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFineTuneJobsResponseBody setJobs(java.util.List<ListFineTuneJobsResponseBodyJobs> jobs) {
        this.jobs = jobs;
        return this;
    }
    public java.util.List<ListFineTuneJobsResponseBodyJobs> getJobs() {
        return this.jobs;
    }

    public ListFineTuneJobsResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListFineTuneJobsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFineTuneJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFineTuneJobsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListFineTuneJobsResponseBodyJobsHyperParameters extends TeaModel {
        @NameInMap("BatchSize")
        public Integer batchSize;

        @NameInMap("Epochs")
        public Integer epochs;

        @NameInMap("LearningRate")
        public String learningRate;

        @NameInMap("PromptLossWeight")
        public Double promptLossWeight;

        public static ListFineTuneJobsResponseBodyJobsHyperParameters build(java.util.Map<String, ?> map) throws Exception {
            ListFineTuneJobsResponseBodyJobsHyperParameters self = new ListFineTuneJobsResponseBodyJobsHyperParameters();
            return TeaModel.build(map, self);
        }

        public ListFineTuneJobsResponseBodyJobsHyperParameters setBatchSize(Integer batchSize) {
            this.batchSize = batchSize;
            return this;
        }
        public Integer getBatchSize() {
            return this.batchSize;
        }

        public ListFineTuneJobsResponseBodyJobsHyperParameters setEpochs(Integer epochs) {
            this.epochs = epochs;
            return this;
        }
        public Integer getEpochs() {
            return this.epochs;
        }

        public ListFineTuneJobsResponseBodyJobsHyperParameters setLearningRate(String learningRate) {
            this.learningRate = learningRate;
            return this;
        }
        public String getLearningRate() {
            return this.learningRate;
        }

        public ListFineTuneJobsResponseBodyJobsHyperParameters setPromptLossWeight(Double promptLossWeight) {
            this.promptLossWeight = promptLossWeight;
            return this;
        }
        public Double getPromptLossWeight() {
            return this.promptLossWeight;
        }

    }

    public static class ListFineTuneJobsResponseBodyJobs extends TeaModel {
        @NameInMap("BaseModel")
        public String baseModel;

        @NameInMap("FineTunedModel")
        public String fineTunedModel;

        @NameInMap("HyperParameters")
        public ListFineTuneJobsResponseBodyJobsHyperParameters hyperParameters;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Message")
        public String message;

        @NameInMap("ModelName")
        public String modelName;

        @NameInMap("Status")
        public String status;

        @NameInMap("TrainingFiles")
        public java.util.List<String> trainingFiles;

        @NameInMap("TrainingType")
        public String trainingType;

        @NameInMap("ValidationFiles")
        public java.util.List<String> validationFiles;

        public static ListFineTuneJobsResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            ListFineTuneJobsResponseBodyJobs self = new ListFineTuneJobsResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public ListFineTuneJobsResponseBodyJobs setBaseModel(String baseModel) {
            this.baseModel = baseModel;
            return this;
        }
        public String getBaseModel() {
            return this.baseModel;
        }

        public ListFineTuneJobsResponseBodyJobs setFineTunedModel(String fineTunedModel) {
            this.fineTunedModel = fineTunedModel;
            return this;
        }
        public String getFineTunedModel() {
            return this.fineTunedModel;
        }

        public ListFineTuneJobsResponseBodyJobs setHyperParameters(ListFineTuneJobsResponseBodyJobsHyperParameters hyperParameters) {
            this.hyperParameters = hyperParameters;
            return this;
        }
        public ListFineTuneJobsResponseBodyJobsHyperParameters getHyperParameters() {
            return this.hyperParameters;
        }

        public ListFineTuneJobsResponseBodyJobs setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListFineTuneJobsResponseBodyJobs setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListFineTuneJobsResponseBodyJobs setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public ListFineTuneJobsResponseBodyJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListFineTuneJobsResponseBodyJobs setTrainingFiles(java.util.List<String> trainingFiles) {
            this.trainingFiles = trainingFiles;
            return this;
        }
        public java.util.List<String> getTrainingFiles() {
            return this.trainingFiles;
        }

        public ListFineTuneJobsResponseBodyJobs setTrainingType(String trainingType) {
            this.trainingType = trainingType;
            return this;
        }
        public String getTrainingType() {
            return this.trainingType;
        }

        public ListFineTuneJobsResponseBodyJobs setValidationFiles(java.util.List<String> validationFiles) {
            this.validationFiles = validationFiles;
            return this;
        }
        public java.util.List<String> getValidationFiles() {
            return this.validationFiles;
        }

    }

}
