// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateLgfRequest extends TeaModel {
    /**
     * <p>The key for the business space. If you omit this parameter, the default business space is used. You can find the key on the Business Management page of your main account.</p>
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
     * <p>The LGF definition.</p>
     */
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
         * <p>The intent ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4675678567</p>
         */
        @NameInMap("IntentId")
        public Long intentId;

        /**
         * <p>The LGF configuration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>.{0,10}北京天气</p>
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
