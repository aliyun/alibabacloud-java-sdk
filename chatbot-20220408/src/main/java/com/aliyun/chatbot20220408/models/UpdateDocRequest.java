// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateDocRequest extends TeaModel {
    /**
     * <p>The key for the business space. If this parameter is not specified, the default business space is used. You can obtain the key on the Business Management page of your master account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The document category ID.</p>
     * 
     * <strong>example:</strong>
     * <p>231001028593</p>
     */
    @NameInMap("CategoryId")
    public Long categoryId;

    /**
     * <p><strong>Splitter</strong>: The method used to split the document. Valid values: <code>paragraphSplitter</code> (splits by paragraph, default) and <code>treeSplitter</code> (splits by hierarchical rules).</p>
     * <p><strong>ChunkSize</strong>: The chunk size. The value must be an integer from 200 to 800. The default value is 500.</p>
     * <p><strong>TreePatterns</strong>: An array of regular expressions that define the structure for rule-based splitting. The default value is <code>[]</code>.</p>
     * <p><strong>TitleSource</strong>: The source of the document title. Valid values: <code>ocrTitle</code> (uses the OCR-recognized title, default) and <code>docName</code> (uses the document name as the title).</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Splitter&quot;:&quot;treeSplitter&quot;,&quot;ChunkSize&quot;:500,&quot;TreePatterns&quot;:[&quot;^# .<em>&quot;,&quot;^## .</em>&quot;,&quot;^### .<em>&quot;,&quot;^#### .</em>&quot;],&quot;TitleSource&quot;:&quot;&quot;}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The document content.</p>
     * 
     * <strong>example:</strong>
     * <p>文档内容</p>
     */
    @NameInMap("Content")
    public String content;

    @NameInMap("DocMetadata")
    public java.util.List<UpdateDocRequestDocMetadata> docMetadata;

    /**
     * <p>The document name.</p>
     * 
     * <strong>example:</strong>
     * <p>文档问答模块功能说明文档</p>
     */
    @NameInMap("DocName")
    public String docName;

    /**
     * <p>The time when the document expires. Specify the time in UTC, using the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-03-11T23:59:59Z</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The document ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001905617</p>
     */
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    /**
     * <p>The metadata of the document, specified as a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;code&quot;:&quot;xxx&quot;}</p>
     */
    @NameInMap("Meta")
    public String meta;

    /**
     * <p>The time when the document becomes effective. Specify the time in UTC, using the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-05-25T16:28:36Z</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The tag IDs to associate with the document. Passing an empty array removes all existing tag associations.</p>
     */
    @NameInMap("TagIds")
    public java.util.List<Long> tagIds;

    /**
     * <p>The document title.</p>
     * 
     * <strong>example:</strong>
     * <p>文档问答功能说明</p>
     */
    @NameInMap("Title")
    public String title;

    public static UpdateDocRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDocRequest self = new UpdateDocRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDocRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateDocRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public UpdateDocRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public UpdateDocRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateDocRequest setDocMetadata(java.util.List<UpdateDocRequestDocMetadata> docMetadata) {
        this.docMetadata = docMetadata;
        return this;
    }
    public java.util.List<UpdateDocRequestDocMetadata> getDocMetadata() {
        return this.docMetadata;
    }

    public UpdateDocRequest setDocName(String docName) {
        this.docName = docName;
        return this;
    }
    public String getDocName() {
        return this.docName;
    }

    public UpdateDocRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public UpdateDocRequest setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    public UpdateDocRequest setMeta(String meta) {
        this.meta = meta;
        return this;
    }
    public String getMeta() {
        return this.meta;
    }

    public UpdateDocRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public UpdateDocRequest setTagIds(java.util.List<Long> tagIds) {
        this.tagIds = tagIds;
        return this;
    }
    public java.util.List<Long> getTagIds() {
        return this.tagIds;
    }

    public UpdateDocRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public static class UpdateDocRequestDocMetadataMetaCellInfoDTOList extends TeaModel {
        @NameInMap("FieldCode")
        public String fieldCode;

        @NameInMap("FieldName")
        public String fieldName;

        @NameInMap("Value")
        public String value;

        public static UpdateDocRequestDocMetadataMetaCellInfoDTOList build(java.util.Map<String, ?> map) throws Exception {
            UpdateDocRequestDocMetadataMetaCellInfoDTOList self = new UpdateDocRequestDocMetadataMetaCellInfoDTOList();
            return TeaModel.build(map, self);
        }

        public UpdateDocRequestDocMetadataMetaCellInfoDTOList setFieldCode(String fieldCode) {
            this.fieldCode = fieldCode;
            return this;
        }
        public String getFieldCode() {
            return this.fieldCode;
        }

        public UpdateDocRequestDocMetadataMetaCellInfoDTOList setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public UpdateDocRequestDocMetadataMetaCellInfoDTOList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateDocRequestDocMetadata extends TeaModel {
        @NameInMap("BusinessViewId")
        public String businessViewId;

        @NameInMap("BusinessViewName")
        public String businessViewName;

        @NameInMap("MetaCellInfoDTOList")
        public java.util.List<UpdateDocRequestDocMetadataMetaCellInfoDTOList> metaCellInfoDTOList;

        public static UpdateDocRequestDocMetadata build(java.util.Map<String, ?> map) throws Exception {
            UpdateDocRequestDocMetadata self = new UpdateDocRequestDocMetadata();
            return TeaModel.build(map, self);
        }

        public UpdateDocRequestDocMetadata setBusinessViewId(String businessViewId) {
            this.businessViewId = businessViewId;
            return this;
        }
        public String getBusinessViewId() {
            return this.businessViewId;
        }

        public UpdateDocRequestDocMetadata setBusinessViewName(String businessViewName) {
            this.businessViewName = businessViewName;
            return this;
        }
        public String getBusinessViewName() {
            return this.businessViewName;
        }

        public UpdateDocRequestDocMetadata setMetaCellInfoDTOList(java.util.List<UpdateDocRequestDocMetadataMetaCellInfoDTOList> metaCellInfoDTOList) {
            this.metaCellInfoDTOList = metaCellInfoDTOList;
            return this;
        }
        public java.util.List<UpdateDocRequestDocMetadataMetaCellInfoDTOList> getMetaCellInfoDTOList() {
            return this.metaCellInfoDTOList;
        }

    }

}
