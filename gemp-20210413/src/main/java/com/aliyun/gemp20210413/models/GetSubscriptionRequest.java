// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetSubscriptionRequest extends TeaModel {
    @NameInMap("notFilterScopeObjectDeleted")
    public Boolean notFilterScopeObjectDeleted;

    @NameInMap("subscriptionId")
    public Long subscriptionId;

    public static GetSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSubscriptionRequest self = new GetSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public GetSubscriptionRequest setNotFilterScopeObjectDeleted(Boolean notFilterScopeObjectDeleted) {
        this.notFilterScopeObjectDeleted = notFilterScopeObjectDeleted;
        return this;
    }
    public Boolean getNotFilterScopeObjectDeleted() {
        return this.notFilterScopeObjectDeleted;
    }

    public GetSubscriptionRequest setSubscriptionId(Long subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }
    public Long getSubscriptionId() {
        return this.subscriptionId;
    }

}
