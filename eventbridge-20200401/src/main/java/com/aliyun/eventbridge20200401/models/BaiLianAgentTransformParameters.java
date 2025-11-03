// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class BaiLianAgentTransformParameters extends TeaModel {
    @NameInMap("ApiKey")
    public String apiKey;

    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("Prompt")
    public BaiLianAgentTransformParametersPrompt prompt;

    @NameInMap("RequestPerMinute")
    public Long requestPerMinute;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
