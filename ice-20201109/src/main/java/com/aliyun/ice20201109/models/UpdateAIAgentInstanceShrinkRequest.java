// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateAIAgentInstanceShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>39f8e0bc005e4f309379701645f4****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TemplateConfig")
    public String templateConfigShrink;

    @NameInMap("UserData")
    public String userData;

    public static UpdateAIAgentInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAIAgentInstanceShrinkRequest self = new UpdateAIAgentInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAIAgentInstanceShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateAIAgentInstanceShrinkRequest setTemplateConfigShrink(String templateConfigShrink) {
        this.templateConfigShrink = templateConfigShrink;
        return this;
    }
    public String getTemplateConfigShrink() {
        return this.templateConfigShrink;
    }

    public UpdateAIAgentInstanceShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
