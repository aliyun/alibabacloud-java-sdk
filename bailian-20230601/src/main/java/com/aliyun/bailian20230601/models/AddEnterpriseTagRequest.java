// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class AddEnterpriseTagRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("TagName")
    public String tagName;

    public static AddEnterpriseTagRequest build(java.util.Map<String, ?> map) throws Exception {
        AddEnterpriseTagRequest self = new AddEnterpriseTagRequest();
        return TeaModel.build(map, self);
    }

    public AddEnterpriseTagRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public AddEnterpriseTagRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

}
