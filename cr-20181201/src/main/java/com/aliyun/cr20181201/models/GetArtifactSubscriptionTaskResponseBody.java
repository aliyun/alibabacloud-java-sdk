// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetArtifactSubscriptionTaskResponseBody extends TeaModel {
    /**
     * <p>The artifact type.</p>
     * 
     * <strong>example:</strong>
     * <p>IMAGE</p>
     */
    @NameInMap("ArtifactType")
    public String artifactType;

    /**
     * <p>The return value.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The end time of the artifact subscription task.</p>
     * 
     * <strong>example:</strong>
     * <p>1691979202000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-xkx6vujuhay0****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Indicates whether the API request is successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request is successful.</li>
     * <li><code>false</code>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The return message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The name of the Container Registry namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("NamespaceName")
    public String namespaceName;

    /**
     * <p>The name of the Container Registry repository.</p>
     * 
     * <strong>example:</strong>
     * <p>test-repo</p>
     */
    @NameInMap("RepoName")
    public String repoName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12589EF7-96E2-4554-AAD7-F7209E88CAD3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The name of the source namespace.</p>
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
     * <p>The name of the source repository.</p>
     * 
     * <strong>example:</strong>
     * <p>nginx</p>
     */
    @NameInMap("SourceRepoName")
    public String sourceRepoName;

    /**
     * <p>The type of the source repository.</p>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("SourceRepoType")
    public String sourceRepoType;

    /**
     * <p>The start time of the artifact subscription task.</p>
     * 
     * <strong>example:</strong>
     * <p>1568718468000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The total subscribed tags.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TagSubscriptionCount")
    public Long tagSubscriptionCount;

    /**
     * <p>The total number of tags.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
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
     * <p>The task results.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("TaskResult")
    public String taskResult;

    /**
     * <p>The status of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("TaskStatus")
    public String taskStatus;

    /**
     * <p>The type of the task. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>AUTO</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static GetArtifactSubscriptionTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetArtifactSubscriptionTaskResponseBody self = new GetArtifactSubscriptionTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetArtifactSubscriptionTaskResponseBody setArtifactType(String artifactType) {
        this.artifactType = artifactType;
        return this;
    }
    public String getArtifactType() {
        return this.artifactType;
    }

    public GetArtifactSubscriptionTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetArtifactSubscriptionTaskResponseBody setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetArtifactSubscriptionTaskResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetArtifactSubscriptionTaskResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public GetArtifactSubscriptionTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetArtifactSubscriptionTaskResponseBody setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public GetArtifactSubscriptionTaskResponseBody setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public GetArtifactSubscriptionTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetArtifactSubscriptionTaskResponseBody setSourceNamespaceName(String sourceNamespaceName) {
        this.sourceNamespaceName = sourceNamespaceName;
        return this;
    }
    public String getSourceNamespaceName() {
        return this.sourceNamespaceName;
    }

    public GetArtifactSubscriptionTaskResponseBody setSourceProvider(String sourceProvider) {
        this.sourceProvider = sourceProvider;
        return this;
    }
    public String getSourceProvider() {
        return this.sourceProvider;
    }

    public GetArtifactSubscriptionTaskResponseBody setSourceRepoName(String sourceRepoName) {
        this.sourceRepoName = sourceRepoName;
        return this;
    }
    public String getSourceRepoName() {
        return this.sourceRepoName;
    }

    public GetArtifactSubscriptionTaskResponseBody setSourceRepoType(String sourceRepoType) {
        this.sourceRepoType = sourceRepoType;
        return this;
    }
    public String getSourceRepoType() {
        return this.sourceRepoType;
    }

    public GetArtifactSubscriptionTaskResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetArtifactSubscriptionTaskResponseBody setTagSubscriptionCount(Long tagSubscriptionCount) {
        this.tagSubscriptionCount = tagSubscriptionCount;
        return this;
    }
    public Long getTagSubscriptionCount() {
        return this.tagSubscriptionCount;
    }

    public GetArtifactSubscriptionTaskResponseBody setTagTotalCount(Long tagTotalCount) {
        this.tagTotalCount = tagTotalCount;
        return this;
    }
    public Long getTagTotalCount() {
        return this.tagTotalCount;
    }

    public GetArtifactSubscriptionTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetArtifactSubscriptionTaskResponseBody setTaskResult(String taskResult) {
        this.taskResult = taskResult;
        return this;
    }
    public String getTaskResult() {
        return this.taskResult;
    }

    public GetArtifactSubscriptionTaskResponseBody setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public GetArtifactSubscriptionTaskResponseBody setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
