// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class EnableRouteRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("data")
    public Integer data;

    /**
     * <strong>example:</strong>
     * <p>C4BE3837-1A13-413B-A225-2C88188E8A43</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static EnableRouteRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableRouteRuleResponseBody self = new EnableRouteRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableRouteRuleResponseBody setData(Integer data) {
        this.data = data;
        return this;
    }
    public Integer getData() {
        return this.data;
    }

    public EnableRouteRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
