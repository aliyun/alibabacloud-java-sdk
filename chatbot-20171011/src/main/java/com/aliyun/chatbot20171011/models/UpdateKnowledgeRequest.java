// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("Knowledge")
    public UpdateKnowledgeRequestKnowledge knowledge;

    public static UpdateKnowledgeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeRequest self = new UpdateKnowledgeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateKnowledgeRequest setKnowledge(UpdateKnowledgeRequestKnowledge knowledge) {
        this.knowledge = knowledge;
        return this;
    }
    public UpdateKnowledgeRequestKnowledge getKnowledge() {
        return this.knowledge;
    }

    public static class UpdateKnowledgeRequestKnowledgeOutlines extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        @NameInMap("OutlineId")
        public Long outlineId;

        @NameInMap("Title")
        public String title;

        public static UpdateKnowledgeRequestKnowledgeOutlines build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeRequestKnowledgeOutlines self = new UpdateKnowledgeRequestKnowledgeOutlines();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeRequestKnowledgeOutlines setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public UpdateKnowledgeRequestKnowledgeOutlines setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public UpdateKnowledgeRequestKnowledgeOutlines setOutlineId(Long outlineId) {
            this.outlineId = outlineId;
            return this;
        }
        public Long getOutlineId() {
            return this.outlineId;
        }

        public UpdateKnowledgeRequestKnowledgeOutlines setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class UpdateKnowledgeRequestKnowledgeSimQuestions extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("SimQuestionId")
        public Long simQuestionId;

        @NameInMap("Title")
        public String title;

        public static UpdateKnowledgeRequestKnowledgeSimQuestions build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeRequestKnowledgeSimQuestions self = new UpdateKnowledgeRequestKnowledgeSimQuestions();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeRequestKnowledgeSimQuestions setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public UpdateKnowledgeRequestKnowledgeSimQuestions setSimQuestionId(Long simQuestionId) {
            this.simQuestionId = simQuestionId;
            return this;
        }
        public Long getSimQuestionId() {
            return this.simQuestionId;
        }

        public UpdateKnowledgeRequestKnowledgeSimQuestions setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class UpdateKnowledgeRequestKnowledgeSolutions extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("Content")
        public String content;

        @NameInMap("PerspectiveIds")
        public java.util.List<String> perspectiveIds;

        @NameInMap("PlainText")
        public String plainText;

        @NameInMap("SolutionId")
        public Long solutionId;

        public static UpdateKnowledgeRequestKnowledgeSolutions build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeRequestKnowledgeSolutions self = new UpdateKnowledgeRequestKnowledgeSolutions();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeRequestKnowledgeSolutions setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public UpdateKnowledgeRequestKnowledgeSolutions setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateKnowledgeRequestKnowledgeSolutions setPerspectiveIds(java.util.List<String> perspectiveIds) {
            this.perspectiveIds = perspectiveIds;
            return this;
        }
        public java.util.List<String> getPerspectiveIds() {
            return this.perspectiveIds;
        }

        public UpdateKnowledgeRequestKnowledgeSolutions setPlainText(String plainText) {
            this.plainText = plainText;
            return this;
        }
        public String getPlainText() {
            return this.plainText;
        }

        public UpdateKnowledgeRequestKnowledgeSolutions setSolutionId(Long solutionId) {
            this.solutionId = solutionId;
            return this;
        }
        public Long getSolutionId() {
            return this.solutionId;
        }

    }

    public static class UpdateKnowledgeRequestKnowledge extends TeaModel {
        @NameInMap("CategoryId")
        public Long categoryId;

        @NameInMap("EndDate")
        public String endDate;

        /**
         * <p>FAQ ID</p>
         */
        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        @NameInMap("KnowledgeTitle")
        public String knowledgeTitle;

        @NameInMap("KnowledgeType")
        public Integer knowledgeType;

        @NameInMap("Outlines")
        public java.util.List<UpdateKnowledgeRequestKnowledgeOutlines> outlines;

        @NameInMap("SimQuestions")
        public java.util.List<UpdateKnowledgeRequestKnowledgeSimQuestions> simQuestions;

        @NameInMap("Solutions")
        public java.util.List<UpdateKnowledgeRequestKnowledgeSolutions> solutions;

        @NameInMap("StartDate")
        public String startDate;

        public static UpdateKnowledgeRequestKnowledge build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeRequestKnowledge self = new UpdateKnowledgeRequestKnowledge();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeRequestKnowledge setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public UpdateKnowledgeRequestKnowledge setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public UpdateKnowledgeRequestKnowledge setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public UpdateKnowledgeRequestKnowledge setKnowledgeTitle(String knowledgeTitle) {
            this.knowledgeTitle = knowledgeTitle;
            return this;
        }
        public String getKnowledgeTitle() {
            return this.knowledgeTitle;
        }

        public UpdateKnowledgeRequestKnowledge setKnowledgeType(Integer knowledgeType) {
            this.knowledgeType = knowledgeType;
            return this;
        }
        public Integer getKnowledgeType() {
            return this.knowledgeType;
        }

        public UpdateKnowledgeRequestKnowledge setOutlines(java.util.List<UpdateKnowledgeRequestKnowledgeOutlines> outlines) {
            this.outlines = outlines;
            return this;
        }
        public java.util.List<UpdateKnowledgeRequestKnowledgeOutlines> getOutlines() {
            return this.outlines;
        }

        public UpdateKnowledgeRequestKnowledge setSimQuestions(java.util.List<UpdateKnowledgeRequestKnowledgeSimQuestions> simQuestions) {
            this.simQuestions = simQuestions;
            return this;
        }
        public java.util.List<UpdateKnowledgeRequestKnowledgeSimQuestions> getSimQuestions() {
            return this.simQuestions;
        }

        public UpdateKnowledgeRequestKnowledge setSolutions(java.util.List<UpdateKnowledgeRequestKnowledgeSolutions> solutions) {
            this.solutions = solutions;
            return this;
        }
        public java.util.List<UpdateKnowledgeRequestKnowledgeSolutions> getSolutions() {
            return this.solutions;
        }

        public UpdateKnowledgeRequestKnowledge setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

    }

}
