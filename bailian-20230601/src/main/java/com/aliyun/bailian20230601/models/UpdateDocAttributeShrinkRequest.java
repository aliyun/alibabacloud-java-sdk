// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class UpdateDocAttributeShrinkRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("DelAllTags")
    public Boolean delAllTags;

    @NameInMap("DocId")
    public String docId;

    @NameInMap("Name")
    public String name;

    @NameInMap("TagIds")
    public String tagIdsShrink;

    public static UpdateDocAttributeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDocAttributeShrinkRequest self = new UpdateDocAttributeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDocAttributeShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateDocAttributeShrinkRequest setDelAllTags(Boolean delAllTags) {
        this.delAllTags = delAllTags;
        return this;
    }
    public Boolean getDelAllTags() {
        return this.delAllTags;
    }

    public UpdateDocAttributeShrinkRequest setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public UpdateDocAttributeShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDocAttributeShrinkRequest setTagIdsShrink(String tagIdsShrink) {
        this.tagIdsShrink = tagIdsShrink;
        return this;
    }
    public String getTagIdsShrink() {
        return this.tagIdsShrink;
    }

}
