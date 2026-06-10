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
     * <p>The configuration for document parsing and splitting. Key: <code>Splitter</code>. Valid values: <code>paragraphSplitter</code> (splits by recognition level, default) and <code>treeSplitter</code> (splits by rule level).</p>
     * <p>Key: <code>ChunkSize</code>. The size of each document chunk, which must be between 200 and 800. The default value is 500.</p>
     * <p>Key: <code>TreePatterns</code>. The patterns for the rule-based hierarchy. The default value is [].</p>
     * <p>Key: <code>TitleSource</code>. The source of the document title. Valid values: <code>ocrTitle</code> (OCR-recognized title, default) and <code>docName</code> (document name).</p>
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
     * <p>The creator ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1111111111</p>
     */
    @NameInMap("CreateUserId")
    public Long createUserId;

    /**
     * <p>The creator name.</p>
     * 
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("CreateUserName")
    public String createUserName;

    /**
     * <p>The document details.</p>
     */
    @NameInMap("DocInfo")
    public DescribeDocResponseBodyDocInfo docInfo;

    /**
     * <p>A list of metadata sets, where each set corresponds to a business view.</p>
     */
    @NameInMap("DocMetadata")
    public java.util.List<DescribeDocResponseBodyDocMetadata> docMetadata;

    /**
     * <p>The document name.</p>
     * 
     * <strong>example:</strong>
     * <p>文档名称</p>
     */
    @NameInMap("DocName")
    public String docName;

    /**
     * <p>A list of document tags.</p>
     */
    @NameInMap("DocTags")
    public java.util.List<DescribeDocResponseBodyDocTags> docTags;

    /**
     * <p>The effective status, calculated from <code>StartDate</code> and <code>EndDate</code>.<br>20: Active<br>21: Expired<br>22: Pending<br><br><br></p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("EffectStatus")
    public Integer effectStatus;

    /**
     * <p>The end time in UTC format.</p>
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
     * <p>The document\&quot;s metadata.</p>
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
     * <p>The modifier ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2222222222</p>
     */
    @NameInMap("ModifyUserId")
    public Long modifyUserId;

    /**
     * <p>The modifier name.</p>
     * 
     * <strong>example:</strong>
     * <p>李四</p>
     */
    @NameInMap("ModifyUserName")
    public String modifyUserName;

    /**
     * <p>Indicates whether a failed task can be retried.<br><code>true</code>: The task can be retried.<br><code>false</code>: The task cannot be retried.<br><br></p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ProcessCanRetry")
    public Boolean processCanRetry;

    /**
     * <p>The processing message.</p>
     * 
     * <strong>example:</strong>
     * <p>任务处理成功</p>
     */
    @NameInMap("ProcessMessage")
    public String processMessage;

    /**
     * <p>The processing status of the task.<br>-1: Queued<br>0: Succeeded<br>1: Parsing<br>2: Processing<br>3: Failed<br><br><br><br><br></p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ProcessStatus")
    public Integer processStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7F132693-212A-40A9-8A81-11E7694E478B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start time in UTC format.</p>
     * 
     * <strong>example:</strong>
     * <p>1979-12-31T16:00:00Z</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The edit status.<br>1: Unpublished<br>2: Published<br>3: Updated but not published<br><br><br></p>
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
     * <p>测试标题</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The OSS address of the document.</p>
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
         * <p>The paragraph number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ParaNo")
        public Integer paraNo;

        /**
         * <p>The paragraph content. The content can be plain text, text extracted from an image using optical character recognition (OCR), or a table in Markdown format.</p>
         * 
         * <strong>example:</strong>
         * <p>内容</p>
         */
        @NameInMap("ParaText")
        public String paraText;

        /**
         * <p>The paragraph type.<br>text: Text<br>figure: Image<br>table: Table<br><br><br></p>
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
         * <p>The paragraphs of the document.</p>
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
        /**
         * <p>The code of the field.</p>
         */
        @NameInMap("FieldCode")
        public String fieldCode;

        /**
         * <p>The field name.</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        /**
         * <p>The value of the field.</p>
         */
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
        /**
         * <p>The ID of the business view.</p>
         */
        @NameInMap("BusinessViewId")
        public String businessViewId;

        /**
         * <p>The business view name.</p>
         */
        @NameInMap("BusinessViewName")
        public String businessViewName;

        /**
         * <p>A list of metadata cells.</p>
         */
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
         * <p>Indicates whether the tag represents all items by default.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DefaultTag")
        public Boolean defaultTag;

        /**
         * <p>The tag\&quot;s group ID.</p>
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
