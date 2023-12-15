// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class CreateKnowledgeRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("Knowledge")
    public CreateKnowledgeRequestKnowledge knowledge;

    public static CreateKnowledgeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeRequest self = new CreateKnowledgeRequest();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreateKnowledgeRequest setKnowledge(CreateKnowledgeRequestKnowledge knowledge) {
        this.knowledge = knowledge;
        return this;
    }
    public CreateKnowledgeRequestKnowledge getKnowledge() {
        return this.knowledge;
    }

    public static class CreateKnowledgeRequestKnowledgeOutlines extends TeaModel {
        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        @NameInMap("OutlineId")
        public Long outlineId;

        @NameInMap("Title")
        public String title;

        public static CreateKnowledgeRequestKnowledgeOutlines build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeRequestKnowledgeOutlines self = new CreateKnowledgeRequestKnowledgeOutlines();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeRequestKnowledgeOutlines setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public CreateKnowledgeRequestKnowledgeOutlines setOutlineId(Long outlineId) {
            this.outlineId = outlineId;
            return this;
        }
        public Long getOutlineId() {
            return this.outlineId;
        }

        public CreateKnowledgeRequestKnowledgeOutlines setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class CreateKnowledgeRequestKnowledgeSimQuestions extends TeaModel {
        @NameInMap("Title")
        public String title;

        public static CreateKnowledgeRequestKnowledgeSimQuestions build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeRequestKnowledgeSimQuestions self = new CreateKnowledgeRequestKnowledgeSimQuestions();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeRequestKnowledgeSimQuestions setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class CreateKnowledgeRequestKnowledgeSolutions extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("PerspectiveIds")
        public java.util.List<String> perspectiveIds;

        @NameInMap("PlainText")
        public String plainText;

        public static CreateKnowledgeRequestKnowledgeSolutions build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeRequestKnowledgeSolutions self = new CreateKnowledgeRequestKnowledgeSolutions();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeRequestKnowledgeSolutions setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateKnowledgeRequestKnowledgeSolutions setPerspectiveIds(java.util.List<String> perspectiveIds) {
            this.perspectiveIds = perspectiveIds;
            return this;
        }
        public java.util.List<String> getPerspectiveIds() {
            return this.perspectiveIds;
        }

        public CreateKnowledgeRequestKnowledgeSolutions setPlainText(String plainText) {
            this.plainText = plainText;
            return this;
        }
        public String getPlainText() {
            return this.plainText;
        }

    }

    public static class CreateKnowledgeRequestKnowledge extends TeaModel {
        @NameInMap("CategoryId")
        public Long categoryId;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("KnowledgeTitle")
        public String knowledgeTitle;

        @NameInMap("KnowledgeType")
        public Integer knowledgeType;

        @NameInMap("Outlines")
        public java.util.List<CreateKnowledgeRequestKnowledgeOutlines> outlines;

        @NameInMap("SimQuestions")
        public java.util.List<CreateKnowledgeRequestKnowledgeSimQuestions> simQuestions;

        @NameInMap("Solutions")
        public java.util.List<CreateKnowledgeRequestKnowledgeSolutions> solutions;

        @NameInMap("StartDate")
        public String startDate;

        public static CreateKnowledgeRequestKnowledge build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeRequestKnowledge self = new CreateKnowledgeRequestKnowledge();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeRequestKnowledge setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public CreateKnowledgeRequestKnowledge setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public CreateKnowledgeRequestKnowledge setKnowledgeTitle(String knowledgeTitle) {
            this.knowledgeTitle = knowledgeTitle;
            return this;
        }
        public String getKnowledgeTitle() {
            return this.knowledgeTitle;
        }

        public CreateKnowledgeRequestKnowledge setKnowledgeType(Integer knowledgeType) {
            this.knowledgeType = knowledgeType;
            return this;
        }
        public Integer getKnowledgeType() {
            return this.knowledgeType;
        }

        public CreateKnowledgeRequestKnowledge setOutlines(java.util.List<CreateKnowledgeRequestKnowledgeOutlines> outlines) {
            this.outlines = outlines;
            return this;
        }
        public java.util.List<CreateKnowledgeRequestKnowledgeOutlines> getOutlines() {
            return this.outlines;
        }

        public CreateKnowledgeRequestKnowledge setSimQuestions(java.util.List<CreateKnowledgeRequestKnowledgeSimQuestions> simQuestions) {
            this.simQuestions = simQuestions;
            return this;
        }
        public java.util.List<CreateKnowledgeRequestKnowledgeSimQuestions> getSimQuestions() {
            return this.simQuestions;
        }

        public CreateKnowledgeRequestKnowledge setSolutions(java.util.List<CreateKnowledgeRequestKnowledgeSolutions> solutions) {
            this.solutions = solutions;
            return this;
        }
        public java.util.List<CreateKnowledgeRequestKnowledgeSolutions> getSolutions() {
            return this.solutions;
        }

        public CreateKnowledgeRequestKnowledge setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

    }

}
