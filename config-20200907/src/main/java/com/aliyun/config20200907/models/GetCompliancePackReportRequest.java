// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetCompliancePackReportRequest extends TeaModel {
    @NameInMap("CompliancePackId")
    public String compliancePackId;

    public static GetCompliancePackReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCompliancePackReportRequest self = new GetCompliancePackReportRequest();
        return TeaModel.build(map, self);
    }

    public GetCompliancePackReportRequest setCompliancePackId(String compliancePackId) {
        this.compliancePackId = compliancePackId;
        return this;
    }
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

}
