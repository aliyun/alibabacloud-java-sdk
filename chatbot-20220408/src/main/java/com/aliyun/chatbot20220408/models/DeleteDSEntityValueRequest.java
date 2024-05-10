// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteDSEntityValueRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EntityId")
    public Long entityId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EntityValueId")
    public Long entityValueId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteDSEntityValueRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDSEntityValueRequest self = new DeleteDSEntityValueRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDSEntityValueRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public DeleteDSEntityValueRequest setEntityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }
    public Long getEntityId() {
        return this.entityId;
    }

    public DeleteDSEntityValueRequest setEntityValueId(Long entityValueId) {
        this.entityValueId = entityValueId;
        return this;
    }
    public Long getEntityValueId() {
        return this.entityValueId;
    }

    public DeleteDSEntityValueRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
