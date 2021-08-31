// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoSyncTaskResponseBody extends TeaModel {
    @NameInMap("SyncRuleId")
    public String syncRuleId;

    @NameInMap("Progress")
    public Long progress;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SyncedSize")
    public Long syncedSize;

    @NameInMap("TaskStatus")
    public String taskStatus;

    @NameInMap("SyncTaskId")
    public String syncTaskId;

    @NameInMap("SyncBatchTaskId")
    public String syncBatchTaskId;

    @NameInMap("Code")
    public String code;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("TaskTrigger")
    public String taskTrigger;

    @NameInMap("ImageFrom")
    public GetRepoSyncTaskResponseBodyImageFrom imageFrom;

    @NameInMap("ImageTo")
    public GetRepoSyncTaskResponseBodyImageTo imageTo;

    @NameInMap("LayerTasks")
    public java.util.List<GetRepoSyncTaskResponseBodyLayerTasks> layerTasks;

    public static GetRepoSyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRepoSyncTaskResponseBody self = new GetRepoSyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRepoSyncTaskResponseBody setSyncRuleId(String syncRuleId) {
        this.syncRuleId = syncRuleId;
        return this;
    }
    public String getSyncRuleId() {
        return this.syncRuleId;
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

    public GetRepoSyncTaskResponseBody setSyncedSize(Long syncedSize) {
        this.syncedSize = syncedSize;
        return this;
    }
    public Long getSyncedSize() {
        return this.syncedSize;
    }

    public GetRepoSyncTaskResponseBody setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public GetRepoSyncTaskResponseBody setSyncTaskId(String syncTaskId) {
        this.syncTaskId = syncTaskId;
        return this;
    }
    public String getSyncTaskId() {
        return this.syncTaskId;
    }

    public GetRepoSyncTaskResponseBody setSyncBatchTaskId(String syncBatchTaskId) {
        this.syncBatchTaskId = syncBatchTaskId;
        return this;
    }
    public String getSyncBatchTaskId() {
        return this.syncBatchTaskId;
    }

    public GetRepoSyncTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRepoSyncTaskResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public GetRepoSyncTaskResponseBody setTaskTrigger(String taskTrigger) {
        this.taskTrigger = taskTrigger;
        return this;
    }
    public String getTaskTrigger() {
        return this.taskTrigger;
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

    public GetRepoSyncTaskResponseBody setLayerTasks(java.util.List<GetRepoSyncTaskResponseBodyLayerTasks> layerTasks) {
        this.layerTasks = layerTasks;
        return this;
    }
    public java.util.List<GetRepoSyncTaskResponseBodyLayerTasks> getLayerTasks() {
        return this.layerTasks;
    }

    public static class GetRepoSyncTaskResponseBodyImageFrom extends TeaModel {
        @NameInMap("RepoNamespaceName")
        public String repoNamespaceName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ImageTag")
        public String imageTag;

        @NameInMap("RepoName")
        public String repoName;

        @NameInMap("RegionId")
        public String regionId;

        public static GetRepoSyncTaskResponseBodyImageFrom build(java.util.Map<String, ?> map) throws Exception {
            GetRepoSyncTaskResponseBodyImageFrom self = new GetRepoSyncTaskResponseBodyImageFrom();
            return TeaModel.build(map, self);
        }

        public GetRepoSyncTaskResponseBodyImageFrom setRepoNamespaceName(String repoNamespaceName) {
            this.repoNamespaceName = repoNamespaceName;
            return this;
        }
        public String getRepoNamespaceName() {
            return this.repoNamespaceName;
        }

        public GetRepoSyncTaskResponseBodyImageFrom setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetRepoSyncTaskResponseBodyImageFrom setImageTag(String imageTag) {
            this.imageTag = imageTag;
            return this;
        }
        public String getImageTag() {
            return this.imageTag;
        }

        public GetRepoSyncTaskResponseBodyImageFrom setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public GetRepoSyncTaskResponseBodyImageFrom setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class GetRepoSyncTaskResponseBodyImageTo extends TeaModel {
        @NameInMap("RepoNamespaceName")
        public String repoNamespaceName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ImageTag")
        public String imageTag;

        @NameInMap("RepoName")
        public String repoName;

        @NameInMap("RegionId")
        public String regionId;

        public static GetRepoSyncTaskResponseBodyImageTo build(java.util.Map<String, ?> map) throws Exception {
            GetRepoSyncTaskResponseBodyImageTo self = new GetRepoSyncTaskResponseBodyImageTo();
            return TeaModel.build(map, self);
        }

        public GetRepoSyncTaskResponseBodyImageTo setRepoNamespaceName(String repoNamespaceName) {
            this.repoNamespaceName = repoNamespaceName;
            return this;
        }
        public String getRepoNamespaceName() {
            return this.repoNamespaceName;
        }

        public GetRepoSyncTaskResponseBodyImageTo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetRepoSyncTaskResponseBodyImageTo setImageTag(String imageTag) {
            this.imageTag = imageTag;
            return this;
        }
        public String getImageTag() {
            return this.imageTag;
        }

        public GetRepoSyncTaskResponseBodyImageTo setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public GetRepoSyncTaskResponseBodyImageTo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class GetRepoSyncTaskResponseBodyLayerTasks extends TeaModel {
        @NameInMap("TaskStatus")
        public String taskStatus;

        @NameInMap("Digest")
        public String digest;

        @NameInMap("SyncedSize")
        public Long syncedSize;

        @NameInMap("Size")
        public Long size;

        @NameInMap("SyncLayerTaskId")
        public String syncLayerTaskId;

        @NameInMap("ArtifactDigest")
        public String artifactDigest;

        public static GetRepoSyncTaskResponseBodyLayerTasks build(java.util.Map<String, ?> map) throws Exception {
            GetRepoSyncTaskResponseBodyLayerTasks self = new GetRepoSyncTaskResponseBodyLayerTasks();
            return TeaModel.build(map, self);
        }

        public GetRepoSyncTaskResponseBodyLayerTasks setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public GetRepoSyncTaskResponseBodyLayerTasks setDigest(String digest) {
            this.digest = digest;
            return this;
        }
        public String getDigest() {
            return this.digest;
        }

        public GetRepoSyncTaskResponseBodyLayerTasks setSyncedSize(Long syncedSize) {
            this.syncedSize = syncedSize;
            return this;
        }
        public Long getSyncedSize() {
            return this.syncedSize;
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

        public GetRepoSyncTaskResponseBodyLayerTasks setArtifactDigest(String artifactDigest) {
            this.artifactDigest = artifactDigest;
            return this;
        }
        public String getArtifactDigest() {
            return this.artifactDigest;
        }

    }

}
