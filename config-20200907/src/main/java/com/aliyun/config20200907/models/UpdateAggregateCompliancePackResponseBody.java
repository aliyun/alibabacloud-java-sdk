// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateAggregateCompliancePackResponseBody extends TeaModel {
    /**
     * <p>The ID of the compliance package.</p>
     */
    @NameInMap("CompliancePackId")
    public String compliancePackId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAggregateCompliancePackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAggregateCompliancePackResponseBody self = new UpdateAggregateCompliancePackResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAggregateCompliancePackResponseBody setCompliancePackId(String compliancePackId) {
        this.compliancePackId = compliancePackId;
        return this;
    }
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

    public UpdateAggregateCompliancePackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
