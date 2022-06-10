// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class SearchFaqResponseBody extends TeaModel {
    @NameInMap("FaqHits")
    public java.util.List<SearchFaqResponseBodyFaqHits> faqHits;

    // 页码 默认1
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 每页数量，默认10，最大500
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    // 总条数
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
        // 类目ID
        @NameInMap("CategoryId")
        public Long categoryId;

        // 创建时间（UTC时间）
        @NameInMap("CreateTime")
        public String createTime;

        // 创建人ID
        @NameInMap("CreateUserId")
        public Long createUserId;

        // 创建人
        @NameInMap("CreateUserName")
        public String createUserName;

        // 知识生效状态,根据StartDate, EndDate计算出来: 20-生效中, 21-已失效, 22-待生效
        @NameInMap("EffectStatus")
        public Integer effectStatus;

        // 命中的相似问
        @NameInMap("HitSimilarTitles")
        public java.util.List<String> hitSimilarTitles;

        // 命中的答案
        @NameInMap("HitSolutions")
        public java.util.List<String> hitSolutions;

        // 知识ID
        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        // 修改时间（UTC时间）
        @NameInMap("ModifyTime")
        public String modifyTime;

        // 修改人ID
        @NameInMap("ModifyUserId")
        public Long modifyUserId;

        // 修改人
        @NameInMap("ModifyUserName")
        public String modifyUserName;

        // 知识状态: -1-已删除未发布, 1-未发布, 2-已发布, 3-已更新未发布
        @NameInMap("Status")
        public Integer status;

        // 标题
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
