// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListMaterialDocumentsShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>33a2658aaabf4c24b45d50e575125311_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("Content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>2023-03-18 02:00:00</p>
     */
    @NameInMap("CreateTimeEnd")
    public String createTimeEnd;

    /**
     * <strong>example:</strong>
     * <p>2023-02-19 07:28:11</p>
     */
    @NameInMap("CreateTimeStart")
    public String createTimeStart;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Current")
    public Integer current;

    /**
     * <strong>example:</strong>
     * <p>jsonLine</p>
     */
    @NameInMap("DocType")
    public String docType;

    /**
     * <strong>example:</strong>
     * <p>excel</p>
     */
    @NameInMap("DocTypeList")
    public String docTypeListShrink;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("GeneratePublicUrl")
    public Boolean generatePublicUrl;

    /**
     * <strong>example:</strong>
     * <p>69</p>
     */
    @NameInMap("Id")
    public Long id;

    @NameInMap("Keywords")
    public String keywordsShrink;

    @NameInMap("Query")
    public String query;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ShareAttr")
    public Integer shareAttr;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Size")
    public Integer size;

    @NameInMap("Title")
    public String title;

    /**
     * <strong>example:</strong>
     * <p>2023-03-18 03:00:00</p>
     */
    @NameInMap("UpdateTimeEnd")
    public String updateTimeEnd;

    /**
     * <strong>example:</strong>
     * <p>2023-03-18 02:00:00</p>
     */
    @NameInMap("UpdateTimeStart")
    public String updateTimeStart;

    public static ListMaterialDocumentsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMaterialDocumentsShrinkRequest self = new ListMaterialDocumentsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListMaterialDocumentsShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ListMaterialDocumentsShrinkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ListMaterialDocumentsShrinkRequest setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public ListMaterialDocumentsShrinkRequest setCreateTimeStart(String createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public String getCreateTimeStart() {
        return this.createTimeStart;
    }

    public ListMaterialDocumentsShrinkRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public ListMaterialDocumentsShrinkRequest setDocType(String docType) {
        this.docType = docType;
        return this;
    }
    public String getDocType() {
        return this.docType;
    }

    public ListMaterialDocumentsShrinkRequest setDocTypeListShrink(String docTypeListShrink) {
        this.docTypeListShrink = docTypeListShrink;
        return this;
    }
    public String getDocTypeListShrink() {
        return this.docTypeListShrink;
    }

    public ListMaterialDocumentsShrinkRequest setGeneratePublicUrl(Boolean generatePublicUrl) {
        this.generatePublicUrl = generatePublicUrl;
        return this;
    }
    public Boolean getGeneratePublicUrl() {
        return this.generatePublicUrl;
    }

    public ListMaterialDocumentsShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ListMaterialDocumentsShrinkRequest setKeywordsShrink(String keywordsShrink) {
        this.keywordsShrink = keywordsShrink;
        return this;
    }
    public String getKeywordsShrink() {
        return this.keywordsShrink;
    }

    public ListMaterialDocumentsShrinkRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ListMaterialDocumentsShrinkRequest setShareAttr(Integer shareAttr) {
        this.shareAttr = shareAttr;
        return this;
    }
    public Integer getShareAttr() {
        return this.shareAttr;
    }

    public ListMaterialDocumentsShrinkRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListMaterialDocumentsShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public ListMaterialDocumentsShrinkRequest setUpdateTimeEnd(String updateTimeEnd) {
        this.updateTimeEnd = updateTimeEnd;
        return this;
    }
    public String getUpdateTimeEnd() {
        return this.updateTimeEnd;
    }

    public ListMaterialDocumentsShrinkRequest setUpdateTimeStart(String updateTimeStart) {
        this.updateTimeStart = updateTimeStart;
        return this;
    }
    public String getUpdateTimeStart() {
        return this.updateTimeStart;
    }

}
