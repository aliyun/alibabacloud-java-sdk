// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DescribeKnowledgeResponseBody extends TeaModel {
    @NameInMap("CategoryId")
    public Long categoryId;

    @NameInMap("CoreWords")
    public java.util.List<String> coreWords;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CreateUserName")
    public String createUserName;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("KeyWords")
    public java.util.List<String> keyWords;

    /**
     * <p>FAQ ID</p>
     */
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    @NameInMap("KnowledgeStatus")
    public Integer knowledgeStatus;

    @NameInMap("KnowledgeTitle")
    public String knowledgeTitle;

    @NameInMap("KnowledgeType")
    public Integer knowledgeType;

    @NameInMap("ModifyTime")
    public String modifyTime;

    @NameInMap("ModifyUserName")
    public String modifyUserName;

    @NameInMap("Outlines")
    public java.util.List<DescribeKnowledgeResponseBodyOutlines> outlines;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SimQuestions")
    public java.util.List<DescribeKnowledgeResponseBodySimQuestions> simQuestions;

    @NameInMap("Solutions")
    public java.util.List<DescribeKnowledgeResponseBodySolutions> solutions;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("Version")
    public Integer version;

    public static DescribeKnowledgeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKnowledgeResponseBody self = new DescribeKnowledgeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKnowledgeResponseBody setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public DescribeKnowledgeResponseBody setCoreWords(java.util.List<String> coreWords) {
        this.coreWords = coreWords;
        return this;
    }
    public java.util.List<String> getCoreWords() {
        return this.coreWords;
    }

    public DescribeKnowledgeResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeKnowledgeResponseBody setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
        return this;
    }
    public String getCreateUserName() {
        return this.createUserName;
    }

    public DescribeKnowledgeResponseBody setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribeKnowledgeResponseBody setKeyWords(java.util.List<String> keyWords) {
        this.keyWords = keyWords;
        return this;
    }
    public java.util.List<String> getKeyWords() {
        return this.keyWords;
    }

    public DescribeKnowledgeResponseBody setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    public DescribeKnowledgeResponseBody setKnowledgeStatus(Integer knowledgeStatus) {
        this.knowledgeStatus = knowledgeStatus;
        return this;
    }
    public Integer getKnowledgeStatus() {
        return this.knowledgeStatus;
    }

    public DescribeKnowledgeResponseBody setKnowledgeTitle(String knowledgeTitle) {
        this.knowledgeTitle = knowledgeTitle;
        return this;
    }
    public String getKnowledgeTitle() {
        return this.knowledgeTitle;
    }

    public DescribeKnowledgeResponseBody setKnowledgeType(Integer knowledgeType) {
        this.knowledgeType = knowledgeType;
        return this;
    }
    public Integer getKnowledgeType() {
        return this.knowledgeType;
    }

    public DescribeKnowledgeResponseBody setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public DescribeKnowledgeResponseBody setModifyUserName(String modifyUserName) {
        this.modifyUserName = modifyUserName;
        return this;
    }
    public String getModifyUserName() {
        return this.modifyUserName;
    }

    public DescribeKnowledgeResponseBody setOutlines(java.util.List<DescribeKnowledgeResponseBodyOutlines> outlines) {
        this.outlines = outlines;
        return this;
    }
    public java.util.List<DescribeKnowledgeResponseBodyOutlines> getOutlines() {
        return this.outlines;
    }

    public DescribeKnowledgeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeKnowledgeResponseBody setSimQuestions(java.util.List<DescribeKnowledgeResponseBodySimQuestions> simQuestions) {
        this.simQuestions = simQuestions;
        return this;
    }
    public java.util.List<DescribeKnowledgeResponseBodySimQuestions> getSimQuestions() {
        return this.simQuestions;
    }

    public DescribeKnowledgeResponseBody setSolutions(java.util.List<DescribeKnowledgeResponseBodySolutions> solutions) {
        this.solutions = solutions;
        return this;
    }
    public java.util.List<DescribeKnowledgeResponseBodySolutions> getSolutions() {
        return this.solutions;
    }

    public DescribeKnowledgeResponseBody setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public DescribeKnowledgeResponseBody setVersion(Integer version) {
        this.version = version;
        return this;
    }
    public Integer getVersion() {
        return this.version;
    }

    public static class DescribeKnowledgeResponseBodyOutlines extends TeaModel {
        /**
         * <p>FAQ ID</p>
         */
        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        @NameInMap("OutlineId")
        public Long outlineId;

        @NameInMap("Title")
        public String title;

        public static DescribeKnowledgeResponseBodyOutlines build(java.util.Map<String, ?> map) throws Exception {
            DescribeKnowledgeResponseBodyOutlines self = new DescribeKnowledgeResponseBodyOutlines();
            return TeaModel.build(map, self);
        }

        public DescribeKnowledgeResponseBodyOutlines setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public DescribeKnowledgeResponseBodyOutlines setOutlineId(Long outlineId) {
            this.outlineId = outlineId;
            return this;
        }
        public Long getOutlineId() {
            return this.outlineId;
        }

        public DescribeKnowledgeResponseBodyOutlines setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class DescribeKnowledgeResponseBodySimQuestions extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("SimQuestionId")
        public Long simQuestionId;

        @NameInMap("Title")
        public String title;

        public static DescribeKnowledgeResponseBodySimQuestions build(java.util.Map<String, ?> map) throws Exception {
            DescribeKnowledgeResponseBodySimQuestions self = new DescribeKnowledgeResponseBodySimQuestions();
            return TeaModel.build(map, self);
        }

        public DescribeKnowledgeResponseBodySimQuestions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeKnowledgeResponseBodySimQuestions setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public DescribeKnowledgeResponseBodySimQuestions setSimQuestionId(Long simQuestionId) {
            this.simQuestionId = simQuestionId;
            return this;
        }
        public Long getSimQuestionId() {
            return this.simQuestionId;
        }

        public DescribeKnowledgeResponseBodySimQuestions setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class DescribeKnowledgeResponseBodySolutions extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("PerspectiveIds")
        public java.util.List<String> perspectiveIds;

        @NameInMap("PlainText")
        public String plainText;

        @NameInMap("SolutionId")
        public Long solutionId;

        @NameInMap("Summary")
        public String summary;

        public static DescribeKnowledgeResponseBodySolutions build(java.util.Map<String, ?> map) throws Exception {
            DescribeKnowledgeResponseBodySolutions self = new DescribeKnowledgeResponseBodySolutions();
            return TeaModel.build(map, self);
        }

        public DescribeKnowledgeResponseBodySolutions setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeKnowledgeResponseBodySolutions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeKnowledgeResponseBodySolutions setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public DescribeKnowledgeResponseBodySolutions setPerspectiveIds(java.util.List<String> perspectiveIds) {
            this.perspectiveIds = perspectiveIds;
            return this;
        }
        public java.util.List<String> getPerspectiveIds() {
            return this.perspectiveIds;
        }

        public DescribeKnowledgeResponseBodySolutions setPlainText(String plainText) {
            this.plainText = plainText;
            return this;
        }
        public String getPlainText() {
            return this.plainText;
        }

        public DescribeKnowledgeResponseBodySolutions setSolutionId(Long solutionId) {
            this.solutionId = solutionId;
            return this;
        }
        public Long getSolutionId() {
            return this.solutionId;
        }

        public DescribeKnowledgeResponseBodySolutions setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

    }

}
