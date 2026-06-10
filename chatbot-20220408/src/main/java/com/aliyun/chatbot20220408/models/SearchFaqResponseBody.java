// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class SearchFaqResponseBody extends TeaModel {
    /**
     * <p>The list of matching FAQs.</p>
     */
    @NameInMap("FaqHits")
    public java.util.List<SearchFaqResponseBodyFaqHits> faqHits;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E45491D5-7E0A-42C6-9B21-91D1066B1475</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of matched entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1075</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static SearchFaqResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchFaqResponseBody self = new SearchFaqResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchFaqResponseBody setFaqHits(java.util.List<SearchFaqResponseBodyFaqHits> faqHits) {
        this.faqHits = faqHits;
        return this;
    }
    public java.util.List<SearchFaqResponseBodyFaqHits> getFaqHits() {
        return this.faqHits;
    }

    public SearchFaqResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchFaqResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchFaqResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchFaqResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class SearchFaqResponseBodyFaqHits extends TeaModel {
        /**
         * <p>The category ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30000055639</p>
         */
        @NameInMap("CategoryId")
        public Long categoryId;

        /**
         * <p>The creation time (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-02T03:09:30Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The creator ID.</p>
         * 
         * <strong>example:</strong>
         * <p>18453</p>
         */
        @NameInMap("CreateUserId")
        public Long createUserId;

        /**
         * <p>The creator\&quot;s username.</p>
         * 
         * <strong>example:</strong>
         * <p>test01</p>
         */
        @NameInMap("CreateUserName")
        public String createUserName;

        /**
         * <p>The effective status of the FAQ. This status is determined by the StartDate and EndDate parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("EffectStatus")
        public Integer effectStatus;

        /**
         * <p>A list of matched similar titles.</p>
         */
        @NameInMap("HitSimilarTitles")
        public java.util.List<String> hitSimilarTitles;

        /**
         * <p>A list of matched answers.</p>
         */
        @NameInMap("HitSolutions")
        public java.util.List<String> hitSolutions;

        /**
         * <p>The FAQ ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30002145804</p>
         */
        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        /**
         * <p>The modification time (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-02T03:09:30Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The modifier ID.</p>
         * 
         * <strong>example:</strong>
         * <p>18453</p>
         */
        @NameInMap("ModifyUserId")
        public Long modifyUserId;

        /**
         * <p>The modifier\&quot;s username.</p>
         * 
         * <strong>example:</strong>
         * <p>test01</p>
         */
        @NameInMap("ModifyUserName")
        public String modifyUserName;

        /**
         * <p>The FAQ status.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The title of the FAQ.</p>
         * 
         * <strong>example:</strong>
         * <p>测试标题</p>
         */
        @NameInMap("Title")
        public String title;

        public static SearchFaqResponseBodyFaqHits build(java.util.Map<String, ?> map) throws Exception {
            SearchFaqResponseBodyFaqHits self = new SearchFaqResponseBodyFaqHits();
            return TeaModel.build(map, self);
        }

        public SearchFaqResponseBodyFaqHits setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public SearchFaqResponseBodyFaqHits setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SearchFaqResponseBodyFaqHits setCreateUserId(Long createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public Long getCreateUserId() {
            return this.createUserId;
        }

        public SearchFaqResponseBodyFaqHits setCreateUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }
        public String getCreateUserName() {
            return this.createUserName;
        }

        public SearchFaqResponseBodyFaqHits setEffectStatus(Integer effectStatus) {
            this.effectStatus = effectStatus;
            return this;
        }
        public Integer getEffectStatus() {
            return this.effectStatus;
        }

        public SearchFaqResponseBodyFaqHits setHitSimilarTitles(java.util.List<String> hitSimilarTitles) {
            this.hitSimilarTitles = hitSimilarTitles;
            return this;
        }
        public java.util.List<String> getHitSimilarTitles() {
            return this.hitSimilarTitles;
        }

        public SearchFaqResponseBodyFaqHits setHitSolutions(java.util.List<String> hitSolutions) {
            this.hitSolutions = hitSolutions;
            return this;
        }
        public java.util.List<String> getHitSolutions() {
            return this.hitSolutions;
        }

        public SearchFaqResponseBodyFaqHits setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public SearchFaqResponseBodyFaqHits setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public SearchFaqResponseBodyFaqHits setModifyUserId(Long modifyUserId) {
            this.modifyUserId = modifyUserId;
            return this;
        }
        public Long getModifyUserId() {
            return this.modifyUserId;
        }

        public SearchFaqResponseBodyFaqHits setModifyUserName(String modifyUserName) {
            this.modifyUserName = modifyUserName;
            return this;
        }
        public String getModifyUserName() {
            return this.modifyUserName;
        }

        public SearchFaqResponseBodyFaqHits setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public SearchFaqResponseBodyFaqHits setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
