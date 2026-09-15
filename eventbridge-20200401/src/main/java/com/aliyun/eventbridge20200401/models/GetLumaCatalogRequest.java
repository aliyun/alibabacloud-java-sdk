// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetLumaCatalogRequest extends TeaModel {
    /**
     * <p>The name of the Agent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_agent</p>
     */
    @NameInMap("AgentName")
    public String agentName;

    /**
     * <p>The name of the data catalog bound to the Agent. You can call ListLumaCatalogs to obtain the name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_catalog</p>
     */
    @NameInMap("Name")
    public String name;

    public static GetLumaCatalogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLumaCatalogRequest self = new GetLumaCatalogRequest();
        return TeaModel.build(map, self);
    }

    public GetLumaCatalogRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public GetLumaCatalogRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
