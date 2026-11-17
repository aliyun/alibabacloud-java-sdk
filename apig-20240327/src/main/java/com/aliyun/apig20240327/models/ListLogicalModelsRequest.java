// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListLogicalModelsRequest extends TeaModel {
    /**
     * <p>The ID of the gateway instance. Specifies the gateway instance for which to query logical models.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-xxxxxxxx</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The keyword used to filter logical models.</p>
     * 
     * <strong>example:</strong>
     * <p>chat</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The maximum number of entries to return per page. Valid values: 1 to 100. This parameter is required. This operation uses token-based pagination with maxResults and nextToken instead of pageNumber and pageSize.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The nextToken value returned in the response of the previous page. Omit this parameter for the first page. The last page does not return a nextToken value.</p>
     * 
     * <strong>example:</strong>
     * <p>next-token-xxxxxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListLogicalModelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLogicalModelsRequest self = new ListLogicalModelsRequest();
        return TeaModel.build(map, self);
    }

    public ListLogicalModelsRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ListLogicalModelsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListLogicalModelsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListLogicalModelsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
