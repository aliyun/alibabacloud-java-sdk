// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReportInstancesStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ReportInstancesStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReportInstancesStatusResponseBody self = new ReportInstancesStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ReportInstancesStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
