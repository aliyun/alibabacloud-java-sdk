// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class SubmitAICoachDebugRequest extends TeaModel {
    @NameInMap("dataId")
    public String dataId;

    @NameInMap("dataType")
    public Long dataType;

    @NameInMap("deductionRule")
    public SubmitAICoachDebugRequestDeductionRule deductionRule;

    @NameInMap("dialogueList")
    public java.util.List<SubmitAICoachDebugRequestDialogueList> dialogueList;

    @NameInMap("expressiveness")
    public SubmitAICoachDebugRequestExpressiveness expressiveness;

    @NameInMap("point")
    public SubmitAICoachDebugRequestPoint point;

    public static SubmitAICoachDebugRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAICoachDebugRequest self = new SubmitAICoachDebugRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAICoachDebugRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public SubmitAICoachDebugRequest setDataType(Long dataType) {
        this.dataType = dataType;
        return this;
    }
    public Long getDataType() {
        return this.dataType;
    }

    public SubmitAICoachDebugRequest setDeductionRule(SubmitAICoachDebugRequestDeductionRule deductionRule) {
        this.deductionRule = deductionRule;
        return this;
    }
    public SubmitAICoachDebugRequestDeductionRule getDeductionRule() {
        return this.deductionRule;
    }

    public SubmitAICoachDebugRequest setDialogueList(java.util.List<SubmitAICoachDebugRequestDialogueList> dialogueList) {
        this.dialogueList = dialogueList;
        return this;
    }
    public java.util.List<SubmitAICoachDebugRequestDialogueList> getDialogueList() {
        return this.dialogueList;
    }

    public SubmitAICoachDebugRequest setExpressiveness(SubmitAICoachDebugRequestExpressiveness expressiveness) {
        this.expressiveness = expressiveness;
        return this;
    }
    public SubmitAICoachDebugRequestExpressiveness getExpressiveness() {
        return this.expressiveness;
    }

    public SubmitAICoachDebugRequest setPoint(SubmitAICoachDebugRequestPoint point) {
        this.point = point;
        return this;
    }
    public SubmitAICoachDebugRequestPoint getPoint() {
        return this.point;
    }

    public static class SubmitAICoachDebugRequestDeductionRule extends TeaModel {
        @NameInMap("deductionRuleId")
        public String deductionRuleId;

        @NameInMap("description")
        public String description;

        @NameInMap("punishmentTypes")
        public java.util.List<String> punishmentTypes;

        @NameInMap("ruleValue")
        public String ruleValue;

        @NameInMap("weight")
        public Integer weight;

        public static SubmitAICoachDebugRequestDeductionRule build(java.util.Map<String, ?> map) throws Exception {
            SubmitAICoachDebugRequestDeductionRule self = new SubmitAICoachDebugRequestDeductionRule();
            return TeaModel.build(map, self);
        }

        public SubmitAICoachDebugRequestDeductionRule setDeductionRuleId(String deductionRuleId) {
            this.deductionRuleId = deductionRuleId;
            return this;
        }
        public String getDeductionRuleId() {
            return this.deductionRuleId;
        }

        public SubmitAICoachDebugRequestDeductionRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SubmitAICoachDebugRequestDeductionRule setPunishmentTypes(java.util.List<String> punishmentTypes) {
            this.punishmentTypes = punishmentTypes;
            return this;
        }
        public java.util.List<String> getPunishmentTypes() {
            return this.punishmentTypes;
        }

        public SubmitAICoachDebugRequestDeductionRule setRuleValue(String ruleValue) {
            this.ruleValue = ruleValue;
            return this;
        }
        public String getRuleValue() {
            return this.ruleValue;
        }

        public SubmitAICoachDebugRequestDeductionRule setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class SubmitAICoachDebugRequestDialogueList extends TeaModel {
        @NameInMap("message")
        public String message;

        @NameInMap("role")
        public String role;

        public static SubmitAICoachDebugRequestDialogueList build(java.util.Map<String, ?> map) throws Exception {
            SubmitAICoachDebugRequestDialogueList self = new SubmitAICoachDebugRequestDialogueList();
            return TeaModel.build(map, self);
        }

        public SubmitAICoachDebugRequestDialogueList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SubmitAICoachDebugRequestDialogueList setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class SubmitAICoachDebugRequestExpressiveness extends TeaModel {
        @NameInMap("desc")
        public String desc;

        @NameInMap("expressivenessId")
        public String expressivenessId;

        @NameInMap("name")
        public String name;

        @NameInMap("rule")
        public String rule;

        public static SubmitAICoachDebugRequestExpressiveness build(java.util.Map<String, ?> map) throws Exception {
            SubmitAICoachDebugRequestExpressiveness self = new SubmitAICoachDebugRequestExpressiveness();
            return TeaModel.build(map, self);
        }

        public SubmitAICoachDebugRequestExpressiveness setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public SubmitAICoachDebugRequestExpressiveness setExpressivenessId(String expressivenessId) {
            this.expressivenessId = expressivenessId;
            return this;
        }
        public String getExpressivenessId() {
            return this.expressivenessId;
        }

        public SubmitAICoachDebugRequestExpressiveness setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SubmitAICoachDebugRequestExpressiveness setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

    }

    public static class SubmitAICoachDebugRequestPointAnswerListAnswerValuesKeywordValues extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("weight")
        public Long weight;

        public static SubmitAICoachDebugRequestPointAnswerListAnswerValuesKeywordValues build(java.util.Map<String, ?> map) throws Exception {
            SubmitAICoachDebugRequestPointAnswerListAnswerValuesKeywordValues self = new SubmitAICoachDebugRequestPointAnswerListAnswerValuesKeywordValues();
            return TeaModel.build(map, self);
        }

        public SubmitAICoachDebugRequestPointAnswerListAnswerValuesKeywordValues setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SubmitAICoachDebugRequestPointAnswerListAnswerValuesKeywordValues setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

    }

    public static class SubmitAICoachDebugRequestPointAnswerListAnswerValuesScoringRules extends TeaModel {
        @NameInMap("name")
        public String name;

        public static SubmitAICoachDebugRequestPointAnswerListAnswerValuesScoringRules build(java.util.Map<String, ?> map) throws Exception {
            SubmitAICoachDebugRequestPointAnswerListAnswerValuesScoringRules self = new SubmitAICoachDebugRequestPointAnswerListAnswerValuesScoringRules();
            return TeaModel.build(map, self);
        }

        public SubmitAICoachDebugRequestPointAnswerListAnswerValuesScoringRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class SubmitAICoachDebugRequestPointAnswerListAnswerValues extends TeaModel {
        @NameInMap("answerName")
        public String answerName;

        @NameInMap("answerWeight")
        public Long answerWeight;

        @NameInMap("keywordValues")
        public java.util.List<SubmitAICoachDebugRequestPointAnswerListAnswerValuesKeywordValues> keywordValues;

        @NameInMap("keywordWeight")
        public Long keywordWeight;

        @NameInMap("scoringRules")
        public java.util.List<SubmitAICoachDebugRequestPointAnswerListAnswerValuesScoringRules> scoringRules;

        public static SubmitAICoachDebugRequestPointAnswerListAnswerValues build(java.util.Map<String, ?> map) throws Exception {
            SubmitAICoachDebugRequestPointAnswerListAnswerValues self = new SubmitAICoachDebugRequestPointAnswerListAnswerValues();
            return TeaModel.build(map, self);
        }

        public SubmitAICoachDebugRequestPointAnswerListAnswerValues setAnswerName(String answerName) {
            this.answerName = answerName;
            return this;
        }
        public String getAnswerName() {
            return this.answerName;
        }

        public SubmitAICoachDebugRequestPointAnswerListAnswerValues setAnswerWeight(Long answerWeight) {
            this.answerWeight = answerWeight;
            return this;
        }
        public Long getAnswerWeight() {
            return this.answerWeight;
        }

        public SubmitAICoachDebugRequestPointAnswerListAnswerValues setKeywordValues(java.util.List<SubmitAICoachDebugRequestPointAnswerListAnswerValuesKeywordValues> keywordValues) {
            this.keywordValues = keywordValues;
            return this;
        }
        public java.util.List<SubmitAICoachDebugRequestPointAnswerListAnswerValuesKeywordValues> getKeywordValues() {
            return this.keywordValues;
        }

        public SubmitAICoachDebugRequestPointAnswerListAnswerValues setKeywordWeight(Long keywordWeight) {
            this.keywordWeight = keywordWeight;
            return this;
        }
        public Long getKeywordWeight() {
            return this.keywordWeight;
        }

        public SubmitAICoachDebugRequestPointAnswerListAnswerValues setScoringRules(java.util.List<SubmitAICoachDebugRequestPointAnswerListAnswerValuesScoringRules> scoringRules) {
            this.scoringRules = scoringRules;
            return this;
        }
        public java.util.List<SubmitAICoachDebugRequestPointAnswerListAnswerValuesScoringRules> getScoringRules() {
            return this.scoringRules;
        }

    }

    public static class SubmitAICoachDebugRequestPointAnswerListParameters extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("value")
        public String value;

        public static SubmitAICoachDebugRequestPointAnswerListParameters build(java.util.Map<String, ?> map) throws Exception {
            SubmitAICoachDebugRequestPointAnswerListParameters self = new SubmitAICoachDebugRequestPointAnswerListParameters();
            return TeaModel.build(map, self);
        }

        public SubmitAICoachDebugRequestPointAnswerListParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SubmitAICoachDebugRequestPointAnswerListParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SubmitAICoachDebugRequestPointAnswerList extends TeaModel {
        @NameInMap("answerValues")
        public java.util.List<SubmitAICoachDebugRequestPointAnswerListAnswerValues> answerValues;

        @NameInMap("enabledKeyword")
        public Boolean enabledKeyword;

        @NameInMap("nameList")
        public java.util.List<String> nameList;

        @NameInMap("operators")
        public String operators;

        @NameInMap("parameters")
        public java.util.List<SubmitAICoachDebugRequestPointAnswerListParameters> parameters;

        @NameInMap("score")
        public Long score;

        @NameInMap("type")
        public String type;

        @NameInMap("weight")
        public Long weight;

        public static SubmitAICoachDebugRequestPointAnswerList build(java.util.Map<String, ?> map) throws Exception {
            SubmitAICoachDebugRequestPointAnswerList self = new SubmitAICoachDebugRequestPointAnswerList();
            return TeaModel.build(map, self);
        }

        public SubmitAICoachDebugRequestPointAnswerList setAnswerValues(java.util.List<SubmitAICoachDebugRequestPointAnswerListAnswerValues> answerValues) {
            this.answerValues = answerValues;
            return this;
        }
        public java.util.List<SubmitAICoachDebugRequestPointAnswerListAnswerValues> getAnswerValues() {
            return this.answerValues;
        }

        public SubmitAICoachDebugRequestPointAnswerList setEnabledKeyword(Boolean enabledKeyword) {
            this.enabledKeyword = enabledKeyword;
            return this;
        }
        public Boolean getEnabledKeyword() {
            return this.enabledKeyword;
        }

        public SubmitAICoachDebugRequestPointAnswerList setNameList(java.util.List<String> nameList) {
            this.nameList = nameList;
            return this;
        }
        public java.util.List<String> getNameList() {
            return this.nameList;
        }

        public SubmitAICoachDebugRequestPointAnswerList setOperators(String operators) {
            this.operators = operators;
            return this;
        }
        public String getOperators() {
            return this.operators;
        }

        public SubmitAICoachDebugRequestPointAnswerList setParameters(java.util.List<SubmitAICoachDebugRequestPointAnswerListParameters> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<SubmitAICoachDebugRequestPointAnswerListParameters> getParameters() {
            return this.parameters;
        }

        public SubmitAICoachDebugRequestPointAnswerList setScore(Long score) {
            this.score = score;
            return this;
        }
        public Long getScore() {
            return this.score;
        }

        public SubmitAICoachDebugRequestPointAnswerList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SubmitAICoachDebugRequestPointAnswerList setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

    }

    public static class SubmitAICoachDebugRequestPoint extends TeaModel {
        @NameInMap("answerList")
        public java.util.List<SubmitAICoachDebugRequestPointAnswerList> answerList;

        @NameInMap("knowledgeList")
        public java.util.List<String> knowledgeList;

        @NameInMap("name")
        public String name;

        @NameInMap("questionSample")
        public String questionSample;

        @NameInMap("weight")
        public Long weight;

        public static SubmitAICoachDebugRequestPoint build(java.util.Map<String, ?> map) throws Exception {
            SubmitAICoachDebugRequestPoint self = new SubmitAICoachDebugRequestPoint();
            return TeaModel.build(map, self);
        }

        public SubmitAICoachDebugRequestPoint setAnswerList(java.util.List<SubmitAICoachDebugRequestPointAnswerList> answerList) {
            this.answerList = answerList;
            return this;
        }
        public java.util.List<SubmitAICoachDebugRequestPointAnswerList> getAnswerList() {
            return this.answerList;
        }

        public SubmitAICoachDebugRequestPoint setKnowledgeList(java.util.List<String> knowledgeList) {
            this.knowledgeList = knowledgeList;
            return this;
        }
        public java.util.List<String> getKnowledgeList() {
            return this.knowledgeList;
        }

        public SubmitAICoachDebugRequestPoint setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SubmitAICoachDebugRequestPoint setQuestionSample(String questionSample) {
            this.questionSample = questionSample;
            return this;
        }
        public String getQuestionSample() {
            return this.questionSample;
        }

        public SubmitAICoachDebugRequestPoint setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

    }

}
