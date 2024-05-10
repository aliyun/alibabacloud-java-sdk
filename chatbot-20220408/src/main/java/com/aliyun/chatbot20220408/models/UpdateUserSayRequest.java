// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateUserSayRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("UserSayDefinition")
    public UpdateUserSayRequestUserSayDefinition userSayDefinition;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserSayId")
    public Long userSayId;

    public static UpdateUserSayRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserSayRequest self = new UpdateUserSayRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserSayRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateUserSayRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateUserSayRequest setUserSayDefinition(UpdateUserSayRequestUserSayDefinition userSayDefinition) {
        this.userSayDefinition = userSayDefinition;
        return this;
    }
    public UpdateUserSayRequestUserSayDefinition getUserSayDefinition() {
        return this.userSayDefinition;
    }

    public UpdateUserSayRequest setUserSayId(Long userSayId) {
        this.userSayId = userSayId;
        return this;
    }
    public Long getUserSayId() {
        return this.userSayId;
    }

    public static class UpdateUserSayRequestUserSayDefinitionSlotInfos extends TeaModel {
        @NameInMap("EndIndex")
        public Integer endIndex;

        @NameInMap("SlotId")
        public String slotId;

        @NameInMap("StartIndex")
        public Integer startIndex;

        public static UpdateUserSayRequestUserSayDefinitionSlotInfos build(java.util.Map<String, ?> map) throws Exception {
            UpdateUserSayRequestUserSayDefinitionSlotInfos self = new UpdateUserSayRequestUserSayDefinitionSlotInfos();
            return TeaModel.build(map, self);
        }

        public UpdateUserSayRequestUserSayDefinitionSlotInfos setEndIndex(Integer endIndex) {
            this.endIndex = endIndex;
            return this;
        }
        public Integer getEndIndex() {
            return this.endIndex;
        }

        public UpdateUserSayRequestUserSayDefinitionSlotInfos setSlotId(String slotId) {
            this.slotId = slotId;
            return this;
        }
        public String getSlotId() {
            return this.slotId;
        }

        public UpdateUserSayRequestUserSayDefinitionSlotInfos setStartIndex(Integer startIndex) {
            this.startIndex = startIndex;
            return this;
        }
        public Integer getStartIndex() {
            return this.startIndex;
        }

    }

    public static class UpdateUserSayRequestUserSayDefinition extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("IntentId")
        public Long intentId;

        @NameInMap("SlotInfos")
        public java.util.List<UpdateUserSayRequestUserSayDefinitionSlotInfos> slotInfos;

        public static UpdateUserSayRequestUserSayDefinition build(java.util.Map<String, ?> map) throws Exception {
            UpdateUserSayRequestUserSayDefinition self = new UpdateUserSayRequestUserSayDefinition();
            return TeaModel.build(map, self);
        }

        public UpdateUserSayRequestUserSayDefinition setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateUserSayRequestUserSayDefinition setIntentId(Long intentId) {
            this.intentId = intentId;
            return this;
        }
        public Long getIntentId() {
            return this.intentId;
        }

        public UpdateUserSayRequestUserSayDefinition setSlotInfos(java.util.List<UpdateUserSayRequestUserSayDefinitionSlotInfos> slotInfos) {
            this.slotInfos = slotInfos;
            return this;
        }
        public java.util.List<UpdateUserSayRequestUserSayDefinitionSlotInfos> getSlotInfos() {
            return this.slotInfos;
        }

    }

}
