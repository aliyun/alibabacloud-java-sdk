// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateIntentRequest extends TeaModel {
    /**
     * <p>The key of the business space. If you do not specify this parameter, the default business space is used. You can get the key from the business management page of your main account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>chatbot-cn-yjzbyrEvqd</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The intent definition.</p>
     */
    @NameInMap("IntentDefinition")
    public CreateIntentRequestIntentDefinition intentDefinition;

    public static CreateIntentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIntentRequest self = new CreateIntentRequest();
        return TeaModel.build(map, self);
    }

    public CreateIntentRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreateIntentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateIntentRequest setIntentDefinition(CreateIntentRequestIntentDefinition intentDefinition) {
        this.intentDefinition = intentDefinition;
        return this;
    }
    public CreateIntentRequestIntentDefinition getIntentDefinition() {
        return this.intentDefinition;
    }

    public static class CreateIntentRequestIntentDefinitionSlotInfos extends TeaModel {
        /**
         * <p>Specifies whether the slot can have multiple values.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Array")
        public Boolean array;

        /**
         * <p>Specifies whether to encrypt the slot value.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypt")
        public Boolean encrypt;

        /**
         * <p>Specifies whether the slot is interactive.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Interactive")
        public Boolean interactive;

        /**
         * <p>The slot name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>天气</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The slot ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fg452dfg3df23</p>
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

        public static CreateIntentRequestIntentDefinitionSlotInfos build(java.util.Map<String, ?> map) throws Exception {
            CreateIntentRequestIntentDefinitionSlotInfos self = new CreateIntentRequestIntentDefinitionSlotInfos();
            return TeaModel.build(map, self);
        }

        public CreateIntentRequestIntentDefinitionSlotInfos setArray(Boolean array) {
            this.array = array;
            return this;
        }
        public Boolean getArray() {
            return this.array;
        }

        public CreateIntentRequestIntentDefinitionSlotInfos setEncrypt(Boolean encrypt) {
            this.encrypt = encrypt;
            return this;
        }
        public Boolean getEncrypt() {
            return this.encrypt;
        }

        public CreateIntentRequestIntentDefinitionSlotInfos setInteractive(Boolean interactive) {
            this.interactive = interactive;
            return this;
        }
        public Boolean getInteractive() {
            return this.interactive;
        }

        public CreateIntentRequestIntentDefinitionSlotInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateIntentRequestIntentDefinitionSlotInfos setSlotId(String slotId) {
            this.slotId = slotId;
            return this;
        }
        public String getSlotId() {
            return this.slotId;
        }

        public CreateIntentRequestIntentDefinitionSlotInfos setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateIntentRequestIntentDefinition extends TeaModel {
        /**
         * <p>The intent alias.</p>
         * 
         * <strong>example:</strong>
         * <p>查天气意图</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <p>The intent name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>查天气意图</p>
         */
        @NameInMap("IntentName")
        public String intentName;

        /**
         * <p>An array of objects, each defining a slot for the intent.</p>
         */
        @NameInMap("SlotInfos")
        public java.util.List<CreateIntentRequestIntentDefinitionSlotInfos> slotInfos;

        public static CreateIntentRequestIntentDefinition build(java.util.Map<String, ?> map) throws Exception {
            CreateIntentRequestIntentDefinition self = new CreateIntentRequestIntentDefinition();
            return TeaModel.build(map, self);
        }

        public CreateIntentRequestIntentDefinition setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public CreateIntentRequestIntentDefinition setIntentName(String intentName) {
            this.intentName = intentName;
            return this;
        }
        public String getIntentName() {
            return this.intentName;
        }

        public CreateIntentRequestIntentDefinition setSlotInfos(java.util.List<CreateIntentRequestIntentDefinitionSlotInfos> slotInfos) {
            this.slotInfos = slotInfos;
            return this;
        }
        public java.util.List<CreateIntentRequestIntentDefinitionSlotInfos> getSlotInfos() {
            return this.slotInfos;
        }

    }

}
