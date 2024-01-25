// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeInspectionThresholdRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("RiskCode")
    public String riskCode;

    public static DescribeInspectionThresholdRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInspectionThresholdRequest self = new DescribeInspectionThresholdRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInspectionThresholdRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public DescribeInspectionThresholdRequest setRiskCode(String riskCode) {
        this.riskCode = riskCode;
        return this;
    }
    public String getRiskCode() {
        return this.riskCode;
    }

}
