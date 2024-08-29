// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateAggregateCompliancePackResponseBody extends TeaModel {
    /**
     * <p>The compliance package ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cp-fc56626622af00f9****</p>
     */
    @NameInMap("CompliancePackId")
    public String compliancePackId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CC0CE5EB-E51E-48EB-B4AB-9A9E131ECC0F</p>
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
