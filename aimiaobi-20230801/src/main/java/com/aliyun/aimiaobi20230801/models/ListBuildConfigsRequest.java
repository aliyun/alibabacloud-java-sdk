// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListBuildConfigsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cd327c3d5d5e44159cc716e23bfa530e_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>media</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListBuildConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBuildConfigsRequest self = new ListBuildConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListBuildConfigsRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ListBuildConfigsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListBuildConfigsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
