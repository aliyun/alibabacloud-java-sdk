// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteSchedulerRuleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0bcf28g5-d57c-11e7-9bs0-d89d6717dxbc</p>
     */
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
