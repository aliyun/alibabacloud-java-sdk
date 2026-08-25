// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListModelConnectionsRequest extends TeaModel {
    @NameInMap("includeModels")
    public Boolean includeModels;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>bW9kZWwtbWFuYWdlbWVudC1vZmZzZXQ6bW9kZWwtY29ubmVjdGlvbjoxMA</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>OpenAI/v1</p>
     */
    @NameInMap("protocol")
    public String protocol;

    /**
     * <strong>example:</strong>
     * <p>qwen</p>
     */
    @NameInMap("providerType")
    public String providerType;

    public static ListModelConnectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelConnectionsRequest self = new ListModelConnectionsRequest();
        return TeaModel.build(map, self);
    }

    public ListModelConnectionsRequest setIncludeModels(Boolean includeModels) {
        this.includeModels = includeModels;
        return this;
    }
    public Boolean getIncludeModels() {
        return this.includeModels;
    }

    public ListModelConnectionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListModelConnectionsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListModelConnectionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListModelConnectionsRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public ListModelConnectionsRequest setProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }
    public String getProviderType() {
        return this.providerType;
    }

}
