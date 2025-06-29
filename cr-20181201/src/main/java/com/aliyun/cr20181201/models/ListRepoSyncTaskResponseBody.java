// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoSyncTaskResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
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
     * <p>7640819A-FB5B-4E25-A227-97717F62****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The queried synchronization tasks.</p>
     */
    @NameInMap("SyncTasks")
    public java.util.List<ListRepoSyncTaskResponseBodySyncTasks> syncTasks;

    /**
     * <p>The total number of the queried synchronization tasks.</p>
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
         * <p>The namespace to which the repository belongs.</p>
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
         * <p>The namespace to which the repository belongs.</p>
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
         * <p>The time when the synchronization task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1572839126000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Indicates whether the synchronization task is performed across Alibaba Cloud accounts. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The image synchronization task is performed across accounts.</li>
         * <li><code>false</code>: The image synchronization task is performed within the same account.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
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
         * <p>The information about the source image.</p>
         */
        @NameInMap("ImageFrom")
        public ListRepoSyncTaskResponseBodySyncTasksImageFrom imageFrom;

        /**
         * <p>The information about the destination image.</p>
         */
        @NameInMap("ImageTo")
        public ListRepoSyncTaskResponseBodySyncTasksImageTo imageTo;

        /**
         * <p>The time when the synchronization task was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1572839133000</p>
         */
        @NameInMap("ModifedTime")
        public Long modifedTime;

        /**
         * <p>The ID of the image synchronization batch tasks, which is the same as the value of SyncRecordId in the request.</p>
         * <blockquote>
         * <p> If an image meets multiple synchronization rules and multiple synchronization tasks are generated for the image, these synchronization tasks use the same SyncBatchTaskId.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>15DEEB56-9271-4FDD-AC4D-C3A5CC2C****</p>
         */
        @NameInMap("SyncBatchTaskId")
        public String syncBatchTaskId;

        /**
         * <p>The ID of the synchronization rule.</p>
         * 
         * <strong>example:</strong>
         * <p>crsr-7lph66uloi6h****</p>
         */
        @NameInMap("SyncRuleId")
        public String syncRuleId;

        /**
         * <p>The ID of the synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>rst-4kfd7fk6pohk****</p>
         */
        @NameInMap("SyncTaskId")
        public String syncTaskId;

        /**
         * <p>Indicates whether the synchronization transfer acceleration feature is enabled for the synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SyncTransAccelerate")
        public Boolean syncTransAccelerate;

        /**
         * <p>The error message that is returned if the synchronization task fails.</p>
         * <blockquote>
         * <p> The system uses this parameter to return an error message if the synchronization task fails.</p>
         * </blockquote>
         * <p>Valid value:</p>
         * <ul>
         * <li>OSS_POLICY_UNAUTHORIZED: Container Registry is not granted permissions to access Object Storage Service (OSS).</li>
         * <li>TAG_CONFLICT: The destination repository contains an image that has the same tag as the source image, and image tag immutability is enabled for the destination repository.</li>
         * <li>UNSUPPORTED_FORMAT: The manifest or config format of the image to be synchronized is not supported.</li>
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
         * <p>The status of the synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <p>The policy that is configured to trigger the synchronization task. Valid values:</p>
         * <ul>
         * <li><code>PASSIVE</code>: automatically triggers the synchronization task.</li>
         * <li><code>INITIATIVE</code>: manually triggers the synchronization task.</li>
         * </ul>
         * <p>Default value: <code>PASSIVE</code>.</p>
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
