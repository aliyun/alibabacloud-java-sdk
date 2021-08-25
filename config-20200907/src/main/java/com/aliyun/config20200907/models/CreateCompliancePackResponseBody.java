// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateCompliancePackResponseBody extends TeaModel {
    @NameInMap("CompliancePackId")
    public String compliancePackId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateCompliancePackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCompliancePackResponseBody self = new CreateCompliancePackResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCompliancePackResponseBody setCompliancePackId(String compliancePackId) {
        this.compliancePackId = compliancePackId;
        return this;
    }
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

    public CreateCompliancePackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
