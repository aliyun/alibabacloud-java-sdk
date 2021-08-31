// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoSyncTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public String totalCount;

    @NameInMap("SyncTasks")
    public java.util.List<ListRepoSyncTaskResponseBodySyncTasks> syncTasks;

    public static ListRepoSyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepoSyncTaskResponseBody self = new ListRepoSyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRepoSyncTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRepoSyncTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRepoSyncTaskResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListRepoSyncTaskResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListRepoSyncTaskResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRepoSyncTaskResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public ListRepoSyncTaskResponseBody setSyncTasks(java.util.List<ListRepoSyncTaskResponseBodySyncTasks> syncTasks) {
        this.syncTasks = syncTasks;
        return this;
    }
    public java.util.List<ListRepoSyncTaskResponseBodySyncTasks> getSyncTasks() {
        return this.syncTasks;
    }

    public static class ListRepoSyncTaskResponseBodySyncTasksImageFrom extends TeaModel {
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

        public static ListRepoSyncTaskResponseBodySyncTasksImageFrom build(java.util.Map<String, ?> map) throws Exception {
            ListRepoSyncTaskResponseBodySyncTasksImageFrom self = new ListRepoSyncTaskResponseBodySyncTasksImageFrom();
            return TeaModel.build(map, self);
        }

        public ListRepoSyncTaskResponseBodySyncTasksImageFrom setRepoNamespaceName(String repoNamespaceName) {
            this.repoNamespaceName = repoNamespaceName;
            return this;
        }
        public String getRepoNamespaceName() {
            return this.repoNamespaceName;
        }

        public ListRepoSyncTaskResponseBodySyncTasksImageFrom setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListRepoSyncTaskResponseBodySyncTasksImageFrom setImageTag(String imageTag) {
            this.imageTag = imageTag;
            return this;
        }
        public String getImageTag() {
            return this.imageTag;
        }

        public ListRepoSyncTaskResponseBodySyncTasksImageFrom setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public ListRepoSyncTaskResponseBodySyncTasksImageFrom setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class ListRepoSyncTaskResponseBodySyncTasksImageTo extends TeaModel {
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

        public static ListRepoSyncTaskResponseBodySyncTasksImageTo build(java.util.Map<String, ?> map) throws Exception {
            ListRepoSyncTaskResponseBodySyncTasksImageTo self = new ListRepoSyncTaskResponseBodySyncTasksImageTo();
            return TeaModel.build(map, self);
        }

        public ListRepoSyncTaskResponseBodySyncTasksImageTo setRepoNamespaceName(String repoNamespaceName) {
            this.repoNamespaceName = repoNamespaceName;
            return this;
        }
        public String getRepoNamespaceName() {
            return this.repoNamespaceName;
        }

        public ListRepoSyncTaskResponseBodySyncTasksImageTo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListRepoSyncTaskResponseBodySyncTasksImageTo setImageTag(String imageTag) {
            this.imageTag = imageTag;
            return this;
        }
        public String getImageTag() {
            return this.imageTag;
        }

        public ListRepoSyncTaskResponseBodySyncTasksImageTo setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public ListRepoSyncTaskResponseBodySyncTasksImageTo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class ListRepoSyncTaskResponseBodySyncTasks extends TeaModel {
        @NameInMap("ModifedTime")
        public Long modifedTime;

        @NameInMap("SyncRuleId")
        public String syncRuleId;

        @NameInMap("SyncTaskId")
        public String syncTaskId;

        @NameInMap("TaskStatus")
        public String taskStatus;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("SyncBatchTaskId")
        public String syncBatchTaskId;

        @NameInMap("TaskTrigger")
        public String taskTrigger;

        @NameInMap("ImageFrom")
        public ListRepoSyncTaskResponseBodySyncTasksImageFrom imageFrom;

        @NameInMap("ImageTo")
        public ListRepoSyncTaskResponseBodySyncTasksImageTo imageTo;

        public static ListRepoSyncTaskResponseBodySyncTasks build(java.util.Map<String, ?> map) throws Exception {
            ListRepoSyncTaskResponseBodySyncTasks self = new ListRepoSyncTaskResponseBodySyncTasks();
            return TeaModel.build(map, self);
        }

        public ListRepoSyncTaskResponseBodySyncTasks setModifedTime(Long modifedTime) {
            this.modifedTime = modifedTime;
            return this;
        }
        public Long getModifedTime() {
            return this.modifedTime;
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

        public ListRepoSyncTaskResponseBodySyncTasks setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public ListRepoSyncTaskResponseBodySyncTasks setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListRepoSyncTaskResponseBodySyncTasks setSyncBatchTaskId(String syncBatchTaskId) {
            this.syncBatchTaskId = syncBatchTaskId;
            return this;
        }
        public String getSyncBatchTaskId() {
            return this.syncBatchTaskId;
        }

        public ListRepoSyncTaskResponseBodySyncTasks setTaskTrigger(String taskTrigger) {
            this.taskTrigger = taskTrigger;
            return this;
        }
        public String getTaskTrigger() {
            return this.taskTrigger;
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

    }

}
