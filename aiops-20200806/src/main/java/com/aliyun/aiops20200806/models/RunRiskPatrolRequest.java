// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class RunRiskPatrolRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("RiskPatrolTypes")
    public String riskPatrolTypes;

    public static RunRiskPatrolRequest build(java.util.Map<String, ?> map) throws Exception {
        RunRiskPatrolRequest self = new RunRiskPatrolRequest();
        return TeaModel.build(map, self);
    }

    public RunRiskPatrolRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public RunRiskPatrolRequest setRiskPatrolTypes(String riskPatrolTypes) {
        this.riskPatrolTypes = riskPatrolTypes;
        return this;
    }
    public String getRiskPatrolTypes() {
        return this.riskPatrolTypes;
    }

}
