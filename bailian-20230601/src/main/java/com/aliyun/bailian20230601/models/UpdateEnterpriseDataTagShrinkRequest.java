// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class UpdateEnterpriseDataTagShrinkRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("DataId")
    public String dataId;

    @NameInMap("Tags")
    public String tagsShrink;

    public static UpdateEnterpriseDataTagShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnterpriseDataTagShrinkRequest self = new UpdateEnterpriseDataTagShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEnterpriseDataTagShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateEnterpriseDataTagShrinkRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public UpdateEnterpriseDataTagShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
