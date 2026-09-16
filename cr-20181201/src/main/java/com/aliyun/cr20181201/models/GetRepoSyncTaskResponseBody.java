// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoSyncTaskResponseBody extends TeaModel {
    /**
     * <p>The return value.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the synchronization is cross-account.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CrossUser")
    public Boolean crossUser;

    /**
     * <p>The source image.</p>
     */
    @NameInMap("ImageFrom")
    public GetRepoSyncTaskResponseBodyImageFrom imageFrom;

    /**
     * <p>The destination image.</p>
     */
    @NameInMap("ImageTo")
    public GetRepoSyncTaskResponseBodyImageTo imageTo;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The list of image layer synchronization tasks.</p>
     */
    @NameInMap("LayerTasks")
    public java.util.List<GetRepoSyncTaskResponseBodyLayerTasks> layerTasks;

    /**
     * <p>The execution priority of the synchronization task. Synchronization tasks are executed in descending order of priority. Tasks with the same priority are executed in random order.</p>
     * <p>Valid values: 1 to 5.</p>
     * <p>Default value: 3.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The synchronization progress. Valid values:</p>
     * <ul>
     * <li><p><code>0</code>: The synchronization has just started or failed.</p>
     * </li>
     * <li><p><code>1</code>: The synchronization succeeded.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Progress")
    public Long progress;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A6DEF8B0-5D45-46D6-867D-8C7FF0966B07</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The synchronization batch task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>a9434731-95ef-4087-9cf4-369c8e90****</p>
     */
    @NameInMap("SyncBatchTaskId")
    public String syncBatchTaskId;

    /**
     * <p>The synchronization rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>crsr-cllro6ho3wne****</p>
     */
    @NameInMap("SyncRuleId")
    public String syncRuleId;

    /**
     * <p>The synchronization task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rst-zxjkiv5oil6f****</p>
     */
    @NameInMap("SyncTaskId")
    public String syncTaskId;

    /**
     * <p>Indicates whether transfer acceleration is enabled for synchronization.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SyncTransAccelerate")
    public Boolean syncTransAccelerate;

    /**
     * <p>The synchronized size, in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>23655489</p>
     */
    @NameInMap("SyncedSize")
    public Long syncedSize;

    /**
     * <p>The task failure information.</p>
     * <blockquote>
     * <p>When the synchronization task fails, this field returns information about the failure.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>NETWORK_ERROR</p>
     */
    @NameInMap("TaskIssue")
    public String taskIssue;

    /**
     * <p>The task status. Valid values:</p>
     * <p><code>PENDING</code>: The synchronization is pending.</p>
     * <p><code>SYNCHRONIZING</code>: The synchronization is in progress.</p>
     * <p><code>SUCCESS</code>: The synchronization succeeded.</p>
     * <p><code>ERROR</code>: The synchronization failed.</p>
     * <p><code>CANCELED</code>: The synchronization task is canceled.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("TaskStatus")
    public String taskStatus;

    /**
     * <p>The trigger type of the synchronization task. Valid values:</p>
     * <p><code>PASSIVE</code>: The synchronization task is automatically triggered.</p>
     * <p><code>INITIATIVE</code>: The synchronization task is manually triggered.</p>
     * 
     * <strong>example:</strong>
     * <p>PASSIVE</p>
     */
    @NameInMap("TaskTrigger")
    public String taskTrigger;

    public static GetRepoSyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRepoSyncTaskResponseBody self = new GetRepoSyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRepoSyncTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRepoSyncTaskResponseBody setCrossUser(Boolean crossUser) {
        this.crossUser = crossUser;
        return this;
    }
    public Boolean getCrossUser() {
        return this.crossUser;
    }

    public GetRepoSyncTaskResponseBody setImageFrom(GetRepoSyncTaskResponseBodyImageFrom imageFrom) {
        this.imageFrom = imageFrom;
        return this;
    }
    public GetRepoSyncTaskResponseBodyImageFrom getImageFrom() {
        return this.imageFrom;
    }

    public GetRepoSyncTaskResponseBody setImageTo(GetRepoSyncTaskResponseBodyImageTo imageTo) {
        this.imageTo = imageTo;
        return this;
    }
    public GetRepoSyncTaskResponseBodyImageTo getImageTo() {
        return this.imageTo;
    }

    public GetRepoSyncTaskResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public GetRepoSyncTaskResponseBody setLayerTasks(java.util.List<GetRepoSyncTaskResponseBodyLayerTasks> layerTasks) {
        this.layerTasks = layerTasks;
        return this;
    }
    public java.util.List<GetRepoSyncTaskResponseBodyLayerTasks> getLayerTasks() {
        return this.layerTasks;
    }

    public GetRepoSyncTaskResponseBody setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public GetRepoSyncTaskResponseBody setProgress(Long progress) {
        this.progress = progress;
        return this;
    }
    public Long getProgress() {
        return this.progress;
    }

    public GetRepoSyncTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRepoSyncTaskResponseBody setSyncBatchTaskId(String syncBatchTaskId) {
        this.syncBatchTaskId = syncBatchTaskId;
        return this;
    }
    public String getSyncBatchTaskId() {
        return this.syncBatchTaskId;
    }

    public GetRepoSyncTaskResponseBody setSyncRuleId(String syncRuleId) {
        this.syncRuleId = syncRuleId;
        return this;
    }
    public String getSyncRuleId() {
        return this.syncRuleId;
    }

    public GetRepoSyncTaskResponseBody setSyncTaskId(String syncTaskId) {
        this.syncTaskId = syncTaskId;
        return this;
    }
    public String getSyncTaskId() {
        return this.syncTaskId;
    }

    public GetRepoSyncTaskResponseBody setSyncTransAccelerate(Boolean syncTransAccelerate) {
        this.syncTransAccelerate = syncTransAccelerate;
        return this;
    }
    public Boolean getSyncTransAccelerate() {
        return this.syncTransAccelerate;
    }

    public GetRepoSyncTaskResponseBody setSyncedSize(Long syncedSize) {
        this.syncedSize = syncedSize;
        return this;
    }
    public Long getSyncedSize() {
        return this.syncedSize;
    }

    public GetRepoSyncTaskResponseBody setTaskIssue(String taskIssue) {
        this.taskIssue = taskIssue;
        return this;
    }
    public String getTaskIssue() {
        return this.taskIssue;
    }

    public GetRepoSyncTaskResponseBody setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public GetRepoSyncTaskResponseBody setTaskTrigger(String taskTrigger) {
        this.taskTrigger = taskTrigger;
        return this;
    }
    public String getTaskTrigger() {
        return this.taskTrigger;
    }

    public static class GetRepoSyncTaskResponseBodyImageFrom extends TeaModel {
        /**
         * <p>The image tag.</p>
         * 
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("ImageTag")
        public String imageTag;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-sgedpenzw80e****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The repository name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RepoName")
        public String repoName;

        /**
         * <p>The namespace name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RepoNamespaceName")
        public String repoNamespaceName;

        public static GetRepoSyncTaskResponseBodyImageFrom build(java.util.Map<String, ?> map) throws Exception {
            GetRepoSyncTaskResponseBodyImageFrom self = new GetRepoSyncTaskResponseBodyImageFrom();
            return TeaModel.build(map, self);
        }

        public GetRepoSyncTaskResponseBodyImageFrom setImageTag(String imageTag) {
            this.imageTag = imageTag;
            return this;
        }
        public String getImageTag() {
            return this.imageTag;
        }

        public GetRepoSyncTaskResponseBodyImageFrom setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetRepoSyncTaskResponseBodyImageFrom setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetRepoSyncTaskResponseBodyImageFrom setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public GetRepoSyncTaskResponseBodyImageFrom setRepoNamespaceName(String repoNamespaceName) {
            this.repoNamespaceName = repoNamespaceName;
            return this;
        }
        public String getRepoNamespaceName() {
            return this.repoNamespaceName;
        }

    }

    public static class GetRepoSyncTaskResponseBodyImageTo extends TeaModel {
        /**
         * <p>The image tag.</p>
         * 
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("ImageTag")
        public String imageTag;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-leqzomz5vijc****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The region.</p>
         * 
         * <strong>example:</strong>
         * <p>eu-west-1</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The repository name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RepoName")
        public String repoName;

        /**
         * <p>The namespace name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RepoNamespaceName")
        public String repoNamespaceName;

        public static GetRepoSyncTaskResponseBodyImageTo build(java.util.Map<String, ?> map) throws Exception {
            GetRepoSyncTaskResponseBodyImageTo self = new GetRepoSyncTaskResponseBodyImageTo();
            return TeaModel.build(map, self);
        }

        public GetRepoSyncTaskResponseBodyImageTo setImageTag(String imageTag) {
            this.imageTag = imageTag;
            return this;
        }
        public String getImageTag() {
            return this.imageTag;
        }

        public GetRepoSyncTaskResponseBodyImageTo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetRepoSyncTaskResponseBodyImageTo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetRepoSyncTaskResponseBodyImageTo setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public GetRepoSyncTaskResponseBodyImageTo setRepoNamespaceName(String repoNamespaceName) {
            this.repoNamespaceName = repoNamespaceName;
            return this;
        }
        public String getRepoNamespaceName() {
            return this.repoNamespaceName;
        }

    }

    public static class GetRepoSyncTaskResponseBodyLayerTasks extends TeaModel {
        /**
         * <p>The digest value of the artifact.</p>
         * 
         * <strong>example:</strong>
         * <p>sha256:36fb85fcb5e919cb60e782397a6be04201868fe7b38ef7669fc01caec1c8fc4e</p>
         */
        @NameInMap("ArtifactDigest")
        public String artifactDigest;

        /**
         * <p>The image digest value.</p>
         * 
         * <strong>example:</strong>
         * <p>sha256:36fb85fcb5e919cb60e782397a6be04201868fe7b38ef7669fc01caec1c8fc4e</p>
         */
        @NameInMap("Digest")
        public String digest;

        /**
         * <p>The size.</p>
         * 
         * <strong>example:</strong>
         * <p>23655489</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The synchronization layer task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rslt-074x4q20fx2d****</p>
         */
        @NameInMap("SyncLayerTaskId")
        public String syncLayerTaskId;

        /**
         * <p>The synchronized size.</p>
         * 
         * <strong>example:</strong>
         * <p>23655489</p>
         */
        @NameInMap("SyncedSize")
        public Long syncedSize;

        /**
         * <p>The task status.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        public static GetRepoSyncTaskResponseBodyLayerTasks build(java.util.Map<String, ?> map) throws Exception {
            GetRepoSyncTaskResponseBodyLayerTasks self = new GetRepoSyncTaskResponseBodyLayerTasks();
            return TeaModel.build(map, self);
        }

        public GetRepoSyncTaskResponseBodyLayerTasks setArtifactDigest(String artifactDigest) {
            this.artifactDigest = artifactDigest;
            return this;
        }
        public String getArtifactDigest() {
            return this.artifactDigest;
        }

        public GetRepoSyncTaskResponseBodyLayerTasks setDigest(String digest) {
            this.digest = digest;
            return this;
        }
        public String getDigest() {
            return this.digest;
        }

        public GetRepoSyncTaskResponseBodyLayerTasks setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetRepoSyncTaskResponseBodyLayerTasks setSyncLayerTaskId(String syncLayerTaskId) {
            this.syncLayerTaskId = syncLayerTaskId;
            return this;
        }
        public String getSyncLayerTaskId() {
            return this.syncLayerTaskId;
        }

        public GetRepoSyncTaskResponseBodyLayerTasks setSyncedSize(Long syncedSize) {
            this.syncedSize = syncedSize;
            return this;
        }
        public Long getSyncedSize() {
            return this.syncedSize;
        }

        public GetRepoSyncTaskResponseBodyLayerTasks setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

}
