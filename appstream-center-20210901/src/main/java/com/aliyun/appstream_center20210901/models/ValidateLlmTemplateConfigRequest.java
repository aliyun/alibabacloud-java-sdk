// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ValidateLlmTemplateConfigRequest extends TeaModel {
    /**
     * <p>The JSON string of the LLM configuration to be validated.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;id&quot;:&quot;qwen3-max-2026-01-23&quot;,&quot;name&quot;:&quot;Qwen3 Max&quot;,&quot;contextWindow&quot;:200000,&quot;maxTokens&quot;:32768}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The ID of the provider template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pt-xxx-001</p>
     */
    @NameInMap("ProviderTemplateId")
    public String providerTemplateId;

    public static ValidateLlmTemplateConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateLlmTemplateConfigRequest self = new ValidateLlmTemplateConfigRequest();
        return TeaModel.build(map, self);
    }

    public ValidateLlmTemplateConfigRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ValidateLlmTemplateConfigRequest setProviderTemplateId(String providerTemplateId) {
        this.providerTemplateId = providerTemplateId;
        return this;
    }
    public String getProviderTemplateId() {
        return this.providerTemplateId;
    }

}
