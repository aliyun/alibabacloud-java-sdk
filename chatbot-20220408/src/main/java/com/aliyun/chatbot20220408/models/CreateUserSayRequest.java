// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateUserSayRequest extends TeaModel {
    /**
     * <p>The business space key. If not specified, the default business space is accessed. You can obtain the key value from the business management page of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The chatbot ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>chatbot-cn-yjzbyrEvqd</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The user utterance definition information.</p>
     */
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
        /**
         * <p>The end index of the slot in the intent utterance (exclusive).</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("EndIndex")
        public Integer endIndex;

        /**
         * <p>The slot ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fb34adf2fv43f2</p>
         */
        @NameInMap("SlotId")
        public String slotId;

        /**
         * <p>The start index of the slot in the intent utterance.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
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
        /**
         * <p>The user utterance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>What is the weather in Beijing tomorrow?</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The intent ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123232</p>
         */
        @NameInMap("IntentId")
        public Long intentId;

        /**
         * <p>The slot information.</p>
         */
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
