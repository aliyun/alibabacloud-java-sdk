// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateLgfRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    // 机器人ID
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
        // 意图ID
        @NameInMap("IntentId")
        public Long intentId;

        // LGF配置
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
