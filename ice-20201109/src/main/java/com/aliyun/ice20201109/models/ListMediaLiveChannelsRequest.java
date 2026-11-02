// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListMediaLiveChannelsRequest extends TeaModel {
    /**
     * <p>The keyword for the query. Fuzzy match is supported for channel IDs and names.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The number of rows per page for paging in a paged query. Maximum value: 100.
     * Default value:</p>
     * <ul>
     * <li>If the Settings are not specified or the specified value is less than 10, the default value is 10.</li>
     * <li>If the specified value in the Settings is greater than 100, the default value is 100.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The query token. Set the value to the NextToken value returned by the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of entries to skip for a paged query.
     * If the number of skipped entries exceeds the total number of matched entries, an empty list is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Skip")
    public Integer skip;

    /**
     * <p>Specifies the collation for sorting channels by creation time. Default value: asc. Valid values:</p>
     * <ul>
     * <li>desc: Descending order.</li>
     * <li>asc: Ascending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>The channel states to query. You can specify multiple states in a JSON array, separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;IDLE&quot;,&quot;RUNNING&quot;]</p>
     */
    @NameInMap("States")
    public String states;

    public static ListMediaLiveChannelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMediaLiveChannelsRequest self = new ListMediaLiveChannelsRequest();
        return TeaModel.build(map, self);
    }

    public ListMediaLiveChannelsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListMediaLiveChannelsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMediaLiveChannelsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMediaLiveChannelsRequest setSkip(Integer skip) {
        this.skip = skip;
        return this;
    }
    public Integer getSkip() {
        return this.skip;
    }

    public ListMediaLiveChannelsRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListMediaLiveChannelsRequest setStates(String states) {
        this.states = states;
        return this;
    }
    public String getStates() {
        return this.states;
    }

}
