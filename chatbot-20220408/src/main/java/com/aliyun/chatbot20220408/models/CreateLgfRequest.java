// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateLgfRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LgfDefinition")
    public CreateLgfRequestLgfDefinition lgfDefinition;

    public static CreateLgfRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLgfRequest self = new CreateLgfRequest();
        return TeaModel.build(map, self);
    }

    public CreateLgfRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreateLgfRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateLgfRequest setLgfDefinition(CreateLgfRequestLgfDefinition lgfDefinition) {
        this.lgfDefinition = lgfDefinition;
        return this;
    }
    public CreateLgfRequestLgfDefinition getLgfDefinition() {
        return this.lgfDefinition;
    }

    public static class CreateLgfRequestLgfDefinition extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("IntentId")
        public Long intentId;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("RuleText")
        public String ruleText;

        public static CreateLgfRequestLgfDefinition build(java.util.Map<String, ?> map) throws Exception {
            CreateLgfRequestLgfDefinition self = new CreateLgfRequestLgfDefinition();
            return TeaModel.build(map, self);
        }

        public CreateLgfRequestLgfDefinition setIntentId(Long intentId) {
            this.intentId = intentId;
            return this;
        }
        public Long getIntentId() {
            return this.intentId;
        }

        public CreateLgfRequestLgfDefinition setRuleText(String ruleText) {
            this.ruleText = ruleText;
            return this;
        }
        public String getRuleText() {
            return this.ruleText;
        }

    }

}
