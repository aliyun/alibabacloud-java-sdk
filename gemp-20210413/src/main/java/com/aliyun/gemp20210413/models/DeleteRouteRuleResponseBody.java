// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteRouteRuleResponseBody extends TeaModel {
    // 请求ID
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
