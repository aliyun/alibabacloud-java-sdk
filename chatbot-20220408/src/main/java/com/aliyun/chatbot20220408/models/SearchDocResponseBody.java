// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class SearchDocResponseBody extends TeaModel {
    /**
     * <p>A list of matching documents.</p>
     */
    @NameInMap("DocHits")
    public java.util.List<SearchDocResponseBodyDocHits> docHits;

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
     * <p>E3E5C779-A630-45AC-B0F2-A4506A4212F1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of matching entries.</p>
     * 
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
        /**
         * <p>Indicates whether this is a default tag.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DefaultTag")
        public Boolean defaultTag;

        /**
         * <p>The tag group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3610</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        /**
         * <p>The tag group name.</p>
         * 
         * <strong>example:</strong>
         * <p>文章</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The tag ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1201</p>
         */
        @NameInMap("TagId")
        public Long tagId;

        /**
         * <p>The tag name.</p>
         * 
         * <strong>example:</strong>
         * <p>小说</p>
         */
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
         * <p>The business code.</p>
         * 
         * <strong>example:</strong>
         * <p>cn_dytns</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <p>The category ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30000135654</p>
         */
        @NameInMap("CategoryId")
        public Long categoryId;

        /**
         * <p>The splitter for the document. Key: <code>Splitter</code>. Valid values:<br>• <code>paragraphSplitter</code> (default): Splits the document by paragraph.<br>• <code>treeSplitter</code>: Splits the document based on a rule-based hierarchy.<br><br></p>
         * <p>The size of each document chunk. Key: <code>ChunkSize</code>. Default value: 500. Value range: [200, 800].</p>
         * <p>The patterns for the rule-based hierarchy. Key: <code>TreePatterns</code>. Default value: <code>[]</code>.</p>
         * <p>The source of the document title. Key: <code>TitleSource</code>. Valid values:<br>• <code>ocrTitle</code> (default): Uses the OCR-identified title.<br>• <code>docName</code>: Uses the document name as the title.<br><br></p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Splitter&quot;:&quot;treeSplitter&quot;,&quot;ChunkSize&quot;:500,&quot;TreePatterns&quot;:[&quot;^# .<em>&quot;,&quot;^## .</em>&quot;,&quot;^### .<em>&quot;,&quot;^#### .</em>&quot;],&quot;TitleSource&quot;:&quot;docName&quot;}</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The time the document was created (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-22T03:53:41Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The creator ID.</p>
         * 
         * <strong>example:</strong>
         * <p>111111111</p>
         */
        @NameInMap("CreateUserId")
        public Long createUserId;

        /**
         * <p>The name of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("CreateUserName")
        public String createUserName;

        /**
         * <p>The document name.</p>
         * 
         * <strong>example:</strong>
         * <p>文档名称</p>
         */
        @NameInMap("DocName")
        public String docName;

        /**
         * <p>A list of the document\&quot;s tags.</p>
         */
        @NameInMap("DocTags")
        public java.util.List<SearchDocResponseBodyDocHitsDocTags> docTags;

        /**
         * <p>The knowledge\&quot;s effective status, calculated based on <code>StartDate</code> and <code>EndDate</code>. Valid values:<br>• 20: Active<br>• 21: Expired<br>• 22: Pending<br><br><br></p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("EffectStatus")
        public Integer effectStatus;

        /**
         * <p>The time the knowledge expires (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2099-12-31T16:00:00Z</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <p>The knowledge ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30002692007</p>
         */
        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        /**
         * <p>The document metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;code&quot;:&quot;xxx&quot;}</p>
         */
        @NameInMap("Meta")
        public String meta;

        /**
         * <p>The time the document was last modified (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-25T02:27:42Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The modifier ID.</p>
         * 
         * <strong>example:</strong>
         * <p>222222222</p>
         */
        @NameInMap("ModifyUserId")
        public Long modifyUserId;

        /**
         * <p>The name of the last modifier.</p>
         * 
         * <strong>example:</strong>
         * <p>李四</p>
         */
        @NameInMap("ModifyUserName")
        public String modifyUserName;

        /**
         * <p>Indicates whether the task can be retried.<br>• <code>true</code>: The task can be retried.<br>• <code>false</code>: The task cannot be retried.<br><br></p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ProcessCanRetry")
        public Boolean processCanRetry;

        /**
         * <p>The processing message for the task.</p>
         * 
         * <strong>example:</strong>
         * <p>任务处理成功</p>
         */
        @NameInMap("ProcessMessage")
        public String processMessage;

        /**
         * <p>The task\&quot;s processing status. Valid values:<br>• -1: Queued<br>• 0: Succeeded<br>• 1: Parsing<br>• 2: Processing<br>• 3: Failed<br><br><br><br><br></p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ProcessStatus")
        public Integer processStatus;

        /**
         * <p>The time the knowledge takes effect (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-28T11:40:18Z</p>
         */
        @NameInMap("StartDate")
        public String startDate;

        /**
         * <p>The editing status of the document. Valid values:<br>• 1: Unpublished<br>• 2: Published<br>• 3: Updated but not published<br><br><br></p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The OSS URL of the object.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://doc2bot-bucket-cloud.oss-cn-shanghai.aliyuncs.com/doc2bot/input/%E6%96%87%E6%A1%A3%E9%97%AE%E7%AD%94%E8%AF%B4%E6%98%8E%E4%B9%A6_V1.pdf">https://doc2bot-bucket-cloud.oss-cn-shanghai.aliyuncs.com/doc2bot/input/文档问答说明书_V1.pdf</a></p>
         */
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
