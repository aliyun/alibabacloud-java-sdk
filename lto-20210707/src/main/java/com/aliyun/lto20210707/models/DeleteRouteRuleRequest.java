// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DeleteRouteRuleRequest extends TeaModel {
    @NameInMap("RouteRuleId")
    public String routeRuleId;

    public static DeleteRouteRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteRuleRequest self = new DeleteRouteRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRouteRuleRequest setRouteRuleId(String routeRuleId) {
        this.routeRuleId = routeRuleId;
        return this;
    }
    public String getRouteRuleId() {
        return this.routeRuleId;
    }

}
