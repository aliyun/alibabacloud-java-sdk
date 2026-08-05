// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ModifyCustomAgentResponseBody extends TeaModel {
    /**
     * <p>The response struct.</p>
     */
    @NameInMap("Data")
    public ModifyCustomAgentResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the call failed.</p>
     * 
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
     * <p>Indicates whether the request was successful. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ModifyCustomAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustomAgentResponseBody self = new ModifyCustomAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCustomAgentResponseBody setData(ModifyCustomAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyCustomAgentResponseBodyData getData() {
        return this.data;
    }

    public ModifyCustomAgentResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ModifyCustomAgentResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ModifyCustomAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyCustomAgentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModifyCustomAgentResponseBodyDataCallbackConfig extends TeaModel {
        @NameInMap("CallbackArgs")
        public String callbackArgs;

        @NameInMap("CallbackPrompt")
        public String callbackPrompt;

        @NameInMap("CallbackTime")
        public Integer callbackTime;

        @NameInMap("ToolId")
        public String toolId;

        @NameInMap("Type")
        public String type;

        public static ModifyCustomAgentResponseBodyDataCallbackConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyCustomAgentResponseBodyDataCallbackConfig self = new ModifyCustomAgentResponseBodyDataCallbackConfig();
            return TeaModel.build(map, self);
        }

        public ModifyCustomAgentResponseBodyDataCallbackConfig setCallbackArgs(String callbackArgs) {
            this.callbackArgs = callbackArgs;
            return this;
        }
        public String getCallbackArgs() {
            return this.callbackArgs;
        }

        public ModifyCustomAgentResponseBodyDataCallbackConfig setCallbackPrompt(String callbackPrompt) {
            this.callbackPrompt = callbackPrompt;
            return this;
        }
        public String getCallbackPrompt() {
            return this.callbackPrompt;
        }

        public ModifyCustomAgentResponseBodyDataCallbackConfig setCallbackTime(Integer callbackTime) {
            this.callbackTime = callbackTime;
            return this;
        }
        public Integer getCallbackTime() {
            return this.callbackTime;
        }

        public ModifyCustomAgentResponseBodyDataCallbackConfig setToolId(String toolId) {
            this.toolId = toolId;
            return this;
        }
        public String getToolId() {
            return this.toolId;
        }

        public ModifyCustomAgentResponseBodyDataCallbackConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ModifyCustomAgentResponseBodyDataExecutionConfig extends TeaModel {
        /**
         * <p>Specifies whether to disable user inquiries during the process.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SkipAskHuman")
        public Boolean skipAskHuman;

        /**
         * <p>Specifies whether to skip the plan confirmation step.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SkipPlan")
        public Boolean skipPlan;

        /**
         * <p>Specifies whether to skip all SQL confirmations.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SkipSqlConfirm")
        public Boolean skipSqlConfirm;

        /**
         * <p>Specifies whether to skip the web report rendering confirmation.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SkipWebReportConfirm")
        public Boolean skipWebReportConfirm;

        public static ModifyCustomAgentResponseBodyDataExecutionConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyCustomAgentResponseBodyDataExecutionConfig self = new ModifyCustomAgentResponseBodyDataExecutionConfig();
            return TeaModel.build(map, self);
        }

        public ModifyCustomAgentResponseBodyDataExecutionConfig setSkipAskHuman(Boolean skipAskHuman) {
            this.skipAskHuman = skipAskHuman;
            return this;
        }
        public Boolean getSkipAskHuman() {
            return this.skipAskHuman;
        }

        public ModifyCustomAgentResponseBodyDataExecutionConfig setSkipPlan(Boolean skipPlan) {
            this.skipPlan = skipPlan;
            return this;
        }
        public Boolean getSkipPlan() {
            return this.skipPlan;
        }

        public ModifyCustomAgentResponseBodyDataExecutionConfig setSkipSqlConfirm(Boolean skipSqlConfirm) {
            this.skipSqlConfirm = skipSqlConfirm;
            return this;
        }
        public Boolean getSkipSqlConfirm() {
            return this.skipSqlConfirm;
        }

        public ModifyCustomAgentResponseBodyDataExecutionConfig setSkipWebReportConfirm(Boolean skipWebReportConfirm) {
            this.skipWebReportConfirm = skipWebReportConfirm;
            return this;
        }
        public Boolean getSkipWebReportConfirm() {
            return this.skipWebReportConfirm;
        }

    }

    public static class ModifyCustomAgentResponseBodyDataKnowledgeConfigList extends TeaModel {
        /**
         * <p>The access type.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp</p>
         */
        @NameInMap("AccessType")
        public String accessType;

        @NameInMap("KbUuid")
        public String kbUuid;

        /**
         * <p>The ID of the MCP server.</p>
         * 
         * <strong>example:</strong>
         * <p>nhdpt9adf6ac**********ca</p>
         */
        @NameInMap("McpServerId")
        public String mcpServerId;

        public static ModifyCustomAgentResponseBodyDataKnowledgeConfigList build(java.util.Map<String, ?> map) throws Exception {
            ModifyCustomAgentResponseBodyDataKnowledgeConfigList self = new ModifyCustomAgentResponseBodyDataKnowledgeConfigList();
            return TeaModel.build(map, self);
        }

        public ModifyCustomAgentResponseBodyDataKnowledgeConfigList setAccessType(String accessType) {
            this.accessType = accessType;
            return this;
        }
        public String getAccessType() {
            return this.accessType;
        }

        public ModifyCustomAgentResponseBodyDataKnowledgeConfigList setKbUuid(String kbUuid) {
            this.kbUuid = kbUuid;
            return this;
        }
        public String getKbUuid() {
            return this.kbUuid;
        }

        public ModifyCustomAgentResponseBodyDataKnowledgeConfigList setMcpServerId(String mcpServerId) {
            this.mcpServerId = mcpServerId;
            return this;
        }
        public String getMcpServerId() {
            return this.mcpServerId;
        }

    }

    public static class ModifyCustomAgentResponseBodyDataKnowledgeSemanticConfigList extends TeaModel {
        @NameInMap("DbId")
        public String dbId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("KnowledgeUuid")
        public String knowledgeUuid;

        @NameInMap("Type")
        public String type;

        public static ModifyCustomAgentResponseBodyDataKnowledgeSemanticConfigList build(java.util.Map<String, ?> map) throws Exception {
            ModifyCustomAgentResponseBodyDataKnowledgeSemanticConfigList self = new ModifyCustomAgentResponseBodyDataKnowledgeSemanticConfigList();
            return TeaModel.build(map, self);
        }

        public ModifyCustomAgentResponseBodyDataKnowledgeSemanticConfigList setDbId(String dbId) {
            this.dbId = dbId;
            return this;
        }
        public String getDbId() {
            return this.dbId;
        }

        public ModifyCustomAgentResponseBodyDataKnowledgeSemanticConfigList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ModifyCustomAgentResponseBodyDataKnowledgeSemanticConfigList setKnowledgeUuid(String knowledgeUuid) {
            this.knowledgeUuid = knowledgeUuid;
            return this;
        }
        public String getKnowledgeUuid() {
            return this.knowledgeUuid;
        }

        public ModifyCustomAgentResponseBodyDataKnowledgeSemanticConfigList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ModifyCustomAgentResponseBodyDataScheduleTaskConfig extends TeaModel {
        /**
         * <p>The cron expression for the time-based scheduling.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 0 ? * 1-7</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <p>The query for the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>Analyze this data and provide a brief report</p>
         */
        @NameInMap("Query")
        public String query;

        /**
         * <p>The ID of the referenced historical session.</p>
         * 
         * <strong>example:</strong>
         * <p>4m24*****mg7j2v</p>
         */
        @NameInMap("RelatedSessionId")
        public String relatedSessionId;

        public static ModifyCustomAgentResponseBodyDataScheduleTaskConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyCustomAgentResponseBodyDataScheduleTaskConfig self = new ModifyCustomAgentResponseBodyDataScheduleTaskConfig();
            return TeaModel.build(map, self);
        }

        public ModifyCustomAgentResponseBodyDataScheduleTaskConfig setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public ModifyCustomAgentResponseBodyDataScheduleTaskConfig setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public ModifyCustomAgentResponseBodyDataScheduleTaskConfig setRelatedSessionId(String relatedSessionId) {
            this.relatedSessionId = relatedSessionId;
            return this;
        }
        public String getRelatedSessionId() {
            return this.relatedSessionId;
        }

    }

    public static class ModifyCustomAgentResponseBodyData extends TeaModel {
        /**
         * <p>The Alibaba Cloud account ID of the primary account.</p>
         * 
         * <strong>example:</strong>
         * <p>16738266********</p>
         */
        @NameInMap("AliyunParentUid")
        public String aliyunParentUid;

        /**
         * <p>The Alibaba Cloud account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20372822********</p>
         */
        @NameInMap("AliyunUid")
        public String aliyunUid;

        @NameInMap("CallbackConfig")
        public ModifyCustomAgentResponseBodyDataCallbackConfig callbackConfig;

        /**
         * <p>The name of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>HaoY*****</p>
         */
        @NameInMap("CreatorUserName")
        public String creatorUserName;

        /**
         * <p>The custom agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-4y3ca4khkcu**********ysf</p>
         */
        @NameInMap("CustomAgentId")
        public String customAgentId;

        /**
         * <p>The current Data Management unit.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("DMSUnit")
        public String DMSUnit;

        /**
         * <p>The specified data range in JSON string format.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;tableFlag&quot; : true,
         *   &quot;scope&quot; : &quot;personal&quot;,
         *   &quot;personal&quot; : {
         *     &quot;DataSourceType&quot; : &quot;remote_data_center&quot;,
         *     &quot;FileId&quot; : &quot;f-5qlrwaw10<strong><strong><strong><strong>s3gpw1z&quot;,
         *     &quot;Database&quot; : &quot;TestTable</strong></strong></strong>.xlsx&quot;,
         *     &quot;Tables&quot; : [ &quot;Sheet1&quot; ],
         *     &quot;TableIds&quot; : [ &quot;</strong>****&quot; ],
         *     &quot;RegionId&quot; : &quot;cn-hangzhou&quot;
         *   }
         * }</p>
         */
        @NameInMap("DataJson")
        public String dataJson;

        /**
         * <p>The description of the custom agent.</p>
         * 
         * <strong>example:</strong>
         * <p>AgentTestDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The current Data Management unit.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("DmsUnit")
        public String dmsUnit;

        /**
         * <p>The execution configuration.</p>
         */
        @NameInMap("ExecutionConfig")
        public ModifyCustomAgentResponseBodyDataExecutionConfig executionConfig;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-11T14:04:32.000+00:00</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-11T14:04:32.000+00:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The instruction.</p>
         * 
         * <strong>example:</strong>
         * <p>Analysis framework:</p>
         * <ol>
         * <li>Monitor core metrics (GMV, order volume, UV, conversion rate) on a daily, weekly, and monthly basis, analyze trends and year-over-year/month-over-month fluctuations;</li>
         * <li>Segment by new/existing customers, channels, and regions to identify growth drivers and weaknesses;</li>
         * <li>Conduct funnel analysis based on user behavior paths (browsing → add to cart → payment) to pinpoint drop-off stages;</li>
         * </ol>
         */
        @NameInMap("Instruction")
        public String instruction;

        /**
         * <p>Indicates whether a periodic task is configured.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsScheduleTask")
        public Boolean isScheduleTask;

        /**
         * <p>The knowledge.</p>
         * 
         * <strong>example:</strong>
         * <p>Core metric definitions:</p>
         * <ol>
         * <li>GMV (Gross Merchandise Volume) refers to the total order amount, including both paid and unpaid orders;</li>
         * <li>Order volume is the number of valid orders placed per day;</li>
         * <li>UV (Unique Visitors) refers to the deduplicated number of users who visit the website or app;</li>
         * <li>Conversion rate = number of paid orders / UV, reflecting traffic conversion efficiency;</li>
         * </ol>
         */
        @NameInMap("Knowledge")
        public String knowledge;

        /**
         * <p>The external knowledge bases.</p>
         */
        @NameInMap("KnowledgeConfigList")
        public java.util.List<ModifyCustomAgentResponseBodyDataKnowledgeConfigList> knowledgeConfigList;

        @NameInMap("KnowledgeSemanticConfigList")
        public java.util.List<ModifyCustomAgentResponseBodyDataKnowledgeSemanticConfigList> knowledgeSemanticConfigList;

        /**
         * <p>The modifier.</p>
         * 
         * <strong>example:</strong>
         * <p>20372822********</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        /**
         * <p>The name of the modifier.</p>
         * 
         * <strong>example:</strong>
         * <p>HaoY*****</p>
         */
        @NameInMap("ModifierUserName")
        public String modifierUserName;

        /**
         * <p>The name of the custom agent.</p>
         * 
         * <strong>example:</strong>
         * <p>AgentTestName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The next run time of the periodic task.</p>
         * 
         * <strong>example:</strong>
         * <p>1767715200</p>
         */
        @NameInMap("NextRuntime")
        public Long nextRuntime;

        /**
         * <p>The offline time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-11T14:04:32.000+00:00</p>
         */
        @NameInMap("OfflineTime")
        public String offlineTime;

        /**
         * <p>The region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The ID of the referenced historical session.</p>
         */
        @NameInMap("RelatedSessionId")
        public String relatedSessionId;

        /**
         * <p>The publish time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-11T14:04:32.000+00:00</p>
         */
        @NameInMap("ReleaseTime")
        public String releaseTime;

        /**
         * <p>The periodic task configuration.</p>
         */
        @NameInMap("ScheduleTaskConfig")
        public ModifyCustomAgentResponseBodyDataScheduleTaskConfig scheduleTaskConfig;

        /**
         * <p>The status of the custom agent.</p>
         * 
         * <strong>example:</strong>
         * <p>RELEASED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The text report format.</p>
         * 
         * <strong>example:</strong>
         * <p>The text report requires that all numbers use Chinese numerals instead of Arabic numerals</p>
         */
        @NameInMap("TextReportConfig")
        public String textReportConfig;

        /**
         * <p>The web report format.</p>
         * 
         * <strong>example:</strong>
         * <p>The web report requires that all numbers use Chinese numerals instead of Arabic numerals</p>
         */
        @NameInMap("WebReportConfig")
        public String webReportConfig;

        @NameInMap("WebReportTheme")
        public String webReportTheme;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>56kv1pvl9uvt9**********bb</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ModifyCustomAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyCustomAgentResponseBodyData self = new ModifyCustomAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyCustomAgentResponseBodyData setAliyunParentUid(String aliyunParentUid) {
            this.aliyunParentUid = aliyunParentUid;
            return this;
        }
        public String getAliyunParentUid() {
            return this.aliyunParentUid;
        }

        public ModifyCustomAgentResponseBodyData setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public ModifyCustomAgentResponseBodyData setCallbackConfig(ModifyCustomAgentResponseBodyDataCallbackConfig callbackConfig) {
            this.callbackConfig = callbackConfig;
            return this;
        }
        public ModifyCustomAgentResponseBodyDataCallbackConfig getCallbackConfig() {
            return this.callbackConfig;
        }

        public ModifyCustomAgentResponseBodyData setCreatorUserName(String creatorUserName) {
            this.creatorUserName = creatorUserName;
            return this;
        }
        public String getCreatorUserName() {
            return this.creatorUserName;
        }

        public ModifyCustomAgentResponseBodyData setCustomAgentId(String customAgentId) {
            this.customAgentId = customAgentId;
            return this;
        }
        public String getCustomAgentId() {
            return this.customAgentId;
        }

        public ModifyCustomAgentResponseBodyData setDMSUnit(String DMSUnit) {
            this.DMSUnit = DMSUnit;
            return this;
        }
        public String getDMSUnit() {
            return this.DMSUnit;
        }

        public ModifyCustomAgentResponseBodyData setDataJson(String dataJson) {
            this.dataJson = dataJson;
            return this;
        }
        public String getDataJson() {
            return this.dataJson;
        }

        public ModifyCustomAgentResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyCustomAgentResponseBodyData setDmsUnit(String dmsUnit) {
            this.dmsUnit = dmsUnit;
            return this;
        }
        public String getDmsUnit() {
            return this.dmsUnit;
        }

        public ModifyCustomAgentResponseBodyData setExecutionConfig(ModifyCustomAgentResponseBodyDataExecutionConfig executionConfig) {
            this.executionConfig = executionConfig;
            return this;
        }
        public ModifyCustomAgentResponseBodyDataExecutionConfig getExecutionConfig() {
            return this.executionConfig;
        }

        public ModifyCustomAgentResponseBodyData setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public ModifyCustomAgentResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ModifyCustomAgentResponseBodyData setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public ModifyCustomAgentResponseBodyData setIsScheduleTask(Boolean isScheduleTask) {
            this.isScheduleTask = isScheduleTask;
            return this;
        }
        public Boolean getIsScheduleTask() {
            return this.isScheduleTask;
        }

        public ModifyCustomAgentResponseBodyData setKnowledge(String knowledge) {
            this.knowledge = knowledge;
            return this;
        }
        public String getKnowledge() {
            return this.knowledge;
        }

        public ModifyCustomAgentResponseBodyData setKnowledgeConfigList(java.util.List<ModifyCustomAgentResponseBodyDataKnowledgeConfigList> knowledgeConfigList) {
            this.knowledgeConfigList = knowledgeConfigList;
            return this;
        }
        public java.util.List<ModifyCustomAgentResponseBodyDataKnowledgeConfigList> getKnowledgeConfigList() {
            return this.knowledgeConfigList;
        }

        public ModifyCustomAgentResponseBodyData setKnowledgeSemanticConfigList(java.util.List<ModifyCustomAgentResponseBodyDataKnowledgeSemanticConfigList> knowledgeSemanticConfigList) {
            this.knowledgeSemanticConfigList = knowledgeSemanticConfigList;
            return this;
        }
        public java.util.List<ModifyCustomAgentResponseBodyDataKnowledgeSemanticConfigList> getKnowledgeSemanticConfigList() {
            return this.knowledgeSemanticConfigList;
        }

        public ModifyCustomAgentResponseBodyData setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ModifyCustomAgentResponseBodyData setModifierUserName(String modifierUserName) {
            this.modifierUserName = modifierUserName;
            return this;
        }
        public String getModifierUserName() {
            return this.modifierUserName;
        }

        public ModifyCustomAgentResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyCustomAgentResponseBodyData setNextRuntime(Long nextRuntime) {
            this.nextRuntime = nextRuntime;
            return this;
        }
        public Long getNextRuntime() {
            return this.nextRuntime;
        }

        public ModifyCustomAgentResponseBodyData setOfflineTime(String offlineTime) {
            this.offlineTime = offlineTime;
            return this;
        }
        public String getOfflineTime() {
            return this.offlineTime;
        }

        public ModifyCustomAgentResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ModifyCustomAgentResponseBodyData setRelatedSessionId(String relatedSessionId) {
            this.relatedSessionId = relatedSessionId;
            return this;
        }
        public String getRelatedSessionId() {
            return this.relatedSessionId;
        }

        public ModifyCustomAgentResponseBodyData setReleaseTime(String releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public String getReleaseTime() {
            return this.releaseTime;
        }

        public ModifyCustomAgentResponseBodyData setScheduleTaskConfig(ModifyCustomAgentResponseBodyDataScheduleTaskConfig scheduleTaskConfig) {
            this.scheduleTaskConfig = scheduleTaskConfig;
            return this;
        }
        public ModifyCustomAgentResponseBodyDataScheduleTaskConfig getScheduleTaskConfig() {
            return this.scheduleTaskConfig;
        }

        public ModifyCustomAgentResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ModifyCustomAgentResponseBodyData setTextReportConfig(String textReportConfig) {
            this.textReportConfig = textReportConfig;
            return this;
        }
        public String getTextReportConfig() {
            return this.textReportConfig;
        }

        public ModifyCustomAgentResponseBodyData setWebReportConfig(String webReportConfig) {
            this.webReportConfig = webReportConfig;
            return this;
        }
        public String getWebReportConfig() {
            return this.webReportConfig;
        }

        public ModifyCustomAgentResponseBodyData setWebReportTheme(String webReportTheme) {
            this.webReportTheme = webReportTheme;
            return this;
        }
        public String getWebReportTheme() {
            return this.webReportTheme;
        }

        public ModifyCustomAgentResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
