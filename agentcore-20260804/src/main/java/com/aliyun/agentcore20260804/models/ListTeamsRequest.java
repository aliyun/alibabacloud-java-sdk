// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListTeamsRequest extends TeaModel {
    /**
     * <p>The maximum number of records to return per page. Valid values: 1 to 100. If this parameter is not specified, 10 records are returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The filter condition for fuzzy matching the team name.</p>
     * 
     * <strong>example:</strong>
     * <p>team</p>
     */
    @NameInMap("nameLike")
    public String nameLike;

    /**
     * <p>The pagination token for querying the next page. Do not specify this parameter for the first call. For subsequent calls, specify the nextToken value returned from the previous call.</p>
     * 
     * <strong>example:</strong>
     * <p>dGVhbS1vZmZzZXQ6MTA</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListTeamsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTeamsRequest self = new ListTeamsRequest();
        return TeaModel.build(map, self);
    }

    public ListTeamsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTeamsRequest setNameLike(String nameLike) {
        this.nameLike = nameLike;
        return this;
    }
    public String getNameLike() {
        return this.nameLike;
    }

    public ListTeamsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
