// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DisableRouteRuleResponseBody extends TeaModel {
    /**
     * <p>C4BE3837-1A13-413B-A225-2C88188E8A43</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("data")
    public Long data;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>C4BE3837-1A13-413B-A225-2C88188E8A43</p>
     */
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
