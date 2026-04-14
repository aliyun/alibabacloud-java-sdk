// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class OneMetaKnowledgeBase extends TeaModel {
    @NameInMap("Creator")
    public String creator;

    @NameInMap("Description")
    public String description;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("KbUuid")
    public String kbUuid;

    @NameInMap("Name")
    public String name;

    @NameInMap("State")
    public Integer state;

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
