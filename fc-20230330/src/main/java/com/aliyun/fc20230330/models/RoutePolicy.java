// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class RoutePolicy extends TeaModel {
    @NameInMap("condition")
    public String condition;

    @NameInMap("policyItems")
    public java.util.List<PolicyItem> policyItems;

    public static RoutePolicy build(java.util.Map<String, ?> map) throws Exception {
        RoutePolicy self = new RoutePolicy();
        return TeaModel.build(map, self);
    }

    public RoutePolicy setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public RoutePolicy setPolicyItems(java.util.List<PolicyItem> policyItems) {
        this.policyItems = policyItems;
        return this;
    }
    public java.util.List<PolicyItem> getPolicyItems() {
        return this.policyItems;
    }

}
