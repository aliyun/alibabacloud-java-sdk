// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class BaiLianAgentTransformParameters extends TeaModel {
    /**
     * <p>The API key for Model Studio.</p>
     * 
     * <strong>example:</strong>
     * <p>Q34****</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0123456789abcdef0123456789abcdef</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The prompt.</p>
     */
    @NameInMap("Prompt")
    public BaiLianAgentTransformParametersPrompt prompt;

    /**
     * <p>The throttling limit in requests per minute.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("RequestPerMinute")
    public Long requestPerMinute;

    /**
     * <p>The throttling limit in tokens per minute.</p>
     * 
     * <strong>example:</strong>
     * <p>100000</p>
     */
    @NameInMap("TokenPerMinute")
    public Long tokenPerMinute;

    public static BaiLianAgentTransformParameters build(java.util.Map<String, ?> map) throws Exception {
        BaiLianAgentTransformParameters self = new BaiLianAgentTransformParameters();
        return TeaModel.build(map, self);
    }

    public BaiLianAgentTransformParameters setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public BaiLianAgentTransformParameters setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public BaiLianAgentTransformParameters setPrompt(BaiLianAgentTransformParametersPrompt prompt) {
        this.prompt = prompt;
        return this;
    }
    public BaiLianAgentTransformParametersPrompt getPrompt() {
        return this.prompt;
    }

    public BaiLianAgentTransformParameters setRequestPerMinute(Long requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
        return this;
    }
    public Long getRequestPerMinute() {
        return this.requestPerMinute;
    }

    public BaiLianAgentTransformParameters setTokenPerMinute(Long tokenPerMinute) {
        this.tokenPerMinute = tokenPerMinute;
        return this;
    }
    public Long getTokenPerMinute() {
        return this.tokenPerMinute;
    }

    public static class BaiLianAgentTransformParametersPrompt extends TeaModel {
        /**
         * <p>The template form.</p>
         * 
         * <strong>example:</strong>
         * <p>JSONPATH</p>
         */
        @NameInMap("Form")
        public String form;

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

        public static BaiLianAgentTransformParametersPrompt build(java.util.Map<String, ?> map) throws Exception {
            BaiLianAgentTransformParametersPrompt self = new BaiLianAgentTransformParametersPrompt();
            return TeaModel.build(map, self);
        }

        public BaiLianAgentTransformParametersPrompt setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public BaiLianAgentTransformParametersPrompt setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public BaiLianAgentTransformParametersPrompt setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
