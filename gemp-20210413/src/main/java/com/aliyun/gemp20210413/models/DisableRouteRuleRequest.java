// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DisableRouteRuleRequest extends TeaModel {
    // 请求ID
    @NameInMap("routeRuleId")
    public Long routeRuleId;

    // 幂等号
    @NameInMap("clientToken")
    public String clientToken;

    public static DisableRouteRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableRouteRuleRequest self = new DisableRouteRuleRequest();
        return TeaModel.build(map, self);
    }

    public DisableRouteRuleRequest setRouteRuleId(Long routeRuleId) {
        this.routeRuleId = routeRuleId;
        return this;
    }
    public Long getRouteRuleId() {
        return this.routeRuleId;
    }

    public DisableRouteRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
