// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListLumaCatalogsRequest extends TeaModel {
    /**
     * <p>The name of the Agent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_agent</p>
     */
    @NameInMap("AgentName")
    public String agentName;

    public static ListLumaCatalogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLumaCatalogsRequest self = new ListLumaCatalogsRequest();
        return TeaModel.build(map, self);
    }

    public ListLumaCatalogsRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

}
