// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class UpdateDocAttributeRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("DelAllTags")
    public Boolean delAllTags;

    @NameInMap("DocId")
    public String docId;

    @NameInMap("Name")
    public String name;

    @NameInMap("TagIds")
    public java.util.List<String> tagIds;

    public static UpdateDocAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDocAttributeRequest self = new UpdateDocAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDocAttributeRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateDocAttributeRequest setDelAllTags(Boolean delAllTags) {
        this.delAllTags = delAllTags;
        return this;
    }
    public Boolean getDelAllTags() {
        return this.delAllTags;
    }

    public UpdateDocAttributeRequest setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public UpdateDocAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDocAttributeRequest setTagIds(java.util.List<String> tagIds) {
        this.tagIds = tagIds;
        return this;
    }
    public java.util.List<String> getTagIds() {
        return this.tagIds;
    }

}
