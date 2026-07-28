// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListTasksResponseBody extends TeaModel {
    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 20. Minimum value: 1. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>98610149-488B-5E48-B981-8D4CE1AF77CD</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The list of tasks.</p>
     */
    @NameInMap("tasks")
    public java.util.List<ListTasksResponseBodyTasks> tasks;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>55</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTasksResponseBody self = new ListTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTasksResponseBody setTasks(java.util.List<ListTasksResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<ListTasksResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public ListTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTasksResponseBodyTasksGroupInfo extends TeaModel {
        /**
         * <p>The group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>g-4267dcfbf1b6d1e0652bfbbe995</p>
         */
        @NameInMap("groupId")
        public String groupId;

        /**
         * <p>The group name.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("groupName")
        public String groupName;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>p-433aead7560571cf1b2bfbbe92b</p>
         */
        @NameInMap("projectId")
        public String projectId;

        /**
         * <p>The project name.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("projectName")
        public String projectName;

        public static ListTasksResponseBodyTasksGroupInfo build(java.util.Map<String, ?> map) throws Exception {
            ListTasksResponseBodyTasksGroupInfo self = new ListTasksResponseBodyTasksGroupInfo();
            return TeaModel.build(map, self);
        }

        public ListTasksResponseBodyTasksGroupInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListTasksResponseBodyTasksGroupInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListTasksResponseBodyTasksGroupInfo setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListTasksResponseBodyTasksGroupInfo setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

    }

    public static class ListTasksResponseBodyTasksTags extends TeaModel {
        /**
         * <p>The tag key of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The tag key of the module.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("tagKey")
        public String tagKey;

        /**
         * <p>The tag value of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>iac-demo</p>
         */
        @NameInMap("tagValue")
        public String tagValue;

        /**
         * <p>The tag value of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>iac-demo</p>
         */
        @NameInMap("value")
        public String value;

        public static ListTasksResponseBodyTasksTags build(java.util.Map<String, ?> map) throws Exception {
            ListTasksResponseBodyTasksTags self = new ListTasksResponseBodyTasksTags();
            return TeaModel.build(map, self);
        }

        public ListTasksResponseBodyTasksTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTasksResponseBodyTasksTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListTasksResponseBodyTasksTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public ListTasksResponseBodyTasksTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListTasksResponseBodyTasks extends TeaModel {
        /**
         * <p>Indicates whether the task is automatically executed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("autoApply")
        public Boolean autoApply;

        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-11T15:09:53Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The job ID of the current task.</p>
         * 
         * <strong>example:</strong>
         * <p>job-123asd</p>
         */
        @NameInMap("currentJobId")
        public String currentJobId;

        /**
         * <p>The current job status.</p>
         * 
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("currentJobStatus")
        public String currentJobStatus;

        /**
         * <p>Indicates whether deletion protection is enabled. Deletion protection is automatically enabled when managed resources are included.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("deletionProtection")
        public Boolean deletionProtection;

        /**
         * <p>The task group information.</p>
         */
        @NameInMap("groupInfo")
        public ListTasksResponseBodyTasksGroupInfo groupInfo;

        /**
         * <p>The latest version of the module.</p>
         * 
         * <strong>example:</strong>
         * <p>v3</p>
         */
        @NameInMap("latestModuleVersion")
        public String latestModuleVersion;

        /**
         * <p>The module ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mod-518855d9a058c331e9c60bc0ce</p>
         */
        @NameInMap("moduleId")
        public String moduleId;

        /**
         * <p>The module name.</p>
         * 
         * <strong>example:</strong>
         * <p>mod-name</p>
         */
        @NameInMap("moduleName")
        public String moduleName;

        /**
         * <p>The module version.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("moduleVersion")
        public String moduleVersion;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>TaskName</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>Available: The task is available, and no job is running.</li>
         * <li>Running: The task is running, and the current job is in progress.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The list of task tags.</p>
         */
        @NameInMap("tags")
        public java.util.List<ListTasksResponseBodyTasksTags> tags;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>task-1525e992f1b621b0ca51647876e</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static ListTasksResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            ListTasksResponseBodyTasks self = new ListTasksResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public ListTasksResponseBodyTasks setAutoApply(Boolean autoApply) {
            this.autoApply = autoApply;
            return this;
        }
        public Boolean getAutoApply() {
            return this.autoApply;
        }

        public ListTasksResponseBodyTasks setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListTasksResponseBodyTasks setCurrentJobId(String currentJobId) {
            this.currentJobId = currentJobId;
            return this;
        }
        public String getCurrentJobId() {
            return this.currentJobId;
        }

        public ListTasksResponseBodyTasks setCurrentJobStatus(String currentJobStatus) {
            this.currentJobStatus = currentJobStatus;
            return this;
        }
        public String getCurrentJobStatus() {
            return this.currentJobStatus;
        }

        public ListTasksResponseBodyTasks setDeletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        public ListTasksResponseBodyTasks setGroupInfo(ListTasksResponseBodyTasksGroupInfo groupInfo) {
            this.groupInfo = groupInfo;
            return this;
        }
        public ListTasksResponseBodyTasksGroupInfo getGroupInfo() {
            return this.groupInfo;
        }

        public ListTasksResponseBodyTasks setLatestModuleVersion(String latestModuleVersion) {
            this.latestModuleVersion = latestModuleVersion;
            return this;
        }
        public String getLatestModuleVersion() {
            return this.latestModuleVersion;
        }

        public ListTasksResponseBodyTasks setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public ListTasksResponseBodyTasks setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public ListTasksResponseBodyTasks setModuleVersion(String moduleVersion) {
            this.moduleVersion = moduleVersion;
            return this;
        }
        public String getModuleVersion() {
            return this.moduleVersion;
        }

        public ListTasksResponseBodyTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTasksResponseBodyTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTasksResponseBodyTasks setTags(java.util.List<ListTasksResponseBodyTasksTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListTasksResponseBodyTasksTags> getTags() {
            return this.tags;
        }

        public ListTasksResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
