// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateAggregateRemediationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RemediationId")
    public String remediationId;

    public static UpdateAggregateRemediationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAggregateRemediationResponseBody self = new UpdateAggregateRemediationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAggregateRemediationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAggregateRemediationResponseBody setRemediationId(String remediationId) {
        this.remediationId = remediationId;
        return this;
    }
    public String getRemediationId() {
        return this.remediationId;
    }

}
