// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteRouteRuleRequest extends TeaModel {
    // 规则ID
    @NameInMap("routeRuleId")
    public Long routeRuleId;

    // 幂等号
    @NameInMap("clientToken")
    public String clientToken;

    public static DeleteRouteRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteRuleRequest self = new DeleteRouteRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRouteRuleRequest setRouteRuleId(Long routeRuleId) {
        this.routeRuleId = routeRuleId;
        return this;
    }
    public Long getRouteRuleId() {
        return this.routeRuleId;
    }

    public DeleteRouteRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
