// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetCompliancePackRequest extends TeaModel {
    @NameInMap("CompliancePackId")
    public String compliancePackId;

    public static GetCompliancePackRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCompliancePackRequest self = new GetCompliancePackRequest();
        return TeaModel.build(map, self);
    }

    public GetCompliancePackRequest setCompliancePackId(String compliancePackId) {
        this.compliancePackId = compliancePackId;
        return this;
    }
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

}
