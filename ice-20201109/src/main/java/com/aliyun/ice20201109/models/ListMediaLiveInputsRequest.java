// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListMediaLiveInputsRequest extends TeaModel {
    /**
     * <p>The keyword of the query. You can perform a fuzzy search on input ID or name.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: If you do not specify this parameter or if you set a value smaller than 10, the default value is 10. If you set a value greater than 100, the default value is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of entries to be skipped in the query. If the number of entries you attempt to skip exceeds the number of entries that meet the condition, an empty list is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Skip")
    public Integer skip;

    /**
     * <p>The sorting order of the inputs by creation time. Default value: asc. Valid values: desc and asc. asc indicates the ascending order, and desc indicates the descending order.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>The type of inputs you want to query. You can separate multiple input types with commas (,) in a JSON array.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;RTMP_PUSH&quot;,&quot;SRT_PULL&quot;]</p>
     */
    @NameInMap("Types")
    public String types;

    public static ListMediaLiveInputsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMediaLiveInputsRequest self = new ListMediaLiveInputsRequest();
        return TeaModel.build(map, self);
    }

    public ListMediaLiveInputsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListMediaLiveInputsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMediaLiveInputsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMediaLiveInputsRequest setSkip(Integer skip) {
        this.skip = skip;
        return this;
    }
    public Integer getSkip() {
        return this.skip;
    }

    public ListMediaLiveInputsRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListMediaLiveInputsRequest setTypes(String types) {
        this.types = types;
        return this;
    }
    public String getTypes() {
        return this.types;
    }

}
