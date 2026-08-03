// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class GetAICoachAssessmentPointResponseBody extends TeaModel {
    @NameInMap("answerList")
    public java.util.List<GetAICoachAssessmentPointResponseBodyAnswerList> answerList;

    @NameInMap("citations")
    public Integer citations;

    @NameInMap("documentId")
    public String documentId;

    @NameInMap("documentName")
    public String documentName;

    @NameInMap("gmtCreate")
    public String gmtCreate;

    @NameInMap("gmtModified")
    public String gmtModified;

    @NameInMap("kbId")
    public String kbId;

    @NameInMap("kbType")
    public String kbType;

    @NameInMap("knowledgeList")
    public java.util.List<String> knowledgeList;

    @NameInMap("name")
    public String name;

    @NameInMap("pointId")
    public String pointId;

    @NameInMap("questionDescription")
    public String questionDescription;

    @NameInMap("questionSample")
    public String questionSample;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("status")
    public String status;

    public static GetAICoachAssessmentPointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAICoachAssessmentPointResponseBody self = new GetAICoachAssessmentPointResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAICoachAssessmentPointResponseBody setAnswerList(java.util.List<GetAICoachAssessmentPointResponseBodyAnswerList> answerList) {
        this.answerList = answerList;
        return this;
    }
    public java.util.List<GetAICoachAssessmentPointResponseBodyAnswerList> getAnswerList() {
        return this.answerList;
    }

    public GetAICoachAssessmentPointResponseBody setCitations(Integer citations) {
        this.citations = citations;
        return this;
    }
    public Integer getCitations() {
        return this.citations;
    }

    public GetAICoachAssessmentPointResponseBody setDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }
    public String getDocumentId() {
        return this.documentId;
    }

    public GetAICoachAssessmentPointResponseBody setDocumentName(String documentName) {
        this.documentName = documentName;
        return this;
    }
    public String getDocumentName() {
        return this.documentName;
    }

    public GetAICoachAssessmentPointResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public GetAICoachAssessmentPointResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public GetAICoachAssessmentPointResponseBody setKbId(String kbId) {
        this.kbId = kbId;
        return this;
    }
    public String getKbId() {
        return this.kbId;
    }

    public GetAICoachAssessmentPointResponseBody setKbType(String kbType) {
        this.kbType = kbType;
        return this;
    }
    public String getKbType() {
        return this.kbType;
    }

    public GetAICoachAssessmentPointResponseBody setKnowledgeList(java.util.List<String> knowledgeList) {
        this.knowledgeList = knowledgeList;
        return this;
    }
    public java.util.List<String> getKnowledgeList() {
        return this.knowledgeList;
    }

    public GetAICoachAssessmentPointResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetAICoachAssessmentPointResponseBody setPointId(String pointId) {
        this.pointId = pointId;
        return this;
    }
    public String getPointId() {
        return this.pointId;
    }

    public GetAICoachAssessmentPointResponseBody setQuestionDescription(String questionDescription) {
        this.questionDescription = questionDescription;
        return this;
    }
    public String getQuestionDescription() {
        return this.questionDescription;
    }

    public GetAICoachAssessmentPointResponseBody setQuestionSample(String questionSample) {
        this.questionSample = questionSample;
        return this;
    }
    public String getQuestionSample() {
        return this.questionSample;
    }

    public GetAICoachAssessmentPointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAICoachAssessmentPointResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class GetAICoachAssessmentPointResponseBodyAnswerListAnswerValuesKeywordValues extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("weight")
        public Integer weight;

        public static GetAICoachAssessmentPointResponseBodyAnswerListAnswerValuesKeywordValues build(java.util.Map<String, ?> map) throws Exception {
            GetAICoachAssessmentPointResponseBodyAnswerListAnswerValuesKeywordValues self = new GetAICoachAssessmentPointResponseBodyAnswerListAnswerValuesKeywordValues();
            return TeaModel.build(map, self);
        }

        public GetAICoachAssessmentPointResponseBodyAnswerListAnswerValuesKeywordValues setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAICoachAssessmentPointResponseBodyAnswerListAnswerValuesKeywordValues setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class GetAICoachAssessmentPointResponseBodyAnswerListAnswerValuesScoringRules extends TeaModel {
        @NameInMap("name")
        public String name;

        public static GetAICoachAssessmentPointResponseBodyAnswerListAnswerValuesScoringRules build(java.util.Map<String, ?> map) throws Exception {
            GetAICoachAssessmentPointResponseBodyAnswerListAnswerValuesScoringRules self = new GetAICoachAssessmentPointResponseBodyAnswerListAnswerValuesScoringRules();
            return TeaModel.build(map, self);
        }

        public GetAICoachAssessmentPointResponseBodyAnswerListAnswerValuesScoringRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetAICoachAssessmentPointResponseBodyAnswerListAnswerValues extends TeaModel {
        @NameInMap("answerName")
        public String answerName;

        @NameInMap("answerWeight")
        public Integer answerWeight;

        @NameInMap("keywordValues")
        public java.util.List<GetAICoachAssessmentPointResponseBodyAnswerListAnswerValuesKeywordValues> keywordValues;

        @NameInMap("keywordWeight")
        public Integer keywordWeight;

        @NameInMap("scoringRules")
        public java.util.List<GetAICoachAssessmentPointResponseBodyAnswerListAnswerValuesScoringRules> scoringRules;

        public static GetAICoachAssessmentPointResponseBodyAnswerListAnswerValues build(java.util.Map<String, ?> map) throws Exception {
            GetAICoachAssessmentPointResponseBodyAnswerListAnswerValues self = new GetAICoachAssessmentPointResponseBodyAnswerListAnswerValues();
            return TeaModel.build(map, self);
        }

        public GetAICoachAssessmentPointResponseBodyAnswerListAnswerValues setAnswerName(String answerName) {
            this.answerName = answerName;
            return this;
        }
        public String getAnswerName() {
            return this.answerName;
        }

        public GetAICoachAssessmentPointResponseBodyAnswerListAnswerValues setAnswerWeight(Integer answerWeight) {
            this.answerWeight = answerWeight;
            return this;
        }
        public Integer getAnswerWeight() {
            return this.answerWeight;
        }

        public GetAICoachAssessmentPointResponseBodyAnswerListAnswerValues setKeywordValues(java.util.List<GetAICoachAssessmentPointResponseBodyAnswerListAnswerValuesKeywordValues> keywordValues) {
            this.keywordValues = keywordValues;
            return this;
        }
        public java.util.List<GetAICoachAssessmentPointResponseBodyAnswerListAnswerValuesKeywordValues> getKeywordValues() {
            return this.keywordValues;
        }

        public GetAICoachAssessmentPointResponseBodyAnswerListAnswerValues setKeywordWeight(Integer keywordWeight) {
            this.keywordWeight = keywordWeight;
            return this;
        }
        public Integer getKeywordWeight() {
            return this.keywordWeight;
        }

        public GetAICoachAssessmentPointResponseBodyAnswerListAnswerValues setScoringRules(java.util.List<GetAICoachAssessmentPointResponseBodyAnswerListAnswerValuesScoringRules> scoringRules) {
            this.scoringRules = scoringRules;
            return this;
        }
        public java.util.List<GetAICoachAssessmentPointResponseBodyAnswerListAnswerValuesScoringRules> getScoringRules() {
            return this.scoringRules;
        }

    }

    public static class GetAICoachAssessmentPointResponseBodyAnswerListParameters extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("value")
        public String value;

        public static GetAICoachAssessmentPointResponseBodyAnswerListParameters build(java.util.Map<String, ?> map) throws Exception {
            GetAICoachAssessmentPointResponseBodyAnswerListParameters self = new GetAICoachAssessmentPointResponseBodyAnswerListParameters();
            return TeaModel.build(map, self);
        }

        public GetAICoachAssessmentPointResponseBodyAnswerListParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAICoachAssessmentPointResponseBodyAnswerListParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetAICoachAssessmentPointResponseBodyAnswerList extends TeaModel {
        @NameInMap("answerValues")
        public java.util.List<GetAICoachAssessmentPointResponseBodyAnswerListAnswerValues> answerValues;

        @NameInMap("enabledKeyword")
        public Boolean enabledKeyword;

        @NameInMap("nameList")
        public java.util.List<String> nameList;

        @NameInMap("operators")
        public String operators;

        @NameInMap("parameters")
        public java.util.List<GetAICoachAssessmentPointResponseBodyAnswerListParameters> parameters;

        @NameInMap("type")
        public String type;

        @NameInMap("weight")
        public Integer weight;

        public static GetAICoachAssessmentPointResponseBodyAnswerList build(java.util.Map<String, ?> map) throws Exception {
            GetAICoachAssessmentPointResponseBodyAnswerList self = new GetAICoachAssessmentPointResponseBodyAnswerList();
            return TeaModel.build(map, self);
        }

        public GetAICoachAssessmentPointResponseBodyAnswerList setAnswerValues(java.util.List<GetAICoachAssessmentPointResponseBodyAnswerListAnswerValues> answerValues) {
            this.answerValues = answerValues;
            return this;
        }
        public java.util.List<GetAICoachAssessmentPointResponseBodyAnswerListAnswerValues> getAnswerValues() {
            return this.answerValues;
        }

        public GetAICoachAssessmentPointResponseBodyAnswerList setEnabledKeyword(Boolean enabledKeyword) {
            this.enabledKeyword = enabledKeyword;
            return this;
        }
        public Boolean getEnabledKeyword() {
            return this.enabledKeyword;
        }

        public GetAICoachAssessmentPointResponseBodyAnswerList setNameList(java.util.List<String> nameList) {
            this.nameList = nameList;
            return this;
        }
        public java.util.List<String> getNameList() {
            return this.nameList;
        }

        public GetAICoachAssessmentPointResponseBodyAnswerList setOperators(String operators) {
            this.operators = operators;
            return this;
        }
        public String getOperators() {
            return this.operators;
        }

        public GetAICoachAssessmentPointResponseBodyAnswerList setParameters(java.util.List<GetAICoachAssessmentPointResponseBodyAnswerListParameters> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<GetAICoachAssessmentPointResponseBodyAnswerListParameters> getParameters() {
            return this.parameters;
        }

        public GetAICoachAssessmentPointResponseBodyAnswerList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetAICoachAssessmentPointResponseBodyAnswerList setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

}
