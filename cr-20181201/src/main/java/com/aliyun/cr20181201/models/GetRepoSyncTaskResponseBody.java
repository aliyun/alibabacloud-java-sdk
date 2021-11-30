// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoSyncTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ImageFrom")
    public GetRepoSyncTaskResponseBodyImageFrom imageFrom;

    @NameInMap("ImageTo")
    public GetRepoSyncTaskResponseBodyImageTo imageTo;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("LayerTasks")
    public java.util.List<GetRepoSyncTaskResponseBodyLayerTasks> layerTasks;

    @NameInMap("Progress")
    public Long progress;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SyncBatchTaskId")
    public String syncBatchTaskId;

    @NameInMap("SyncRuleId")
    public String syncRuleId;

    @NameInMap("SyncTaskId")
    public String syncTaskId;

    @NameInMap("SyncedSize")
    public Long syncedSize;

    @NameInMap("TaskStatus")
    public String taskStatus;

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

    public GetRepoSyncTaskResponseBody setTaskTrigger(String taskTrigger) {
        this.taskTrigger = taskTrigger;
        return this;
    }
    public String getTaskTrigger() {
        return this.taskTrigger;
    }

    public static class GetRepoSyncTaskResponseBodyImageFrom extends TeaModel {
        @NameInMap("ImageTag")
        public String imageTag;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RepoName")
        public String repoName;

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
        @NameInMap("ImageTag")
        public String imageTag;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RepoName")
        public String repoName;

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
        @NameInMap("ArtifactDigest")
        public String artifactDigest;

        @NameInMap("Digest")
        public String digest;

        @NameInMap("Size")
        public Long size;

        @NameInMap("SyncLayerTaskId")
        public String syncLayerTaskId;

        @NameInMap("SyncedSize")
        public Long syncedSize;

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
