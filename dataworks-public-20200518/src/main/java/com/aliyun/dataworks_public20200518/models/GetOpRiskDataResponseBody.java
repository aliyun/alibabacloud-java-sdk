// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetOpRiskDataResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-EFG****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the high-risk sensitive data. The information includes totalCount and opRiskDatas. opRiskDatas includes the following parameters:</p>
     * <ul>
     * <li>sensType: the type of the sensitive data</li>
     * <li>sensLevel: the sensitivity level of the sensitive data</li>
     * <li>opType: the type of the operation</li>
     * <li>sql: the SQL statement that is executed</li>
     * <li>opAccount: the account that is used to perform the operation</li>
     * <li>opTime: the time when the operation was performed</li>
     * </ul>
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
