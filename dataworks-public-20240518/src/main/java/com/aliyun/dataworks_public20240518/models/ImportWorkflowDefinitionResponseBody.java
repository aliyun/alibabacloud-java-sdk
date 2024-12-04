// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ImportWorkflowDefinitionResponseBody extends TeaModel {
    /**
     * <p>The status information of the asynchronous task.</p>
     */
    @NameInMap("AsyncJob")
    public ImportWorkflowDefinitionResponseBodyAsyncJob asyncJob;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7C352CB7-CD88-50CF-9D0D-E81BDF020E7F</p>
     */
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
        /**
         * <p>Indicates whether the asynchronous task is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Completed")
        public Boolean completed;

        /**
         * <p>The time when the asynchronous task was created. This value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1706581425000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The error message returned if the asynchronous task fails.</p>
         * 
         * <strong>example:</strong>
         * <p>target folder already exists: XXXX</p>
         */
        @NameInMap("Error")
        public String error;

        /**
         * <p>The ID of the asynchronous task.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567691239009XXXX</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The progress of the asynchronous task. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>The response.</p>
         * <blockquote>
         * <p> The workflow ID is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>632647691239009XXXX</p>
         */
        @NameInMap("Response")
        public String response;

        /**
         * <p>The status of the asynchronous task.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Running: The asynchronous task is running.</li>
         * <li>Success: The asynchronous task is complete.</li>
         * <li>Fail: The asynchronous task fails.</li>
         * <li>Cancel: The asynchronous task is canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the asynchronous task.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Create: The asynchronous task is used to create an object.</li>
         * <li>Cancel: The asynchronous task is used to cancel an operation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Create</p>
         */
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
