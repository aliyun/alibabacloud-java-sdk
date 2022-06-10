// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateDSEntityValueRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("Content")
    public String content;

    // 实体ID，修改实体成员时可为空
    @NameInMap("EntityId")
    public Long entityId;

    // 机器人ID
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Synonyms")
    public java.util.List<String> synonyms;

    public static CreateDSEntityValueRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDSEntityValueRequest self = new CreateDSEntityValueRequest();
        return TeaModel.build(map, self);
    }

    public CreateDSEntityValueRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreateDSEntityValueRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateDSEntityValueRequest setEntityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }
    public Long getEntityId() {
        return this.entityId;
    }

    public CreateDSEntityValueRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDSEntityValueRequest setSynonyms(java.util.List<String> synonyms) {
        this.synonyms = synonyms;
        return this;
    }
    public java.util.List<String> getSynonyms() {
        return this.synonyms;
    }

}
