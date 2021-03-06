// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetRouteRuleRequest extends TeaModel {
    // 规则ID
    @NameInMap("routeRuleId")
    public Long routeRuleId;

    // 幂等号
    @NameInMap("clientToken")
    public String clientToken;

    public static GetRouteRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRouteRuleRequest self = new GetRouteRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetRouteRuleRequest setRouteRuleId(Long routeRuleId) {
        this.routeRuleId = routeRuleId;
        return this;
    }
    public Long getRouteRuleId() {
        return this.routeRuleId;
    }

    public GetRouteRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
