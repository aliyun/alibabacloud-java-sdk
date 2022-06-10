// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateDSEntityValueRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    // 实体类型为synonyms时，表示实体归一化值；当实体类型为regex时，表示正则表达式文本
    @NameInMap("Content")
    public String content;

    // 实体ID，修改实体成员时可为空
    @NameInMap("EntityId")
    public Long entityId;

    // 实体成员ID，创建实体成员时为空
    @NameInMap("EntityValueId")
    public Long entityValueId;

    // 机器人ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 实体同义词
    @NameInMap("Synonyms")
    public java.util.List<String> synonyms;

    public static UpdateDSEntityValueRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDSEntityValueRequest self = new UpdateDSEntityValueRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDSEntityValueRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateDSEntityValueRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateDSEntityValueRequest setEntityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }
    public Long getEntityId() {
        return this.entityId;
    }

    public UpdateDSEntityValueRequest setEntityValueId(Long entityValueId) {
        this.entityValueId = entityValueId;
        return this;
    }
    public Long getEntityValueId() {
        return this.entityValueId;
    }

    public UpdateDSEntityValueRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateDSEntityValueRequest setSynonyms(java.util.List<String> synonyms) {
        this.synonyms = synonyms;
        return this;
    }
    public java.util.List<String> getSynonyms() {
        return this.synonyms;
    }

}
