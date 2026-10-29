// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class DashScopeTransformParameters extends TeaModel {
    /**
     * <p>The API key for DashScope.</p>
     * 
     * <strong>example:</strong>
     * <p>Q37sQ****</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    /**
     * <p>The prompts.</p>
     */
    @NameInMap("Messages")
    public java.util.List<DashScopeTransformParametersMessages> messages;

    /**
     * <p>The model name.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>The rate limit in requests per minute.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("RequestPerMinute")
    public Long requestPerMinute;

    /**
     * <p>The structured output schema.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;type&quot;:&quot;object&quot;,&quot;properties&quot;:{&quot;message&quot;:{&quot;type&quot;:&quot;string&quot;}},&quot;required&quot;:[&quot;message&quot;]}</p>
     */
    @NameInMap("StructuredOutputJsonSchema")
    public String structuredOutputJsonSchema;

    /**
     * <p>The rate limit in tokens per minute.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("TokenPerMinute")
    public Long tokenPerMinute;

    public static DashScopeTransformParameters build(java.util.Map<String, ?> map) throws Exception {
        DashScopeTransformParameters self = new DashScopeTransformParameters();
        return TeaModel.build(map, self);
    }

    public DashScopeTransformParameters setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public DashScopeTransformParameters setMessages(java.util.List<DashScopeTransformParametersMessages> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<DashScopeTransformParametersMessages> getMessages() {
        return this.messages;
    }

    public DashScopeTransformParameters setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public DashScopeTransformParameters setRequestPerMinute(Long requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
        return this;
    }
    public Long getRequestPerMinute() {
        return this.requestPerMinute;
    }

    public DashScopeTransformParameters setStructuredOutputJsonSchema(String structuredOutputJsonSchema) {
        this.structuredOutputJsonSchema = structuredOutputJsonSchema;
        return this;
    }
    public String getStructuredOutputJsonSchema() {
        return this.structuredOutputJsonSchema;
    }

    public DashScopeTransformParameters setTokenPerMinute(Long tokenPerMinute) {
        this.tokenPerMinute = tokenPerMinute;
        return this;
    }
    public Long getTokenPerMinute() {
        return this.tokenPerMinute;
    }

    public static class DashScopeTransformParametersMessages extends TeaModel {
        /**
         * <p>The template form.</p>
         * 
         * <strong>example:</strong>
         * <p>JSONPATH</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The role.</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The template.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The template value.</p>
         * 
         * <strong>example:</strong>
         * <p>$.data.message</p>
         */
        @NameInMap("Value")
        public String value;

        public static DashScopeTransformParametersMessages build(java.util.Map<String, ?> map) throws Exception {
            DashScopeTransformParametersMessages self = new DashScopeTransformParametersMessages();
            return TeaModel.build(map, self);
        }

        public DashScopeTransformParametersMessages setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public DashScopeTransformParametersMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DashScopeTransformParametersMessages setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public DashScopeTransformParametersMessages setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
