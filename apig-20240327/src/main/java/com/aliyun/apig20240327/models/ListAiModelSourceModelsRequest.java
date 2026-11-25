// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListAiModelSourceModelsRequest extends TeaModel {
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
     * <p>The maximum number of results to return per page. Valid values: 1 to 100. This parameter is required. Token-based pagination does not use pageNumber or pageSize.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The ID of the model source. Use the modelSourceId returned by CreateAiModelSource.</p>
     * 
     * <strong>example:</strong>
     * <p>ms-d00000000000000000000</p>
     */
    @NameInMap("modelSourceId")
    public String modelSourceId;

    /**
     * <p>The pagination token returned from the previous page. Omit this parameter for the first page. The token is empty or omitted for the last page.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJvZmZzZXQiOjIwfQ==</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListAiModelSourceModelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAiModelSourceModelsRequest self = new ListAiModelSourceModelsRequest();
        return TeaModel.build(map, self);
    }

    public ListAiModelSourceModelsRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ListAiModelSourceModelsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListAiModelSourceModelsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAiModelSourceModelsRequest setModelSourceId(String modelSourceId) {
        this.modelSourceId = modelSourceId;
        return this;
    }
    public String getModelSourceId() {
        return this.modelSourceId;
    }

    public ListAiModelSourceModelsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
