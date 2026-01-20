// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DescribeCustomAgentResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeCustomAgentResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>Specified parameter Tid is not valid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeCustomAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomAgentResponseBody self = new DescribeCustomAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomAgentResponseBody setData(DescribeCustomAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeCustomAgentResponseBodyData getData() {
        return this.data;
    }

    public DescribeCustomAgentResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeCustomAgentResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeCustomAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomAgentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCustomAgentResponseBodyDataExecutionConfig extends TeaModel {
        @NameInMap("SkipAskHuman")
        public Boolean skipAskHuman;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SkipPlan")
        public Boolean skipPlan;

        @NameInMap("SkipSqlConfirm")
        public Boolean skipSqlConfirm;

        @NameInMap("SkipWebReportConfirm")
        public Boolean skipWebReportConfirm;

        public static DescribeCustomAgentResponseBodyDataExecutionConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomAgentResponseBodyDataExecutionConfig self = new DescribeCustomAgentResponseBodyDataExecutionConfig();
            return TeaModel.build(map, self);
        }

        public DescribeCustomAgentResponseBodyDataExecutionConfig setSkipAskHuman(Boolean skipAskHuman) {
            this.skipAskHuman = skipAskHuman;
            return this;
        }
        public Boolean getSkipAskHuman() {
            return this.skipAskHuman;
        }

        public DescribeCustomAgentResponseBodyDataExecutionConfig setSkipPlan(Boolean skipPlan) {
            this.skipPlan = skipPlan;
            return this;
        }
        public Boolean getSkipPlan() {
            return this.skipPlan;
        }

        public DescribeCustomAgentResponseBodyDataExecutionConfig setSkipSqlConfirm(Boolean skipSqlConfirm) {
            this.skipSqlConfirm = skipSqlConfirm;
            return this;
        }
        public Boolean getSkipSqlConfirm() {
            return this.skipSqlConfirm;
        }

        public DescribeCustomAgentResponseBodyDataExecutionConfig setSkipWebReportConfirm(Boolean skipWebReportConfirm) {
            this.skipWebReportConfirm = skipWebReportConfirm;
            return this;
        }
        public Boolean getSkipWebReportConfirm() {
            return this.skipWebReportConfirm;
        }

    }

    public static class DescribeCustomAgentResponseBodyDataKnowledgeConfigList extends TeaModel {
        @NameInMap("AccessType")
        public String accessType;

        @NameInMap("McpServerId")
        public String mcpServerId;

        public static DescribeCustomAgentResponseBodyDataKnowledgeConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomAgentResponseBodyDataKnowledgeConfigList self = new DescribeCustomAgentResponseBodyDataKnowledgeConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeCustomAgentResponseBodyDataKnowledgeConfigList setAccessType(String accessType) {
            this.accessType = accessType;
            return this;
        }
        public String getAccessType() {
            return this.accessType;
        }

        public DescribeCustomAgentResponseBodyDataKnowledgeConfigList setMcpServerId(String mcpServerId) {
            this.mcpServerId = mcpServerId;
            return this;
        }
        public String getMcpServerId() {
            return this.mcpServerId;
        }

    }

    public static class DescribeCustomAgentResponseBodyDataScheduleTaskConfig extends TeaModel {
        @NameInMap("CronExpression")
        public String cronExpression;

        @NameInMap("Query")
        public String query;

        @NameInMap("RelatedSessionId")
        public String relatedSessionId;

        public static DescribeCustomAgentResponseBodyDataScheduleTaskConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomAgentResponseBodyDataScheduleTaskConfig self = new DescribeCustomAgentResponseBodyDataScheduleTaskConfig();
            return TeaModel.build(map, self);
        }

        public DescribeCustomAgentResponseBodyDataScheduleTaskConfig setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public DescribeCustomAgentResponseBodyDataScheduleTaskConfig setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public DescribeCustomAgentResponseBodyDataScheduleTaskConfig setRelatedSessionId(String relatedSessionId) {
            this.relatedSessionId = relatedSessionId;
            return this;
        }
        public String getRelatedSessionId() {
            return this.relatedSessionId;
        }

    }

    public static class DescribeCustomAgentResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>16738266********</p>
         */
        @NameInMap("AliyunParentUid")
        public String aliyunParentUid;

        /**
         * <strong>example:</strong>
         * <p>20372822********</p>
         */
        @NameInMap("AliyunUid")
        public String aliyunUid;

        /**
         * <strong>example:</strong>
         * <p>HaoY*****</p>
         */
        @NameInMap("CreatorUserName")
        public String creatorUserName;

        /**
         * <strong>example:</strong>
         * <p>ca-4y3ca4khkcu**********ysf</p>
         */
        @NameInMap("CustomAgentId")
        public String customAgentId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("DMSUnit")
        public String DMSUnit;

        @NameInMap("DataJson")
        public String dataJson;

        @NameInMap("DefaultAgent")
        public Integer defaultAgent;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("DmsUnit")
        public String dmsUnit;

        @NameInMap("ExecutionConfig")
        public DescribeCustomAgentResponseBodyDataExecutionConfig executionConfig;

        /**
         * <strong>example:</strong>
         * <p>2025-12-11T14:04:32.000+00:00</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <strong>example:</strong>
         * <p>2025-12-11T14:04:32.000+00:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Instruction")
        public String instruction;

        @NameInMap("IsScheduleTask")
        public Boolean isScheduleTask;

        @NameInMap("Knowledge")
        public String knowledge;

        @NameInMap("KnowledgeConfigList")
        public java.util.List<DescribeCustomAgentResponseBodyDataKnowledgeConfigList> knowledgeConfigList;

        /**
         * <strong>example:</strong>
         * <p>20372822********</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        /**
         * <strong>example:</strong>
         * <p>HaoY*****</p>
         */
        @NameInMap("ModifierUserName")
        public String modifierUserName;

        @NameInMap("Name")
        public String name;

        @NameInMap("NextRuntime")
        public Long nextRuntime;

        /**
         * <strong>example:</strong>
         * <p>2025-12-11T14:04:32.000+00:00</p>
         */
        @NameInMap("OfflineTime")
        public String offlineTime;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>2025-12-11T14:04:32.000+00:00</p>
         */
        @NameInMap("ReleaseTime")
        public String releaseTime;

        @NameInMap("ScheduleTaskConfig")
        public DescribeCustomAgentResponseBodyDataScheduleTaskConfig scheduleTaskConfig;

        /**
         * <strong>example:</strong>
         * <p>RELEASED</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("TextReportConfig")
        public String textReportConfig;

        @NameInMap("WebReportConfig")
        public String webReportConfig;

        /**
         * <strong>example:</strong>
         * <p>56kv1pvl9uvt9**********bb</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static DescribeCustomAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomAgentResponseBodyData self = new DescribeCustomAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCustomAgentResponseBodyData setAliyunParentUid(String aliyunParentUid) {
            this.aliyunParentUid = aliyunParentUid;
            return this;
        }
        public String getAliyunParentUid() {
            return this.aliyunParentUid;
        }

        public DescribeCustomAgentResponseBodyData setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public DescribeCustomAgentResponseBodyData setCreatorUserName(String creatorUserName) {
            this.creatorUserName = creatorUserName;
            return this;
        }
        public String getCreatorUserName() {
            return this.creatorUserName;
        }

        public DescribeCustomAgentResponseBodyData setCustomAgentId(String customAgentId) {
            this.customAgentId = customAgentId;
            return this;
        }
        public String getCustomAgentId() {
            return this.customAgentId;
        }

        public DescribeCustomAgentResponseBodyData setDMSUnit(String DMSUnit) {
            this.DMSUnit = DMSUnit;
            return this;
        }
        public String getDMSUnit() {
            return this.DMSUnit;
        }

        public DescribeCustomAgentResponseBodyData setDataJson(String dataJson) {
            this.dataJson = dataJson;
            return this;
        }
        public String getDataJson() {
            return this.dataJson;
        }

        public DescribeCustomAgentResponseBodyData setDefaultAgent(Integer defaultAgent) {
            this.defaultAgent = defaultAgent;
            return this;
        }
        public Integer getDefaultAgent() {
            return this.defaultAgent;
        }

        public DescribeCustomAgentResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCustomAgentResponseBodyData setDmsUnit(String dmsUnit) {
            this.dmsUnit = dmsUnit;
            return this;
        }
        public String getDmsUnit() {
            return this.dmsUnit;
        }

        public DescribeCustomAgentResponseBodyData setExecutionConfig(DescribeCustomAgentResponseBodyDataExecutionConfig executionConfig) {
            this.executionConfig = executionConfig;
            return this;
        }
        public DescribeCustomAgentResponseBodyDataExecutionConfig getExecutionConfig() {
            return this.executionConfig;
        }

        public DescribeCustomAgentResponseBodyData setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeCustomAgentResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeCustomAgentResponseBodyData setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public DescribeCustomAgentResponseBodyData setIsScheduleTask(Boolean isScheduleTask) {
            this.isScheduleTask = isScheduleTask;
            return this;
        }
        public Boolean getIsScheduleTask() {
            return this.isScheduleTask;
        }

        public DescribeCustomAgentResponseBodyData setKnowledge(String knowledge) {
            this.knowledge = knowledge;
            return this;
        }
        public String getKnowledge() {
            return this.knowledge;
        }

        public DescribeCustomAgentResponseBodyData setKnowledgeConfigList(java.util.List<DescribeCustomAgentResponseBodyDataKnowledgeConfigList> knowledgeConfigList) {
            this.knowledgeConfigList = knowledgeConfigList;
            return this;
        }
        public java.util.List<DescribeCustomAgentResponseBodyDataKnowledgeConfigList> getKnowledgeConfigList() {
            return this.knowledgeConfigList;
        }

        public DescribeCustomAgentResponseBodyData setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public DescribeCustomAgentResponseBodyData setModifierUserName(String modifierUserName) {
            this.modifierUserName = modifierUserName;
            return this;
        }
        public String getModifierUserName() {
            return this.modifierUserName;
        }

        public DescribeCustomAgentResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCustomAgentResponseBodyData setNextRuntime(Long nextRuntime) {
            this.nextRuntime = nextRuntime;
            return this;
        }
        public Long getNextRuntime() {
            return this.nextRuntime;
        }

        public DescribeCustomAgentResponseBodyData setOfflineTime(String offlineTime) {
            this.offlineTime = offlineTime;
            return this;
        }
        public String getOfflineTime() {
            return this.offlineTime;
        }

        public DescribeCustomAgentResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeCustomAgentResponseBodyData setReleaseTime(String releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public String getReleaseTime() {
            return this.releaseTime;
        }

        public DescribeCustomAgentResponseBodyData setScheduleTaskConfig(DescribeCustomAgentResponseBodyDataScheduleTaskConfig scheduleTaskConfig) {
            this.scheduleTaskConfig = scheduleTaskConfig;
            return this;
        }
        public DescribeCustomAgentResponseBodyDataScheduleTaskConfig getScheduleTaskConfig() {
            return this.scheduleTaskConfig;
        }

        public DescribeCustomAgentResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCustomAgentResponseBodyData setTextReportConfig(String textReportConfig) {
            this.textReportConfig = textReportConfig;
            return this;
        }
        public String getTextReportConfig() {
            return this.textReportConfig;
        }

        public DescribeCustomAgentResponseBodyData setWebReportConfig(String webReportConfig) {
            this.webReportConfig = webReportConfig;
            return this;
        }
        public String getWebReportConfig() {
            return this.webReportConfig;
        }

        public DescribeCustomAgentResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
