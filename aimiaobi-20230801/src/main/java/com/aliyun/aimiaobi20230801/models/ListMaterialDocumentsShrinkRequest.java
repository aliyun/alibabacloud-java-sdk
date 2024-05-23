// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListMaterialDocumentsShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("Content")
    public String content;

    @NameInMap("CreateTimeEnd")
    public String createTimeEnd;

    @NameInMap("CreateTimeStart")
    public String createTimeStart;

    @NameInMap("Current")
    public Integer current;

    @NameInMap("DocType")
    public String docType;

    @NameInMap("DocTypeList")
    public String docTypeListShrink;

    @NameInMap("GeneratePublicUrl")
    public Boolean generatePublicUrl;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Keywords")
    public String keywordsShrink;

    @NameInMap("Query")
    public String query;

    @NameInMap("ShareAttr")
    public Integer shareAttr;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("Title")
    public String title;

    @NameInMap("UpdateTimeEnd")
    public String updateTimeEnd;

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
