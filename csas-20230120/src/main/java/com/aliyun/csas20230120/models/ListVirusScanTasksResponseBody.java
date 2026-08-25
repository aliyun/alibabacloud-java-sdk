// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListVirusScanTasksResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3D7EC0AF-DB2A-5D9C-90EC-F090A6BAAEA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of virus scan tasks.</p>
     */
    @NameInMap("Tasks")
    public java.util.List<ListVirusScanTasksResponseBodyTasks> tasks;

    /**
     * <p>The total number of virus scan tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalNum")
    public Integer totalNum;

    public static ListVirusScanTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVirusScanTasksResponseBody self = new ListVirusScanTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVirusScanTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVirusScanTasksResponseBody setTasks(java.util.List<ListVirusScanTasksResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<ListVirusScanTasksResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public ListVirusScanTasksResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class ListVirusScanTasksResponseBodyTasksCustomMatchGroup extends TeaModel {
        /**
         * <p>The collection of organizational structure nodes.</p>
         */
        @NameInMap("Group")
        public java.util.List<String> group;

        /**
         * <p>The ID of the identity provider.</p>
         * 
         * <strong>example:</strong>
         * <p>idp-7c3f9a2e5b18****</p>
         */
        @NameInMap("IdpId")
        public String idpId;

        public static ListVirusScanTasksResponseBodyTasksCustomMatchGroup build(java.util.Map<String, ?> map) throws Exception {
            ListVirusScanTasksResponseBodyTasksCustomMatchGroup self = new ListVirusScanTasksResponseBodyTasksCustomMatchGroup();
            return TeaModel.build(map, self);
        }

        public ListVirusScanTasksResponseBodyTasksCustomMatchGroup setGroup(java.util.List<String> group) {
            this.group = group;
            return this;
        }
        public java.util.List<String> getGroup() {
            return this.group;
        }

        public ListVirusScanTasksResponseBodyTasksCustomMatchGroup setIdpId(String idpId) {
            this.idpId = idpId;
            return this;
        }
        public String getIdpId() {
            return this.idpId;
        }

    }

    public static class ListVirusScanTasksResponseBodyTasksMatchTargetInfos extends TeaModel {
        /**
         * <p>The ID of the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>usergroup-9d4f2a7b3c1e****</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        /**
         * <p>The name of the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D Department</p>
         */
        @NameInMap("TargetName")
        public String targetName;

        public static ListVirusScanTasksResponseBodyTasksMatchTargetInfos build(java.util.Map<String, ?> map) throws Exception {
            ListVirusScanTasksResponseBodyTasksMatchTargetInfos self = new ListVirusScanTasksResponseBodyTasksMatchTargetInfos();
            return TeaModel.build(map, self);
        }

        public ListVirusScanTasksResponseBodyTasksMatchTargetInfos setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public ListVirusScanTasksResponseBodyTasksMatchTargetInfos setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

    }

    public static class ListVirusScanTasksResponseBodyTasks extends TeaModel {
        /**
         * <p>The time when the task was created, in the yyyy-MM-dd HH:mm:ss format. The time is in the UTC+8 time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-21 10:24:31</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The effective scope specified by organizational structure.</p>
         */
        @NameInMap("CustomMatchGroup")
        public java.util.List<ListVirusScanTasksResponseBodyTasksCustomMatchGroup> customMatchGroup;

        /**
         * <p>The time when the task expires, in seconds-level UNIX timestamp format.</p>
         * 
         * <strong>example:</strong>
         * <p>1786377600</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The action to take on high-risk virus files. Valid values:</p>
         * <ul>
         * <li><strong>Quarantine</strong>: Quarantine quarantined file.</li>
         * <li><strong>Notify</strong>: Report an alert only without taking action on quarantined file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Quarantine</p>
         */
        @NameInMap("HighRiskOperation")
        public String highRiskOperation;

        /**
         * <p>The action to take on low-risk virus files. Valid values:</p>
         * <ul>
         * <li><strong>Quarantine</strong>: Quarantine quarantined file.</li>
         * <li><strong>Notify</strong>: Report an alert only without taking action on quarantined file.</li>
         * <li><strong>None</strong>: Take no action.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("LowRiskOperation")
        public String lowRiskOperation;

        /**
         * <p>The matching mode for the effective scope. Valid values:</p>
         * <ul>
         * <li><strong>UserGroupAll</strong>: Applies to all users under the current Alibaba Cloud account.</li>
         * <li><strong>UserGroupNormal</strong>: Applies only to users in specified user groups.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UserGroupNormal</p>
         */
        @NameInMap("MatchMode")
        public String matchMode;

        /**
         * <p>The collection of user groups to which the task applies.</p>
         */
        @NameInMap("MatchTargetInfos")
        public java.util.List<ListVirusScanTasksResponseBodyTasksMatchTargetInfos> matchTargetInfos;

        /**
         * <p>The maximum percentage of endpoint CPU usage allowed during scanning.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("MaxCpuUsage")
        public Long maxCpuUsage;

        /**
         * <p>The action to take on medium-risk virus files. Valid values:</p>
         * <ul>
         * <li><strong>Quarantine</strong>: Quarantine quarantined file.</li>
         * <li><strong>Notify</strong>: Report an alert only without taking action on quarantined file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Notify</p>
         */
        @NameInMap("MidRiskOperation")
        public String midRiskOperation;

        /**
         * <p>The scan performance schema pattern. Valid values:</p>
         * <ul>
         * <li><strong>SecurityFirst</strong>: Security first. The default CPU usage upper limit is 50%.</li>
         * <li><strong>Balance</strong>: Balanced. The default CPU usage upper limit is 30%.</li>
         * <li><strong>ExperienceFirst</strong>: Experience first. The default CPU usage upper limit is 15%.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Balance</p>
         */
        @NameInMap("PerformanceMode")
        public String performanceMode;

        /**
         * <p>The scan path scope. Valid values:</p>
         * <ul>
         * <li><strong>Quick</strong>: Quick scan. Only scans critical system directories and common risk locations.</li>
         * <li><strong>Full</strong>: Full scan.</li>
         * <li><strong>Custom</strong>: Custom path scan.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Quick</p>
         */
        @NameInMap("ScanMode")
        public String scanMode;

        /**
         * <p>The collection of custom scan paths.</p>
         */
        @NameInMap("ScanPath")
        public java.util.List<String> scanPath;

        /**
         * <p>The collection of virus types to be handled in this scan.</p>
         */
        @NameInMap("ScanTargets")
        public java.util.List<String> scanTargets;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Not canceled.</li>
         * <li><strong>1</strong>: Canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The description of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>Full scan for R&amp;D department</p>
         */
        @NameInMap("TaskDescription")
        public String taskDescription;

        /**
         * <p>The ID of the virus scan task.</p>
         * 
         * <strong>example:</strong>
         * <p>v1:1024772</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The list of exempted users.</p>
         */
        @NameInMap("Whitelist")
        public java.util.List<String> whitelist;

        public static ListVirusScanTasksResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            ListVirusScanTasksResponseBodyTasks self = new ListVirusScanTasksResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public ListVirusScanTasksResponseBodyTasks setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListVirusScanTasksResponseBodyTasks setCustomMatchGroup(java.util.List<ListVirusScanTasksResponseBodyTasksCustomMatchGroup> customMatchGroup) {
            this.customMatchGroup = customMatchGroup;
            return this;
        }
        public java.util.List<ListVirusScanTasksResponseBodyTasksCustomMatchGroup> getCustomMatchGroup() {
            return this.customMatchGroup;
        }

        public ListVirusScanTasksResponseBodyTasks setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListVirusScanTasksResponseBodyTasks setHighRiskOperation(String highRiskOperation) {
            this.highRiskOperation = highRiskOperation;
            return this;
        }
        public String getHighRiskOperation() {
            return this.highRiskOperation;
        }

        public ListVirusScanTasksResponseBodyTasks setLowRiskOperation(String lowRiskOperation) {
            this.lowRiskOperation = lowRiskOperation;
            return this;
        }
        public String getLowRiskOperation() {
            return this.lowRiskOperation;
        }

        public ListVirusScanTasksResponseBodyTasks setMatchMode(String matchMode) {
            this.matchMode = matchMode;
            return this;
        }
        public String getMatchMode() {
            return this.matchMode;
        }

        public ListVirusScanTasksResponseBodyTasks setMatchTargetInfos(java.util.List<ListVirusScanTasksResponseBodyTasksMatchTargetInfos> matchTargetInfos) {
            this.matchTargetInfos = matchTargetInfos;
            return this;
        }
        public java.util.List<ListVirusScanTasksResponseBodyTasksMatchTargetInfos> getMatchTargetInfos() {
            return this.matchTargetInfos;
        }

        public ListVirusScanTasksResponseBodyTasks setMaxCpuUsage(Long maxCpuUsage) {
            this.maxCpuUsage = maxCpuUsage;
            return this;
        }
        public Long getMaxCpuUsage() {
            return this.maxCpuUsage;
        }

        public ListVirusScanTasksResponseBodyTasks setMidRiskOperation(String midRiskOperation) {
            this.midRiskOperation = midRiskOperation;
            return this;
        }
        public String getMidRiskOperation() {
            return this.midRiskOperation;
        }

        public ListVirusScanTasksResponseBodyTasks setPerformanceMode(String performanceMode) {
            this.performanceMode = performanceMode;
            return this;
        }
        public String getPerformanceMode() {
            return this.performanceMode;
        }

        public ListVirusScanTasksResponseBodyTasks setScanMode(String scanMode) {
            this.scanMode = scanMode;
            return this;
        }
        public String getScanMode() {
            return this.scanMode;
        }

        public ListVirusScanTasksResponseBodyTasks setScanPath(java.util.List<String> scanPath) {
            this.scanPath = scanPath;
            return this;
        }
        public java.util.List<String> getScanPath() {
            return this.scanPath;
        }

        public ListVirusScanTasksResponseBodyTasks setScanTargets(java.util.List<String> scanTargets) {
            this.scanTargets = scanTargets;
            return this;
        }
        public java.util.List<String> getScanTargets() {
            return this.scanTargets;
        }

        public ListVirusScanTasksResponseBodyTasks setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListVirusScanTasksResponseBodyTasks setTaskDescription(String taskDescription) {
            this.taskDescription = taskDescription;
            return this;
        }
        public String getTaskDescription() {
            return this.taskDescription;
        }

        public ListVirusScanTasksResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListVirusScanTasksResponseBodyTasks setWhitelist(java.util.List<String> whitelist) {
            this.whitelist = whitelist;
            return this;
        }
        public java.util.List<String> getWhitelist() {
            return this.whitelist;
        }

    }

}
