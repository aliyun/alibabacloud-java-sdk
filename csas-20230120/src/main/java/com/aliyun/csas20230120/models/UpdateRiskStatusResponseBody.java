// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateRiskStatusResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D6707286-A50E-57B1-B2CF-EFAC59E850D8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateRiskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRiskStatusResponseBody self = new UpdateRiskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRiskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
