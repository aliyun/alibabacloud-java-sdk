// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListModelGroupsRequest extends TeaModel {
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
     * <p>The keyword used to match model groups by name, description, member identity, or invocation name.</p>
     * 
     * <strong>example:</strong>
     * <p>beta</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The maximum number of results to return per page. Valid values: 1 to 100. This parameter is required. Token-based pagination is used instead of pageNumber and pageSize.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token returned from the previous page. Omit this parameter for the first page. The value is empty or omitted for the last page.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJvZmZzZXQiOjIwfQ==</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListModelGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelGroupsRequest self = new ListModelGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListModelGroupsRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ListModelGroupsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListModelGroupsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListModelGroupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
