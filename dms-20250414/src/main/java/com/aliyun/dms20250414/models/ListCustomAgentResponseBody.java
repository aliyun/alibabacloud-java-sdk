// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListCustomAgentResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListCustomAgentResponseBodyData data;

    /**
     * <p>The error code.</p>
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

    public static ListCustomAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomAgentResponseBody self = new ListCustomAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomAgentResponseBody setData(ListCustomAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCustomAgentResponseBodyData getData() {
        return this.data;
    }

    public ListCustomAgentResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListCustomAgentResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListCustomAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCustomAgentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCustomAgentResponseBodyDataContentCallbackConfig extends TeaModel {
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

        public static ListCustomAgentResponseBodyDataContentCallbackConfig build(java.util.Map<String, ?> map) throws Exception {
            ListCustomAgentResponseBodyDataContentCallbackConfig self = new ListCustomAgentResponseBodyDataContentCallbackConfig();
            return TeaModel.build(map, self);
        }

        public ListCustomAgentResponseBodyDataContentCallbackConfig setCallbackArgs(String callbackArgs) {
            this.callbackArgs = callbackArgs;
            return this;
        }
        public String getCallbackArgs() {
            return this.callbackArgs;
        }

        public ListCustomAgentResponseBodyDataContentCallbackConfig setCallbackPrompt(String callbackPrompt) {
            this.callbackPrompt = callbackPrompt;
            return this;
        }
        public String getCallbackPrompt() {
            return this.callbackPrompt;
        }

        public ListCustomAgentResponseBodyDataContentCallbackConfig setCallbackTime(Integer callbackTime) {
            this.callbackTime = callbackTime;
            return this;
        }
        public Integer getCallbackTime() {
            return this.callbackTime;
        }

        public ListCustomAgentResponseBodyDataContentCallbackConfig setToolId(String toolId) {
            this.toolId = toolId;
            return this;
        }
        public String getToolId() {
            return this.toolId;
        }

        public ListCustomAgentResponseBodyDataContentCallbackConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListCustomAgentResponseBodyDataContentExecutionConfig extends TeaModel {
        /**
         * <p>Indicates whether to prevent user inquiries during the process.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SkipAskHuman")
        public Boolean skipAskHuman;

        /**
         * <p>Indicates whether to skip the plan confirmation step.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SkipPlan")
        public Boolean skipPlan;

        /**
         * <p>Indicates whether to skip all SQL confirmations.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SkipSqlConfirm")
        public Boolean skipSqlConfirm;

        /**
         * <p>Indicates whether to skip the confirmation for generating a web report.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SkipWebReportConfirm")
        public Boolean skipWebReportConfirm;

        public static ListCustomAgentResponseBodyDataContentExecutionConfig build(java.util.Map<String, ?> map) throws Exception {
            ListCustomAgentResponseBodyDataContentExecutionConfig self = new ListCustomAgentResponseBodyDataContentExecutionConfig();
            return TeaModel.build(map, self);
        }

        public ListCustomAgentResponseBodyDataContentExecutionConfig setSkipAskHuman(Boolean skipAskHuman) {
            this.skipAskHuman = skipAskHuman;
            return this;
        }
        public Boolean getSkipAskHuman() {
            return this.skipAskHuman;
        }

        public ListCustomAgentResponseBodyDataContentExecutionConfig setSkipPlan(Boolean skipPlan) {
            this.skipPlan = skipPlan;
            return this;
        }
        public Boolean getSkipPlan() {
            return this.skipPlan;
        }

        public ListCustomAgentResponseBodyDataContentExecutionConfig setSkipSqlConfirm(Boolean skipSqlConfirm) {
            this.skipSqlConfirm = skipSqlConfirm;
            return this;
        }
        public Boolean getSkipSqlConfirm() {
            return this.skipSqlConfirm;
        }

        public ListCustomAgentResponseBodyDataContentExecutionConfig setSkipWebReportConfirm(Boolean skipWebReportConfirm) {
            this.skipWebReportConfirm = skipWebReportConfirm;
            return this;
        }
        public Boolean getSkipWebReportConfirm() {
            return this.skipWebReportConfirm;
        }

    }

    public static class ListCustomAgentResponseBodyDataContentKnowledgeConfigList extends TeaModel {
        @NameInMap("AccessType")
        public String accessType;

        @NameInMap("KbUuid")
        public String kbUuid;

        @NameInMap("McpServerId")
        public String mcpServerId;

        public static ListCustomAgentResponseBodyDataContentKnowledgeConfigList build(java.util.Map<String, ?> map) throws Exception {
            ListCustomAgentResponseBodyDataContentKnowledgeConfigList self = new ListCustomAgentResponseBodyDataContentKnowledgeConfigList();
            return TeaModel.build(map, self);
        }

        public ListCustomAgentResponseBodyDataContentKnowledgeConfigList setAccessType(String accessType) {
            this.accessType = accessType;
            return this;
        }
        public String getAccessType() {
            return this.accessType;
        }

        public ListCustomAgentResponseBodyDataContentKnowledgeConfigList setKbUuid(String kbUuid) {
            this.kbUuid = kbUuid;
            return this;
        }
        public String getKbUuid() {
            return this.kbUuid;
        }

        public ListCustomAgentResponseBodyDataContentKnowledgeConfigList setMcpServerId(String mcpServerId) {
            this.mcpServerId = mcpServerId;
            return this;
        }
        public String getMcpServerId() {
            return this.mcpServerId;
        }

    }

    public static class ListCustomAgentResponseBodyDataContentScheduleTaskConfig extends TeaModel {
        /**
         * <p>The cron expression for the recurring task.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 0 ? * 1-7</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <p>The query for the recurring task.</p>
         * 
         * <strong>example:</strong>
         * <p>分析一下这份数据，给出简报</p>
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

        public static ListCustomAgentResponseBodyDataContentScheduleTaskConfig build(java.util.Map<String, ?> map) throws Exception {
            ListCustomAgentResponseBodyDataContentScheduleTaskConfig self = new ListCustomAgentResponseBodyDataContentScheduleTaskConfig();
            return TeaModel.build(map, self);
        }

        public ListCustomAgentResponseBodyDataContentScheduleTaskConfig setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public ListCustomAgentResponseBodyDataContentScheduleTaskConfig setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public ListCustomAgentResponseBodyDataContentScheduleTaskConfig setRelatedSessionId(String relatedSessionId) {
            this.relatedSessionId = relatedSessionId;
            return this;
        }
        public String getRelatedSessionId() {
            return this.relatedSessionId;
        }

    }

    public static class ListCustomAgentResponseBodyDataContent extends TeaModel {
        /**
         * <p>The parent Alibaba Cloud account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16738266********</p>
         */
        @NameInMap("AliyunParentId")
        public String aliyunParentId;

        /**
         * <p>The Alibaba Cloud account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20372822********</p>
         */
        @NameInMap("AliyunUid")
        public String aliyunUid;

        @NameInMap("CallbackConfig")
        public ListCustomAgentResponseBodyDataContentCallbackConfig callbackConfig;

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
         * <p>The data scope, specified as a JSON string.</p>
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
        public ListCustomAgentResponseBodyDataContentExecutionConfig executionConfig;

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
         * <p>The instructions.</p>
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
         * <p>Indicates whether the agent is configured with a recurring task.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsScheduleTask")
        public Boolean isScheduleTask;

        /**
         * <p>The provided knowledge.</p>
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

        @NameInMap("KnowledgeConfigList")
        public java.util.List<ListCustomAgentResponseBodyDataContentKnowledgeConfigList> knowledgeConfigList;

        /**
         * <p>The user who last modified the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>20372822********</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        /**
         * <p>The name of the user who last modified the agent.</p>
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
         * <p>If a recurring task is configured, this indicates its next scheduled runtime.</p>
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

        @NameInMap("RelatedSessionId")
        public String relatedSessionId;

        /**
         * <p>The time when the agent was published.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-11T14:04:32.000+00:00</p>
         */
        @NameInMap("ReleaseTime")
        public String releaseTime;

        /**
         * <p>The recurring task configuration.</p>
         */
        @NameInMap("ScheduleTaskConfig")
        public ListCustomAgentResponseBodyDataContentScheduleTaskConfig scheduleTaskConfig;

        /**
         * <p>The status of the custom agent.</p>
         * 
         * <strong>example:</strong>
         * <p>RELEASED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The formatting instructions for the text report.</p>
         * 
         * <strong>example:</strong>
         * <p>文字报告要求所有数字不使用阿拉伯数字，全部转为中文数字</p>
         */
        @NameInMap("TextReportConfig")
        public String textReportConfig;

        /**
         * <p>The formatting instructions for the web report.</p>
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

        public static ListCustomAgentResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListCustomAgentResponseBodyDataContent self = new ListCustomAgentResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListCustomAgentResponseBodyDataContent setAliyunParentId(String aliyunParentId) {
            this.aliyunParentId = aliyunParentId;
            return this;
        }
        public String getAliyunParentId() {
            return this.aliyunParentId;
        }

        public ListCustomAgentResponseBodyDataContent setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public ListCustomAgentResponseBodyDataContent setCallbackConfig(ListCustomAgentResponseBodyDataContentCallbackConfig callbackConfig) {
            this.callbackConfig = callbackConfig;
            return this;
        }
        public ListCustomAgentResponseBodyDataContentCallbackConfig getCallbackConfig() {
            return this.callbackConfig;
        }

        public ListCustomAgentResponseBodyDataContent setCreatorUserName(String creatorUserName) {
            this.creatorUserName = creatorUserName;
            return this;
        }
        public String getCreatorUserName() {
            return this.creatorUserName;
        }

        public ListCustomAgentResponseBodyDataContent setCustomAgentId(String customAgentId) {
            this.customAgentId = customAgentId;
            return this;
        }
        public String getCustomAgentId() {
            return this.customAgentId;
        }

        public ListCustomAgentResponseBodyDataContent setDMSUnit(String DMSUnit) {
            this.DMSUnit = DMSUnit;
            return this;
        }
        public String getDMSUnit() {
            return this.DMSUnit;
        }

        public ListCustomAgentResponseBodyDataContent setDataJson(String dataJson) {
            this.dataJson = dataJson;
            return this;
        }
        public String getDataJson() {
            return this.dataJson;
        }

        public ListCustomAgentResponseBodyDataContent setDefaultAgent(Integer defaultAgent) {
            this.defaultAgent = defaultAgent;
            return this;
        }
        public Integer getDefaultAgent() {
            return this.defaultAgent;
        }

        public ListCustomAgentResponseBodyDataContent setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCustomAgentResponseBodyDataContent setDmsUnit(String dmsUnit) {
            this.dmsUnit = dmsUnit;
            return this;
        }
        public String getDmsUnit() {
            return this.dmsUnit;
        }

        public ListCustomAgentResponseBodyDataContent setExecutionConfig(ListCustomAgentResponseBodyDataContentExecutionConfig executionConfig) {
            this.executionConfig = executionConfig;
            return this;
        }
        public ListCustomAgentResponseBodyDataContentExecutionConfig getExecutionConfig() {
            return this.executionConfig;
        }

        public ListCustomAgentResponseBodyDataContent setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public ListCustomAgentResponseBodyDataContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListCustomAgentResponseBodyDataContent setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public ListCustomAgentResponseBodyDataContent setIsScheduleTask(Boolean isScheduleTask) {
            this.isScheduleTask = isScheduleTask;
            return this;
        }
        public Boolean getIsScheduleTask() {
            return this.isScheduleTask;
        }

        public ListCustomAgentResponseBodyDataContent setKnowledge(String knowledge) {
            this.knowledge = knowledge;
            return this;
        }
        public String getKnowledge() {
            return this.knowledge;
        }

        public ListCustomAgentResponseBodyDataContent setKnowledgeConfigList(java.util.List<ListCustomAgentResponseBodyDataContentKnowledgeConfigList> knowledgeConfigList) {
            this.knowledgeConfigList = knowledgeConfigList;
            return this;
        }
        public java.util.List<ListCustomAgentResponseBodyDataContentKnowledgeConfigList> getKnowledgeConfigList() {
            return this.knowledgeConfigList;
        }

        public ListCustomAgentResponseBodyDataContent setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListCustomAgentResponseBodyDataContent setModifierUserName(String modifierUserName) {
            this.modifierUserName = modifierUserName;
            return this;
        }
        public String getModifierUserName() {
            return this.modifierUserName;
        }

        public ListCustomAgentResponseBodyDataContent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCustomAgentResponseBodyDataContent setNextRuntime(Long nextRuntime) {
            this.nextRuntime = nextRuntime;
            return this;
        }
        public Long getNextRuntime() {
            return this.nextRuntime;
        }

        public ListCustomAgentResponseBodyDataContent setOfflineTime(String offlineTime) {
            this.offlineTime = offlineTime;
            return this;
        }
        public String getOfflineTime() {
            return this.offlineTime;
        }

        public ListCustomAgentResponseBodyDataContent setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListCustomAgentResponseBodyDataContent setRelatedSessionId(String relatedSessionId) {
            this.relatedSessionId = relatedSessionId;
            return this;
        }
        public String getRelatedSessionId() {
            return this.relatedSessionId;
        }

        public ListCustomAgentResponseBodyDataContent setReleaseTime(String releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public String getReleaseTime() {
            return this.releaseTime;
        }

        public ListCustomAgentResponseBodyDataContent setScheduleTaskConfig(ListCustomAgentResponseBodyDataContentScheduleTaskConfig scheduleTaskConfig) {
            this.scheduleTaskConfig = scheduleTaskConfig;
            return this;
        }
        public ListCustomAgentResponseBodyDataContentScheduleTaskConfig getScheduleTaskConfig() {
            return this.scheduleTaskConfig;
        }

        public ListCustomAgentResponseBodyDataContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCustomAgentResponseBodyDataContent setTextReportConfig(String textReportConfig) {
            this.textReportConfig = textReportConfig;
            return this;
        }
        public String getTextReportConfig() {
            return this.textReportConfig;
        }

        public ListCustomAgentResponseBodyDataContent setWebReportConfig(String webReportConfig) {
            this.webReportConfig = webReportConfig;
            return this;
        }
        public String getWebReportConfig() {
            return this.webReportConfig;
        }

        public ListCustomAgentResponseBodyDataContent setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class ListCustomAgentResponseBodyData extends TeaModel {
        /**
         * <p>A list of custom agent objects.</p>
         */
        @NameInMap("Content")
        public java.util.List<ListCustomAgentResponseBodyDataContent> content;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TotalElements")
        public Long totalElements;

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalPages")
        public Long totalPages;

        public static ListCustomAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCustomAgentResponseBodyData self = new ListCustomAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCustomAgentResponseBodyData setContent(java.util.List<ListCustomAgentResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListCustomAgentResponseBodyDataContent> getContent() {
            return this.content;
        }

        public ListCustomAgentResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListCustomAgentResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListCustomAgentResponseBodyData setTotalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Long getTotalElements() {
            return this.totalElements;
        }

        public ListCustomAgentResponseBodyData setTotalPages(Long totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Long getTotalPages() {
            return this.totalPages;
        }

    }

}
