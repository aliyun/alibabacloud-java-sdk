// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class EnableRouteRuleRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("routeRuleId")
    public Long routeRuleId;

    public static EnableRouteRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableRouteRuleRequest self = new EnableRouteRuleRequest();
        return TeaModel.build(map, self);
    }

    public EnableRouteRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public EnableRouteRuleRequest setRouteRuleId(Long routeRuleId) {
        this.routeRuleId = routeRuleId;
        return this;
    }
    public Long getRouteRuleId() {
        return this.routeRuleId;
    }

}
