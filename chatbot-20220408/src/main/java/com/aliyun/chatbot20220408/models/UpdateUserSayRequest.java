// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateUserSayRequest extends TeaModel {
    /**
     * <p>The business space key. If this parameter is not specified, the default business space is accessed. You can obtain the key value from the business management page of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The robot ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>chatbot-cn-yjzbyrEvqd</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The definition of the user utterance.</p>
     */
    @NameInMap("UserSayDefinition")
    public UpdateUserSayRequestUserSayDefinition userSayDefinition;

    /**
     * <p>The user utterance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>34512323</p>
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
        /**
         * <p>The end index of the slot in the intent utterance (exclusive).</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("EndIndex")
        public Integer endIndex;

        /**
         * <p>The slot ID.</p>
         * 
         * <strong>example:</strong>
         * <p>346ffg3q23dv</p>
         */
        @NameInMap("SlotId")
        public String slotId;

        /**
         * <p>The start index of the slot in the intent utterance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
         * <p>The user utterance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Have you taken a COVID test?</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The intent ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("IntentId")
        public Long intentId;

        /**
         * <p>The slot information.</p>
         */
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
