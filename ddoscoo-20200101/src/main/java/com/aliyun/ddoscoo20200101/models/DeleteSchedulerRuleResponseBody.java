// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteSchedulerRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSchedulerRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSchedulerRuleResponseBody self = new DeleteSchedulerRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSchedulerRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
