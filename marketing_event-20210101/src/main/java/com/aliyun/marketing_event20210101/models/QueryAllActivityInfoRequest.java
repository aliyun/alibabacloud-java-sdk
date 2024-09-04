// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class QueryAllActivityInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ActivityId")
    public String activityId;

    public static QueryAllActivityInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAllActivityInfoRequest self = new QueryAllActivityInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryAllActivityInfoRequest setActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    public String getActivityId() {
        return this.activityId;
    }

}
