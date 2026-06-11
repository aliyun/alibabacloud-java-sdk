// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ModifyCustomAgentResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
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
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Specified parameter Tid is not valid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request succeeded.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
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
        /**
         * <p>The callback arguments.</p>
         */
        @NameInMap("CallbackArgs")
        public String callbackArgs;

        /**
         * <p>The callback prompt.</p>
         */
        @NameInMap("CallbackPrompt")
        public String callbackPrompt;

        /**
         * <p>The callback timestamp.</p>
         */
        @NameInMap("CallbackTime")
        public Integer callbackTime;

        /**
         * <p>The ID of the tool to be called.</p>
         */
        @NameInMap("ToolId")
        public String toolId;

        /**
         * <p>The callback type.</p>
         */
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
         * <p>Specifies whether to skip asking for human input during execution.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SkipAskHuman")
        public Boolean skipAskHuman;

        /**
         * <p>Specifies whether to skip plan confirmation.</p>
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
         * <p>Specifies whether to skip web report confirmation.</p>
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
         * <ul>
         * <li>mcp: Connects via MCP.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mcp</p>
         */
        @NameInMap("AccessType")
        public String accessType;

        /**
         * <p>The knowledge base UUID.</p>
         */
        @NameInMap("KbUuid")
        public String kbUuid;

        /**
         * <p>The MCP server ID.</p>
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

    public static class ModifyCustomAgentResponseBodyDataScheduleTaskConfig extends TeaModel {
        /**
         * <p>The cron expression for the task.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 0 ? * 1-7</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <p>The query for the task.</p>
         * 
         * <strong>example:</strong>
         * <p>分析一下这份数据，给出简报</p>
         */
        @NameInMap("Query")
        public String query;

        /**
         * <p>The ID of a reference session.</p>
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
         * <p>The main Alibaba Cloud account ID.</p>
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

        /**
         * <p>The callback configuration.</p>
         */
        @NameInMap("CallbackConfig")
        public ModifyCustomAgentResponseBodyDataCallbackConfig callbackConfig;

        /**
         * <p>Name of the user who created the agent.</p>
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
         * <p>The data scope in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;tableFlag&quot; : true,
         *   &quot;scope&quot; : &quot;personal&quot;,
         *   &quot;personal&quot; : {
         *     &quot;DataSourceType&quot; : &quot;remote_data_center&quot;,
         *     &quot;FileId&quot; : &quot;f-5qlrwaw10<strong><strong><strong><strong>s3gpw1z&quot;,
         *     &quot;Database&quot; : &quot;测试表格</strong></strong></strong>.xlsx&quot;,
         *     &quot;Tables&quot; : [ &quot;Sheet1&quot; ],
         *     &quot;TableIds&quot; : [ &quot;</strong>****&quot; ],
         *     &quot;RegionId&quot; : &quot;cn-hangzhou&quot;
         *   }
         * }</p>
         */
        @NameInMap("DataJson")
        public String dataJson;

        /**
         * <p>The custom agent description.</p>
         * 
         * <strong>example:</strong>
         * <p>Agent测试描述</p>
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
         * <p>The last modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-11T14:04:32.000+00:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The instruction for the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>分析框架：
         * 1、需按日、周、月维度监控核心指标（GMV、订单量、UV、转化率），分析趋势变化及同比/环比波动；
         * 2、划分新老客、渠道、地域进行拆解，识别增长来源与短板；
         * 3、结合用户行为路径（浏览→加购→支付）开展漏斗分析，定位流失环节；</p>
         */
        @NameInMap("Instruction")
        public String instruction;

        /**
         * <p>Indicates whether a scheduled task is configured.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsScheduleTask")
        public Boolean isScheduleTask;

        /**
         * <p>The text-based knowledge for the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>核心指标定义：
         * 1、GMV（成交总额）指订单金额总和，含已支付及未支付成功订单；
         * 2、订单量为每日有效下单笔数；
         * 3、UV（独立访客）指访问网站或APP的去重用户数；
         * 4、转化率=支付订单数 / UV，反映流量转化效率；</p>
         */
        @NameInMap("Knowledge")
        public String knowledge;

        /**
         * <p>Configurations for external knowledge bases.</p>
         */
        @NameInMap("KnowledgeConfigList")
        public java.util.List<ModifyCustomAgentResponseBodyDataKnowledgeConfigList> knowledgeConfigList;

        /**
         * <p>ID of the last modifier.</p>
         * 
         * <strong>example:</strong>
         * <p>20372822********</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        /**
         * <p>Name of the user who last modified the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>HaoY*****</p>
         */
        @NameInMap("ModifierUserName")
        public String modifierUserName;

        /**
         * <p>The custom agent name.</p>
         * 
         * <strong>example:</strong>
         * <p>Agent测试名称</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The next runtime for the scheduled task.</p>
         * <ul>
         * <li>This value is a UNIX timestamp.</li>
         * </ul>
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
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The ID of a reference session.</p>
         */
        @NameInMap("RelatedSessionId")
        public String relatedSessionId;

        /**
         * <p>The release time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-11T14:04:32.000+00:00</p>
         */
        @NameInMap("ReleaseTime")
        public String releaseTime;

        /**
         * <p>The scheduled task configuration.</p>
         */
        @NameInMap("ScheduleTaskConfig")
        public ModifyCustomAgentResponseBodyDataScheduleTaskConfig scheduleTaskConfig;

        /**
         * <p>The agent status.</p>
         * 
         * <strong>example:</strong>
         * <p>RELEASED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Formatting requirements for the text report.</p>
         * 
         * <strong>example:</strong>
         * <p>文字报告要求所有数字不使用阿拉伯数字，全部转为中文数字</p>
         */
        @NameInMap("TextReportConfig")
        public String textReportConfig;

        /**
         * <p>Formatting requirements for the web report.</p>
         * 
         * <strong>example:</strong>
         * <p>网页报告要求所有数字不使用阿拉伯数字，全部转为中文数字</p>
         */
        @NameInMap("WebReportConfig")
        public String webReportConfig;

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

        public ModifyCustomAgentResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
