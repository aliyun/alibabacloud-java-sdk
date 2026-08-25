// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListTeamsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>team</p>
     */
    @NameInMap("nameLike")
    public String nameLike;

    /**
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
