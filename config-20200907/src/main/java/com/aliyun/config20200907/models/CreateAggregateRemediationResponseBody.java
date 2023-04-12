// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateAggregateRemediationResponseBody extends TeaModel {
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

    public static CreateAggregateRemediationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAggregateRemediationResponseBody self = new CreateAggregateRemediationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAggregateRemediationResponseBody setRemediationId(String remediationId) {
        this.remediationId = remediationId;
        return this;
    }
    public String getRemediationId() {
        return this.remediationId;
    }

    public CreateAggregateRemediationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
