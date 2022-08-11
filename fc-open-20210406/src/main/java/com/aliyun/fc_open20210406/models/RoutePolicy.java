// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class RoutePolicy extends TeaModel {
    @NameInMap("condition")
    public byte[] condition;

    @NameInMap("policyItems")
    public PolicyItem policyItems;

    public static RoutePolicy build(java.util.Map<String, ?> map) throws Exception {
        RoutePolicy self = new RoutePolicy();
        return TeaModel.build(map, self);
    }

    public RoutePolicy setCondition(byte[] condition) {
        this.condition = condition;
        return this;
    }
    public byte[] getCondition() {
        return this.condition;
    }

    public RoutePolicy setPolicyItems(PolicyItem policyItems) {
        this.policyItems = policyItems;
        return this;
    }
    public PolicyItem getPolicyItems() {
        return this.policyItems;
    }

}
