// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListArtifactSubscriptionTaskResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the API call is successful. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: The API call is successful.</p>
     * </li>
     * <li><p><code>false</code>: The API call failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>81E7A039-A4EF-57D9-A100-88E5DCEF9D56</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task list.</p>
     */
    @NameInMap("Tasks")
    public java.util.List<ListArtifactSubscriptionTaskResponseBodyTasks> tasks;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListArtifactSubscriptionTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListArtifactSubscriptionTaskResponseBody self = new ListArtifactSubscriptionTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListArtifactSubscriptionTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListArtifactSubscriptionTaskResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListArtifactSubscriptionTaskResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListArtifactSubscriptionTaskResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListArtifactSubscriptionTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListArtifactSubscriptionTaskResponseBody setTasks(java.util.List<ListArtifactSubscriptionTaskResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<ListArtifactSubscriptionTaskResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public ListArtifactSubscriptionTaskResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListArtifactSubscriptionTaskResponseBodyTasks extends TeaModel {
        /**
         * <p>The artifact type.</p>
         * 
         * <strong>example:</strong>
         * <p>IMAGE</p>
         */
        @NameInMap("ArtifactType")
        public String artifactType;

        /**
         * <p>The end time, in UNIX timestamp format. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1692756630000</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-7pd01myak****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The namespace name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-ns</p>
         */
        @NameInMap("NamespaceName")
        public String namespaceName;

        /**
         * <p>The repository name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-repo</p>
         */
        @NameInMap("RepoName")
        public String repoName;

        /**
         * <p>The source namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>library</p>
         */
        @NameInMap("SourceNamespaceName")
        public String sourceNamespaceName;

        /**
         * <p>The artifact source.</p>
         * 
         * <strong>example:</strong>
         * <p>DOCKER_HUB</p>
         */
        @NameInMap("SourceProvider")
        public String sourceProvider;

        /**
         * <p>The source repository.</p>
         * 
         * <strong>example:</strong>
         * <p>nginx</p>
         */
        @NameInMap("SourceRepoName")
        public String sourceRepoName;

        /**
         * <p>The source artifact type.</p>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        @NameInMap("SourceRepoType")
        public String sourceRepoType;

        /**
         * <p>The start time, in UNIX timestamp format. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1695348301000</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The number of subscribed tags.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TagSubscriptionCount")
        public Long tagSubscriptionCount;

        /**
         * <p>The total number of tags.</p>
         * 
         * <strong>example:</strong>
         * <p>311</p>
         */
        @NameInMap("TagTotalCount")
        public Long tagTotalCount;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>crast-40le4es9yh0p****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The task result.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("TaskResult")
        public String taskResult;

        /**
         * <p>The task status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <p>The task type.</p>
         * 
         * <strong>example:</strong>
         * <p>AUTO</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        public static ListArtifactSubscriptionTaskResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            ListArtifactSubscriptionTaskResponseBodyTasks self = new ListArtifactSubscriptionTaskResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public ListArtifactSubscriptionTaskResponseBodyTasks setArtifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }
        public String getArtifactType() {
            return this.artifactType;
        }

        public ListArtifactSubscriptionTaskResponseBodyTasks setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListArtifactSubscriptionTaskResponseBodyTasks setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListArtifactSubscriptionTaskResponseBodyTasks setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListArtifactSubscriptionTaskResponseBodyTasks setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

        public ListArtifactSubscriptionTaskResponseBodyTasks setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public ListArtifactSubscriptionTaskResponseBodyTasks setSourceNamespaceName(String sourceNamespaceName) {
            this.sourceNamespaceName = sourceNamespaceName;
            return this;
        }
        public String getSourceNamespaceName() {
            return this.sourceNamespaceName;
        }

        public ListArtifactSubscriptionTaskResponseBodyTasks setSourceProvider(String sourceProvider) {
            this.sourceProvider = sourceProvider;
            return this;
        }
        public String getSourceProvider() {
            return this.sourceProvider;
        }

        public ListArtifactSubscriptionTaskResponseBodyTasks setSourceRepoName(String sourceRepoName) {
            this.sourceRepoName = sourceRepoName;
            return this;
        }
        public String getSourceRepoName() {
            return this.sourceRepoName;
        }

        public ListArtifactSubscriptionTaskResponseBodyTasks setSourceRepoType(String sourceRepoType) {
            this.sourceRepoType = sourceRepoType;
            return this;
        }
        public String getSourceRepoType() {
            return this.sourceRepoType;
        }

        public ListArtifactSubscriptionTaskResponseBodyTasks setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListArtifactSubscriptionTaskResponseBodyTasks setTagSubscriptionCount(Long tagSubscriptionCount) {
            this.tagSubscriptionCount = tagSubscriptionCount;
            return this;
        }
        public Long getTagSubscriptionCount() {
            return this.tagSubscriptionCount;
        }

        public ListArtifactSubscriptionTaskResponseBodyTasks setTagTotalCount(Long tagTotalCount) {
            this.tagTotalCount = tagTotalCount;
            return this;
        }
        public Long getTagTotalCount() {
            return this.tagTotalCount;
        }

        public ListArtifactSubscriptionTaskResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListArtifactSubscriptionTaskResponseBodyTasks setTaskResult(String taskResult) {
            this.taskResult = taskResult;
            return this;
        }
        public String getTaskResult() {
            return this.taskResult;
        }

        public ListArtifactSubscriptionTaskResponseBodyTasks setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public ListArtifactSubscriptionTaskResponseBodyTasks setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
