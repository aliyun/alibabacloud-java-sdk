// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateIntentRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IntentDefinition")
    public UpdateIntentRequestIntentDefinition intentDefinition;

    /**
     * <p>This parameter is required.</p>
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
        @NameInMap("Array")
        public Boolean array;

        @NameInMap("Encrypt")
        public Boolean encrypt;

        @NameInMap("Interactive")
        public Boolean interactive;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("SlotId")
        public String slotId;

        /**
         * <p>This parameter is required.</p>
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
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("IntentName")
        public String intentName;

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
