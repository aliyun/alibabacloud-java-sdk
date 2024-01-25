// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class RunPatrolInspectionRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("ProductCodes")
    public String productCodes;

    @NameInMap("RiskCodeList")
    public String riskCodeList;

    public static RunPatrolInspectionRequest build(java.util.Map<String, ?> map) throws Exception {
        RunPatrolInspectionRequest self = new RunPatrolInspectionRequest();
        return TeaModel.build(map, self);
    }

    public RunPatrolInspectionRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public RunPatrolInspectionRequest setProductCodes(String productCodes) {
        this.productCodes = productCodes;
        return this;
    }
    public String getProductCodes() {
        return this.productCodes;
    }

    public RunPatrolInspectionRequest setRiskCodeList(String riskCodeList) {
        this.riskCodeList = riskCodeList;
        return this;
    }
    public String getRiskCodeList() {
        return this.riskCodeList;
    }

}
