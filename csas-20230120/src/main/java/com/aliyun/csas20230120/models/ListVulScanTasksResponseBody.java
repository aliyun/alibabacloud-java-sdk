// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListVulScanTasksResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3D7EC0AF-DB2A-5D9C-90EC-F090A6BAAEA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of vulnerability scanning tasks.</p>
     */
    @NameInMap("Tasks")
    public java.util.List<ListVulScanTasksResponseBodyTasks> tasks;

    /**
     * <p>The total number of vulnerability scanning tasks that match the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>37</p>
     */
    @NameInMap("TotalNum")
    public Long totalNum;

    public static ListVulScanTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVulScanTasksResponseBody self = new ListVulScanTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVulScanTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVulScanTasksResponseBody setTasks(java.util.List<ListVulScanTasksResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<ListVulScanTasksResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public ListVulScanTasksResponseBody setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public static class ListVulScanTasksResponseBodyTasksCustomMatchGroup extends TeaModel {
        /**
         * <p>The collection of organizational structure nodes.</p>
         */
        @NameInMap("Group")
        public java.util.List<String> group;

        /**
         * <p>The identity provider ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idp-7c3f9a2e5b18****</p>
         */
        @NameInMap("IdpId")
        public String idpId;

        public static ListVulScanTasksResponseBodyTasksCustomMatchGroup build(java.util.Map<String, ?> map) throws Exception {
            ListVulScanTasksResponseBodyTasksCustomMatchGroup self = new ListVulScanTasksResponseBodyTasksCustomMatchGroup();
            return TeaModel.build(map, self);
        }

        public ListVulScanTasksResponseBodyTasksCustomMatchGroup setGroup(java.util.List<String> group) {
            this.group = group;
            return this;
        }
        public java.util.List<String> getGroup() {
            return this.group;
        }

        public ListVulScanTasksResponseBodyTasksCustomMatchGroup setIdpId(String idpId) {
            this.idpId = idpId;
            return this;
        }
        public String getIdpId() {
            return this.idpId;
        }

    }

    public static class ListVulScanTasksResponseBodyTasksTargetDeviceCount extends TeaModel {
        /**
         * <p>The number of user endpoint devices that have acknowledged receipt of this task.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("AckCount")
        public Long ackCount;

        /**
         * <p>The number of user endpoint devices on which the scan failed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FailCount")
        public Long failCount;

        /**
         * <p>The number of user endpoint devices currently executing the scan. This value is calculated by subtracting SuccessCount and FailCount from AckCount.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("StartCount")
        public Long startCount;

        /**
         * <p>The number of user endpoint devices on which the scan succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("SuccessCount")
        public Long successCount;

        public static ListVulScanTasksResponseBodyTasksTargetDeviceCount build(java.util.Map<String, ?> map) throws Exception {
            ListVulScanTasksResponseBodyTasksTargetDeviceCount self = new ListVulScanTasksResponseBodyTasksTargetDeviceCount();
            return TeaModel.build(map, self);
        }

        public ListVulScanTasksResponseBodyTasksTargetDeviceCount setAckCount(Long ackCount) {
            this.ackCount = ackCount;
            return this;
        }
        public Long getAckCount() {
            return this.ackCount;
        }

        public ListVulScanTasksResponseBodyTasksTargetDeviceCount setFailCount(Long failCount) {
            this.failCount = failCount;
            return this;
        }
        public Long getFailCount() {
            return this.failCount;
        }

        public ListVulScanTasksResponseBodyTasksTargetDeviceCount setStartCount(Long startCount) {
            this.startCount = startCount;
            return this;
        }
        public Long getStartCount() {
            return this.startCount;
        }

        public ListVulScanTasksResponseBodyTasksTargetDeviceCount setSuccessCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }
        public Long getSuccessCount() {
            return this.successCount;
        }

    }

    public static class ListVulScanTasksResponseBodyTasks extends TeaModel {
        /**
         * <p>The task creation time, in seconds-level UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1786291200</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The effective scope specified by organizational structure. An empty list is returned if no organizational structure is configured.</p>
         */
        @NameInMap("CustomMatchGroup")
        public java.util.List<ListVulScanTasksResponseBodyTasksCustomMatchGroup> customMatchGroup;

        /**
         * <p>The task expiration time, in seconds-level UNIX timestamp. After this time, endpoints no longer pull and execute this task.</p>
         * 
         * <strong>example:</strong>
         * <p>1786291200</p>
         */
        @NameInMap("EndTimestamp")
        public Long endTimestamp;

        /**
         * <p>The matching mode of the effective scope. Valid values:</p>
         * <ul>
         * <li><strong>UserGroupAll</strong>: applies to all users under the current Alibaba Cloud account.</li>
         * <li><strong>UserGroupNormal</strong>: applies only to users within specified user groups.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UserGroupNormal</p>
         */
        @NameInMap("MatchMode")
        public String matchMode;

        /**
         * <p>The collection of effective user group IDs. An empty list is returned when MatchMode is UserGroupAll.</p>
         */
        @NameInMap("MatchTargetIds")
        public java.util.List<String> matchTargetIds;

        /**
         * <p>The ID of the vulnerability scheduled scan policy that triggered this task. An empty string is returned when TaskType is Instant.</p>
         * 
         * <strong>example:</strong>
         * <p>vul-scan-scheduled-strategy-8a3f6c2e91b7****</p>
         */
        @NameInMap("ScheduledStrategyId")
        public String scheduledStrategyId;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li><strong>Running</strong>: the task is in progress and still within the validity period.</li>
         * <li><strong>Expired</strong>: the task has expired and exceeded the validity period.</li>
         * <li><strong>Canceled</strong>: the task has been canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The execution statistics of this task on user endpoint devices within the effective scope.</p>
         */
        @NameInMap("TargetDeviceCount")
        public ListVulScanTasksResponseBodyTasksTargetDeviceCount targetDeviceCount;

        /**
         * <p>The task description. An empty string is returned if no description is specified.</p>
         * 
         * <strong>example:</strong>
         * <p>Execute a vulnerability scanning on R&amp;D department endpoints</p>
         */
        @NameInMap("TaskDescription")
        public String taskDescription;

        /**
         * <p>The vulnerability scanning task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vul-scan-task-4d7b1e9a6c38****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D department vulnerability scanning</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li><strong>Instant</strong>: an instant task created by CreateVulScanTask.</li>
         * <li><strong>Scheduled</strong>: a scheduled task automatically created by a vulnerability scheduled scan policy on a periodic basis.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Instant</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The total number of vulnerabilities detected by this task.</p>
         * 
         * <strong>example:</strong>
         * <p>27</p>
         */
        @NameInMap("VulCount")
        public Long vulCount;

        /**
         * <p>The list of exempted users. Users in this list are excluded from the scan. An empty list is returned if no exemption is configured.</p>
         */
        @NameInMap("Whitelist")
        public java.util.List<String> whitelist;

        public static ListVulScanTasksResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            ListVulScanTasksResponseBodyTasks self = new ListVulScanTasksResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public ListVulScanTasksResponseBodyTasks setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListVulScanTasksResponseBodyTasks setCustomMatchGroup(java.util.List<ListVulScanTasksResponseBodyTasksCustomMatchGroup> customMatchGroup) {
            this.customMatchGroup = customMatchGroup;
            return this;
        }
        public java.util.List<ListVulScanTasksResponseBodyTasksCustomMatchGroup> getCustomMatchGroup() {
            return this.customMatchGroup;
        }

        public ListVulScanTasksResponseBodyTasks setEndTimestamp(Long endTimestamp) {
            this.endTimestamp = endTimestamp;
            return this;
        }
        public Long getEndTimestamp() {
            return this.endTimestamp;
        }

        public ListVulScanTasksResponseBodyTasks setMatchMode(String matchMode) {
            this.matchMode = matchMode;
            return this;
        }
        public String getMatchMode() {
            return this.matchMode;
        }

        public ListVulScanTasksResponseBodyTasks setMatchTargetIds(java.util.List<String> matchTargetIds) {
            this.matchTargetIds = matchTargetIds;
            return this;
        }
        public java.util.List<String> getMatchTargetIds() {
            return this.matchTargetIds;
        }

        public ListVulScanTasksResponseBodyTasks setScheduledStrategyId(String scheduledStrategyId) {
            this.scheduledStrategyId = scheduledStrategyId;
            return this;
        }
        public String getScheduledStrategyId() {
            return this.scheduledStrategyId;
        }

        public ListVulScanTasksResponseBodyTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListVulScanTasksResponseBodyTasks setTargetDeviceCount(ListVulScanTasksResponseBodyTasksTargetDeviceCount targetDeviceCount) {
            this.targetDeviceCount = targetDeviceCount;
            return this;
        }
        public ListVulScanTasksResponseBodyTasksTargetDeviceCount getTargetDeviceCount() {
            return this.targetDeviceCount;
        }

        public ListVulScanTasksResponseBodyTasks setTaskDescription(String taskDescription) {
            this.taskDescription = taskDescription;
            return this;
        }
        public String getTaskDescription() {
            return this.taskDescription;
        }

        public ListVulScanTasksResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListVulScanTasksResponseBodyTasks setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListVulScanTasksResponseBodyTasks setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public ListVulScanTasksResponseBodyTasks setVulCount(Long vulCount) {
            this.vulCount = vulCount;
            return this;
        }
        public Long getVulCount() {
            return this.vulCount;
        }

        public ListVulScanTasksResponseBodyTasks setWhitelist(java.util.List<String> whitelist) {
            this.whitelist = whitelist;
            return this;
        }
        public java.util.List<String> getWhitelist() {
            return this.whitelist;
        }

    }

}
