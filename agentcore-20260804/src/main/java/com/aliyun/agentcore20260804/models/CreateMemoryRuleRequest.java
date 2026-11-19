// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateMemoryRuleRequest extends TeaModel {
    /**
     * <p>The JSON request body.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public CreateMemoryRuleRequestBody body;

    public static CreateMemoryRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMemoryRuleRequest self = new CreateMemoryRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateMemoryRuleRequest setBody(CreateMemoryRuleRequestBody body) {
        this.body = body;
        return this;
    }
    public CreateMemoryRuleRequestBody getBody() {
        return this.body;
    }

    public static class CreateMemoryRuleRequestBodyStrategy extends TeaModel {
        /**
         * <p>The strategy-level instruction. It takes effect together with the store-level instruction. If a conflict occurs, this field takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>Retain only long-term preferences explicitly expressed by users</p>
         */
        @NameInMap("instruction")
        public String instruction;

        /**
         * <p>type</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateMemoryRuleRequestBodyStrategy build(java.util.Map<String, ?> map) throws Exception {
            CreateMemoryRuleRequestBodyStrategy self = new CreateMemoryRuleRequestBodyStrategy();
            return TeaModel.build(map, self);
        }

        public CreateMemoryRuleRequestBodyStrategy setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public CreateMemoryRuleRequestBodyStrategy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateMemoryRuleRequestBody extends TeaModel {
        /**
         * <p>description</p>
         * 
         * <strong>example:</strong>
         * <p>Extract long-term preferences explicitly expressed by users</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Long-term preferences</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>strategy</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("strategy")
        public CreateMemoryRuleRequestBodyStrategy strategy;

        public static CreateMemoryRuleRequestBody build(java.util.Map<String, ?> map) throws Exception {
            CreateMemoryRuleRequestBody self = new CreateMemoryRuleRequestBody();
            return TeaModel.build(map, self);
        }

        public CreateMemoryRuleRequestBody setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateMemoryRuleRequestBody setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateMemoryRuleRequestBody setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateMemoryRuleRequestBody setStrategy(CreateMemoryRuleRequestBodyStrategy strategy) {
            this.strategy = strategy;
            return this;
        }
        public CreateMemoryRuleRequestBodyStrategy getStrategy() {
            return this.strategy;
        }

    }

}
