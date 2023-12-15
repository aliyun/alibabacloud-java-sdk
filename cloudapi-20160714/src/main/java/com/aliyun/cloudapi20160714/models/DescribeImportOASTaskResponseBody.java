// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeImportOASTaskResponseBody extends TeaModel {
    /**
     * <p>The execution status of the subtask. Valid values:</p>
     * <br>
     * <p>*   RUNNING</p>
     * <p>*   WAIT</p>
     * <p>*   OVER</p>
     * <p>*   FAIL</p>
     * <p>*   CANCEL</p>
     */
    @NameInMap("ApiResults")
    public DescribeImportOASTaskResponseBodyApiResults apiResults;

    /**
     * <p>The execution status of the subtask. Valid values:</p>
     * <br>
     * <p>*   RUNNING</p>
     * <p>*   WAIT</p>
     * <p>*   OVER</p>
     * <p>*   FAIL</p>
     * <p>*   CANCEL</p>
     */
    @NameInMap("ModelResults")
    public DescribeImportOASTaskResponseBodyModelResults modelResults;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the import task. Valid values:</p>
     * <br>
     * <p>*   Running</p>
     * <p>*   Finished</p>
     */
    @NameInMap("TaskStatus")
    public String taskStatus;

    public static DescribeImportOASTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImportOASTaskResponseBody self = new DescribeImportOASTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImportOASTaskResponseBody setApiResults(DescribeImportOASTaskResponseBodyApiResults apiResults) {
        this.apiResults = apiResults;
        return this;
    }
    public DescribeImportOASTaskResponseBodyApiResults getApiResults() {
        return this.apiResults;
    }

    public DescribeImportOASTaskResponseBody setModelResults(DescribeImportOASTaskResponseBodyModelResults modelResults) {
        this.modelResults = modelResults;
        return this;
    }
    public DescribeImportOASTaskResponseBodyModelResults getModelResults() {
        return this.modelResults;
    }

    public DescribeImportOASTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImportOASTaskResponseBody setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public static class DescribeImportOASTaskResponseBodyApiResultsApiResult extends TeaModel {
        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("ApiName")
        public String apiName;

        @NameInMap("Description")
        public String description;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Method")
        public String method;

        @NameInMap("Path")
        public String path;

        @NameInMap("UpdateStatus")
        public String updateStatus;

        public static DescribeImportOASTaskResponseBodyApiResultsApiResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeImportOASTaskResponseBodyApiResultsApiResult self = new DescribeImportOASTaskResponseBodyApiResultsApiResult();
            return TeaModel.build(map, self);
        }

        public DescribeImportOASTaskResponseBodyApiResultsApiResult setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeImportOASTaskResponseBodyApiResultsApiResult setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeImportOASTaskResponseBodyApiResultsApiResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeImportOASTaskResponseBodyApiResultsApiResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeImportOASTaskResponseBodyApiResultsApiResult setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeImportOASTaskResponseBodyApiResultsApiResult setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeImportOASTaskResponseBodyApiResultsApiResult setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeImportOASTaskResponseBodyApiResultsApiResult setUpdateStatus(String updateStatus) {
            this.updateStatus = updateStatus;
            return this;
        }
        public String getUpdateStatus() {
            return this.updateStatus;
        }

    }

    public static class DescribeImportOASTaskResponseBodyApiResults extends TeaModel {
        @NameInMap("ApiResult")
        public java.util.List<DescribeImportOASTaskResponseBodyApiResultsApiResult> apiResult;

        public static DescribeImportOASTaskResponseBodyApiResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeImportOASTaskResponseBodyApiResults self = new DescribeImportOASTaskResponseBodyApiResults();
            return TeaModel.build(map, self);
        }

        public DescribeImportOASTaskResponseBodyApiResults setApiResult(java.util.List<DescribeImportOASTaskResponseBodyApiResultsApiResult> apiResult) {
            this.apiResult = apiResult;
            return this;
        }
        public java.util.List<DescribeImportOASTaskResponseBodyApiResultsApiResult> getApiResult() {
            return this.apiResult;
        }

    }

    public static class DescribeImportOASTaskResponseBodyModelResultsModelResult extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("ModelId")
        public String modelId;

        @NameInMap("ModelName")
        public String modelName;

        @NameInMap("UpdateStatus")
        public String updateStatus;

        public static DescribeImportOASTaskResponseBodyModelResultsModelResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeImportOASTaskResponseBodyModelResultsModelResult self = new DescribeImportOASTaskResponseBodyModelResultsModelResult();
            return TeaModel.build(map, self);
        }

        public DescribeImportOASTaskResponseBodyModelResultsModelResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeImportOASTaskResponseBodyModelResultsModelResult setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeImportOASTaskResponseBodyModelResultsModelResult setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public DescribeImportOASTaskResponseBodyModelResultsModelResult setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public DescribeImportOASTaskResponseBodyModelResultsModelResult setUpdateStatus(String updateStatus) {
            this.updateStatus = updateStatus;
            return this;
        }
        public String getUpdateStatus() {
            return this.updateStatus;
        }

    }

    public static class DescribeImportOASTaskResponseBodyModelResults extends TeaModel {
        @NameInMap("ModelResult")
        public java.util.List<DescribeImportOASTaskResponseBodyModelResultsModelResult> modelResult;

        public static DescribeImportOASTaskResponseBodyModelResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeImportOASTaskResponseBodyModelResults self = new DescribeImportOASTaskResponseBodyModelResults();
            return TeaModel.build(map, self);
        }

        public DescribeImportOASTaskResponseBodyModelResults setModelResult(java.util.List<DescribeImportOASTaskResponseBodyModelResultsModelResult> modelResult) {
            this.modelResult = modelResult;
            return this;
        }
        public java.util.List<DescribeImportOASTaskResponseBodyModelResultsModelResult> getModelResult() {
            return this.modelResult;
        }

    }

}
