// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class ChatRefDocItem extends TeaModel {
    @NameInMap("docInfo")
    public ChatRefDocInfo docInfo;

    @NameInMap("docName")
    public String docName;

    @NameInMap("docUrl")
    public String docUrl;

    @NameInMap("originDocName")
    public String originDocName;

    @NameInMap("originDocUrl")
    public String originDocUrl;

    @NameInMap("pageNum")
    public java.util.List<ChatDocumentPageNum> pageNum;

    @NameInMap("sourceType")
    public String sourceType;

    public static ChatRefDocItem build(java.util.Map<String, ?> map) throws Exception {
        ChatRefDocItem self = new ChatRefDocItem();
        return TeaModel.build(map, self);
    }

    public ChatRefDocItem setDocInfo(ChatRefDocInfo docInfo) {
        this.docInfo = docInfo;
        return this;
    }
    public ChatRefDocInfo getDocInfo() {
        return this.docInfo;
    }

    public ChatRefDocItem setDocName(String docName) {
        this.docName = docName;
        return this;
    }
    public String getDocName() {
        return this.docName;
    }

    public ChatRefDocItem setDocUrl(String docUrl) {
        this.docUrl = docUrl;
        return this;
    }
    public String getDocUrl() {
        return this.docUrl;
    }

    public ChatRefDocItem setOriginDocName(String originDocName) {
        this.originDocName = originDocName;
        return this;
    }
    public String getOriginDocName() {
        return this.originDocName;
    }

    public ChatRefDocItem setOriginDocUrl(String originDocUrl) {
        this.originDocUrl = originDocUrl;
        return this;
    }
    public String getOriginDocUrl() {
        return this.originDocUrl;
    }

    public ChatRefDocItem setPageNum(java.util.List<ChatDocumentPageNum> pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public java.util.List<ChatDocumentPageNum> getPageNum() {
        return this.pageNum;
    }

    public ChatRefDocItem setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
