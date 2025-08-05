// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ImportWorkflowDefinitionResponseBody extends TeaModel {
    @NameInMap("AsyncJob")
    public ImportWorkflowDefinitionResponseBodyAsyncJob asyncJob;

    @NameInMap("RequestId")
    public String requestId;

    public static ImportWorkflowDefinitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportWorkflowDefinitionResponseBody self = new ImportWorkflowDefinitionResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportWorkflowDefinitionResponseBody setAsyncJob(ImportWorkflowDefinitionResponseBodyAsyncJob asyncJob) {
        this.asyncJob = asyncJob;
        return this;
    }
    public ImportWorkflowDefinitionResponseBodyAsyncJob getAsyncJob() {
        return this.asyncJob;
    }

    public ImportWorkflowDefinitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ImportWorkflowDefinitionResponseBodyAsyncJob extends TeaModel {
        @NameInMap("Completed")
        public Boolean completed;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Error")
        public String error;

        @NameInMap("Id")
        public String id;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("Response")
        public String response;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static ImportWorkflowDefinitionResponseBodyAsyncJob build(java.util.Map<String, ?> map) throws Exception {
            ImportWorkflowDefinitionResponseBodyAsyncJob self = new ImportWorkflowDefinitionResponseBodyAsyncJob();
            return TeaModel.build(map, self);
        }

        public ImportWorkflowDefinitionResponseBodyAsyncJob setCompleted(Boolean completed) {
            this.completed = completed;
            return this;
        }
        public Boolean getCompleted() {
            return this.completed;
        }

        public ImportWorkflowDefinitionResponseBodyAsyncJob setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ImportWorkflowDefinitionResponseBodyAsyncJob setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public ImportWorkflowDefinitionResponseBodyAsyncJob setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ImportWorkflowDefinitionResponseBodyAsyncJob setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public ImportWorkflowDefinitionResponseBodyAsyncJob setResponse(String response) {
            this.response = response;
            return this;
        }
        public String getResponse() {
            return this.response;
        }

        public ImportWorkflowDefinitionResponseBodyAsyncJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ImportWorkflowDefinitionResponseBodyAsyncJob setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
