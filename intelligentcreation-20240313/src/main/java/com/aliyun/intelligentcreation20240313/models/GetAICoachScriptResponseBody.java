// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class GetAICoachScriptResponseBody extends TeaModel {
    @NameInMap("appendQuestionFlag")
    public Boolean appendQuestionFlag;

    /**
     * <strong>example:</strong>
     * <p>point</p>
     */
    @NameInMap("assessmentScope")
    public String assessmentScope;

    @NameInMap("checkCheatConfig")
    public GetAICoachScriptResponseBodyCheckCheatConfig checkCheatConfig;

    @NameInMap("closingRemarks")
    public String closingRemarks;

    @NameInMap("completeStrategy")
    public GetAICoachScriptResponseBodyCompleteStrategy completeStrategy;

    /**
     * <strong>example:</strong>
     * <p><a href="https://demo.com">https://demo.com</a></p>
     */
    @NameInMap("coverUrl")
    public String coverUrl;

    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("dialogueInputTextLimit")
    public Integer dialogueInputTextLimit;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dialogueTextFlag")
    public Boolean dialogueTextFlag;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dialogueTipFlag")
    public Boolean dialogueTipFlag;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("dialogueVoiceLimit")
    public Integer dialogueVoiceLimit;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("evaluateReportFlag")
    public Boolean evaluateReportFlag;

    @NameInMap("expressiveness")
    public java.util.Map<String, Integer> expressiveness;

    @NameInMap("expressivenessList")
    public java.util.List<GetAICoachScriptResponseBodyExpressivenessList> expressivenessList;

    @NameInMap("gifDynamicUrl")
    public String gifDynamicUrl;

    @NameInMap("gifStaticUrl")
    public String gifStaticUrl;

    /**
     * <strong>example:</strong>
     * <p>2025-02-24 12:00:00</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <strong>example:</strong>
     * <p>2025-02-24 12:00:00</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <strong>example:</strong>
     * <p>coach</p>
     */
    @NameInMap("initiator")
    public String initiator;

    @NameInMap("interactionInputTypes")
    public java.util.List<String> interactionInputTypes;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("interactionType")
    public Integer interactionType;

    /**
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("introduce")
    public String introduce;

    /**
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("openingRemarks")
    public String openingRemarks;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("orderAckFlag")
    public Boolean orderAckFlag;

    @NameInMap("pointDeductionRuleList")
    public java.util.List<GetAICoachScriptResponseBodyPointDeductionRuleList> pointDeductionRuleList;

    @NameInMap("points")
    public java.util.List<GetAICoachScriptResponseBodyPoints> points;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("sampleDialogueList")
    public java.util.List<GetAICoachScriptResponseBodySampleDialogueList> sampleDialogueList;

    @NameInMap("scoreConfig")
    public GetAICoachScriptResponseBodyScoreConfig scoreConfig;

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

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("studentThinkTimeFlag")
    public Boolean studentThinkTimeFlag;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("studentThinkTimeLimit")
    public Integer studentThinkTimeLimit;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("type")
    public Integer type;

    @NameInMap("weights")
    public GetAICoachScriptResponseBodyWeights weights;

    public static GetAICoachScriptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAICoachScriptResponseBody self = new GetAICoachScriptResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAICoachScriptResponseBody setAppendQuestionFlag(Boolean appendQuestionFlag) {
        this.appendQuestionFlag = appendQuestionFlag;
        return this;
    }
    public Boolean getAppendQuestionFlag() {
        return this.appendQuestionFlag;
    }

    public GetAICoachScriptResponseBody setAssessmentScope(String assessmentScope) {
        this.assessmentScope = assessmentScope;
        return this;
    }
    public String getAssessmentScope() {
        return this.assessmentScope;
    }

    public GetAICoachScriptResponseBody setCheckCheatConfig(GetAICoachScriptResponseBodyCheckCheatConfig checkCheatConfig) {
        this.checkCheatConfig = checkCheatConfig;
        return this;
    }
    public GetAICoachScriptResponseBodyCheckCheatConfig getCheckCheatConfig() {
        return this.checkCheatConfig;
    }

    public GetAICoachScriptResponseBody setClosingRemarks(String closingRemarks) {
        this.closingRemarks = closingRemarks;
        return this;
    }
    public String getClosingRemarks() {
        return this.closingRemarks;
    }

    public GetAICoachScriptResponseBody setCompleteStrategy(GetAICoachScriptResponseBodyCompleteStrategy completeStrategy) {
        this.completeStrategy = completeStrategy;
        return this;
    }
    public GetAICoachScriptResponseBodyCompleteStrategy getCompleteStrategy() {
        return this.completeStrategy;
    }

    public GetAICoachScriptResponseBody setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
        return this;
    }
    public String getCoverUrl() {
        return this.coverUrl;
    }

    public GetAICoachScriptResponseBody setDialogueInputTextLimit(Integer dialogueInputTextLimit) {
        this.dialogueInputTextLimit = dialogueInputTextLimit;
        return this;
    }
    public Integer getDialogueInputTextLimit() {
        return this.dialogueInputTextLimit;
    }

    public GetAICoachScriptResponseBody setDialogueTextFlag(Boolean dialogueTextFlag) {
        this.dialogueTextFlag = dialogueTextFlag;
        return this;
    }
    public Boolean getDialogueTextFlag() {
        return this.dialogueTextFlag;
    }

    public GetAICoachScriptResponseBody setDialogueTipFlag(Boolean dialogueTipFlag) {
        this.dialogueTipFlag = dialogueTipFlag;
        return this;
    }
    public Boolean getDialogueTipFlag() {
        return this.dialogueTipFlag;
    }

    public GetAICoachScriptResponseBody setDialogueVoiceLimit(Integer dialogueVoiceLimit) {
        this.dialogueVoiceLimit = dialogueVoiceLimit;
        return this;
    }
    public Integer getDialogueVoiceLimit() {
        return this.dialogueVoiceLimit;
    }

    public GetAICoachScriptResponseBody setEvaluateReportFlag(Boolean evaluateReportFlag) {
        this.evaluateReportFlag = evaluateReportFlag;
        return this;
    }
    public Boolean getEvaluateReportFlag() {
        return this.evaluateReportFlag;
    }

    public GetAICoachScriptResponseBody setExpressiveness(java.util.Map<String, Integer> expressiveness) {
        this.expressiveness = expressiveness;
        return this;
    }
    public java.util.Map<String, Integer> getExpressiveness() {
        return this.expressiveness;
    }

    public GetAICoachScriptResponseBody setExpressivenessList(java.util.List<GetAICoachScriptResponseBodyExpressivenessList> expressivenessList) {
        this.expressivenessList = expressivenessList;
        return this;
    }
    public java.util.List<GetAICoachScriptResponseBodyExpressivenessList> getExpressivenessList() {
        return this.expressivenessList;
    }

    public GetAICoachScriptResponseBody setGifDynamicUrl(String gifDynamicUrl) {
        this.gifDynamicUrl = gifDynamicUrl;
        return this;
    }
    public String getGifDynamicUrl() {
        return this.gifDynamicUrl;
    }

    public GetAICoachScriptResponseBody setGifStaticUrl(String gifStaticUrl) {
        this.gifStaticUrl = gifStaticUrl;
        return this;
    }
    public String getGifStaticUrl() {
        return this.gifStaticUrl;
    }

    public GetAICoachScriptResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public GetAICoachScriptResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public GetAICoachScriptResponseBody setInitiator(String initiator) {
        this.initiator = initiator;
        return this;
    }
    public String getInitiator() {
        return this.initiator;
    }

    public GetAICoachScriptResponseBody setInteractionInputTypes(java.util.List<String> interactionInputTypes) {
        this.interactionInputTypes = interactionInputTypes;
        return this;
    }
    public java.util.List<String> getInteractionInputTypes() {
        return this.interactionInputTypes;
    }

    public GetAICoachScriptResponseBody setInteractionType(Integer interactionType) {
        this.interactionType = interactionType;
        return this;
    }
    public Integer getInteractionType() {
        return this.interactionType;
    }

    public GetAICoachScriptResponseBody setIntroduce(String introduce) {
        this.introduce = introduce;
        return this;
    }
    public String getIntroduce() {
        return this.introduce;
    }

    public GetAICoachScriptResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetAICoachScriptResponseBody setOpeningRemarks(String openingRemarks) {
        this.openingRemarks = openingRemarks;
        return this;
    }
    public String getOpeningRemarks() {
        return this.openingRemarks;
    }

    public GetAICoachScriptResponseBody setOrderAckFlag(Boolean orderAckFlag) {
        this.orderAckFlag = orderAckFlag;
        return this;
    }
    public Boolean getOrderAckFlag() {
        return this.orderAckFlag;
    }

    public GetAICoachScriptResponseBody setPointDeductionRuleList(java.util.List<GetAICoachScriptResponseBodyPointDeductionRuleList> pointDeductionRuleList) {
        this.pointDeductionRuleList = pointDeductionRuleList;
        return this;
    }
    public java.util.List<GetAICoachScriptResponseBodyPointDeductionRuleList> getPointDeductionRuleList() {
        return this.pointDeductionRuleList;
    }

    public GetAICoachScriptResponseBody setPoints(java.util.List<GetAICoachScriptResponseBodyPoints> points) {
        this.points = points;
        return this;
    }
    public java.util.List<GetAICoachScriptResponseBodyPoints> getPoints() {
        return this.points;
    }

    public GetAICoachScriptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAICoachScriptResponseBody setSampleDialogueList(java.util.List<GetAICoachScriptResponseBodySampleDialogueList> sampleDialogueList) {
        this.sampleDialogueList = sampleDialogueList;
        return this;
    }
    public java.util.List<GetAICoachScriptResponseBodySampleDialogueList> getSampleDialogueList() {
        return this.sampleDialogueList;
    }

    public GetAICoachScriptResponseBody setScoreConfig(GetAICoachScriptResponseBodyScoreConfig scoreConfig) {
        this.scoreConfig = scoreConfig;
        return this;
    }
    public GetAICoachScriptResponseBodyScoreConfig getScoreConfig() {
        return this.scoreConfig;
    }

    public GetAICoachScriptResponseBody setScriptRecordId(String scriptRecordId) {
        this.scriptRecordId = scriptRecordId;
        return this;
    }
    public String getScriptRecordId() {
        return this.scriptRecordId;
    }

    public GetAICoachScriptResponseBody setSparringTipContent(String sparringTipContent) {
        this.sparringTipContent = sparringTipContent;
        return this;
    }
    public String getSparringTipContent() {
        return this.sparringTipContent;
    }

    public GetAICoachScriptResponseBody setSparringTipTitle(String sparringTipTitle) {
        this.sparringTipTitle = sparringTipTitle;
        return this;
    }
    public String getSparringTipTitle() {
        return this.sparringTipTitle;
    }

    public GetAICoachScriptResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public GetAICoachScriptResponseBody setStudentThinkTimeFlag(Boolean studentThinkTimeFlag) {
        this.studentThinkTimeFlag = studentThinkTimeFlag;
        return this;
    }
    public Boolean getStudentThinkTimeFlag() {
        return this.studentThinkTimeFlag;
    }

    public GetAICoachScriptResponseBody setStudentThinkTimeLimit(Integer studentThinkTimeLimit) {
        this.studentThinkTimeLimit = studentThinkTimeLimit;
        return this;
    }
    public Integer getStudentThinkTimeLimit() {
        return this.studentThinkTimeLimit;
    }

    public GetAICoachScriptResponseBody setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public GetAICoachScriptResponseBody setWeights(GetAICoachScriptResponseBodyWeights weights) {
        this.weights = weights;
        return this;
    }
    public GetAICoachScriptResponseBodyWeights getWeights() {
        return this.weights;
    }

    public static class GetAICoachScriptResponseBodyCheckCheatConfig extends TeaModel {
        @NameInMap("checkImage")
        public Boolean checkImage;

        @NameInMap("checkVoice")
        public Boolean checkVoice;

        public static GetAICoachScriptResponseBodyCheckCheatConfig build(java.util.Map<String, ?> map) throws Exception {
            GetAICoachScriptResponseBodyCheckCheatConfig self = new GetAICoachScriptResponseBodyCheckCheatConfig();
            return TeaModel.build(map, self);
        }

        public GetAICoachScriptResponseBodyCheckCheatConfig setCheckImage(Boolean checkImage) {
            this.checkImage = checkImage;
            return this;
        }
        public Boolean getCheckImage() {
            return this.checkImage;
        }

        public GetAICoachScriptResponseBodyCheckCheatConfig setCheckVoice(Boolean checkVoice) {
            this.checkVoice = checkVoice;
            return this;
        }
        public Boolean getCheckVoice() {
            return this.checkVoice;
        }

    }

    public static class GetAICoachScriptResponseBodyCompleteStrategy extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("abnormalQuitSessionExpired")
        public Integer abnormalQuitSessionExpired;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("abnormalQuitSessionExpiredFlag")
        public Boolean abnormalQuitSessionExpiredFlag;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("clickCompleteAutoEnd")
        public Boolean clickCompleteAutoEnd;

        /**
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("duration")
        public Integer duration;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("durationFlag")
        public Boolean durationFlag;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("fullCoverageAutoEnd")
        public Boolean fullCoverageAutoEnd;

        public static GetAICoachScriptResponseBodyCompleteStrategy build(java.util.Map<String, ?> map) throws Exception {
            GetAICoachScriptResponseBodyCompleteStrategy self = new GetAICoachScriptResponseBodyCompleteStrategy();
            return TeaModel.build(map, self);
        }

        public GetAICoachScriptResponseBodyCompleteStrategy setAbnormalQuitSessionExpired(Integer abnormalQuitSessionExpired) {
            this.abnormalQuitSessionExpired = abnormalQuitSessionExpired;
            return this;
        }
        public Integer getAbnormalQuitSessionExpired() {
            return this.abnormalQuitSessionExpired;
        }

        public GetAICoachScriptResponseBodyCompleteStrategy setAbnormalQuitSessionExpiredFlag(Boolean abnormalQuitSessionExpiredFlag) {
            this.abnormalQuitSessionExpiredFlag = abnormalQuitSessionExpiredFlag;
            return this;
        }
        public Boolean getAbnormalQuitSessionExpiredFlag() {
            return this.abnormalQuitSessionExpiredFlag;
        }

        public GetAICoachScriptResponseBodyCompleteStrategy setClickCompleteAutoEnd(Boolean clickCompleteAutoEnd) {
            this.clickCompleteAutoEnd = clickCompleteAutoEnd;
            return this;
        }
        public Boolean getClickCompleteAutoEnd() {
            return this.clickCompleteAutoEnd;
        }

        public GetAICoachScriptResponseBodyCompleteStrategy setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public GetAICoachScriptResponseBodyCompleteStrategy setDurationFlag(Boolean durationFlag) {
            this.durationFlag = durationFlag;
            return this;
        }
        public Boolean getDurationFlag() {
            return this.durationFlag;
        }

        public GetAICoachScriptResponseBodyCompleteStrategy setFullCoverageAutoEnd(Boolean fullCoverageAutoEnd) {
            this.fullCoverageAutoEnd = fullCoverageAutoEnd;
            return this;
        }
        public Boolean getFullCoverageAutoEnd() {
            return this.fullCoverageAutoEnd;
        }

    }

    public static class GetAICoachScriptResponseBodyExpressivenessList extends TeaModel {
        @NameInMap("desc")
        public String desc;

        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("expressivenessId")
        public String expressivenessId;

        @NameInMap("name")
        public String name;

        @NameInMap("rule")
        public String rule;

        @NameInMap("type")
        public String type;

        @NameInMap("weight")
        public Integer weight;

        public static GetAICoachScriptResponseBodyExpressivenessList build(java.util.Map<String, ?> map) throws Exception {
            GetAICoachScriptResponseBodyExpressivenessList self = new GetAICoachScriptResponseBodyExpressivenessList();
            return TeaModel.build(map, self);
        }

        public GetAICoachScriptResponseBodyExpressivenessList setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetAICoachScriptResponseBodyExpressivenessList setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetAICoachScriptResponseBodyExpressivenessList setExpressivenessId(String expressivenessId) {
            this.expressivenessId = expressivenessId;
            return this;
        }
        public String getExpressivenessId() {
            return this.expressivenessId;
        }

        public GetAICoachScriptResponseBodyExpressivenessList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAICoachScriptResponseBodyExpressivenessList setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public GetAICoachScriptResponseBodyExpressivenessList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetAICoachScriptResponseBodyExpressivenessList setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class GetAICoachScriptResponseBodyPointDeductionRuleList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("description")
        public String description;

        @NameInMap("punishmentTypes")
        public java.util.List<String> punishmentTypes;

        @NameInMap("ruleValue")
        public String ruleValue;

        /**
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("weight")
        public Integer weight;

        public static GetAICoachScriptResponseBodyPointDeductionRuleList build(java.util.Map<String, ?> map) throws Exception {
            GetAICoachScriptResponseBodyPointDeductionRuleList self = new GetAICoachScriptResponseBodyPointDeductionRuleList();
            return TeaModel.build(map, self);
        }

        public GetAICoachScriptResponseBodyPointDeductionRuleList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAICoachScriptResponseBodyPointDeductionRuleList setPunishmentTypes(java.util.List<String> punishmentTypes) {
            this.punishmentTypes = punishmentTypes;
            return this;
        }
        public java.util.List<String> getPunishmentTypes() {
            return this.punishmentTypes;
        }

        public GetAICoachScriptResponseBodyPointDeductionRuleList setRuleValue(String ruleValue) {
            this.ruleValue = ruleValue;
            return this;
        }
        public String getRuleValue() {
            return this.ruleValue;
        }

        public GetAICoachScriptResponseBodyPointDeductionRuleList setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class GetAICoachScriptResponseBodyPointsAnswerListAnswerValuesKeywordValues extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("weight")
        public Integer weight;

        public static GetAICoachScriptResponseBodyPointsAnswerListAnswerValuesKeywordValues build(java.util.Map<String, ?> map) throws Exception {
            GetAICoachScriptResponseBodyPointsAnswerListAnswerValuesKeywordValues self = new GetAICoachScriptResponseBodyPointsAnswerListAnswerValuesKeywordValues();
            return TeaModel.build(map, self);
        }

        public GetAICoachScriptResponseBodyPointsAnswerListAnswerValuesKeywordValues setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAICoachScriptResponseBodyPointsAnswerListAnswerValuesKeywordValues setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class GetAICoachScriptResponseBodyPointsAnswerListAnswerValuesScoringRules extends TeaModel {
        @NameInMap("name")
        public String name;

        public static GetAICoachScriptResponseBodyPointsAnswerListAnswerValuesScoringRules build(java.util.Map<String, ?> map) throws Exception {
            GetAICoachScriptResponseBodyPointsAnswerListAnswerValuesScoringRules self = new GetAICoachScriptResponseBodyPointsAnswerListAnswerValuesScoringRules();
            return TeaModel.build(map, self);
        }

        public GetAICoachScriptResponseBodyPointsAnswerListAnswerValuesScoringRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetAICoachScriptResponseBodyPointsAnswerListAnswerValues extends TeaModel {
        @NameInMap("answerName")
        public String answerName;

        @NameInMap("answerWeight")
        public Integer answerWeight;

        @NameInMap("keywordValues")
        public java.util.List<GetAICoachScriptResponseBodyPointsAnswerListAnswerValuesKeywordValues> keywordValues;

        @NameInMap("keywordWeight")
        public Integer keywordWeight;

        @NameInMap("scoringRules")
        public java.util.List<GetAICoachScriptResponseBodyPointsAnswerListAnswerValuesScoringRules> scoringRules;

        public static GetAICoachScriptResponseBodyPointsAnswerListAnswerValues build(java.util.Map<String, ?> map) throws Exception {
            GetAICoachScriptResponseBodyPointsAnswerListAnswerValues self = new GetAICoachScriptResponseBodyPointsAnswerListAnswerValues();
            return TeaModel.build(map, self);
        }

        public GetAICoachScriptResponseBodyPointsAnswerListAnswerValues setAnswerName(String answerName) {
            this.answerName = answerName;
            return this;
        }
        public String getAnswerName() {
            return this.answerName;
        }

        public GetAICoachScriptResponseBodyPointsAnswerListAnswerValues setAnswerWeight(Integer answerWeight) {
            this.answerWeight = answerWeight;
            return this;
        }
        public Integer getAnswerWeight() {
            return this.answerWeight;
        }

        public GetAICoachScriptResponseBodyPointsAnswerListAnswerValues setKeywordValues(java.util.List<GetAICoachScriptResponseBodyPointsAnswerListAnswerValuesKeywordValues> keywordValues) {
            this.keywordValues = keywordValues;
            return this;
        }
        public java.util.List<GetAICoachScriptResponseBodyPointsAnswerListAnswerValuesKeywordValues> getKeywordValues() {
            return this.keywordValues;
        }

        public GetAICoachScriptResponseBodyPointsAnswerListAnswerValues setKeywordWeight(Integer keywordWeight) {
            this.keywordWeight = keywordWeight;
            return this;
        }
        public Integer getKeywordWeight() {
            return this.keywordWeight;
        }

        public GetAICoachScriptResponseBodyPointsAnswerListAnswerValues setScoringRules(java.util.List<GetAICoachScriptResponseBodyPointsAnswerListAnswerValuesScoringRules> scoringRules) {
            this.scoringRules = scoringRules;
            return this;
        }
        public java.util.List<GetAICoachScriptResponseBodyPointsAnswerListAnswerValuesScoringRules> getScoringRules() {
            return this.scoringRules;
        }

    }

    public static class GetAICoachScriptResponseBodyPointsAnswerListParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("value")
        public String value;

        public static GetAICoachScriptResponseBodyPointsAnswerListParameters build(java.util.Map<String, ?> map) throws Exception {
            GetAICoachScriptResponseBodyPointsAnswerListParameters self = new GetAICoachScriptResponseBodyPointsAnswerListParameters();
            return TeaModel.build(map, self);
        }

        public GetAICoachScriptResponseBodyPointsAnswerListParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAICoachScriptResponseBodyPointsAnswerListParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetAICoachScriptResponseBodyPointsAnswerList extends TeaModel {
        @NameInMap("answerValues")
        public java.util.List<GetAICoachScriptResponseBodyPointsAnswerListAnswerValues> answerValues;

        @NameInMap("enabledKeyword")
        public Boolean enabledKeyword;

        @NameInMap("name")
        public String name;

        @NameInMap("nameList")
        public java.util.List<String> nameList;

        @NameInMap("operators")
        public String operators;

        @NameInMap("parameters")
        public java.util.List<GetAICoachScriptResponseBodyPointsAnswerListParameters> parameters;

        /**
         * <strong>example:</strong>
         * <p>normalKnowledge</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("weight")
        public Integer weight;

        public static GetAICoachScriptResponseBodyPointsAnswerList build(java.util.Map<String, ?> map) throws Exception {
            GetAICoachScriptResponseBodyPointsAnswerList self = new GetAICoachScriptResponseBodyPointsAnswerList();
            return TeaModel.build(map, self);
        }

        public GetAICoachScriptResponseBodyPointsAnswerList setAnswerValues(java.util.List<GetAICoachScriptResponseBodyPointsAnswerListAnswerValues> answerValues) {
            this.answerValues = answerValues;
            return this;
        }
        public java.util.List<GetAICoachScriptResponseBodyPointsAnswerListAnswerValues> getAnswerValues() {
            return this.answerValues;
        }

        public GetAICoachScriptResponseBodyPointsAnswerList setEnabledKeyword(Boolean enabledKeyword) {
            this.enabledKeyword = enabledKeyword;
            return this;
        }
        public Boolean getEnabledKeyword() {
            return this.enabledKeyword;
        }

        public GetAICoachScriptResponseBodyPointsAnswerList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAICoachScriptResponseBodyPointsAnswerList setNameList(java.util.List<String> nameList) {
            this.nameList = nameList;
            return this;
        }
        public java.util.List<String> getNameList() {
            return this.nameList;
        }

        public GetAICoachScriptResponseBodyPointsAnswerList setOperators(String operators) {
            this.operators = operators;
            return this;
        }
        public String getOperators() {
            return this.operators;
        }

        public GetAICoachScriptResponseBodyPointsAnswerList setParameters(java.util.List<GetAICoachScriptResponseBodyPointsAnswerListParameters> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<GetAICoachScriptResponseBodyPointsAnswerListParameters> getParameters() {
            return this.parameters;
        }

        public GetAICoachScriptResponseBodyPointsAnswerList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetAICoachScriptResponseBodyPointsAnswerList setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class GetAICoachScriptResponseBodyPoints extends TeaModel {
        @NameInMap("answerList")
        public java.util.List<GetAICoachScriptResponseBodyPointsAnswerList> answerList;

        @NameInMap("knowledgeList")
        public java.util.List<String> knowledgeList;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("pointId")
        public String pointId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("questionDescription")
        public String questionDescription;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sortNo")
        public Integer sortNo;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("weight")
        public Integer weight;

        public static GetAICoachScriptResponseBodyPoints build(java.util.Map<String, ?> map) throws Exception {
            GetAICoachScriptResponseBodyPoints self = new GetAICoachScriptResponseBodyPoints();
            return TeaModel.build(map, self);
        }

        public GetAICoachScriptResponseBodyPoints setAnswerList(java.util.List<GetAICoachScriptResponseBodyPointsAnswerList> answerList) {
            this.answerList = answerList;
            return this;
        }
        public java.util.List<GetAICoachScriptResponseBodyPointsAnswerList> getAnswerList() {
            return this.answerList;
        }

        public GetAICoachScriptResponseBodyPoints setKnowledgeList(java.util.List<String> knowledgeList) {
            this.knowledgeList = knowledgeList;
            return this;
        }
        public java.util.List<String> getKnowledgeList() {
            return this.knowledgeList;
        }

        public GetAICoachScriptResponseBodyPoints setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAICoachScriptResponseBodyPoints setPointId(String pointId) {
            this.pointId = pointId;
            return this;
        }
        public String getPointId() {
            return this.pointId;
        }

        public GetAICoachScriptResponseBodyPoints setQuestionDescription(String questionDescription) {
            this.questionDescription = questionDescription;
            return this;
        }
        public String getQuestionDescription() {
            return this.questionDescription;
        }

        public GetAICoachScriptResponseBodyPoints setSortNo(Integer sortNo) {
            this.sortNo = sortNo;
            return this;
        }
        public Integer getSortNo() {
            return this.sortNo;
        }

        public GetAICoachScriptResponseBodyPoints setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class GetAICoachScriptResponseBodySampleDialogueList extends TeaModel {
        @NameInMap("message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>coach</p>
         */
        @NameInMap("role")
        public String role;

        public static GetAICoachScriptResponseBodySampleDialogueList build(java.util.Map<String, ?> map) throws Exception {
            GetAICoachScriptResponseBodySampleDialogueList self = new GetAICoachScriptResponseBodySampleDialogueList();
            return TeaModel.build(map, self);
        }

        public GetAICoachScriptResponseBodySampleDialogueList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetAICoachScriptResponseBodySampleDialogueList setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class GetAICoachScriptResponseBodyScoreConfigLevels extends TeaModel {
        @NameInMap("max")
        public Integer max;

        @NameInMap("min")
        public Integer min;

        @NameInMap("name")
        public String name;

        public static GetAICoachScriptResponseBodyScoreConfigLevels build(java.util.Map<String, ?> map) throws Exception {
            GetAICoachScriptResponseBodyScoreConfigLevels self = new GetAICoachScriptResponseBodyScoreConfigLevels();
            return TeaModel.build(map, self);
        }

        public GetAICoachScriptResponseBodyScoreConfigLevels setMax(Integer max) {
            this.max = max;
            return this;
        }
        public Integer getMax() {
            return this.max;
        }

        public GetAICoachScriptResponseBodyScoreConfigLevels setMin(Integer min) {
            this.min = min;
            return this;
        }
        public Integer getMin() {
            return this.min;
        }

        public GetAICoachScriptResponseBodyScoreConfigLevels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetAICoachScriptResponseBodyScoreConfig extends TeaModel {
        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("levelEnabled")
        public Boolean levelEnabled;

        @NameInMap("levels")
        public java.util.List<GetAICoachScriptResponseBodyScoreConfigLevels> levels;

        @NameInMap("passScore")
        public String passScore;

        public static GetAICoachScriptResponseBodyScoreConfig build(java.util.Map<String, ?> map) throws Exception {
            GetAICoachScriptResponseBodyScoreConfig self = new GetAICoachScriptResponseBodyScoreConfig();
            return TeaModel.build(map, self);
        }

        public GetAICoachScriptResponseBodyScoreConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetAICoachScriptResponseBodyScoreConfig setLevelEnabled(Boolean levelEnabled) {
            this.levelEnabled = levelEnabled;
            return this;
        }
        public Boolean getLevelEnabled() {
            return this.levelEnabled;
        }

        public GetAICoachScriptResponseBodyScoreConfig setLevels(java.util.List<GetAICoachScriptResponseBodyScoreConfigLevels> levels) {
            this.levels = levels;
            return this;
        }
        public java.util.List<GetAICoachScriptResponseBodyScoreConfigLevels> getLevels() {
            return this.levels;
        }

        public GetAICoachScriptResponseBodyScoreConfig setPassScore(String passScore) {
            this.passScore = passScore;
            return this;
        }
        public String getPassScore() {
            return this.passScore;
        }

    }

    public static class GetAICoachScriptResponseBodyWeights extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("abilityEvaluation")
        public Integer abilityEvaluation;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("abilityEvaluationEnabled")
        public Boolean abilityEvaluationEnabled;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("assessmentPoint")
        public Integer assessmentPoint;

        @NameInMap("assessmentPointEnabled")
        public Boolean assessmentPointEnabled;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("expressiveness")
        public Integer expressiveness;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("expressivenessEnabled")
        public Boolean expressivenessEnabled;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pointDeductionRule")
        public Integer pointDeductionRule;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("pointDeductionRuleEnabled")
        public Boolean pointDeductionRuleEnabled;

        @NameInMap("similarPronunciationScoringEnabled")
        public Boolean similarPronunciationScoringEnabled;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("standard")
        public Integer standard;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("standardEnabled")
        public Boolean standardEnabled;

        public static GetAICoachScriptResponseBodyWeights build(java.util.Map<String, ?> map) throws Exception {
            GetAICoachScriptResponseBodyWeights self = new GetAICoachScriptResponseBodyWeights();
            return TeaModel.build(map, self);
        }

        public GetAICoachScriptResponseBodyWeights setAbilityEvaluation(Integer abilityEvaluation) {
            this.abilityEvaluation = abilityEvaluation;
            return this;
        }
        public Integer getAbilityEvaluation() {
            return this.abilityEvaluation;
        }

        public GetAICoachScriptResponseBodyWeights setAbilityEvaluationEnabled(Boolean abilityEvaluationEnabled) {
            this.abilityEvaluationEnabled = abilityEvaluationEnabled;
            return this;
        }
        public Boolean getAbilityEvaluationEnabled() {
            return this.abilityEvaluationEnabled;
        }

        public GetAICoachScriptResponseBodyWeights setAssessmentPoint(Integer assessmentPoint) {
            this.assessmentPoint = assessmentPoint;
            return this;
        }
        public Integer getAssessmentPoint() {
            return this.assessmentPoint;
        }

        public GetAICoachScriptResponseBodyWeights setAssessmentPointEnabled(Boolean assessmentPointEnabled) {
            this.assessmentPointEnabled = assessmentPointEnabled;
            return this;
        }
        public Boolean getAssessmentPointEnabled() {
            return this.assessmentPointEnabled;
        }

        public GetAICoachScriptResponseBodyWeights setExpressiveness(Integer expressiveness) {
            this.expressiveness = expressiveness;
            return this;
        }
        public Integer getExpressiveness() {
            return this.expressiveness;
        }

        public GetAICoachScriptResponseBodyWeights setExpressivenessEnabled(Boolean expressivenessEnabled) {
            this.expressivenessEnabled = expressivenessEnabled;
            return this;
        }
        public Boolean getExpressivenessEnabled() {
            return this.expressivenessEnabled;
        }

        public GetAICoachScriptResponseBodyWeights setPointDeductionRule(Integer pointDeductionRule) {
            this.pointDeductionRule = pointDeductionRule;
            return this;
        }
        public Integer getPointDeductionRule() {
            return this.pointDeductionRule;
        }

        public GetAICoachScriptResponseBodyWeights setPointDeductionRuleEnabled(Boolean pointDeductionRuleEnabled) {
            this.pointDeductionRuleEnabled = pointDeductionRuleEnabled;
            return this;
        }
        public Boolean getPointDeductionRuleEnabled() {
            return this.pointDeductionRuleEnabled;
        }

        public GetAICoachScriptResponseBodyWeights setSimilarPronunciationScoringEnabled(Boolean similarPronunciationScoringEnabled) {
            this.similarPronunciationScoringEnabled = similarPronunciationScoringEnabled;
            return this;
        }
        public Boolean getSimilarPronunciationScoringEnabled() {
            return this.similarPronunciationScoringEnabled;
        }

        public GetAICoachScriptResponseBodyWeights setStandard(Integer standard) {
            this.standard = standard;
            return this;
        }
        public Integer getStandard() {
            return this.standard;
        }

        public GetAICoachScriptResponseBodyWeights setStandardEnabled(Boolean standardEnabled) {
            this.standardEnabled = standardEnabled;
            return this;
        }
        public Boolean getStandardEnabled() {
            return this.standardEnabled;
        }

    }

}
