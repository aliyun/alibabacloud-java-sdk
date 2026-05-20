// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class OneMetaKnowledgeBase extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20464374909***</p>
     */
    @NameInMap("Creator")
    public String creator;

    /**
     * <strong>example:</strong>
     * <p>order knowledgebase</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>vehicle</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <strong>example:</strong>
     * <p>{&quot;keywords&quot;:&quot;sales,vehicle brand&quot;}</p>
     */
    @NameInMap("ExtraInfo")
    public String extraInfo;

    /**
     * <strong>example:</strong>
     * <p>2026-05-14 11:30:00</p>
     */
    @NameInMap("GmtCreate")
    public String gmtCreate;

    /**
     * <strong>example:</strong>
     * <p>2026-05-14 11:30:39</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <strong>example:</strong>
     * <p>kb-***</p>
     */
    @NameInMap("KbUuid")
    public String kbUuid;

    /**
     * <strong>example:</strong>
     * <p>order_kb</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("State")
    public Integer state;

    /**
     * <strong>example:</strong>
     * <p>4phsj52f81ymlm***</p>
     */
    @NameInMap("Tag")
    public String tag;

    public static OneMetaKnowledgeBase build(java.util.Map<String, ?> map) throws Exception {
        OneMetaKnowledgeBase self = new OneMetaKnowledgeBase();
        return TeaModel.build(map, self);
    }

    public OneMetaKnowledgeBase setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public OneMetaKnowledgeBase setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public OneMetaKnowledgeBase setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public OneMetaKnowledgeBase setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public OneMetaKnowledgeBase setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public OneMetaKnowledgeBase setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public OneMetaKnowledgeBase setKbUuid(String kbUuid) {
        this.kbUuid = kbUuid;
        return this;
    }
    public String getKbUuid() {
        return this.kbUuid;
    }

    public OneMetaKnowledgeBase setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OneMetaKnowledgeBase setState(Integer state) {
        this.state = state;
        return this;
    }
    public Integer getState() {
        return this.state;
    }

    public OneMetaKnowledgeBase setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
