// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class ListAICoachScriptPageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PARAM_ERROR</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>SYSTEM_ERROR</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("list")
    public java.util.List<ListAICoachScriptPageResponseBodyList> list;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>86A90C40-D1AB-50DA-A4B1-0D545F80F2FE</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListAICoachScriptPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAICoachScriptPageResponseBody self = new ListAICoachScriptPageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAICoachScriptPageResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListAICoachScriptPageResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListAICoachScriptPageResponseBody setList(java.util.List<ListAICoachScriptPageResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListAICoachScriptPageResponseBodyList> getList() {
        return this.list;
    }

    public ListAICoachScriptPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAICoachScriptPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAICoachScriptPageResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListAICoachScriptPageResponseBodyListCompleteStrategy extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("clickCompleteAutoEnd")
        public Boolean clickCompleteAutoEnd;

        /**
         * <strong>example:</strong>
         * <p>75</p>
         */
        @NameInMap("duration")
        public Integer duration;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("fullCoverageAutoEnd")
        public Boolean fullCoverageAutoEnd;

        public static ListAICoachScriptPageResponseBodyListCompleteStrategy build(java.util.Map<String, ?> map) throws Exception {
            ListAICoachScriptPageResponseBodyListCompleteStrategy self = new ListAICoachScriptPageResponseBodyListCompleteStrategy();
            return TeaModel.build(map, self);
        }

        public ListAICoachScriptPageResponseBodyListCompleteStrategy setClickCompleteAutoEnd(Boolean clickCompleteAutoEnd) {
            this.clickCompleteAutoEnd = clickCompleteAutoEnd;
            return this;
        }
        public Boolean getClickCompleteAutoEnd() {
            return this.clickCompleteAutoEnd;
        }

        public ListAICoachScriptPageResponseBodyListCompleteStrategy setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public ListAICoachScriptPageResponseBodyListCompleteStrategy setFullCoverageAutoEnd(Boolean fullCoverageAutoEnd) {
            this.fullCoverageAutoEnd = fullCoverageAutoEnd;
            return this;
        }
        public Boolean getFullCoverageAutoEnd() {
            return this.fullCoverageAutoEnd;
        }

    }

    public static class ListAICoachScriptPageResponseBodyListCustomReplyRulesActionParameters extends TeaModel {
        @NameInMap("assessPoint")
        public String assessPoint;

        @NameInMap("customContent")
        public String customContent;

        public static ListAICoachScriptPageResponseBodyListCustomReplyRulesActionParameters build(java.util.Map<String, ?> map) throws Exception {
            ListAICoachScriptPageResponseBodyListCustomReplyRulesActionParameters self = new ListAICoachScriptPageResponseBodyListCustomReplyRulesActionParameters();
            return TeaModel.build(map, self);
        }

        public ListAICoachScriptPageResponseBodyListCustomReplyRulesActionParameters setAssessPoint(String assessPoint) {
            this.assessPoint = assessPoint;
            return this;
        }
        public String getAssessPoint() {
            return this.assessPoint;
        }

        public ListAICoachScriptPageResponseBodyListCustomReplyRulesActionParameters setCustomContent(String customContent) {
            this.customContent = customContent;
            return this;
        }
        public String getCustomContent() {
            return this.customContent;
        }

    }

    public static class ListAICoachScriptPageResponseBodyListCustomReplyRulesAction extends TeaModel {
        @NameInMap("parameters")
        public ListAICoachScriptPageResponseBodyListCustomReplyRulesActionParameters parameters;

        @NameInMap("type")
        public String type;

        public static ListAICoachScriptPageResponseBodyListCustomReplyRulesAction build(java.util.Map<String, ?> map) throws Exception {
            ListAICoachScriptPageResponseBodyListCustomReplyRulesAction self = new ListAICoachScriptPageResponseBodyListCustomReplyRulesAction();
            return TeaModel.build(map, self);
        }

        public ListAICoachScriptPageResponseBodyListCustomReplyRulesAction setParameters(ListAICoachScriptPageResponseBodyListCustomReplyRulesActionParameters parameters) {
            this.parameters = parameters;
            return this;
        }
        public ListAICoachScriptPageResponseBodyListCustomReplyRulesActionParameters getParameters() {
            return this.parameters;
        }

        public ListAICoachScriptPageResponseBodyListCustomReplyRulesAction setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAICoachScriptPageResponseBodyListCustomReplyRulesMainConditionParameters extends TeaModel {
        @NameInMap("assessPoint")
        public String assessPoint;

        public static ListAICoachScriptPageResponseBodyListCustomReplyRulesMainConditionParameters build(java.util.Map<String, ?> map) throws Exception {
            ListAICoachScriptPageResponseBodyListCustomReplyRulesMainConditionParameters self = new ListAICoachScriptPageResponseBodyListCustomReplyRulesMainConditionParameters();
            return TeaModel.build(map, self);
        }

        public ListAICoachScriptPageResponseBodyListCustomReplyRulesMainConditionParameters setAssessPoint(String assessPoint) {
            this.assessPoint = assessPoint;
            return this;
        }
        public String getAssessPoint() {
            return this.assessPoint;
        }

    }

    public static class ListAICoachScriptPageResponseBodyListCustomReplyRulesMainCondition extends TeaModel {
        @NameInMap("parameters")
        public ListAICoachScriptPageResponseBodyListCustomReplyRulesMainConditionParameters parameters;

        @NameInMap("type")
        public String type;

        public static ListAICoachScriptPageResponseBodyListCustomReplyRulesMainCondition build(java.util.Map<String, ?> map) throws Exception {
            ListAICoachScriptPageResponseBodyListCustomReplyRulesMainCondition self = new ListAICoachScriptPageResponseBodyListCustomReplyRulesMainCondition();
            return TeaModel.build(map, self);
        }

        public ListAICoachScriptPageResponseBodyListCustomReplyRulesMainCondition setParameters(ListAICoachScriptPageResponseBodyListCustomReplyRulesMainConditionParameters parameters) {
            this.parameters = parameters;
            return this;
        }
        public ListAICoachScriptPageResponseBodyListCustomReplyRulesMainConditionParameters getParameters() {
            return this.parameters;
        }

        public ListAICoachScriptPageResponseBodyListCustomReplyRulesMainCondition setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAICoachScriptPageResponseBodyListCustomReplyRulesSubCondition extends TeaModel {
        @NameInMap("type")
        public String type;

        public static ListAICoachScriptPageResponseBodyListCustomReplyRulesSubCondition build(java.util.Map<String, ?> map) throws Exception {
            ListAICoachScriptPageResponseBodyListCustomReplyRulesSubCondition self = new ListAICoachScriptPageResponseBodyListCustomReplyRulesSubCondition();
            return TeaModel.build(map, self);
        }

        public ListAICoachScriptPageResponseBodyListCustomReplyRulesSubCondition setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAICoachScriptPageResponseBodyListCustomReplyRules extends TeaModel {
        @NameInMap("action")
        public ListAICoachScriptPageResponseBodyListCustomReplyRulesAction action;

        @NameInMap("logic")
        public String logic;

        @NameInMap("mainCondition")
        public ListAICoachScriptPageResponseBodyListCustomReplyRulesMainCondition mainCondition;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("sortNo")
        public Integer sortNo;

        @NameInMap("subCondition")
        public ListAICoachScriptPageResponseBodyListCustomReplyRulesSubCondition subCondition;

        public static ListAICoachScriptPageResponseBodyListCustomReplyRules build(java.util.Map<String, ?> map) throws Exception {
            ListAICoachScriptPageResponseBodyListCustomReplyRules self = new ListAICoachScriptPageResponseBodyListCustomReplyRules();
            return TeaModel.build(map, self);
        }

        public ListAICoachScriptPageResponseBodyListCustomReplyRules setAction(ListAICoachScriptPageResponseBodyListCustomReplyRulesAction action) {
            this.action = action;
            return this;
        }
        public ListAICoachScriptPageResponseBodyListCustomReplyRulesAction getAction() {
            return this.action;
        }

        public ListAICoachScriptPageResponseBodyListCustomReplyRules setLogic(String logic) {
            this.logic = logic;
            return this;
        }
        public String getLogic() {
            return this.logic;
        }

        public ListAICoachScriptPageResponseBodyListCustomReplyRules setMainCondition(ListAICoachScriptPageResponseBodyListCustomReplyRulesMainCondition mainCondition) {
            this.mainCondition = mainCondition;
            return this;
        }
        public ListAICoachScriptPageResponseBodyListCustomReplyRulesMainCondition getMainCondition() {
            return this.mainCondition;
        }

        public ListAICoachScriptPageResponseBodyListCustomReplyRules setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListAICoachScriptPageResponseBodyListCustomReplyRules setSortNo(Integer sortNo) {
            this.sortNo = sortNo;
            return this;
        }
        public Integer getSortNo() {
            return this.sortNo;
        }

        public ListAICoachScriptPageResponseBodyListCustomReplyRules setSubCondition(ListAICoachScriptPageResponseBodyListCustomReplyRulesSubCondition subCondition) {
            this.subCondition = subCondition;
            return this;
        }
        public ListAICoachScriptPageResponseBodyListCustomReplyRulesSubCondition getSubCondition() {
            return this.subCondition;
        }

    }

    public static class ListAICoachScriptPageResponseBodyListSampleDialogueList extends TeaModel {
        @NameInMap("message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>student</p>
         */
        @NameInMap("role")
        public String role;

        public static ListAICoachScriptPageResponseBodyListSampleDialogueList build(java.util.Map<String, ?> map) throws Exception {
            ListAICoachScriptPageResponseBodyListSampleDialogueList self = new ListAICoachScriptPageResponseBodyListSampleDialogueList();
            return TeaModel.build(map, self);
        }

        public ListAICoachScriptPageResponseBodyListSampleDialogueList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListAICoachScriptPageResponseBodyListSampleDialogueList setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class ListAICoachScriptPageResponseBodyListScoreConfigLevels extends TeaModel {
        @NameInMap("max")
        public Integer max;

        @NameInMap("min")
        public Integer min;

        @NameInMap("name")
        public String name;

        public static ListAICoachScriptPageResponseBodyListScoreConfigLevels build(java.util.Map<String, ?> map) throws Exception {
            ListAICoachScriptPageResponseBodyListScoreConfigLevels self = new ListAICoachScriptPageResponseBodyListScoreConfigLevels();
            return TeaModel.build(map, self);
        }

        public ListAICoachScriptPageResponseBodyListScoreConfigLevels setMax(Integer max) {
            this.max = max;
            return this;
        }
        public Integer getMax() {
            return this.max;
        }

        public ListAICoachScriptPageResponseBodyListScoreConfigLevels setMin(Integer min) {
            this.min = min;
            return this;
        }
        public Integer getMin() {
            return this.min;
        }

        public ListAICoachScriptPageResponseBodyListScoreConfigLevels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListAICoachScriptPageResponseBodyListScoreConfig extends TeaModel {
        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("levelEnabled")
        public Boolean levelEnabled;

        @NameInMap("levels")
        public java.util.List<ListAICoachScriptPageResponseBodyListScoreConfigLevels> levels;

        @NameInMap("passScore")
        public Integer passScore;

        public static ListAICoachScriptPageResponseBodyListScoreConfig build(java.util.Map<String, ?> map) throws Exception {
            ListAICoachScriptPageResponseBodyListScoreConfig self = new ListAICoachScriptPageResponseBodyListScoreConfig();
            return TeaModel.build(map, self);
        }

        public ListAICoachScriptPageResponseBodyListScoreConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListAICoachScriptPageResponseBodyListScoreConfig setLevelEnabled(Boolean levelEnabled) {
            this.levelEnabled = levelEnabled;
            return this;
        }
        public Boolean getLevelEnabled() {
            return this.levelEnabled;
        }

        public ListAICoachScriptPageResponseBodyListScoreConfig setLevels(java.util.List<ListAICoachScriptPageResponseBodyListScoreConfigLevels> levels) {
            this.levels = levels;
            return this;
        }
        public java.util.List<ListAICoachScriptPageResponseBodyListScoreConfigLevels> getLevels() {
            return this.levels;
        }

        public ListAICoachScriptPageResponseBodyListScoreConfig setPassScore(Integer passScore) {
            this.passScore = passScore;
            return this;
        }
        public Integer getPassScore() {
            return this.passScore;
        }

    }

    public static class ListAICoachScriptPageResponseBodyListWeights extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("assessmentPoint")
        public Integer assessmentPoint;

        @NameInMap("assessmentPointEnabled")
        public Boolean assessmentPointEnabled;

        @NameInMap("customReplyRuleEnabled")
        public Boolean customReplyRuleEnabled;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("expressiveness")
        public Integer expressiveness;

        @NameInMap("expressivenessEnabled")
        public Boolean expressivenessEnabled;

        @NameInMap("pointDeductionRule")
        public Integer pointDeductionRule;

        @NameInMap("pointDeductionRuleEnabled")
        public Boolean pointDeductionRuleEnabled;

        @NameInMap("similarPronunciationScoringEnabled")
        public Boolean similarPronunciationScoringEnabled;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("standard")
        public Integer standard;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("standardEnabled")
        public Boolean standardEnabled;

        public static ListAICoachScriptPageResponseBodyListWeights build(java.util.Map<String, ?> map) throws Exception {
            ListAICoachScriptPageResponseBodyListWeights self = new ListAICoachScriptPageResponseBodyListWeights();
            return TeaModel.build(map, self);
        }

        public ListAICoachScriptPageResponseBodyListWeights setAssessmentPoint(Integer assessmentPoint) {
            this.assessmentPoint = assessmentPoint;
            return this;
        }
        public Integer getAssessmentPoint() {
            return this.assessmentPoint;
        }

        public ListAICoachScriptPageResponseBodyListWeights setAssessmentPointEnabled(Boolean assessmentPointEnabled) {
            this.assessmentPointEnabled = assessmentPointEnabled;
            return this;
        }
        public Boolean getAssessmentPointEnabled() {
            return this.assessmentPointEnabled;
        }

        public ListAICoachScriptPageResponseBodyListWeights setCustomReplyRuleEnabled(Boolean customReplyRuleEnabled) {
            this.customReplyRuleEnabled = customReplyRuleEnabled;
            return this;
        }
        public Boolean getCustomReplyRuleEnabled() {
            return this.customReplyRuleEnabled;
        }

        public ListAICoachScriptPageResponseBodyListWeights setExpressiveness(Integer expressiveness) {
            this.expressiveness = expressiveness;
            return this;
        }
        public Integer getExpressiveness() {
            return this.expressiveness;
        }

        public ListAICoachScriptPageResponseBodyListWeights setExpressivenessEnabled(Boolean expressivenessEnabled) {
            this.expressivenessEnabled = expressivenessEnabled;
            return this;
        }
        public Boolean getExpressivenessEnabled() {
            return this.expressivenessEnabled;
        }

        public ListAICoachScriptPageResponseBodyListWeights setPointDeductionRule(Integer pointDeductionRule) {
            this.pointDeductionRule = pointDeductionRule;
            return this;
        }
        public Integer getPointDeductionRule() {
            return this.pointDeductionRule;
        }

        public ListAICoachScriptPageResponseBodyListWeights setPointDeductionRuleEnabled(Boolean pointDeductionRuleEnabled) {
            this.pointDeductionRuleEnabled = pointDeductionRuleEnabled;
            return this;
        }
        public Boolean getPointDeductionRuleEnabled() {
            return this.pointDeductionRuleEnabled;
        }

        public ListAICoachScriptPageResponseBodyListWeights setSimilarPronunciationScoringEnabled(Boolean similarPronunciationScoringEnabled) {
            this.similarPronunciationScoringEnabled = similarPronunciationScoringEnabled;
            return this;
        }
        public Boolean getSimilarPronunciationScoringEnabled() {
            return this.similarPronunciationScoringEnabled;
        }

        public ListAICoachScriptPageResponseBodyListWeights setStandard(Integer standard) {
            this.standard = standard;
            return this;
        }
        public Integer getStandard() {
            return this.standard;
        }

        public ListAICoachScriptPageResponseBodyListWeights setStandardEnabled(Boolean standardEnabled) {
            this.standardEnabled = standardEnabled;
            return this;
        }
        public Boolean getStandardEnabled() {
            return this.standardEnabled;
        }

    }

    public static class ListAICoachScriptPageResponseBodyList extends TeaModel {
        @NameInMap("appendQuestionFlag")
        public String appendQuestionFlag;

        @NameInMap("assessmentScope")
        public String assessmentScope;

        @NameInMap("closingRemarks")
        public String closingRemarks;

        @NameInMap("completeStrategy")
        public ListAICoachScriptPageResponseBodyListCompleteStrategy completeStrategy;

        /**
         * <strong>example:</strong>
         * <p><a href="https://oss-ata.alibaba.com/front/live/banner1.png">https://oss-ata.alibaba.com/front/live/banner1.png</a></p>
         */
        @NameInMap("coverUrl")
        public String coverUrl;

        @NameInMap("customReplyRules")
        public java.util.List<ListAICoachScriptPageResponseBodyListCustomReplyRules> customReplyRules;

        @NameInMap("dialogueTextFlag")
        public Boolean dialogueTextFlag;

        @NameInMap("dialogueTipFlag")
        public Boolean dialogueTipFlag;

        @NameInMap("evaluateReportFlag")
        public Boolean evaluateReportFlag;

        @NameInMap("expressiveness")
        public java.util.Map<String, String> expressiveness;

        @NameInMap("gifDynamicUrl")
        public String gifDynamicUrl;

        @NameInMap("gifStaticUrl")
        public String gifStaticUrl;

        /**
         * <strong>example:</strong>
         * <p>2024-12-25 14:00:00</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2024-12-25 14:00:00</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>student</p>
         */
        @NameInMap("initiator")
        public String initiator;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("interactionType")
        public String interactionType;

        @NameInMap("introduce")
        public String introduce;

        /**
         * <strong>example:</strong>
         * <p>prod-ydsf</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("openingRemarks")
        public String openingRemarks;

        @NameInMap("orderAckFlag")
        public Boolean orderAckFlag;

        @NameInMap("sampleDialogueList")
        public java.util.List<ListAICoachScriptPageResponseBodyListSampleDialogueList> sampleDialogueList;

        @NameInMap("scoreConfig")
        public ListAICoachScriptPageResponseBodyListScoreConfig scoreConfig;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("scriptRecordId")
        public String scriptRecordId;

        @NameInMap("sparringTipContent")
        public String sparringTipContent;

        @NameInMap("sparringTipTitle")
        public String sparringTipTitle;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("status")
        public Integer status;

        @NameInMap("studentThinkTimeFlag")
        public Boolean studentThinkTimeFlag;

        @NameInMap("type")
        public Integer type;

        @NameInMap("weights")
        public ListAICoachScriptPageResponseBodyListWeights weights;

        public static ListAICoachScriptPageResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListAICoachScriptPageResponseBodyList self = new ListAICoachScriptPageResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListAICoachScriptPageResponseBodyList setAppendQuestionFlag(String appendQuestionFlag) {
            this.appendQuestionFlag = appendQuestionFlag;
            return this;
        }
        public String getAppendQuestionFlag() {
            return this.appendQuestionFlag;
        }

        public ListAICoachScriptPageResponseBodyList setAssessmentScope(String assessmentScope) {
            this.assessmentScope = assessmentScope;
            return this;
        }
        public String getAssessmentScope() {
            return this.assessmentScope;
        }

        public ListAICoachScriptPageResponseBodyList setClosingRemarks(String closingRemarks) {
            this.closingRemarks = closingRemarks;
            return this;
        }
        public String getClosingRemarks() {
            return this.closingRemarks;
        }

        public ListAICoachScriptPageResponseBodyList setCompleteStrategy(ListAICoachScriptPageResponseBodyListCompleteStrategy completeStrategy) {
            this.completeStrategy = completeStrategy;
            return this;
        }
        public ListAICoachScriptPageResponseBodyListCompleteStrategy getCompleteStrategy() {
            return this.completeStrategy;
        }

        public ListAICoachScriptPageResponseBodyList setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public ListAICoachScriptPageResponseBodyList setCustomReplyRules(java.util.List<ListAICoachScriptPageResponseBodyListCustomReplyRules> customReplyRules) {
            this.customReplyRules = customReplyRules;
            return this;
        }
        public java.util.List<ListAICoachScriptPageResponseBodyListCustomReplyRules> getCustomReplyRules() {
            return this.customReplyRules;
        }

        public ListAICoachScriptPageResponseBodyList setDialogueTextFlag(Boolean dialogueTextFlag) {
            this.dialogueTextFlag = dialogueTextFlag;
            return this;
        }
        public Boolean getDialogueTextFlag() {
            return this.dialogueTextFlag;
        }

        public ListAICoachScriptPageResponseBodyList setDialogueTipFlag(Boolean dialogueTipFlag) {
            this.dialogueTipFlag = dialogueTipFlag;
            return this;
        }
        public Boolean getDialogueTipFlag() {
            return this.dialogueTipFlag;
        }

        public ListAICoachScriptPageResponseBodyList setEvaluateReportFlag(Boolean evaluateReportFlag) {
            this.evaluateReportFlag = evaluateReportFlag;
            return this;
        }
        public Boolean getEvaluateReportFlag() {
            return this.evaluateReportFlag;
        }

        public ListAICoachScriptPageResponseBodyList setExpressiveness(java.util.Map<String, String> expressiveness) {
            this.expressiveness = expressiveness;
            return this;
        }
        public java.util.Map<String, String> getExpressiveness() {
            return this.expressiveness;
        }

        public ListAICoachScriptPageResponseBodyList setGifDynamicUrl(String gifDynamicUrl) {
            this.gifDynamicUrl = gifDynamicUrl;
            return this;
        }
        public String getGifDynamicUrl() {
            return this.gifDynamicUrl;
        }

        public ListAICoachScriptPageResponseBodyList setGifStaticUrl(String gifStaticUrl) {
            this.gifStaticUrl = gifStaticUrl;
            return this;
        }
        public String getGifStaticUrl() {
            return this.gifStaticUrl;
        }

        public ListAICoachScriptPageResponseBodyList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAICoachScriptPageResponseBodyList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListAICoachScriptPageResponseBodyList setInitiator(String initiator) {
            this.initiator = initiator;
            return this;
        }
        public String getInitiator() {
            return this.initiator;
        }

        public ListAICoachScriptPageResponseBodyList setInteractionType(String interactionType) {
            this.interactionType = interactionType;
            return this;
        }
        public String getInteractionType() {
            return this.interactionType;
        }

        public ListAICoachScriptPageResponseBodyList setIntroduce(String introduce) {
            this.introduce = introduce;
            return this;
        }
        public String getIntroduce() {
            return this.introduce;
        }

        public ListAICoachScriptPageResponseBodyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAICoachScriptPageResponseBodyList setOpeningRemarks(String openingRemarks) {
            this.openingRemarks = openingRemarks;
            return this;
        }
        public String getOpeningRemarks() {
            return this.openingRemarks;
        }

        public ListAICoachScriptPageResponseBodyList setOrderAckFlag(Boolean orderAckFlag) {
            this.orderAckFlag = orderAckFlag;
            return this;
        }
        public Boolean getOrderAckFlag() {
            return this.orderAckFlag;
        }

        public ListAICoachScriptPageResponseBodyList setSampleDialogueList(java.util.List<ListAICoachScriptPageResponseBodyListSampleDialogueList> sampleDialogueList) {
            this.sampleDialogueList = sampleDialogueList;
            return this;
        }
        public java.util.List<ListAICoachScriptPageResponseBodyListSampleDialogueList> getSampleDialogueList() {
            return this.sampleDialogueList;
        }

        public ListAICoachScriptPageResponseBodyList setScoreConfig(ListAICoachScriptPageResponseBodyListScoreConfig scoreConfig) {
            this.scoreConfig = scoreConfig;
            return this;
        }
        public ListAICoachScriptPageResponseBodyListScoreConfig getScoreConfig() {
            return this.scoreConfig;
        }

        public ListAICoachScriptPageResponseBodyList setScriptRecordId(String scriptRecordId) {
            this.scriptRecordId = scriptRecordId;
            return this;
        }
        public String getScriptRecordId() {
            return this.scriptRecordId;
        }

        public ListAICoachScriptPageResponseBodyList setSparringTipContent(String sparringTipContent) {
            this.sparringTipContent = sparringTipContent;
            return this;
        }
        public String getSparringTipContent() {
            return this.sparringTipContent;
        }

        public ListAICoachScriptPageResponseBodyList setSparringTipTitle(String sparringTipTitle) {
            this.sparringTipTitle = sparringTipTitle;
            return this;
        }
        public String getSparringTipTitle() {
            return this.sparringTipTitle;
        }

        public ListAICoachScriptPageResponseBodyList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListAICoachScriptPageResponseBodyList setStudentThinkTimeFlag(Boolean studentThinkTimeFlag) {
            this.studentThinkTimeFlag = studentThinkTimeFlag;
            return this;
        }
        public Boolean getStudentThinkTimeFlag() {
            return this.studentThinkTimeFlag;
        }

        public ListAICoachScriptPageResponseBodyList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public ListAICoachScriptPageResponseBodyList setWeights(ListAICoachScriptPageResponseBodyListWeights weights) {
            this.weights = weights;
            return this;
        }
        public ListAICoachScriptPageResponseBodyListWeights getWeights() {
            return this.weights;
        }

    }

}
