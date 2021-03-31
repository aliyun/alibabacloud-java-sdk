// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReportInstancesStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ReportInstancesStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportInstancesStatusResponse self = new ReportInstancesStatusResponse();
        return TeaModel.build(map, self);
    }

    public ReportInstancesStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
