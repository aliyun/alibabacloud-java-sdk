// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoSyncTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SyncTasks")
    public java.util.List<ListRepoSyncTaskResponseBodySyncTasks> syncTasks;

    @NameInMap("TotalCount")
    public String totalCount;

    public static ListRepoSyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepoSyncTaskResponseBody self = new ListRepoSyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRepoSyncTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRepoSyncTaskResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListRepoSyncTaskResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListRepoSyncTaskResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRepoSyncTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRepoSyncTaskResponseBody setSyncTasks(java.util.List<ListRepoSyncTaskResponseBodySyncTasks> syncTasks) {
        this.syncTasks = syncTasks;
        return this;
    }
    public java.util.List<ListRepoSyncTaskResponseBodySyncTasks> getSyncTasks() {
        return this.syncTasks;
    }

    public ListRepoSyncTaskResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListRepoSyncTaskResponseBodySyncTasksImageFrom extends TeaModel {
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

        public static ListRepoSyncTaskResponseBodySyncTasksImageFrom build(java.util.Map<String, ?> map) throws Exception {
            ListRepoSyncTaskResponseBodySyncTasksImageFrom self = new ListRepoSyncTaskResponseBodySyncTasksImageFrom();
            return TeaModel.build(map, self);
        }

        public ListRepoSyncTaskResponseBodySyncTasksImageFrom setImageTag(String imageTag) {
            this.imageTag = imageTag;
            return this;
        }
        public String getImageTag() {
            return this.imageTag;
        }

        public ListRepoSyncTaskResponseBodySyncTasksImageFrom setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListRepoSyncTaskResponseBodySyncTasksImageFrom setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListRepoSyncTaskResponseBodySyncTasksImageFrom setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public ListRepoSyncTaskResponseBodySyncTasksImageFrom setRepoNamespaceName(String repoNamespaceName) {
            this.repoNamespaceName = repoNamespaceName;
            return this;
        }
        public String getRepoNamespaceName() {
            return this.repoNamespaceName;
        }

    }

    public static class ListRepoSyncTaskResponseBodySyncTasksImageTo extends TeaModel {
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

        public static ListRepoSyncTaskResponseBodySyncTasksImageTo build(java.util.Map<String, ?> map) throws Exception {
            ListRepoSyncTaskResponseBodySyncTasksImageTo self = new ListRepoSyncTaskResponseBodySyncTasksImageTo();
            return TeaModel.build(map, self);
        }

        public ListRepoSyncTaskResponseBodySyncTasksImageTo setImageTag(String imageTag) {
            this.imageTag = imageTag;
            return this;
        }
        public String getImageTag() {
            return this.imageTag;
        }

        public ListRepoSyncTaskResponseBodySyncTasksImageTo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListRepoSyncTaskResponseBodySyncTasksImageTo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListRepoSyncTaskResponseBodySyncTasksImageTo setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public ListRepoSyncTaskResponseBodySyncTasksImageTo setRepoNamespaceName(String repoNamespaceName) {
            this.repoNamespaceName = repoNamespaceName;
            return this;
        }
        public String getRepoNamespaceName() {
            return this.repoNamespaceName;
        }

    }

    public static class ListRepoSyncTaskResponseBodySyncTasks extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CrossUser")
        public Boolean crossUser;

        @NameInMap("CustomLink")
        public Boolean customLink;

        @NameInMap("ImageFrom")
        public ListRepoSyncTaskResponseBodySyncTasksImageFrom imageFrom;

        @NameInMap("ImageTo")
        public ListRepoSyncTaskResponseBodySyncTasksImageTo imageTo;

        @NameInMap("ModifedTime")
        public Long modifedTime;

        @NameInMap("SyncBatchTaskId")
        public String syncBatchTaskId;

        @NameInMap("SyncRuleId")
        public String syncRuleId;

        @NameInMap("SyncTaskId")
        public String syncTaskId;

        @NameInMap("SyncTransAccelerate")
        public Boolean syncTransAccelerate;

        @NameInMap("TaskStatus")
        public String taskStatus;

        @NameInMap("TaskTrigger")
        public String taskTrigger;

        public static ListRepoSyncTaskResponseBodySyncTasks build(java.util.Map<String, ?> map) throws Exception {
            ListRepoSyncTaskResponseBodySyncTasks self = new ListRepoSyncTaskResponseBodySyncTasks();
            return TeaModel.build(map, self);
        }

        public ListRepoSyncTaskResponseBodySyncTasks setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListRepoSyncTaskResponseBodySyncTasks setCrossUser(Boolean crossUser) {
            this.crossUser = crossUser;
            return this;
        }
        public Boolean getCrossUser() {
            return this.crossUser;
        }

        public ListRepoSyncTaskResponseBodySyncTasks setCustomLink(Boolean customLink) {
            this.customLink = customLink;
            return this;
        }
        public Boolean getCustomLink() {
            return this.customLink;
        }

        public ListRepoSyncTaskResponseBodySyncTasks setImageFrom(ListRepoSyncTaskResponseBodySyncTasksImageFrom imageFrom) {
            this.imageFrom = imageFrom;
            return this;
        }
        public ListRepoSyncTaskResponseBodySyncTasksImageFrom getImageFrom() {
            return this.imageFrom;
        }

        public ListRepoSyncTaskResponseBodySyncTasks setImageTo(ListRepoSyncTaskResponseBodySyncTasksImageTo imageTo) {
            this.imageTo = imageTo;
            return this;
        }
        public ListRepoSyncTaskResponseBodySyncTasksImageTo getImageTo() {
            return this.imageTo;
        }

        public ListRepoSyncTaskResponseBodySyncTasks setModifedTime(Long modifedTime) {
            this.modifedTime = modifedTime;
            return this;
        }
        public Long getModifedTime() {
            return this.modifedTime;
        }

        public ListRepoSyncTaskResponseBodySyncTasks setSyncBatchTaskId(String syncBatchTaskId) {
            this.syncBatchTaskId = syncBatchTaskId;
            return this;
        }
        public String getSyncBatchTaskId() {
            return this.syncBatchTaskId;
        }

        public ListRepoSyncTaskResponseBodySyncTasks setSyncRuleId(String syncRuleId) {
            this.syncRuleId = syncRuleId;
            return this;
        }
        public String getSyncRuleId() {
            return this.syncRuleId;
        }

        public ListRepoSyncTaskResponseBodySyncTasks setSyncTaskId(String syncTaskId) {
            this.syncTaskId = syncTaskId;
            return this;
        }
        public String getSyncTaskId() {
            return this.syncTaskId;
        }

        public ListRepoSyncTaskResponseBodySyncTasks setSyncTransAccelerate(Boolean syncTransAccelerate) {
            this.syncTransAccelerate = syncTransAccelerate;
            return this;
        }
        public Boolean getSyncTransAccelerate() {
            return this.syncTransAccelerate;
        }

        public ListRepoSyncTaskResponseBodySyncTasks setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public ListRepoSyncTaskResponseBodySyncTasks setTaskTrigger(String taskTrigger) {
            this.taskTrigger = taskTrigger;
            return this;
        }
        public String getTaskTrigger() {
            return this.taskTrigger;
        }

    }

}
