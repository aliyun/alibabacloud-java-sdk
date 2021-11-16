// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetOpRiskDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RiskData")
    public String riskData;

    public static GetOpRiskDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOpRiskDataResponseBody self = new GetOpRiskDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOpRiskDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOpRiskDataResponseBody setRiskData(String riskData) {
        this.riskData = riskData;
        return this;
    }
    public String getRiskData() {
        return this.riskData;
    }

}
