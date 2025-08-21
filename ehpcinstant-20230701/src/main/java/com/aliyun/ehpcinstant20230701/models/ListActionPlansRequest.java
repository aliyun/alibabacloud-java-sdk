// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class ListActionPlansRequest extends TeaModel {
    @NameInMap("ActionPlanIds")
    public java.util.List<String> actionPlanIds;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>1d2db86scXXXXXXXXXX</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListActionPlansRequest build(java.util.Map<String, ?> map) throws Exception {
        ListActionPlansRequest self = new ListActionPlansRequest();
        return TeaModel.build(map, self);
    }

    public ListActionPlansRequest setActionPlanIds(java.util.List<String> actionPlanIds) {
        this.actionPlanIds = actionPlanIds;
        return this;
    }
    public java.util.List<String> getActionPlanIds() {
        return this.actionPlanIds;
    }

    public ListActionPlansRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListActionPlansRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
