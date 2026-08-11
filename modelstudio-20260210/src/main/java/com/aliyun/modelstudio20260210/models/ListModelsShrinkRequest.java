// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class ListModelsShrinkRequest extends TeaModel {
    @NameInMap("capabilities")
    public String capabilitiesShrink;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("contextWindow")
    public Long contextWindow;

    @NameInMap("features")
    public String featuresShrink;

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
    public String providersShrink;

    public static ListModelsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelsShrinkRequest self = new ListModelsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListModelsShrinkRequest setCapabilitiesShrink(String capabilitiesShrink) {
        this.capabilitiesShrink = capabilitiesShrink;
        return this;
    }
    public String getCapabilitiesShrink() {
        return this.capabilitiesShrink;
    }

    public ListModelsShrinkRequest setContextWindow(Long contextWindow) {
        this.contextWindow = contextWindow;
        return this;
    }
    public Long getContextWindow() {
        return this.contextWindow;
    }

    public ListModelsShrinkRequest setFeaturesShrink(String featuresShrink) {
        this.featuresShrink = featuresShrink;
        return this;
    }
    public String getFeaturesShrink() {
        return this.featuresShrink;
    }

    public ListModelsShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListModelsShrinkRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListModelsShrinkRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ListModelsShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListModelsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListModelsShrinkRequest setProvidersShrink(String providersShrink) {
        this.providersShrink = providersShrink;
        return this;
    }
    public String getProvidersShrink() {
        return this.providersShrink;
    }

}
