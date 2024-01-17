// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ExportGeneratedContentRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("Id")
    public Long id;

    public static ExportGeneratedContentRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportGeneratedContentRequest self = new ExportGeneratedContentRequest();
        return TeaModel.build(map, self);
    }

    public ExportGeneratedContentRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ExportGeneratedContentRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
