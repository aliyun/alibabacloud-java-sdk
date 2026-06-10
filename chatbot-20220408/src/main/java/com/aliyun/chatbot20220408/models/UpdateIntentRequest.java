// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateIntentRequest extends TeaModel {
    /**
     * <p>The key for the business space. If you omit this parameter, the system uses the default business space. You can find this key on the Business Management page of your primary account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The ID of the chatbot instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>chatbot-cn-yjzbyrEvqd</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The intent definition object.</p>
     */
    @NameInMap("IntentDefinition")
    public UpdateIntentRequestIntentDefinition intentDefinition;

    /**
     * <p>The ID of the intent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>234234234534</p>
     */
    @NameInMap("IntentId")
    public Long intentId;

    public static UpdateIntentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIntentRequest self = new UpdateIntentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIntentRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateIntentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateIntentRequest setIntentDefinition(UpdateIntentRequestIntentDefinition intentDefinition) {
        this.intentDefinition = intentDefinition;
        return this;
    }
    public UpdateIntentRequestIntentDefinition getIntentDefinition() {
        return this.intentDefinition;
    }

    public UpdateIntentRequest setIntentId(Long intentId) {
        this.intentId = intentId;
        return this;
    }
    public Long getIntentId() {
        return this.intentId;
    }

    public static class UpdateIntentRequestIntentDefinitionSlotInfos extends TeaModel {
        /**
         * <p>Specifies whether the slot can contain an array of values.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Array")
        public Boolean array;

        /**
         * <p>Specifies whether to enable data masking for the slot value.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypt")
        public Boolean encrypt;

        /**
         * <p>Specifies whether the slot is interactive. If true, the chatbot prompts the user for a value if the user does not provide one.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Interactive")
        public Boolean interactive;

        /**
         * <p>The name of the slot.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>天气</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the slot.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dgadf23dfg2f</p>
         */
        @NameInMap("SlotId")
        public String slotId;

        /**
         * <p>The name of the associated entity.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>天气</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateIntentRequestIntentDefinitionSlotInfos build(java.util.Map<String, ?> map) throws Exception {
            UpdateIntentRequestIntentDefinitionSlotInfos self = new UpdateIntentRequestIntentDefinitionSlotInfos();
            return TeaModel.build(map, self);
        }

        public UpdateIntentRequestIntentDefinitionSlotInfos setArray(Boolean array) {
            this.array = array;
            return this;
        }
        public Boolean getArray() {
            return this.array;
        }

        public UpdateIntentRequestIntentDefinitionSlotInfos setEncrypt(Boolean encrypt) {
            this.encrypt = encrypt;
            return this;
        }
        public Boolean getEncrypt() {
            return this.encrypt;
        }

        public UpdateIntentRequestIntentDefinitionSlotInfos setInteractive(Boolean interactive) {
            this.interactive = interactive;
            return this;
        }
        public Boolean getInteractive() {
            return this.interactive;
        }

        public UpdateIntentRequestIntentDefinitionSlotInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateIntentRequestIntentDefinitionSlotInfos setSlotId(String slotId) {
            this.slotId = slotId;
            return this;
        }
        public String getSlotId() {
            return this.slotId;
        }

        public UpdateIntentRequestIntentDefinitionSlotInfos setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateIntentRequestIntentDefinition extends TeaModel {
        /**
         * <p>The alias for the intent.</p>
         * 
         * <strong>example:</strong>
         * <p>查天气意图</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <p>The name of the intent.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>查天气意图</p>
         */
        @NameInMap("IntentName")
        public String intentName;

        /**
         * <p>A list of slot objects.</p>
         */
        @NameInMap("SlotInfos")
        public java.util.List<UpdateIntentRequestIntentDefinitionSlotInfos> slotInfos;

        public static UpdateIntentRequestIntentDefinition build(java.util.Map<String, ?> map) throws Exception {
            UpdateIntentRequestIntentDefinition self = new UpdateIntentRequestIntentDefinition();
            return TeaModel.build(map, self);
        }

        public UpdateIntentRequestIntentDefinition setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public UpdateIntentRequestIntentDefinition setIntentName(String intentName) {
            this.intentName = intentName;
            return this;
        }
        public String getIntentName() {
            return this.intentName;
        }

        public UpdateIntentRequestIntentDefinition setSlotInfos(java.util.List<UpdateIntentRequestIntentDefinitionSlotInfos> slotInfos) {
            this.slotInfos = slotInfos;
            return this;
        }
        public java.util.List<UpdateIntentRequestIntentDefinitionSlotInfos> getSlotInfos() {
            return this.slotInfos;
        }

    }

}
