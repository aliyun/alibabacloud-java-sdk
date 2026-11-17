// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListAiModelSourcesRequest extends TeaModel {
    /**
     * <p>The ID of the AI gateway instance to which the resource belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-d00000000000000000000</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The search keyword used to match resources by name or identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>beta</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The maximum number of results to return per page. Valid values: 1 to 100. This parameter is required. Do not use pageNumber or pageSize for token-based pagination.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token returned from the previous page. Omit this parameter for the first page. The token is empty or omitted on the last page.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJvZmZzZXQiOjIwfQ==</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The stable identifier of the model provider.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen</p>
     */
    @NameInMap("provider")
    public String provider;

    public static ListAiModelSourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAiModelSourcesRequest self = new ListAiModelSourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListAiModelSourcesRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ListAiModelSourcesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListAiModelSourcesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAiModelSourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAiModelSourcesRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

}
