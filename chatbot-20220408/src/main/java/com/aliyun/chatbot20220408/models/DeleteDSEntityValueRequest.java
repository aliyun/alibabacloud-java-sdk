// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteDSEntityValueRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    // 实体ID
    @NameInMap("EntityId")
    public Long entityId;

    // 实体成员ID
    @NameInMap("EntityValueId")
    public Long entityValueId;

    // 机器人ID
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
