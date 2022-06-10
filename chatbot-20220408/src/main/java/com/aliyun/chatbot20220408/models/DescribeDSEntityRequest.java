// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DescribeDSEntityRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    // 实体ID
    @NameInMap("EntityId")
    public Long entityId;

    // 机器人ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeDSEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDSEntityRequest self = new DescribeDSEntityRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDSEntityRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public DescribeDSEntityRequest setEntityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }
    public Long getEntityId() {
        return this.entityId;
    }

    public DescribeDSEntityRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
