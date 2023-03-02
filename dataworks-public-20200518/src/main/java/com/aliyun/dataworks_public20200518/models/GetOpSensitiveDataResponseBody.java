// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetOpSensitiveDataResponseBody extends TeaModel {
    /**
     * <p>The information of the access records returned for the sensitive data. The information includes totalCount and opRiskDatas.</p>
     * <br>
     * <p>opRiskDatas includes the following parameters:</p>
     * <br>
     * <p>*   sensType: indicates the type of the sensitive data.</p>
     * <p>*   sensLevel: indicates the sensitivity level of the sensitive data. A larger value of sensLevel indicates a higher sensitivity level.</p>
     * <p>*   opType: indicates the type of the operation.</p>
     * <p>*   sql: indicates the SQL statement that is executed.</p>
     * <p>*   opAccount: indicates the account that is used to perform the operation.</p>
     * <p>*   opTime: indicates the time when the operation was performed.</p>
     */
    @NameInMap("OpSensitiveData")
    public String opSensitiveData;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetOpSensitiveDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOpSensitiveDataResponseBody self = new GetOpSensitiveDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOpSensitiveDataResponseBody setOpSensitiveData(String opSensitiveData) {
        this.opSensitiveData = opSensitiveData;
        return this;
    }
    public String getOpSensitiveData() {
        return this.opSensitiveData;
    }

    public GetOpSensitiveDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
