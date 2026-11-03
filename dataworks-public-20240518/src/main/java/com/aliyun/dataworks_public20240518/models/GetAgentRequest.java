// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetAgentRequest extends TeaModel {
    /**
     * <p>If omitted, the current definition is retrieved. If a published version is specified, the corresponding snapshot and the fixed versions of official skills and suite artifacts are retrieved. If a current unpublished version is specified, the draft is returned without fixed artifact versions. This is not the POP system parameter Version.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AgentVersion")
    public Integer agentVersion;

    /**
     * <p>The name of the skill to read.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-skill</p>
     */
    @NameInMap("Name")
    public String name;

    public static GetAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentRequest self = new GetAgentRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentRequest setAgentVersion(Integer agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public Integer getAgentVersion() {
        return this.agentVersion;
    }

    public GetAgentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
