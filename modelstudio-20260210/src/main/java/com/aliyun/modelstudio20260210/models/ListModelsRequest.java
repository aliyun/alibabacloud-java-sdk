// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class ListModelsRequest extends TeaModel {
    @NameInMap("capabilities")
    public java.util.List<String> capabilities;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("contextWindow")
    public Long contextWindow;

    @NameInMap("features")
    public java.util.List<String> features;

    /**
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("language")
    public String language;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Long maxResults;

    /**
     * <strong>example:</strong>
     * <p>qwen-plus</p>
     */
    @NameInMap("model")
    public String model;

    /**
     * <strong>example:</strong>
     * <p>qwen-plus</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>lwytFRtLdNk=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("providers")
    public java.util.List<String> providers;

    public static ListModelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelsRequest self = new ListModelsRequest();
        return TeaModel.build(map, self);
    }

    public ListModelsRequest setCapabilities(java.util.List<String> capabilities) {
        this.capabilities = capabilities;
        return this;
    }
    public java.util.List<String> getCapabilities() {
        return this.capabilities;
    }

    public ListModelsRequest setContextWindow(Long contextWindow) {
        this.contextWindow = contextWindow;
        return this;
    }
    public Long getContextWindow() {
        return this.contextWindow;
    }

    public ListModelsRequest setFeatures(java.util.List<String> features) {
        this.features = features;
        return this;
    }
    public java.util.List<String> getFeatures() {
        return this.features;
    }

    public ListModelsRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListModelsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListModelsRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ListModelsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListModelsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListModelsRequest setProviders(java.util.List<String> providers) {
        this.providers = providers;
        return this;
    }
    public java.util.List<String> getProviders() {
        return this.providers;
    }

}
