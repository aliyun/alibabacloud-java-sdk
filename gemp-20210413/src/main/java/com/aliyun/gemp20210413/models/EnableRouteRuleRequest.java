// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class EnableRouteRuleRequest extends TeaModel {
    // 规则ID
    @NameInMap("routeRuleId")
    public Long routeRuleId;

    // 幂等号
    @NameInMap("clientToken")
    public String clientToken;

    public static EnableRouteRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableRouteRuleRequest self = new EnableRouteRuleRequest();
        return TeaModel.build(map, self);
    }

    public EnableRouteRuleRequest setRouteRuleId(Long routeRuleId) {
        this.routeRuleId = routeRuleId;
        return this;
    }
    public Long getRouteRuleId() {
        return this.routeRuleId;
    }

    public EnableRouteRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
