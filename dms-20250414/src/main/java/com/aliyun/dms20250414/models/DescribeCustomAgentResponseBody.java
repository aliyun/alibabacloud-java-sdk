// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DescribeCustomAgentResponseBody extends TeaModel {
    /**
     * <p>The details of the custom agent.</p>
     */
    @NameInMap("Data")
    public DescribeCustomAgentResponseBodyData data;

    /**
     * <p>The error code returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request fails.</p>
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
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
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
         * <p>The callback time.</p>
         */
        @NameInMap("CallbackTime")
        public Integer callbackTime;

        /**
         * <p>The tool ID.</p>
         */
        @NameInMap("ToolId")
        public String toolId;

        /**
         * <p>The callback type.</p>
         */
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
        /**
         * <p>Specifies whether to disable prompts that require human intervention.</p>
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
         * <p>Specifies whether to skip confirmation before a web report is generated.</p>
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
        /**
         * <p>The access type.</p>
         */
        @NameInMap("AccessType")
        public String accessType;

        /**
         * <p>The UUID of the knowledge base.</p>
         */
        @NameInMap("KbUuid")
        public String kbUuid;

        /**
         * <p>The ID of the MCP server.</p>
         */
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

    public static class DescribeCustomAgentResponseBodyDataScheduleTaskConfig extends TeaModel {
        /**
         * <p>The cron expression for the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 0 ? * 1-7</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <p>The task query.</p>
         * 
         * <strong>example:</strong>
         * <p>分析一下这份数据，给出简报</p>
         */
        @NameInMap("Query")
        public String query;

        /**
         * <p>The ID of the related historical session.</p>
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
         * <p>The ID of the parent Alibaba Cloud account.</p>
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
        public DescribeCustomAgentResponseBodyDataCallbackConfig callbackConfig;

        /**
         * <p>The username of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>HaoY*****</p>
         */
        @NameInMap("CreatorUserName")
        public String creatorUserName;

        /**
         * <p>The ID of the custom agent.</p>
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
         * <p>The data scope, formatted as a JSON string.</p>
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
         * <p>Indicates whether this is the default agent.</p>
         */
        @NameInMap("DefaultAgent")
        public Integer defaultAgent;

        /**
         * <p>The description of the custom agent.</p>
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
        public DescribeCustomAgentResponseBodyDataExecutionConfig executionConfig;

        /**
         * <p>The time when the agent was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-11T14:04:32.000+00:00</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The time when the agent was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-11T14:04:32.000+00:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The instruction for the agent\&quot;s analysis.</p>
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
         * <p>true</p>
         */
        @NameInMap("IsScheduleTask")
        public Boolean isScheduleTask;

        /**
         * <p>The domain knowledge for the agent.</p>
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
         * <p>The knowledge configurations.</p>
         */
        @NameInMap("KnowledgeConfigList")
        public java.util.List<DescribeCustomAgentResponseBodyDataKnowledgeConfigList> knowledgeConfigList;

        /**
         * <p>The ID of the user who last modified the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>20372822********</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        /**
         * <p>The username of the modifier.</p>
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
         * <p>Agent测试名称</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The next scheduled execution time.</p>
         * 
         * <strong>example:</strong>
         * <p>1767715200</p>
         */
        @NameInMap("NextRuntime")
        public Long nextRuntime;

        /**
         * <p>The time when the agent was taken offline.</p>
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
         * <p>The ID of the related historical session.</p>
         * 
         * <strong>example:</strong>
         * <p>5xyz...</p>
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
         * <p>The configuration of the scheduled task.</p>
         */
        @NameInMap("ScheduleTaskConfig")
        public DescribeCustomAgentResponseBodyDataScheduleTaskConfig scheduleTaskConfig;

        /**
         * <p>The status of the custom agent. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>RELEASED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The formatting requirements for the text report.</p>
         * 
         * <strong>example:</strong>
         * <p>文字报告要求所有数字不使用阿拉伯数字，全部转为中文数字</p>
         */
        @NameInMap("TextReportConfig")
        public String textReportConfig;

        /**
         * <p>The formatting requirements for the web report.</p>
         * 
         * <strong>example:</strong>
         * <p>网页报告要求所有数字不使用阿拉伯数字，全部转为中文数字</p>
         */
        @NameInMap("WebReportConfig")
        public String webReportConfig;

        /**
         * <p>The ID of the workspace.</p>
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

        public DescribeCustomAgentResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
