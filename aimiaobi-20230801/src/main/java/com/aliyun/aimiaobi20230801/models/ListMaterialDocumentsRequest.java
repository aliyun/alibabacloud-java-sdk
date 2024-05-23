// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListMaterialDocumentsRequest extends TeaModel {
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
    public java.util.List<String> docTypeList;

    @NameInMap("GeneratePublicUrl")
    public Boolean generatePublicUrl;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Keywords")
    public java.util.List<String> keywords;

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

    public static ListMaterialDocumentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMaterialDocumentsRequest self = new ListMaterialDocumentsRequest();
        return TeaModel.build(map, self);
    }

    public ListMaterialDocumentsRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ListMaterialDocumentsRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ListMaterialDocumentsRequest setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public ListMaterialDocumentsRequest setCreateTimeStart(String createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public String getCreateTimeStart() {
        return this.createTimeStart;
    }

    public ListMaterialDocumentsRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public ListMaterialDocumentsRequest setDocType(String docType) {
        this.docType = docType;
        return this;
    }
    public String getDocType() {
        return this.docType;
    }

    public ListMaterialDocumentsRequest setDocTypeList(java.util.List<String> docTypeList) {
        this.docTypeList = docTypeList;
        return this;
    }
    public java.util.List<String> getDocTypeList() {
        return this.docTypeList;
    }

    public ListMaterialDocumentsRequest setGeneratePublicUrl(Boolean generatePublicUrl) {
        this.generatePublicUrl = generatePublicUrl;
        return this;
    }
    public Boolean getGeneratePublicUrl() {
        return this.generatePublicUrl;
    }

    public ListMaterialDocumentsRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ListMaterialDocumentsRequest setKeywords(java.util.List<String> keywords) {
        this.keywords = keywords;
        return this;
    }
    public java.util.List<String> getKeywords() {
        return this.keywords;
    }

    public ListMaterialDocumentsRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ListMaterialDocumentsRequest setShareAttr(Integer shareAttr) {
        this.shareAttr = shareAttr;
        return this;
    }
    public Integer getShareAttr() {
        return this.shareAttr;
    }

    public ListMaterialDocumentsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListMaterialDocumentsRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public ListMaterialDocumentsRequest setUpdateTimeEnd(String updateTimeEnd) {
        this.updateTimeEnd = updateTimeEnd;
        return this;
    }
    public String getUpdateTimeEnd() {
        return this.updateTimeEnd;
    }

    public ListMaterialDocumentsRequest setUpdateTimeStart(String updateTimeStart) {
        this.updateTimeStart = updateTimeStart;
        return this;
    }
    public String getUpdateTimeStart() {
        return this.updateTimeStart;
    }

}
