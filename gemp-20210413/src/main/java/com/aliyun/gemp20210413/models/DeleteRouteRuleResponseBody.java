// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteRouteRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C4BE3837-1A13-413B-A225-2C88188E8A43</p>
     */
    @NameInMap("requestId")
    public Long requestId;

    public static DeleteRouteRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteRuleResponseBody self = new DeleteRouteRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRouteRuleResponseBody setRequestId(Long requestId) {
        this.requestId = requestId;
        return this;
    }
    public Long getRequestId() {
        return this.requestId;
    }

}
