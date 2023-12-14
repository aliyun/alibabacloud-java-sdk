// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class UpdateEnterpriseTagRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("TagId")
    public Long tagId;

    @NameInMap("TagName")
    public String tagName;

    public static UpdateEnterpriseTagRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnterpriseTagRequest self = new UpdateEnterpriseTagRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEnterpriseTagRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateEnterpriseTagRequest setTagId(Long tagId) {
        this.tagId = tagId;
        return this;
    }
    public Long getTagId() {
        return this.tagId;
    }

    public UpdateEnterpriseTagRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

}
