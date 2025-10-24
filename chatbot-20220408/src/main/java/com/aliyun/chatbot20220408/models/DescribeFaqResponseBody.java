// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DescribeFaqResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>30000055617</p>
     */
    @NameInMap("CategoryId")
    public Long categoryId;

    /**
     * <strong>example:</strong>
     * <p>2020-11-30T03:03:37Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>test01</p>
     */
    @NameInMap("CreateUserName")
    public String createUserName;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("EffectStatus")
    public Integer effectStatus;

    /**
     * <strong>example:</strong>
     * <p>2023-04-27T06:08:54Z</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <strong>example:</strong>
     * <p>30001979424</p>
     */
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    /**
     * <strong>example:</strong>
     * <p>2020-12-02T06:35:50Z</p>
     */
    @NameInMap("ModifyTime")
    public String modifyTime;

    /**
     * <strong>example:</strong>
     * <p>test01</p>
     */
    @NameInMap("ModifyUserName")
    public String modifyUserName;

    @NameInMap("Outlines")
    public java.util.List<DescribeFaqResponseBodyOutlines> outlines;

    /**
     * <strong>example:</strong>
     * <p>8AD9FA10-7780-5E12-B701-13C928524F32</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SimQuestions")
    public java.util.List<DescribeFaqResponseBodySimQuestions> simQuestions;

    @NameInMap("Solutions")
    public java.util.List<DescribeFaqResponseBodySolutions> solutions;

    /**
     * <strong>example:</strong>
     * <p>2022-04-27T07:04:39Z</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Status")
    public Integer status;

    @NameInMap("TagIdList")
    public java.util.List<Long> tagIdList;

    @NameInMap("Title")
    public String title;

    public static DescribeFaqResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaqResponseBody self = new DescribeFaqResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFaqResponseBody setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public DescribeFaqResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeFaqResponseBody setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
        return this;
    }
    public String getCreateUserName() {
        return this.createUserName;
    }

    public DescribeFaqResponseBody setEffectStatus(Integer effectStatus) {
        this.effectStatus = effectStatus;
        return this;
    }
    public Integer getEffectStatus() {
        return this.effectStatus;
    }

    public DescribeFaqResponseBody setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribeFaqResponseBody setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    public DescribeFaqResponseBody setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public DescribeFaqResponseBody setModifyUserName(String modifyUserName) {
        this.modifyUserName = modifyUserName;
        return this;
    }
    public String getModifyUserName() {
        return this.modifyUserName;
    }

    public DescribeFaqResponseBody setOutlines(java.util.List<DescribeFaqResponseBodyOutlines> outlines) {
        this.outlines = outlines;
        return this;
    }
    public java.util.List<DescribeFaqResponseBodyOutlines> getOutlines() {
        return this.outlines;
    }

    public DescribeFaqResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFaqResponseBody setSimQuestions(java.util.List<DescribeFaqResponseBodySimQuestions> simQuestions) {
        this.simQuestions = simQuestions;
        return this;
    }
    public java.util.List<DescribeFaqResponseBodySimQuestions> getSimQuestions() {
        return this.simQuestions;
    }

    public DescribeFaqResponseBody setSolutions(java.util.List<DescribeFaqResponseBodySolutions> solutions) {
        this.solutions = solutions;
        return this;
    }
    public java.util.List<DescribeFaqResponseBodySolutions> getSolutions() {
        return this.solutions;
    }

    public DescribeFaqResponseBody setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public DescribeFaqResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public DescribeFaqResponseBody setTagIdList(java.util.List<Long> tagIdList) {
        this.tagIdList = tagIdList;
        return this;
    }
    public java.util.List<Long> getTagIdList() {
        return this.tagIdList;
    }

    public DescribeFaqResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public static class DescribeFaqResponseBodyOutlines extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1000098002</p>
         */
        @NameInMap("ConnQuestionId")
        public Long connQuestionId;

        /**
         * <strong>example:</strong>
         * <p>2022-05-26T10:24:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>2022-05-26T18:12:02Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <strong>example:</strong>
         * <p>797</p>
         */
        @NameInMap("OutlineId")
        public Long outlineId;

        @NameInMap("Title")
        public String title;

        public static DescribeFaqResponseBodyOutlines build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaqResponseBodyOutlines self = new DescribeFaqResponseBodyOutlines();
            return TeaModel.build(map, self);
        }

        public DescribeFaqResponseBodyOutlines setConnQuestionId(Long connQuestionId) {
            this.connQuestionId = connQuestionId;
            return this;
        }
        public Long getConnQuestionId() {
            return this.connQuestionId;
        }

        public DescribeFaqResponseBodyOutlines setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeFaqResponseBodyOutlines setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public DescribeFaqResponseBodyOutlines setOutlineId(Long outlineId) {
            this.outlineId = outlineId;
            return this;
        }
        public Long getOutlineId() {
            return this.outlineId;
        }

        public DescribeFaqResponseBodyOutlines setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class DescribeFaqResponseBodySimQuestions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-05-26T10:24:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>2022-05-29T03:55:07Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <strong>example:</strong>
         * <p>10000000581</p>
         */
        @NameInMap("SimQuestionId")
        public Long simQuestionId;

        @NameInMap("Title")
        public String title;

        public static DescribeFaqResponseBodySimQuestions build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaqResponseBodySimQuestions self = new DescribeFaqResponseBodySimQuestions();
            return TeaModel.build(map, self);
        }

        public DescribeFaqResponseBodySimQuestions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeFaqResponseBodySimQuestions setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public DescribeFaqResponseBodySimQuestions setSimQuestionId(Long simQuestionId) {
            this.simQuestionId = simQuestionId;
            return this;
        }
        public Long getSimQuestionId() {
            return this.simQuestionId;
        }

        public DescribeFaqResponseBodySimQuestions setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class DescribeFaqResponseBodySolutions extends TeaModel {
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ContentType")
        public Integer contentType;

        /**
         * <strong>example:</strong>
         * <p>2022-05-26T10:24:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>2022-05-29T07:07:13Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("PerspectiveCodes")
        public java.util.List<String> perspectiveCodes;

        @NameInMap("PlainText")
        public String plainText;

        /**
         * <strong>example:</strong>
         * <p>10000003071</p>
         */
        @NameInMap("SolutionId")
        public Long solutionId;

        public static DescribeFaqResponseBodySolutions build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaqResponseBodySolutions self = new DescribeFaqResponseBodySolutions();
            return TeaModel.build(map, self);
        }

        public DescribeFaqResponseBodySolutions setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeFaqResponseBodySolutions setContentType(Integer contentType) {
            this.contentType = contentType;
            return this;
        }
        public Integer getContentType() {
            return this.contentType;
        }

        public DescribeFaqResponseBodySolutions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeFaqResponseBodySolutions setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public DescribeFaqResponseBodySolutions setPerspectiveCodes(java.util.List<String> perspectiveCodes) {
            this.perspectiveCodes = perspectiveCodes;
            return this;
        }
        public java.util.List<String> getPerspectiveCodes() {
            return this.perspectiveCodes;
        }

        public DescribeFaqResponseBodySolutions setPlainText(String plainText) {
            this.plainText = plainText;
            return this;
        }
        public String getPlainText() {
            return this.plainText;
        }

        public DescribeFaqResponseBodySolutions setSolutionId(Long solutionId) {
            this.solutionId = solutionId;
            return this;
        }
        public Long getSolutionId() {
            return this.solutionId;
        }

    }

}
