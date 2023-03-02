// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetOpRiskDataResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of the risky sensitive data returned. The information includes totalCount and opRiskDatas.</p>
     * <br>
     * <p>opRiskDatas includes the following parameters:</p>
     * <br>
     * <p>*   sensType: the type of the sensitive data</p>
     * <p>*   sensLevel: the sensitivity level of the sensitive data</p>
     * <p>*   opType: the type of the operation</p>
     * <p>*   sql: the SQL statement that is executed</p>
     * <p>*   opAccount: the account that is used to perform the operation</p>
     * <p>*   opTime: the time when the operation was performed</p>
     */
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
