// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoSyncTaskResponseBody extends TeaModel {
    /**
     * <p>The return value.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the request is successful.</p>
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
     * <p>The page size.</p>
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
     * <p>7640819A-FB5B-4E25-A227-97717F62****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of synchronization tasks.</p>
     */
    @NameInMap("SyncTasks")
    public java.util.List<ListRepoSyncTaskResponseBodySyncTasks> syncTasks;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>The image tag.</p>
         * 
         * <strong>example:</strong>
         * <p>v0.1</p>
         */
        @NameInMap("ImageTag")
        public String imageTag;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-kmsiwlxxdcva****</p>
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
         * <p>The repository name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RepoName")
        public String repoName;

        /**
         * <p>The repository namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
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
        /**
         * <p>The image tag.</p>
         * 
         * <strong>example:</strong>
         * <p>v0.1</p>
         */
        @NameInMap("ImageTag")
        public String imageTag;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-k77rd2eo9zttneqo</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
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
         * <p>The repository namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
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
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1572839126000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Indicates whether the image is synchronized across accounts. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: The image is synchronized across accounts.</p>
         * </li>
         * <li><p><code>false</code>: The image is synchronized within the same account.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>false</code></p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CrossUser")
        public Boolean crossUser;

        /**
         * <p>Indicates whether a custom synchronization link is used.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CustomLink")
        public Boolean customLink;

        /**
         * <p>The source image.</p>
         */
        @NameInMap("ImageFrom")
        public ListRepoSyncTaskResponseBodySyncTasksImageFrom imageFrom;

        /**
         * <p>The destination image.</p>
         */
        @NameInMap("ImageTo")
        public ListRepoSyncTaskResponseBodySyncTasksImageTo imageTo;

        /**
         * <p>The custom synchronization link ID.</p>
         * 
         * <strong>example:</strong>
         * <p>stl-b3fpik5nq6oy7***</p>
         */
        @NameInMap("LinkId")
        public String linkId;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1572839133000</p>
         */
        @NameInMap("ModifedTime")
        @Deprecated
        public Long modifedTime;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1572839133000</p>
         */
        @NameInMap("ModifiedTime")
        public Long modifiedTime;

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
         * <p>The batch synchronization task ID for images, which corresponds to the SyncRecordId (synchronization task record ID) in the request parameters.</p>
         * <blockquote>
         * <p>When an image matches multiple synchronization rules and generates multiple synchronization tasks, these tasks share the same SyncBatchTaskId.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>9d8ac4f6-8138-4c15-a2e3-60624ad3****</p>
         */
        @NameInMap("SyncBatchTaskId")
        public String syncBatchTaskId;

        /**
         * <p>The synchronization rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>crsr-7lph66uloi6h****</p>
         */
        @NameInMap("SyncRuleId")
        public String syncRuleId;

        /**
         * <p>The synchronization task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rst-4kfd7fk6pohk****</p>
         */
        @NameInMap("SyncTaskId")
        public String syncTaskId;

        /**
         * <p>The synchronization transfer acceleration status.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SyncTransAccelerate")
        public Boolean syncTransAccelerate;

        /**
         * <p>The task failure information.</p>
         * <blockquote>
         * <p>When a synchronization task fails, this field returns information about the failure.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>NETWORK_ERROR</p>
         */
        @NameInMap("TaskIssue")
        public String taskIssue;

        /**
         * <p>The task status.</p>
         * 
         * <strong>example:</strong>
         * <p>ERROR</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <p>The trigger policy. Valid values:</p>
         * <ul>
         * <li><p><code>PASSIVE</code>: Synchronization is automatically triggered.</p>
         * </li>
         * <li><p><code>INITIATIVE</code>: Synchronization is manually triggered.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>PASSIVE</code></p>
         * 
         * <strong>example:</strong>
         * <p>PASSIVE</p>
         */
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

        public ListRepoSyncTaskResponseBodySyncTasks setLinkId(String linkId) {
            this.linkId = linkId;
            return this;
        }
        public String getLinkId() {
            return this.linkId;
        }

        @Deprecated
        public ListRepoSyncTaskResponseBodySyncTasks setModifedTime(Long modifedTime) {
            this.modifedTime = modifedTime;
            return this;
        }
        public Long getModifedTime() {
            return this.modifedTime;
        }

        public ListRepoSyncTaskResponseBodySyncTasks setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public ListRepoSyncTaskResponseBodySyncTasks setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
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

        public ListRepoSyncTaskResponseBodySyncTasks setTaskIssue(String taskIssue) {
            this.taskIssue = taskIssue;
            return this;
        }
        public String getTaskIssue() {
            return this.taskIssue;
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
