// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateLgfRequest extends TeaModel {
    /**
     * <p>The key for the business space. If omitted, the default business space is used. You can get the key on the Business Management page of your main account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The bot ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>chatbot-cn-yjzbyrEvqd</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The LGF definition.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LgfDefinition")
    public UpdateLgfRequestLgfDefinition lgfDefinition;

    /**
     * <p>The LGF ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12121</p>
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
         * <p>The intent ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>23234523522</p>
         */
        @NameInMap("IntentId")
        public Long intentId;

        /**
         * <p>The LGF configuration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>.{0,10}[天气]</p>
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
