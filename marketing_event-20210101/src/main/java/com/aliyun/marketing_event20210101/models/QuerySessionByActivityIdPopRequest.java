// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class QuerySessionByActivityIdPopRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4546</p>
     */
    @NameInMap("ActivityId")
    public Long activityId;

    public static QuerySessionByActivityIdPopRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySessionByActivityIdPopRequest self = new QuerySessionByActivityIdPopRequest();
        return TeaModel.build(map, self);
    }

    public QuerySessionByActivityIdPopRequest setActivityId(Long activityId) {
        this.activityId = activityId;
        return this;
    }
    public Long getActivityId() {
        return this.activityId;
    }

}
