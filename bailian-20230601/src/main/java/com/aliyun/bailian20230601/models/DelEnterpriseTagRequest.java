// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class DelEnterpriseTagRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("TagId")
    public Long tagId;

    public static DelEnterpriseTagRequest build(java.util.Map<String, ?> map) throws Exception {
        DelEnterpriseTagRequest self = new DelEnterpriseTagRequest();
        return TeaModel.build(map, self);
    }

    public DelEnterpriseTagRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public DelEnterpriseTagRequest setTagId(Long tagId) {
        this.tagId = tagId;
        return this;
    }
    public Long getTagId() {
        return this.tagId;
    }

}
