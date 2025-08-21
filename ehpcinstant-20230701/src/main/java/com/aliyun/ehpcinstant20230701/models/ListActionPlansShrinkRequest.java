// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class ListActionPlansShrinkRequest extends TeaModel {
    @NameInMap("ActionPlanIds")
    public String actionPlanIdsShrink;

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

    public static ListActionPlansShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListActionPlansShrinkRequest self = new ListActionPlansShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListActionPlansShrinkRequest setActionPlanIdsShrink(String actionPlanIdsShrink) {
        this.actionPlanIdsShrink = actionPlanIdsShrink;
        return this;
    }
    public String getActionPlanIdsShrink() {
        return this.actionPlanIdsShrink;
    }

    public ListActionPlansShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListActionPlansShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
