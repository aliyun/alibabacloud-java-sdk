// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class ListActionPlanActivitiesRequest extends TeaModel {
    /**
     * <p>The ID of the execution plan.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-hz036ubmx2qmw93k****</p>
     */
    @NameInMap("ActionPlanId")
    public String actionPlanId;

    /**
     * <p>The maximum number of entries per page.</p>
     * <p>Valid values: 1 to 100.</p>
     * <p>Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>1d2db86scXXXXXXXXXX</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListActionPlanActivitiesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListActionPlanActivitiesRequest self = new ListActionPlanActivitiesRequest();
        return TeaModel.build(map, self);
    }

    public ListActionPlanActivitiesRequest setActionPlanId(String actionPlanId) {
        this.actionPlanId = actionPlanId;
        return this;
    }
    public String getActionPlanId() {
        return this.actionPlanId;
    }

    public ListActionPlanActivitiesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListActionPlanActivitiesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
