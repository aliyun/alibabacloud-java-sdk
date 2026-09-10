// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetLhmAgentStatusRequest extends TeaModel {
    /**
     * <p>The Agent type. Valid values:</p>
     * <ul>
     * <li>0: data validation (the only type currently supported).</li>
     * <li>1: metadata.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("agentType")
    public Integer agentType;

    /**
     * <p>The skill name. This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>lhm-data-validation-skill</p>
     */
    @NameInMap("skillName")
    public String skillName;

    public static GetLhmAgentStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLhmAgentStatusRequest self = new GetLhmAgentStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetLhmAgentStatusRequest setAgentType(Integer agentType) {
        this.agentType = agentType;
        return this;
    }
    public Integer getAgentType() {
        return this.agentType;
    }

    public GetLhmAgentStatusRequest setSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }
    public String getSkillName() {
        return this.skillName;
    }

}
