// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class SearchDocResponseBody extends TeaModel {
    @NameInMap("DocHits")
    public java.util.List<SearchDocResponseBodyDocHits> docHits;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E3E5C779-A630-45AC-B0F2-A4506A4212F1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>141</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static SearchDocResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchDocResponseBody self = new SearchDocResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchDocResponseBody setDocHits(java.util.List<SearchDocResponseBodyDocHits> docHits) {
        this.docHits = docHits;
        return this;
    }
    public java.util.List<SearchDocResponseBodyDocHits> getDocHits() {
        return this.docHits;
    }

    public SearchDocResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchDocResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchDocResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchDocResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class SearchDocResponseBodyDocHitsDocTags extends TeaModel {
        @NameInMap("DefaultTag")
        public Boolean defaultTag;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("TagId")
        public Long tagId;

        @NameInMap("TagName")
        public String tagName;

        public static SearchDocResponseBodyDocHitsDocTags build(java.util.Map<String, ?> map) throws Exception {
            SearchDocResponseBodyDocHitsDocTags self = new SearchDocResponseBodyDocHitsDocTags();
            return TeaModel.build(map, self);
        }

        public SearchDocResponseBodyDocHitsDocTags setDefaultTag(Boolean defaultTag) {
            this.defaultTag = defaultTag;
            return this;
        }
        public Boolean getDefaultTag() {
            return this.defaultTag;
        }

        public SearchDocResponseBodyDocHitsDocTags setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public SearchDocResponseBodyDocHitsDocTags setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public SearchDocResponseBodyDocHitsDocTags setTagId(Long tagId) {
            this.tagId = tagId;
            return this;
        }
        public Long getTagId() {
            return this.tagId;
        }

        public SearchDocResponseBodyDocHitsDocTags setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

    public static class SearchDocResponseBodyDocHits extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cn_dytns</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <strong>example:</strong>
         * <p>30000135654</p>
         */
        @NameInMap("CategoryId")
        public Long categoryId;

        /**
         * <strong>example:</strong>
         * <p>{&quot;Splitter&quot;:&quot;treeSplitter&quot;,&quot;ChunkSize&quot;:500,&quot;TreePatterns&quot;:[&quot;^# .<em>&quot;,&quot;^## .</em>&quot;,&quot;^### .<em>&quot;,&quot;^#### .</em>&quot;],&quot;TitleSource&quot;:&quot;docName&quot;}</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <strong>example:</strong>
         * <p>2023-06-22T03:53:41Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>111111111</p>
         */
        @NameInMap("CreateUserId")
        public Long createUserId;

        @NameInMap("CreateUserName")
        public String createUserName;

        @NameInMap("DocName")
        public String docName;

        @NameInMap("DocTags")
        public java.util.List<SearchDocResponseBodyDocHitsDocTags> docTags;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("EffectStatus")
        public Integer effectStatus;

        /**
         * <strong>example:</strong>
         * <p>2099-12-31T16:00:00Z</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <strong>example:</strong>
         * <p>30002692007</p>
         */
        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        /**
         * <strong>example:</strong>
         * <p>{&quot;code&quot;:&quot;xxx&quot;}</p>
         */
        @NameInMap("Meta")
        public String meta;

        /**
         * <strong>example:</strong>
         * <p>2023-06-25T02:27:42Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <strong>example:</strong>
         * <p>222222222</p>
         */
        @NameInMap("ModifyUserId")
        public Long modifyUserId;

        @NameInMap("ModifyUserName")
        public String modifyUserName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ProcessCanRetry")
        public Boolean processCanRetry;

        @NameInMap("ProcessMessage")
        public String processMessage;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ProcessStatus")
        public Integer processStatus;

        /**
         * <strong>example:</strong>
         * <p>2023-02-28T11:40:18Z</p>
         */
        @NameInMap("StartDate")
        public String startDate;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        @NameInMap("Url")
        public String url;

        public static SearchDocResponseBodyDocHits build(java.util.Map<String, ?> map) throws Exception {
            SearchDocResponseBodyDocHits self = new SearchDocResponseBodyDocHits();
            return TeaModel.build(map, self);
        }

        public SearchDocResponseBodyDocHits setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public SearchDocResponseBodyDocHits setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public SearchDocResponseBodyDocHits setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public SearchDocResponseBodyDocHits setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SearchDocResponseBodyDocHits setCreateUserId(Long createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public Long getCreateUserId() {
            return this.createUserId;
        }

        public SearchDocResponseBodyDocHits setCreateUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }
        public String getCreateUserName() {
            return this.createUserName;
        }

        public SearchDocResponseBodyDocHits setDocName(String docName) {
            this.docName = docName;
            return this;
        }
        public String getDocName() {
            return this.docName;
        }

        public SearchDocResponseBodyDocHits setDocTags(java.util.List<SearchDocResponseBodyDocHitsDocTags> docTags) {
            this.docTags = docTags;
            return this;
        }
        public java.util.List<SearchDocResponseBodyDocHitsDocTags> getDocTags() {
            return this.docTags;
        }

        public SearchDocResponseBodyDocHits setEffectStatus(Integer effectStatus) {
            this.effectStatus = effectStatus;
            return this;
        }
        public Integer getEffectStatus() {
            return this.effectStatus;
        }

        public SearchDocResponseBodyDocHits setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public SearchDocResponseBodyDocHits setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public SearchDocResponseBodyDocHits setMeta(String meta) {
            this.meta = meta;
            return this;
        }
        public String getMeta() {
            return this.meta;
        }

        public SearchDocResponseBodyDocHits setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public SearchDocResponseBodyDocHits setModifyUserId(Long modifyUserId) {
            this.modifyUserId = modifyUserId;
            return this;
        }
        public Long getModifyUserId() {
            return this.modifyUserId;
        }

        public SearchDocResponseBodyDocHits setModifyUserName(String modifyUserName) {
            this.modifyUserName = modifyUserName;
            return this;
        }
        public String getModifyUserName() {
            return this.modifyUserName;
        }

        public SearchDocResponseBodyDocHits setProcessCanRetry(Boolean processCanRetry) {
            this.processCanRetry = processCanRetry;
            return this;
        }
        public Boolean getProcessCanRetry() {
            return this.processCanRetry;
        }

        public SearchDocResponseBodyDocHits setProcessMessage(String processMessage) {
            this.processMessage = processMessage;
            return this;
        }
        public String getProcessMessage() {
            return this.processMessage;
        }

        public SearchDocResponseBodyDocHits setProcessStatus(Integer processStatus) {
            this.processStatus = processStatus;
            return this;
        }
        public Integer getProcessStatus() {
            return this.processStatus;
        }

        public SearchDocResponseBodyDocHits setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public SearchDocResponseBodyDocHits setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public SearchDocResponseBodyDocHits setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
