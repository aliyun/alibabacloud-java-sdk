// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class UpdateEnterpriseDataTagRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("DataId")
    public String dataId;

    @NameInMap("Tags")
    public java.util.List<Long> tags;

    public static UpdateEnterpriseDataTagRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnterpriseDataTagRequest self = new UpdateEnterpriseDataTagRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEnterpriseDataTagRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateEnterpriseDataTagRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public UpdateEnterpriseDataTagRequest setTags(java.util.List<Long> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<Long> getTags() {
        return this.tags;
    }

}
