// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateUserSayRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    // 机器人ID
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("UserSayDefinition")
    public CreateUserSayRequestUserSayDefinition userSayDefinition;

    public static CreateUserSayRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserSayRequest self = new CreateUserSayRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserSayRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreateUserSayRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateUserSayRequest setUserSayDefinition(CreateUserSayRequestUserSayDefinition userSayDefinition) {
        this.userSayDefinition = userSayDefinition;
        return this;
    }
    public CreateUserSayRequestUserSayDefinition getUserSayDefinition() {
        return this.userSayDefinition;
    }

    public static class CreateUserSayRequestUserSayDefinitionSlotInfos extends TeaModel {
        // 槽位在意图话术中的结束下标（不含）
        @NameInMap("EndIndex")
        public Integer endIndex;

        // 划槽ID
        @NameInMap("SlotId")
        public String slotId;

        // 槽位在意图话术中的起始下标
        @NameInMap("StartIndex")
        public Integer startIndex;

        public static CreateUserSayRequestUserSayDefinitionSlotInfos build(java.util.Map<String, ?> map) throws Exception {
            CreateUserSayRequestUserSayDefinitionSlotInfos self = new CreateUserSayRequestUserSayDefinitionSlotInfos();
            return TeaModel.build(map, self);
        }

        public CreateUserSayRequestUserSayDefinitionSlotInfos setEndIndex(Integer endIndex) {
            this.endIndex = endIndex;
            return this;
        }
        public Integer getEndIndex() {
            return this.endIndex;
        }

        public CreateUserSayRequestUserSayDefinitionSlotInfos setSlotId(String slotId) {
            this.slotId = slotId;
            return this;
        }
        public String getSlotId() {
            return this.slotId;
        }

        public CreateUserSayRequestUserSayDefinitionSlotInfos setStartIndex(Integer startIndex) {
            this.startIndex = startIndex;
            return this;
        }
        public Integer getStartIndex() {
            return this.startIndex;
        }

    }

    public static class CreateUserSayRequestUserSayDefinition extends TeaModel {
        // 用户话术
        @NameInMap("Content")
        public String content;

        // 意图ID
        @NameInMap("IntentId")
        public Long intentId;

        // 划槽信息
        @NameInMap("SlotInfos")
        public java.util.List<CreateUserSayRequestUserSayDefinitionSlotInfos> slotInfos;

        public static CreateUserSayRequestUserSayDefinition build(java.util.Map<String, ?> map) throws Exception {
            CreateUserSayRequestUserSayDefinition self = new CreateUserSayRequestUserSayDefinition();
            return TeaModel.build(map, self);
        }

        public CreateUserSayRequestUserSayDefinition setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateUserSayRequestUserSayDefinition setIntentId(Long intentId) {
            this.intentId = intentId;
            return this;
        }
        public Long getIntentId() {
            return this.intentId;
        }

        public CreateUserSayRequestUserSayDefinition setSlotInfos(java.util.List<CreateUserSayRequestUserSayDefinitionSlotInfos> slotInfos) {
            this.slotInfos = slotInfos;
            return this;
        }
        public java.util.List<CreateUserSayRequestUserSayDefinitionSlotInfos> getSlotInfos() {
            return this.slotInfos;
        }

    }

}
