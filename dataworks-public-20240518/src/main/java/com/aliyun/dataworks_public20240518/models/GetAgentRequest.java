// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetAgentRequest extends TeaModel {
    /**
     * <p>省略时读取当前定义；指定已发布版本时读取对应快照及固定的官方 Skill、套件制品版本；指定当前未发布版本时仍返回草稿，不返回固定制品版本。不是 POP 系统参数 Version。</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AgentVersion")
    public Integer agentVersion;

    /**
     * <p>The name of the skill to retrieve.</p>
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
