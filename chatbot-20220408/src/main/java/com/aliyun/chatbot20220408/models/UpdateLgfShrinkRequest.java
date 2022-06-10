// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateLgfShrinkRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    // 机器人ID
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LgfDefinition")
    public String lgfDefinitionShrink;

    // LGF ID
    @NameInMap("LgfId")
    public Long lgfId;

    public static UpdateLgfShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLgfShrinkRequest self = new UpdateLgfShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLgfShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateLgfShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateLgfShrinkRequest setLgfDefinitionShrink(String lgfDefinitionShrink) {
        this.lgfDefinitionShrink = lgfDefinitionShrink;
        return this;
    }
    public String getLgfDefinitionShrink() {
        return this.lgfDefinitionShrink;
    }

    public UpdateLgfShrinkRequest setLgfId(Long lgfId) {
        this.lgfId = lgfId;
        return this;
    }
    public Long getLgfId() {
        return this.lgfId;
    }

}
