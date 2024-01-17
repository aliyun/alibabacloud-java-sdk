// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetMaterialByIdRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("Id")
    public Long id;

    public static GetMaterialByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMaterialByIdRequest self = new GetMaterialByIdRequest();
        return TeaModel.build(map, self);
    }

    public GetMaterialByIdRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public GetMaterialByIdRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
