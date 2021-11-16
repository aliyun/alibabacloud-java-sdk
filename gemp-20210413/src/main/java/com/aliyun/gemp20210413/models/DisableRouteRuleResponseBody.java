// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DisableRouteRuleResponseBody extends TeaModel {
    // C4BE3837-1A13-413B-A225-2C88188E8A43
    @NameInMap("data")
    public Long data;

    // 请求ID
    @NameInMap("requestId")
    public String requestId;

    public static DisableRouteRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableRouteRuleResponseBody self = new DisableRouteRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableRouteRuleResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public DisableRouteRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
