// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DescribeCustomAgentResponseBody extends TeaModel {
    /**
     * <p>The response struct.</p>
     */
    @NameInMap("Data")
    public DescribeCustomAgentResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
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
     * <ul>
     * <li><strong>true</strong>: The request was successful.                                 </li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
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

    public static class DescribeCustomAgentResponseBodyDataCallbackConfig extends TeaModel {
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

        public static DescribeCustomAgentResponseBodyDataCallbackConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomAgentResponseBodyDataCallbackConfig self = new DescribeCustomAgentResponseBodyDataCallbackConfig();
            return TeaModel.build(map, self);
        }

        public DescribeCustomAgentResponseBodyDataCallbackConfig setCallbackArgs(String callbackArgs) {
            this.callbackArgs = callbackArgs;
            return this;
        }
        public String getCallbackArgs() {
            return this.callbackArgs;
        }

        public DescribeCustomAgentResponseBodyDataCallbackConfig setCallbackPrompt(String callbackPrompt) {
            this.callbackPrompt = callbackPrompt;
            return this;
        }
        public String getCallbackPrompt() {
            return this.callbackPrompt;
        }

        public DescribeCustomAgentResponseBodyDataCallbackConfig setCallbackTime(Integer callbackTime) {
            this.callbackTime = callbackTime;
            return this;
        }
        public Integer getCallbackTime() {
            return this.callbackTime;
        }

        public DescribeCustomAgentResponseBodyDataCallbackConfig setToolId(String toolId) {
            this.toolId = toolId;
            return this;
        }
        public String getToolId() {
            return this.toolId;
        }

        public DescribeCustomAgentResponseBodyDataCallbackConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeCustomAgentResponseBodyDataExecutionConfig extends TeaModel {
        @NameInMap("ForbiddenAppendDataSource")
        public Boolean forbiddenAppendDataSource;

        /**
         * <p>Specifies whether to disable user inquiries during the process.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>false</p>
         */
        @NameInMap("SkipWebReportConfirm")
        public Boolean skipWebReportConfirm;

        public static DescribeCustomAgentResponseBodyDataExecutionConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomAgentResponseBodyDataExecutionConfig self = new DescribeCustomAgentResponseBodyDataExecutionConfig();
            return TeaModel.build(map, self);
        }

        public DescribeCustomAgentResponseBodyDataExecutionConfig setForbiddenAppendDataSource(Boolean forbiddenAppendDataSource) {
            this.forbiddenAppendDataSource = forbiddenAppendDataSource;
            return this;
        }
        public Boolean getForbiddenAppendDataSource() {
            return this.forbiddenAppendDataSource;
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

        @NameInMap("KbUuid")
        public String kbUuid;

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

        public DescribeCustomAgentResponseBodyDataKnowledgeConfigList setKbUuid(String kbUuid) {
            this.kbUuid = kbUuid;
            return this;
        }
        public String getKbUuid() {
            return this.kbUuid;
        }

        public DescribeCustomAgentResponseBodyDataKnowledgeConfigList setMcpServerId(String mcpServerId) {
            this.mcpServerId = mcpServerId;
            return this;
        }
        public String getMcpServerId() {
            return this.mcpServerId;
        }

    }

    public static class DescribeCustomAgentResponseBodyDataKnowledgeSemanticConfigList extends TeaModel {
        @NameInMap("DbId")
        public String dbId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("KnowledgeUuid")
        public String knowledgeUuid;

        @NameInMap("Type")
        public String type;

        public static DescribeCustomAgentResponseBodyDataKnowledgeSemanticConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomAgentResponseBodyDataKnowledgeSemanticConfigList self = new DescribeCustomAgentResponseBodyDataKnowledgeSemanticConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeCustomAgentResponseBodyDataKnowledgeSemanticConfigList setDbId(String dbId) {
            this.dbId = dbId;
            return this;
        }
        public String getDbId() {
            return this.dbId;
        }

        public DescribeCustomAgentResponseBodyDataKnowledgeSemanticConfigList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeCustomAgentResponseBodyDataKnowledgeSemanticConfigList setKnowledgeUuid(String knowledgeUuid) {
            this.knowledgeUuid = knowledgeUuid;
            return this;
        }
        public String getKnowledgeUuid() {
            return this.knowledgeUuid;
        }

        public DescribeCustomAgentResponseBodyDataKnowledgeSemanticConfigList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeCustomAgentResponseBodyDataScheduleTaskConfig extends TeaModel {
        /**
         * <p>The cron expression for timed scheduling.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 0 ? * 1-7</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <p>The query for the periodic task.</p>
         * 
         * <strong>example:</strong>
         * <p>Analyze this data and provide a brief report</p>
         */
        @NameInMap("Query")
        public String query;

        /**
         * <p>The referenced historical session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4m24*****mg7j2v</p>
         */
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
         * <p>The Alibaba Cloud primary account ID.</p>
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
        public DescribeCustomAgentResponseBodyDataCallbackConfig callbackConfig;

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
         * <p>The current DMS unit.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("DMSUnit")
        public String DMSUnit;

        /**
         * <p>The specified data scope in JSON string format.</p>
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

        @NameInMap("DefaultAgent")
        public Integer defaultAgent;

        /**
         * <p>The description of the custom agent.</p>
         * 
         * <strong>example:</strong>
         * <p>AgentTestDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The current DMS unit.</p>
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
        public DescribeCustomAgentResponseBodyDataExecutionConfig executionConfig;

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
         * <li>Monitor core metrics (GMV, order volume, UV, conversion rate) by day, week, and month dimensions, and analyze trends and year-over-year/month-over-month fluctuations;</li>
         * <li>Segment by new/existing customers, channels, and regions to identify growth sources and weaknesses;</li>
         * <li>Conduct funnel analysis based on user behavior paths (browse → add to cart → payment) to locate drop-off points;</li>
         * </ol>
         */
        @NameInMap("Instruction")
        public String instruction;

        /**
         * <p>Specifies whether a periodic task is configured.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsScheduleTask")
        public Boolean isScheduleTask;

        /**
         * <p>The knowledge.</p>
         * 
         * <strong>example:</strong>
         * <p>Core metric definitions:</p>
         * <ol>
         * <li>GMV (Gross Merchandise Volume) refers to the total order amount, including paid and unpaid orders;</li>
         * <li>Order volume is the number of valid orders placed per day;</li>
         * <li>UV (Unique Visitors) refers to the deduplicated number of users who visit the website or app;</li>
         * <li>Conversion rate = paid orders / UV, reflecting traffic conversion efficiency;</li>
         * </ol>
         */
        @NameInMap("Knowledge")
        public String knowledge;

        @NameInMap("KnowledgeConfigList")
        public java.util.List<DescribeCustomAgentResponseBodyDataKnowledgeConfigList> knowledgeConfigList;

        @NameInMap("KnowledgeSemanticConfigList")
        public java.util.List<DescribeCustomAgentResponseBodyDataKnowledgeSemanticConfigList> knowledgeSemanticConfigList;

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
         * <p>The referenced historical session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5xyz...</p>
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
        public DescribeCustomAgentResponseBodyDataScheduleTaskConfig scheduleTaskConfig;

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
         * <p>The text report requires all numbers to be converted from Arabic numerals to Chinese numerals</p>
         */
        @NameInMap("TextReportConfig")
        public String textReportConfig;

        /**
         * <p>The web report format.</p>
         * 
         * <strong>example:</strong>
         * <p>The web report requires all numbers to be converted from Arabic numerals to Chinese numerals</p>
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

        public DescribeCustomAgentResponseBodyData setCallbackConfig(DescribeCustomAgentResponseBodyDataCallbackConfig callbackConfig) {
            this.callbackConfig = callbackConfig;
            return this;
        }
        public DescribeCustomAgentResponseBodyDataCallbackConfig getCallbackConfig() {
            return this.callbackConfig;
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

        public DescribeCustomAgentResponseBodyData setKnowledgeSemanticConfigList(java.util.List<DescribeCustomAgentResponseBodyDataKnowledgeSemanticConfigList> knowledgeSemanticConfigList) {
            this.knowledgeSemanticConfigList = knowledgeSemanticConfigList;
            return this;
        }
        public java.util.List<DescribeCustomAgentResponseBodyDataKnowledgeSemanticConfigList> getKnowledgeSemanticConfigList() {
            return this.knowledgeSemanticConfigList;
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

        public DescribeCustomAgentResponseBodyData setRelatedSessionId(String relatedSessionId) {
            this.relatedSessionId = relatedSessionId;
            return this;
        }
        public String getRelatedSessionId() {
            return this.relatedSessionId;
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

        public DescribeCustomAgentResponseBodyData setWebReportTheme(String webReportTheme) {
            this.webReportTheme = webReportTheme;
            return this;
        }
        public String getWebReportTheme() {
            return this.webReportTheme;
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
