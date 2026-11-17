// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ModelSelection extends TeaModel {
    /**
     * <p>Specifies whether to enable convenience aliases. When enabled, all selected model names must be unique.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("convenienceAliasEnabled")
    public Boolean convenienceAliasEnabled;

    /**
     * <p>The collection of explicitly selected built-in endpoint (route) names. This parameter is required and cannot be empty.</p>
     */
    @NameInMap("endpoints")
    public java.util.List<String> endpoints;

    /**
     * <p>The ordered fallback chains configured by endpoint and initial model.</p>
     */
    @NameInMap("fallbackChains")
    public java.util.List<ModelSelectionFallbackChains> fallbackChains;

    /**
     * <p>The selected model group IDs within the instance. Group identity is retained, the union of current members and single-selected models is calculated, and empty groups can be saved as drafts.</p>
     */
    @NameInMap("modelGroupIds")
    public java.util.List<String> modelGroupIds;

    /**
     * <p>The selected model collection.</p>
     */
    @NameInMap("models")
    public java.util.List<ModelSelectionModels> models;

    public static ModelSelection build(java.util.Map<String, ?> map) throws Exception {
        ModelSelection self = new ModelSelection();
        return TeaModel.build(map, self);
    }

    public ModelSelection setConvenienceAliasEnabled(Boolean convenienceAliasEnabled) {
        this.convenienceAliasEnabled = convenienceAliasEnabled;
        return this;
    }
    public Boolean getConvenienceAliasEnabled() {
        return this.convenienceAliasEnabled;
    }

    public ModelSelection setEndpoints(java.util.List<String> endpoints) {
        this.endpoints = endpoints;
        return this;
    }
    public java.util.List<String> getEndpoints() {
        return this.endpoints;
    }

    public ModelSelection setFallbackChains(java.util.List<ModelSelectionFallbackChains> fallbackChains) {
        this.fallbackChains = fallbackChains;
        return this;
    }
    public java.util.List<ModelSelectionFallbackChains> getFallbackChains() {
        return this.fallbackChains;
    }

    public ModelSelection setModelGroupIds(java.util.List<String> modelGroupIds) {
        this.modelGroupIds = modelGroupIds;
        return this;
    }
    public java.util.List<String> getModelGroupIds() {
        return this.modelGroupIds;
    }

    public ModelSelection setModels(java.util.List<ModelSelectionModels> models) {
        this.models = models;
        return this;
    }
    public java.util.List<ModelSelectionModels> getModels() {
        return this.models;
    }

    public static class ModelSelectionFallbackChains extends TeaModel {
        /**
         * <p>The endpoint name to which the chain belongs. It must be one of the currently selected endpoints.</p>
         * 
         * <strong>example:</strong>
         * <p>create-chat-completion</p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>The ordered collection of fallback model card IDs.</p>
         */
        @NameInMap("fallbackModelCardIds")
        public java.util.List<String> fallbackModelCardIds;

        /**
         * <p>The source model card ID.</p>
         * 
         * <strong>example:</strong>
         * <p>msc-d00000000000000000000</p>
         */
        @NameInMap("sourceModelCardId")
        public String sourceModelCardId;

        public static ModelSelectionFallbackChains build(java.util.Map<String, ?> map) throws Exception {
            ModelSelectionFallbackChains self = new ModelSelectionFallbackChains();
            return TeaModel.build(map, self);
        }

        public ModelSelectionFallbackChains setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ModelSelectionFallbackChains setFallbackModelCardIds(java.util.List<String> fallbackModelCardIds) {
            this.fallbackModelCardIds = fallbackModelCardIds;
            return this;
        }
        public java.util.List<String> getFallbackModelCardIds() {
            return this.fallbackModelCardIds;
        }

        public ModelSelectionFallbackChains setSourceModelCardId(String sourceModelCardId) {
            this.sourceModelCardId = sourceModelCardId;
            return this;
        }
        public String getSourceModelCardId() {
            return this.sourceModelCardId;
        }

    }

    public static class ModelSelectionModels extends TeaModel {
        /**
         * <p>The model card ID.</p>
         * 
         * <strong>example:</strong>
         * <p>msc-d00000000000000000000</p>
         */
        @NameInMap("modelCardId")
        public String modelCardId;

        /**
         * <p>The explicit execution target AI service ID for the model. This parameter is optional and takes precedence over the provider default.</p>
         * 
         * <strong>example:</strong>
         * <p>svc-d00000000000000000000</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        public static ModelSelectionModels build(java.util.Map<String, ?> map) throws Exception {
            ModelSelectionModels self = new ModelSelectionModels();
            return TeaModel.build(map, self);
        }

        public ModelSelectionModels setModelCardId(String modelCardId) {
            this.modelCardId = modelCardId;
            return this;
        }
        public String getModelCardId() {
            return this.modelCardId;
        }

        public ModelSelectionModels setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

    }

}
