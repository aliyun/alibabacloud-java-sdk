// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListMaterialDocumentsRequest extends TeaModel {
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
    public java.util.List<String> docTypeList;

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
    public java.util.List<String> keywords;

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
