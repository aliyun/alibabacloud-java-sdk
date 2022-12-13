// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListSubscriptionServiceGroupsRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("serviceIds")
    public java.util.List<Long> serviceIds;

    public static ListSubscriptionServiceGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSubscriptionServiceGroupsRequest self = new ListSubscriptionServiceGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListSubscriptionServiceGroupsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListSubscriptionServiceGroupsRequest setServiceIds(java.util.List<Long> serviceIds) {
        this.serviceIds = serviceIds;
        return this;
    }
    public java.util.List<Long> getServiceIds() {
        return this.serviceIds;
    }

}
