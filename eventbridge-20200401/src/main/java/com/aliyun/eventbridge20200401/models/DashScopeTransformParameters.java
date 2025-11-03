// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class DashScopeTransformParameters extends TeaModel {
    @NameInMap("ApiKey")
    public String apiKey;

    @NameInMap("Messages")
    public java.util.List<DashScopeTransformParametersMessages> messages;

    @NameInMap("Model")
    public String model;

    @NameInMap("RequestPerMinute")
    public Long requestPerMinute;

    @NameInMap("StructuredOutputJsonSchema")
    public String structuredOutputJsonSchema;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Role")
        public String role;

        @NameInMap("Template")
        public String template;

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
