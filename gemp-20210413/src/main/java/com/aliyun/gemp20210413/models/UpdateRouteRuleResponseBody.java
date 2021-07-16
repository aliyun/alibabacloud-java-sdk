// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateRouteRuleResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("data")
    public Long data;

    public static UpdateRouteRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRouteRuleResponseBody self = new UpdateRouteRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRouteRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateRouteRuleResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

}
