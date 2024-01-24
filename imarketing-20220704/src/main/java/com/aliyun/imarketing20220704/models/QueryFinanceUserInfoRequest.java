// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class QueryFinanceUserInfoRequest extends TeaModel {
    @NameInMap("ActivityId")
    public Long activityId;

    @NameInMap("UserId")
    public Long userId;

    public static QueryFinanceUserInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFinanceUserInfoRequest self = new QueryFinanceUserInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryFinanceUserInfoRequest setActivityId(Long activityId) {
        this.activityId = activityId;
        return this;
    }
    public Long getActivityId() {
        return this.activityId;
    }

    public QueryFinanceUserInfoRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
