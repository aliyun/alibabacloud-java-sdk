// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteLgfRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IntentId")
    public Long intentId;

    /**
     * <p>lgf Id</p>
     */
    @NameInMap("LgfId")
    public Long lgfId;

    public static DeleteLgfRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLgfRequest self = new DeleteLgfRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLgfRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public DeleteLgfRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteLgfRequest setIntentId(Long intentId) {
        this.intentId = intentId;
        return this;
    }
    public Long getIntentId() {
        return this.intentId;
    }

    public DeleteLgfRequest setLgfId(Long lgfId) {
        this.lgfId = lgfId;
        return this;
    }
    public Long getLgfId() {
        return this.lgfId;
    }

}
