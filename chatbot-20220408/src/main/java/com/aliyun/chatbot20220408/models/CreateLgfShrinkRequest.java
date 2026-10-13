// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateLgfShrinkRequest extends TeaModel {
    /**
     * <p>The business space key. If this parameter is not specified, the default business space is accessed. You can obtain the key value on the business management page of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The robot ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>chatbot-cn-yjzbyrEvqd</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The LGF definition information.</p>
     */
    @NameInMap("LgfDefinition")
    public String lgfDefinitionShrink;

    public static CreateLgfShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLgfShrinkRequest self = new CreateLgfShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateLgfShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreateLgfShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateLgfShrinkRequest setLgfDefinitionShrink(String lgfDefinitionShrink) {
        this.lgfDefinitionShrink = lgfDefinitionShrink;
        return this;
    }
    public String getLgfDefinitionShrink() {
        return this.lgfDefinitionShrink;
    }

}
