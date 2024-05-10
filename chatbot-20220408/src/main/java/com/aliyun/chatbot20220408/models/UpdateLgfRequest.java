// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateLgfRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LgfDefinition")
    public UpdateLgfRequestLgfDefinition lgfDefinition;

    /**
     * <p>LGF ID</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LgfId")
    public Long lgfId;

    public static UpdateLgfRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLgfRequest self = new UpdateLgfRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLgfRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateLgfRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateLgfRequest setLgfDefinition(UpdateLgfRequestLgfDefinition lgfDefinition) {
        this.lgfDefinition = lgfDefinition;
        return this;
    }
    public UpdateLgfRequestLgfDefinition getLgfDefinition() {
        return this.lgfDefinition;
    }

    public UpdateLgfRequest setLgfId(Long lgfId) {
        this.lgfId = lgfId;
        return this;
    }
    public Long getLgfId() {
        return this.lgfId;
    }

    public static class UpdateLgfRequestLgfDefinition extends TeaModel {
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

        public static UpdateLgfRequestLgfDefinition build(java.util.Map<String, ?> map) throws Exception {
            UpdateLgfRequestLgfDefinition self = new UpdateLgfRequestLgfDefinition();
            return TeaModel.build(map, self);
        }

        public UpdateLgfRequestLgfDefinition setIntentId(Long intentId) {
            this.intentId = intentId;
            return this;
        }
        public Long getIntentId() {
            return this.intentId;
        }

        public UpdateLgfRequestLgfDefinition setRuleText(String ruleText) {
            this.ruleText = ruleText;
            return this;
        }
        public String getRuleText() {
            return this.ruleText;
        }

    }

}
