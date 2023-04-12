// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateAggregateRemediationResponseBody extends TeaModel {
    /**
     * <p>The ID of the remediation setting.</p>
     */
    @NameInMap("RemediationId")
    public String remediationId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAggregateRemediationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAggregateRemediationResponseBody self = new UpdateAggregateRemediationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAggregateRemediationResponseBody setRemediationId(String remediationId) {
        this.remediationId = remediationId;
        return this;
    }
    public String getRemediationId() {
        return this.remediationId;
    }

    public UpdateAggregateRemediationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
