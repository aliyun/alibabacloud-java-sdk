// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetOpRiskDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RiskData")
    @Validation(required = true)
    public String riskData;

    public static GetOpRiskDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOpRiskDataResponse self = new GetOpRiskDataResponse();
        return TeaModel.build(map, self);
    }

    public GetOpRiskDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOpRiskDataResponse setRiskData(String riskData) {
        this.riskData = riskData;
        return this;
    }
    public String getRiskData() {
        return this.riskData;
    }

}
