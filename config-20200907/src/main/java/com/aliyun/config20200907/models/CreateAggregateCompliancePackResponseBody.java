// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateAggregateCompliancePackResponseBody extends TeaModel {
    /**
     * <p>The compliance package ID.</p>
     */
    @NameInMap("CompliancePackId")
    public String compliancePackId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAggregateCompliancePackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAggregateCompliancePackResponseBody self = new CreateAggregateCompliancePackResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAggregateCompliancePackResponseBody setCompliancePackId(String compliancePackId) {
        this.compliancePackId = compliancePackId;
        return this;
    }
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

    public CreateAggregateCompliancePackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
