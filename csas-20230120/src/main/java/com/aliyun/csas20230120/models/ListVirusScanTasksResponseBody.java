// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListVirusScanTasksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3D7EC0AF-DB2A-5D9C-90EC-F090A6BAAEA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tasks")
    public java.util.List<ListVirusScanTasksResponseBodyTasks> tasks;

    /**
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
        @NameInMap("Group")
        public java.util.List<String> group;

        /**
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
         * <strong>example:</strong>
         * <p>usergroup-9d4f2a7b3c1e****</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        /**
         * <strong>example:</strong>
         * <p>研发部门</p>
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
         * <strong>example:</strong>
         * <p>2026-08-21 10:24:31</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CustomMatchGroup")
        public java.util.List<ListVirusScanTasksResponseBodyTasksCustomMatchGroup> customMatchGroup;

        /**
         * <strong>example:</strong>
         * <p>1786377600</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>Quarantine</p>
         */
        @NameInMap("HighRiskOperation")
        public String highRiskOperation;

        /**
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("LowRiskOperation")
        public String lowRiskOperation;

        /**
         * <strong>example:</strong>
         * <p>UserGroupNormal</p>
         */
        @NameInMap("MatchMode")
        public String matchMode;

        @NameInMap("MatchTargetInfos")
        public java.util.List<ListVirusScanTasksResponseBodyTasksMatchTargetInfos> matchTargetInfos;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("MaxCpuUsage")
        public Long maxCpuUsage;

        /**
         * <strong>example:</strong>
         * <p>Notify</p>
         */
        @NameInMap("MidRiskOperation")
        public String midRiskOperation;

        /**
         * <strong>example:</strong>
         * <p>Balance</p>
         */
        @NameInMap("PerformanceMode")
        public String performanceMode;

        /**
         * <strong>example:</strong>
         * <p>Quick</p>
         */
        @NameInMap("ScanMode")
        public String scanMode;

        @NameInMap("ScanPath")
        public java.util.List<String> scanPath;

        @NameInMap("ScanTargets")
        public java.util.List<String> scanTargets;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>研发部门全盘扫描</p>
         */
        @NameInMap("TaskDescription")
        public String taskDescription;

        /**
         * <strong>example:</strong>
         * <p>v1:1024772</p>
         */
        @NameInMap("TaskId")
        public String taskId;

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
