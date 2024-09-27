// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ExecuteGtmRecoveryPlanResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6856BCF6-11D6-4D7E-AC53-FD579933522B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ExecuteGtmRecoveryPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteGtmRecoveryPlanResponseBody self = new ExecuteGtmRecoveryPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteGtmRecoveryPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
