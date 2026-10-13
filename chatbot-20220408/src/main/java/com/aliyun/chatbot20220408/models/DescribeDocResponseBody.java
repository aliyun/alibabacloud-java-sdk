// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DescribeDocResponseBody extends TeaModel {
    /**
     * <p>The business code.</p>
     * 
     * <strong>example:</strong>
     * <p>bizcode123</p>
     */
    @NameInMap("BizCode")
    public String bizCode;

    /**
     * <p>The category ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30000049006</p>
     */
    @NameInMap("CategoryId")
    public Long categoryId;

    /**
     * <p>The document parsing and chunking configuration items:</p>
     * <p>Chunker KEY: Splitter. Valid values: paragraphSplitter - hierarchy recognition (default). treeSplitter - rule-based hierarchy.</p>
     * <p>Document chunk size KEY: ChunkSize. VALUE: default 500. Range: [200, 800].</p>
     * <p>Rule-based hierarchy KEY: TreePatterns. VALUE: default [].</p>
     * <p>Document title source KEY: TitleSource. Valid values: ocrTitle - OCR-recognized title (default). docName - document name as title.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Splitter&quot;:&quot;treeSplitter&quot;,&quot;ChunkSize&quot;:500,&quot;TreePatterns&quot;:[&quot;^# .<em>&quot;,&quot;^## .</em>&quot;,&quot;^### .<em>&quot;,&quot;^#### .</em>&quot;],&quot;TitleSource&quot;:&quot;docName&quot;}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-04-12T06:30:17Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The ID of the user who created the document.</p>
     * 
     * <strong>example:</strong>
     * <p>1111111111</p>
     */
    @NameInMap("CreateUserId")
    public Long createUserId;

    /**
     * <p>The name of the user who created the document.</p>
     * 
     * <strong>example:</strong>
     * <p>Jane</p>
     */
    @NameInMap("CreateUserName")
    public String createUserName;

    /**
     * <p>The document details.</p>
     */
    @NameInMap("DocInfo")
    public DescribeDocResponseBodyDocInfo docInfo;

    @NameInMap("DocMetadata")
    public java.util.List<DescribeDocResponseBodyDocMetadata> docMetadata;

    /**
     * <p>The document name.</p>
     * 
     * <strong>example:</strong>
     * <p>Document name</p>
     */
    @NameInMap("DocName")
    public String docName;

    /**
     * <p>The list of tag details.</p>
     */
    @NameInMap("DocTags")
    public java.util.List<DescribeDocResponseBodyDocTags> docTags;

    /**
     * <p>The effective status, which is calculated based on StartDate and EndDate. Valid values:</p>
     * <ul>
     * <li>20: Effective.</li>
     * <li>21: Expired.</li>
     * <li>22: Pending effective.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("EffectStatus")
    public Integer effectStatus;

    /**
     * <p>The expiration time (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-27T06:08:54Z</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The knowledge ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30001979424</p>
     */
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    /**
     * <p>The metadata associated with the document.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;code&quot;:&quot;xxx&quot;}</p>
     */
    @NameInMap("Meta")
    public String meta;

    /**
     * <p>The modification time.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-25T08:56:55Z</p>
     */
    @NameInMap("ModifyTime")
    public String modifyTime;

    /**
     * <p>The ID of the user who last modified the document.</p>
     * 
     * <strong>example:</strong>
     * <p>2222222222</p>
     */
    @NameInMap("ModifyUserId")
    public Long modifyUserId;

    /**
     * <p>The name of the user who last modified the document.</p>
     * 
     * <strong>example:</strong>
     * <p>John</p>
     */
    @NameInMap("ModifyUserName")
    public String modifyUserName;

    /**
     * <p>Indicates whether the task can be retried. Valid values:</p>
     * <ul>
     * <li>true: The task can be retried.</li>
     * <li>false: The task cannot be retried.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ProcessCanRetry")
    public Boolean processCanRetry;

    /**
     * <p>The task processing message.</p>
     * 
     * <strong>example:</strong>
     * <p>Task processed successfully</p>
     */
    @NameInMap("ProcessMessage")
    public String processMessage;

    /**
     * <p>The task processing status. Valid values:</p>
     * <ul>
     * <li>-1: Queued.</li>
     * <li>0: Succeeded.</li>
     * <li>1: Parsing.</li>
     * <li>2: Processing.</li>
     * <li>3: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ProcessStatus")
    public Integer processStatus;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>7F132693-212A-40A9-8A81-11E7694E478B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The effective period (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>1979-12-31T16:00:00Z</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The editing status. Valid values:</p>
     * <ul>
     * <li>1: Unpublished.</li>
     * <li>2: Published.</li>
     * <li>3: Updated but not published.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The document title.</p>
     * 
     * <strong>example:</strong>
     * <p>Test title</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The OSS URL where the document is stored.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://doc2bot-bucket-cloud.oss-cn-shanghai.aliyuncs.com/doc2bot/input/%E6%96%87%E6%A1%A3%E9%97%AE%E7%AD%94%E8%AF%B4%E6%98%8E%E4%B9%A6_V1.pdf">https://doc2bot-bucket-cloud.oss-cn-shanghai.aliyuncs.com/doc2bot/input/文档问答说明书_V1.pdf</a></p>
     */
    @NameInMap("Url")
    public String url;

    public static DescribeDocResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDocResponseBody self = new DescribeDocResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDocResponseBody setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public DescribeDocResponseBody setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public DescribeDocResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public DescribeDocResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeDocResponseBody setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
        return this;
    }
    public Long getCreateUserId() {
        return this.createUserId;
    }

    public DescribeDocResponseBody setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
        return this;
    }
    public String getCreateUserName() {
        return this.createUserName;
    }

    public DescribeDocResponseBody setDocInfo(DescribeDocResponseBodyDocInfo docInfo) {
        this.docInfo = docInfo;
        return this;
    }
    public DescribeDocResponseBodyDocInfo getDocInfo() {
        return this.docInfo;
    }

    public DescribeDocResponseBody setDocMetadata(java.util.List<DescribeDocResponseBodyDocMetadata> docMetadata) {
        this.docMetadata = docMetadata;
        return this;
    }
    public java.util.List<DescribeDocResponseBodyDocMetadata> getDocMetadata() {
        return this.docMetadata;
    }

    public DescribeDocResponseBody setDocName(String docName) {
        this.docName = docName;
        return this;
    }
    public String getDocName() {
        return this.docName;
    }

    public DescribeDocResponseBody setDocTags(java.util.List<DescribeDocResponseBodyDocTags> docTags) {
        this.docTags = docTags;
        return this;
    }
    public java.util.List<DescribeDocResponseBodyDocTags> getDocTags() {
        return this.docTags;
    }

    public DescribeDocResponseBody setEffectStatus(Integer effectStatus) {
        this.effectStatus = effectStatus;
        return this;
    }
    public Integer getEffectStatus() {
        return this.effectStatus;
    }

    public DescribeDocResponseBody setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribeDocResponseBody setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    public DescribeDocResponseBody setMeta(String meta) {
        this.meta = meta;
        return this;
    }
    public String getMeta() {
        return this.meta;
    }

    public DescribeDocResponseBody setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public DescribeDocResponseBody setModifyUserId(Long modifyUserId) {
        this.modifyUserId = modifyUserId;
        return this;
    }
    public Long getModifyUserId() {
        return this.modifyUserId;
    }

    public DescribeDocResponseBody setModifyUserName(String modifyUserName) {
        this.modifyUserName = modifyUserName;
        return this;
    }
    public String getModifyUserName() {
        return this.modifyUserName;
    }

    public DescribeDocResponseBody setProcessCanRetry(Boolean processCanRetry) {
        this.processCanRetry = processCanRetry;
        return this;
    }
    public Boolean getProcessCanRetry() {
        return this.processCanRetry;
    }

    public DescribeDocResponseBody setProcessMessage(String processMessage) {
        this.processMessage = processMessage;
        return this;
    }
    public String getProcessMessage() {
        return this.processMessage;
    }

    public DescribeDocResponseBody setProcessStatus(Integer processStatus) {
        this.processStatus = processStatus;
        return this;
    }
    public Integer getProcessStatus() {
        return this.processStatus;
    }

    public DescribeDocResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDocResponseBody setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public DescribeDocResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public DescribeDocResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public DescribeDocResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public static class DescribeDocResponseBodyDocInfoDocParas extends TeaModel {
        /**
         * <p>The paragraph level.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ParaLevel")
        public Integer paraLevel;

        /**
         * <p>The paragraph sequence number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ParaNo")
        public Integer paraNo;

        /**
         * <p>The paragraph content (plain text, OCR content for images, or Markdown representation for tables).</p>
         * 
         * <strong>example:</strong>
         * <p>Content</p>
         */
        @NameInMap("ParaText")
        public String paraText;

        /**
         * <p>The paragraph content type. Valid values:</p>
         * <ul>
         * <li>text: Text.</li>
         * <li>figure: Image.</li>
         * <li>table: Table.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("ParaType")
        public String paraType;

        public static DescribeDocResponseBodyDocInfoDocParas build(java.util.Map<String, ?> map) throws Exception {
            DescribeDocResponseBodyDocInfoDocParas self = new DescribeDocResponseBodyDocInfoDocParas();
            return TeaModel.build(map, self);
        }

        public DescribeDocResponseBodyDocInfoDocParas setParaLevel(Integer paraLevel) {
            this.paraLevel = paraLevel;
            return this;
        }
        public Integer getParaLevel() {
            return this.paraLevel;
        }

        public DescribeDocResponseBodyDocInfoDocParas setParaNo(Integer paraNo) {
            this.paraNo = paraNo;
            return this;
        }
        public Integer getParaNo() {
            return this.paraNo;
        }

        public DescribeDocResponseBodyDocInfoDocParas setParaText(String paraText) {
            this.paraText = paraText;
            return this;
        }
        public String getParaText() {
            return this.paraText;
        }

        public DescribeDocResponseBodyDocInfoDocParas setParaType(String paraType) {
            this.paraType = paraType;
            return this;
        }
        public String getParaType() {
            return this.paraType;
        }

    }

    public static class DescribeDocResponseBodyDocInfo extends TeaModel {
        /**
         * <p>The document paragraph information.</p>
         */
        @NameInMap("DocParas")
        public java.util.List<DescribeDocResponseBodyDocInfoDocParas> docParas;

        public static DescribeDocResponseBodyDocInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDocResponseBodyDocInfo self = new DescribeDocResponseBodyDocInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDocResponseBodyDocInfo setDocParas(java.util.List<DescribeDocResponseBodyDocInfoDocParas> docParas) {
            this.docParas = docParas;
            return this;
        }
        public java.util.List<DescribeDocResponseBodyDocInfoDocParas> getDocParas() {
            return this.docParas;
        }

    }

    public static class DescribeDocResponseBodyDocMetadataMetaCellInfoDTOList extends TeaModel {
        @NameInMap("FieldCode")
        public String fieldCode;

        @NameInMap("FieldName")
        public String fieldName;

        @NameInMap("Value")
        public String value;

        public static DescribeDocResponseBodyDocMetadataMetaCellInfoDTOList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDocResponseBodyDocMetadataMetaCellInfoDTOList self = new DescribeDocResponseBodyDocMetadataMetaCellInfoDTOList();
            return TeaModel.build(map, self);
        }

        public DescribeDocResponseBodyDocMetadataMetaCellInfoDTOList setFieldCode(String fieldCode) {
            this.fieldCode = fieldCode;
            return this;
        }
        public String getFieldCode() {
            return this.fieldCode;
        }

        public DescribeDocResponseBodyDocMetadataMetaCellInfoDTOList setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public DescribeDocResponseBodyDocMetadataMetaCellInfoDTOList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDocResponseBodyDocMetadata extends TeaModel {
        @NameInMap("BusinessViewId")
        public String businessViewId;

        /**
         * <p>The tag name.</p>
         */
        @NameInMap("BusinessViewName")
        public String businessViewName;

        @NameInMap("MetaCellInfoDTOList")
        public java.util.List<DescribeDocResponseBodyDocMetadataMetaCellInfoDTOList> metaCellInfoDTOList;

        public static DescribeDocResponseBodyDocMetadata build(java.util.Map<String, ?> map) throws Exception {
            DescribeDocResponseBodyDocMetadata self = new DescribeDocResponseBodyDocMetadata();
            return TeaModel.build(map, self);
        }

        public DescribeDocResponseBodyDocMetadata setBusinessViewId(String businessViewId) {
            this.businessViewId = businessViewId;
            return this;
        }
        public String getBusinessViewId() {
            return this.businessViewId;
        }

        public DescribeDocResponseBodyDocMetadata setBusinessViewName(String businessViewName) {
            this.businessViewName = businessViewName;
            return this;
        }
        public String getBusinessViewName() {
            return this.businessViewName;
        }

        public DescribeDocResponseBodyDocMetadata setMetaCellInfoDTOList(java.util.List<DescribeDocResponseBodyDocMetadataMetaCellInfoDTOList> metaCellInfoDTOList) {
            this.metaCellInfoDTOList = metaCellInfoDTOList;
            return this;
        }
        public java.util.List<DescribeDocResponseBodyDocMetadataMetaCellInfoDTOList> getMetaCellInfoDTOList() {
            return this.metaCellInfoDTOList;
        }

    }

    public static class DescribeDocResponseBodyDocTags extends TeaModel {
        /**
         * <p>Indicates whether this is the default &quot;all tags&quot; label.</p>
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
         * <p>Article</p>
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
         * <p>Novel</p>
         */
        @NameInMap("TagName")
        public String tagName;

        public static DescribeDocResponseBodyDocTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDocResponseBodyDocTags self = new DescribeDocResponseBodyDocTags();
            return TeaModel.build(map, self);
        }

        public DescribeDocResponseBodyDocTags setDefaultTag(Boolean defaultTag) {
            this.defaultTag = defaultTag;
            return this;
        }
        public Boolean getDefaultTag() {
            return this.defaultTag;
        }

        public DescribeDocResponseBodyDocTags setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public DescribeDocResponseBodyDocTags setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDocResponseBodyDocTags setTagId(Long tagId) {
            this.tagId = tagId;
            return this;
        }
        public Long getTagId() {
            return this.tagId;
        }

        public DescribeDocResponseBodyDocTags setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

}
