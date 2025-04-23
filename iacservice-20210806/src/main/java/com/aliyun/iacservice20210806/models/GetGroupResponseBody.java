// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetGroupResponseBody extends TeaModel {
    @NameInMap("group")
    public GetGroupResponseBodyGroup group;

    /**
     * <strong>example:</strong>
     * <p>B6ED9F71-7FA8-598E-B64D-4606FB3FCCC9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGroupResponseBody self = new GetGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGroupResponseBody setGroup(GetGroupResponseBodyGroup group) {
        this.group = group;
        return this;
    }
    public GetGroupResponseBodyGroup getGroup() {
        return this.group;
    }

    public GetGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetGroupResponseBodyGroupNotifyConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("notifyPath")
        public String notifyPath;

        /**
         * <strong>example:</strong>
         * <p>DingDing</p>
         */
        @NameInMap("notifyType")
        public String notifyType;

        public static GetGroupResponseBodyGroupNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            GetGroupResponseBodyGroupNotifyConfig self = new GetGroupResponseBodyGroupNotifyConfig();
            return TeaModel.build(map, self);
        }

        public GetGroupResponseBodyGroupNotifyConfig setNotifyPath(String notifyPath) {
            this.notifyPath = notifyPath;
            return this;
        }
        public String getNotifyPath() {
            return this.notifyPath;
        }

        public GetGroupResponseBodyGroupNotifyConfig setNotifyType(String notifyType) {
            this.notifyType = notifyType;
            return this;
        }
        public String getNotifyType() {
            return this.notifyType;
        }

    }

    public static class GetGroupResponseBodyGroupTriggerConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Cron</p>
         */
        @NameInMap("triggerStrategy")
        public String triggerStrategy;

        /**
         * <strong>example:</strong>
         * <p>0 0 8 * * ?</p>
         */
        @NameInMap("triggerValue")
        public String triggerValue;

        public static GetGroupResponseBodyGroupTriggerConfig build(java.util.Map<String, ?> map) throws Exception {
            GetGroupResponseBodyGroupTriggerConfig self = new GetGroupResponseBodyGroupTriggerConfig();
            return TeaModel.build(map, self);
        }

        public GetGroupResponseBodyGroupTriggerConfig setTriggerStrategy(String triggerStrategy) {
            this.triggerStrategy = triggerStrategy;
            return this;
        }
        public String getTriggerStrategy() {
            return this.triggerStrategy;
        }

        public GetGroupResponseBodyGroupTriggerConfig setTriggerValue(String triggerValue) {
            this.triggerValue = triggerValue;
            return this;
        }
        public String getTriggerValue() {
            return this.triggerValue;
        }

    }

    public static class GetGroupResponseBodyGroup extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("autoDestroy")
        public Boolean autoDestroy;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("autoTrigger")
        public Boolean autoTrigger;

        /**
         * <strong>example:</strong>
         * <p>2022-08-21T10:57:11Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("forcedSetting")
        public Boolean forcedSetting;

        /**
         * <strong>example:</strong>
         * <p>g-14e80de4866bf7ffed0bab6154d738</p>
         */
        @NameInMap("groupId")
        public String groupId;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("notifyConfig")
        public java.util.List<GetGroupResponseBodyGroupNotifyConfig> notifyConfig;

        @NameInMap("notifyOperationTypes")
        public java.util.List<String> notifyOperationTypes;

        /**
         * <strong>example:</strong>
         * <p>p-4267dcfbf1b6d126edcadf0e949</p>
         */
        @NameInMap("projectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>ramRoleName</p>
         */
        @NameInMap("ramRole")
        public String ramRole;

        @NameInMap("reportExportField")
        public java.util.List<String> reportExportField;

        /**
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("reportExportPath")
        public String reportExportPath;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("taskCnt")
        public Long taskCnt;

        /**
         * <strong>example:</strong>
         * <p>1.191.0</p>
         */
        @NameInMap("terraformProviderVersion")
        public String terraformProviderVersion;

        @NameInMap("triggerConfig")
        public java.util.List<GetGroupResponseBodyGroupTriggerConfig> triggerConfig;

        @NameInMap("triggerResourceType")
        public java.util.List<String> triggerResourceType;

        public static GetGroupResponseBodyGroup build(java.util.Map<String, ?> map) throws Exception {
            GetGroupResponseBodyGroup self = new GetGroupResponseBodyGroup();
            return TeaModel.build(map, self);
        }

        public GetGroupResponseBodyGroup setAutoDestroy(Boolean autoDestroy) {
            this.autoDestroy = autoDestroy;
            return this;
        }
        public Boolean getAutoDestroy() {
            return this.autoDestroy;
        }

        public GetGroupResponseBodyGroup setAutoTrigger(Boolean autoTrigger) {
            this.autoTrigger = autoTrigger;
            return this;
        }
        public Boolean getAutoTrigger() {
            return this.autoTrigger;
        }

        public GetGroupResponseBodyGroup setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetGroupResponseBodyGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetGroupResponseBodyGroup setForcedSetting(Boolean forcedSetting) {
            this.forcedSetting = forcedSetting;
            return this;
        }
        public Boolean getForcedSetting() {
            return this.forcedSetting;
        }

        public GetGroupResponseBodyGroup setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetGroupResponseBodyGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetGroupResponseBodyGroup setNotifyConfig(java.util.List<GetGroupResponseBodyGroupNotifyConfig> notifyConfig) {
            this.notifyConfig = notifyConfig;
            return this;
        }
        public java.util.List<GetGroupResponseBodyGroupNotifyConfig> getNotifyConfig() {
            return this.notifyConfig;
        }

        public GetGroupResponseBodyGroup setNotifyOperationTypes(java.util.List<String> notifyOperationTypes) {
            this.notifyOperationTypes = notifyOperationTypes;
            return this;
        }
        public java.util.List<String> getNotifyOperationTypes() {
            return this.notifyOperationTypes;
        }

        public GetGroupResponseBodyGroup setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public GetGroupResponseBodyGroup setRamRole(String ramRole) {
            this.ramRole = ramRole;
            return this;
        }
        public String getRamRole() {
            return this.ramRole;
        }

        public GetGroupResponseBodyGroup setReportExportField(java.util.List<String> reportExportField) {
            this.reportExportField = reportExportField;
            return this;
        }
        public java.util.List<String> getReportExportField() {
            return this.reportExportField;
        }

        public GetGroupResponseBodyGroup setReportExportPath(String reportExportPath) {
            this.reportExportPath = reportExportPath;
            return this;
        }
        public String getReportExportPath() {
            return this.reportExportPath;
        }

        public GetGroupResponseBodyGroup setTaskCnt(Long taskCnt) {
            this.taskCnt = taskCnt;
            return this;
        }
        public Long getTaskCnt() {
            return this.taskCnt;
        }

        public GetGroupResponseBodyGroup setTerraformProviderVersion(String terraformProviderVersion) {
            this.terraformProviderVersion = terraformProviderVersion;
            return this;
        }
        public String getTerraformProviderVersion() {
            return this.terraformProviderVersion;
        }

        public GetGroupResponseBodyGroup setTriggerConfig(java.util.List<GetGroupResponseBodyGroupTriggerConfig> triggerConfig) {
            this.triggerConfig = triggerConfig;
            return this;
        }
        public java.util.List<GetGroupResponseBodyGroupTriggerConfig> getTriggerConfig() {
            return this.triggerConfig;
        }

        public GetGroupResponseBodyGroup setTriggerResourceType(java.util.List<String> triggerResourceType) {
            this.triggerResourceType = triggerResourceType;
            return this;
        }
        public java.util.List<String> getTriggerResourceType() {
            return this.triggerResourceType;
        }

    }

}
