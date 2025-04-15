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
     * <p>Indicates whether the synchronization task is performed across Alibaba Cloud accounts.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CrossUser")
    public Boolean crossUser;

    /**
     * <p>The source address of the image.</p>
     */
    @NameInMap("ImageFrom")
    public GetRepoSyncTaskResponseBodyImageFrom imageFrom;

    /**
     * <p>The destination address of the image.</p>
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
     * <p>The synchronization tasks for the image layer.</p>
     */
    @NameInMap("LayerTasks")
    public java.util.List<GetRepoSyncTaskResponseBodyLayerTasks> layerTasks;

    /**
     * <p>The synchronization progress. Valid values:</p>
     * <ul>
     * <li><code>0</code>: The synchronization starts or failed.</li>
     * <li><code>1</code>: The synchronization is successful.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Progress")
    public Long progress;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A6DEF8B0-5D45-46D6-867D-8C7FF0966B07</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the synchronization task in which multiple images are synchronized at a time.</p>
     * 
     * <strong>example:</strong>
     * <p>a9434731-95ef-4087-9cf4-369c8e90****</p>
     */
    @NameInMap("SyncBatchTaskId")
    public String syncBatchTaskId;

    /**
     * <p>The ID of the synchronization rule.</p>
     * 
     * <strong>example:</strong>
     * <p>crsr-cllro6ho3wne****</p>
     */
    @NameInMap("SyncRuleId")
    public String syncRuleId;

    /**
     * <p>The ID of the synchronization task.</p>
     * 
     * <strong>example:</strong>
     * <p>rst-zxjkiv5oil6f****</p>
     */
    @NameInMap("SyncTaskId")
    public String syncTaskId;

    /**
     * <p>Indicates whether transfer acceleration is enabled in the synchronization process.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SyncTransAccelerate")
    public Boolean syncTransAccelerate;

    /**
     * <p>The size of the image layer that is synchronized. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>23655489</p>
     */
    @NameInMap("SyncedSize")
    public Long syncedSize;

    /**
     * <p>The error message that is returned if the synchronization task fails.</p>
     * <blockquote>
     * <p> The system uses this parameter to return an error message if the synchronization task fails.</p>
     * </blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li>OSS_POLICY_UNAUTHORIZED: Container Registry is not granted permissions to use Object Storage Service (OSS).</li>
     * <li>TAG_CONFLICT: The destination repository contains an image that has the same tag as the source image, and image tag immutability is enabled for the destination repository.</li>
     * <li>UNSUPPORTED_FORMAT: The manifest and config formats of the image to be synchronized are not supported.</li>
     * <li>INTERNAL_ERROR: The synchronization task failed due to internal issues on the server.</li>
     * <li>NETWORK_ERROR: The synchronization task failed due to unstable network connection.</li>
     * <li>DATA_LENGTH_EXCEEDED: The manifest or config of the image is oversized.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NETWORK_ERROR</p>
     */
    @NameInMap("TaskIssue")
    public String taskIssue;

    /**
     * <p>The status of the task. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("TaskStatus")
    public String taskStatus;

    /**
     * <p>The policy that is used to trigger the synchronization task.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
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
         * <p>The tag of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("ImageTag")
        public String imageTag;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-sgedpenzw80e****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RepoName")
        public String repoName;

        /**
         * <p>The name of the namespace.</p>
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
         * <p>The tag of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("ImageTag")
        public String imageTag;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-leqzomz5vijc****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eu-west-1</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RepoName")
        public String repoName;

        /**
         * <p>The name of the namespace.</p>
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
         * <p>The digest of the artifact.</p>
         * 
         * <strong>example:</strong>
         * <p>sha256:36fb85fcb5e919cb60e782397a6be04201868fe7b38ef7669fc01caec1c8fc4e</p>
         */
        @NameInMap("ArtifactDigest")
        public String artifactDigest;

        /**
         * <p>The digest of the image layer.</p>
         * 
         * <strong>example:</strong>
         * <p>sha256:36fb85fcb5e919cb60e782397a6be04201868fe7b38ef7669fc01caec1c8fc4e</p>
         */
        @NameInMap("Digest")
        public String digest;

        /**
         * <p>The size of synchronized image layers.</p>
         * 
         * <strong>example:</strong>
         * <p>23655489</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The ID of the synchronization task for the image layer.</p>
         * 
         * <strong>example:</strong>
         * <p>rslt-074x4q20fx2d****</p>
         */
        @NameInMap("SyncLayerTaskId")
        public String syncLayerTaskId;

        /**
         * <p>The size of the image layer that is synchronized.</p>
         * 
         * <strong>example:</strong>
         * <p>23655489</p>
         */
        @NameInMap("SyncedSize")
        public Long syncedSize;

        /**
         * <p>The status of the synchronization task. Valid values:</p>
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
