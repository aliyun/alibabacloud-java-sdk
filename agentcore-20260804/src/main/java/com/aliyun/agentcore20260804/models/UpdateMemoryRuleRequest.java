// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateMemoryRuleRequest extends TeaModel {
    /**
     * <p>The JSON request body.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public UpdateMemoryRuleRequestBody body;

    public static UpdateMemoryRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemoryRuleRequest self = new UpdateMemoryRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMemoryRuleRequest setBody(UpdateMemoryRuleRequestBody body) {
        this.body = body;
        return this;
    }
    public UpdateMemoryRuleRequestBody getBody() {
        return this.body;
    }

    public static class UpdateMemoryRuleRequestBodyStrategy extends TeaModel {
        /**
         * <p>The custom extraction instruction. If omitted, the original value is retained. An empty string clears the value.</p>
         * 
         * <strong>example:</strong>
         * <p>Retain only long-term preferences explicitly expressed by the user</p>
         */
        @NameInMap("instruction")
        public String instruction;

        /**
         * <p>type</p>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateMemoryRuleRequestBodyStrategy build(java.util.Map<String, ?> map) throws Exception {
            UpdateMemoryRuleRequestBodyStrategy self = new UpdateMemoryRuleRequestBodyStrategy();
            return TeaModel.build(map, self);
        }

        public UpdateMemoryRuleRequestBodyStrategy setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public UpdateMemoryRuleRequestBodyStrategy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateMemoryRuleRequestBody extends TeaModel {
        /**
         * <p>description</p>
         * 
         * <strong>example:</strong>
         * <p>Extract long-term preferences explicitly expressed by the user</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>enabled</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>name</p>
         * 
         * <strong>example:</strong>
         * <p>Long-term preferences</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The extraction strategy. Uses partial merging, where omitted fields retain their original values.</p>
         */
        @NameInMap("strategy")
        public UpdateMemoryRuleRequestBodyStrategy strategy;

        public static UpdateMemoryRuleRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateMemoryRuleRequestBody self = new UpdateMemoryRuleRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdateMemoryRuleRequestBody setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateMemoryRuleRequestBody setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateMemoryRuleRequestBody setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateMemoryRuleRequestBody setStrategy(UpdateMemoryRuleRequestBodyStrategy strategy) {
            this.strategy = strategy;
            return this;
        }
        public UpdateMemoryRuleRequestBodyStrategy getStrategy() {
            return this.strategy;
        }

    }

}
