// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class BatchCreateLlmTemplatesRequest extends TeaModel {
    /**
     * <p>The list of model configurations to create.</p>
     */
    @NameInMap("LlmTemplateItems")
    public java.util.List<BatchCreateLlmTemplatesRequestLlmTemplateItems> llmTemplateItems;

    /**
     * <p>The ID of the associated model group.</p>
     * 
     * <strong>example:</strong>
     * <p>mt-xxxx</p>
     */
    @NameInMap("ModelTemplateId")
    public String modelTemplateId;

    /**
     * <p>The ID of the model provider template to which the models belong.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mpt-xxxx</p>
     */
    @NameInMap("ProviderTemplateId")
    public String providerTemplateId;

    public static BatchCreateLlmTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateLlmTemplatesRequest self = new BatchCreateLlmTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateLlmTemplatesRequest setLlmTemplateItems(java.util.List<BatchCreateLlmTemplatesRequestLlmTemplateItems> llmTemplateItems) {
        this.llmTemplateItems = llmTemplateItems;
        return this;
    }
    public java.util.List<BatchCreateLlmTemplatesRequestLlmTemplateItems> getLlmTemplateItems() {
        return this.llmTemplateItems;
    }

    public BatchCreateLlmTemplatesRequest setModelTemplateId(String modelTemplateId) {
        this.modelTemplateId = modelTemplateId;
        return this;
    }
    public String getModelTemplateId() {
        return this.modelTemplateId;
    }

    public BatchCreateLlmTemplatesRequest setProviderTemplateId(String providerTemplateId) {
        this.providerTemplateId = providerTemplateId;
        return this;
    }
    public String getProviderTemplateId() {
        return this.providerTemplateId;
    }

    public static class BatchCreateLlmTemplatesRequestLlmTemplateItems extends TeaModel {
        /**
         * <p>The model configuration JSON object.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;id&quot;: &quot;qwen3.6-plus&quot;,
         *     &quot;cost&quot;: {
         *         &quot;input&quot;: 0,
         *         &quot;output&quot;: 0,
         *         &quot;cacheRead&quot;: 0,
         *         &quot;cacheWrite&quot;: 0
         *     },
         *     &quot;name&quot;: &quot;Qwen3.6-Plus&quot;,
         *     &quot;input&quot;: [&quot;image&quot;, &quot;text&quot;],
         *     &quot;compat&quot;: {
         *         &quot;supportsUsageInStreaming&quot;: true
         *     },
         *     &quot;maxTokens&quot;: 65536,
         *     &quot;reasoning&quot;: false,
         *     &quot;contextWindow&quot;: 1000000
         * }</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The model description.</p>
         * 
         * <strong>example:</strong>
         * <p>千问Plus系列模型</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Specifies whether to set this model as the default model. Each model group can have at most one default model.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDefaultModel")
        public Boolean isDefaultModel;

        /**
         * <p>The model code, which must be unique within the same provider.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3.6-plus</p>
         */
        @NameInMap("LlmCode")
        public String llmCode;

        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen3.6-Plus</p>
         */
        @NameInMap("Name")
        public String name;

        public static BatchCreateLlmTemplatesRequestLlmTemplateItems build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateLlmTemplatesRequestLlmTemplateItems self = new BatchCreateLlmTemplatesRequestLlmTemplateItems();
            return TeaModel.build(map, self);
        }

        public BatchCreateLlmTemplatesRequestLlmTemplateItems setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public BatchCreateLlmTemplatesRequestLlmTemplateItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public BatchCreateLlmTemplatesRequestLlmTemplateItems setIsDefaultModel(Boolean isDefaultModel) {
            this.isDefaultModel = isDefaultModel;
            return this;
        }
        public Boolean getIsDefaultModel() {
            return this.isDefaultModel;
        }

        public BatchCreateLlmTemplatesRequestLlmTemplateItems setLlmCode(String llmCode) {
            this.llmCode = llmCode;
            return this;
        }
        public String getLlmCode() {
            return this.llmCode;
        }

        public BatchCreateLlmTemplatesRequestLlmTemplateItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
